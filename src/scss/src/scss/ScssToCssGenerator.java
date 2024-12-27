package scss.src.scss;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import scss.src.scss.lib.ScssLexer;
import scss.src.scss.lib.ScssParser;
import scss.src.scss.lib.ScssParserBaseVisitor;

import javax.naming.NameNotFoundException;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ScssToCssGenerator extends ScssParserBaseVisitor<String> {

    public String compileFileToString(File file) throws IOException {
        ScssLexer lexer = new ScssLexer(CharStreams.fromStream(new FileInputStream(file)));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ScssParser parser = new ScssParser(tokens);
        ParseTree tree = parser.stylesheet();
        return visit(tree);
    }

    public Stream<Character> compileFileToStream(File file) throws IOException {
        return compileFileToString(file).chars().mapToObj(c -> (char) c);
    }

    public File compileFileToFile(File inputFile, String outputFilePath) throws IOException {
        Stream<Character> chars = compileFileToStream(inputFile);

        File outputFile = new File(outputFilePath);
        try {
            Files.createFile(outputFile.toPath());
        } catch (FileAlreadyExistsException e) {
        }

        FileWriter writer = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        StringBuilder lineBuilder = new StringBuilder();
        chars.forEachOrdered(
                character -> {
                    lineBuilder.append(character);
                    if (character == '\n') {
                        try {
                            bufferedWriter.write(lineBuilder.toString());
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                        lineBuilder.setLength(0);
                    }
                }
        );

        try {
            bufferedWriter.write(lineBuilder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        bufferedWriter.close();
        return outputFile;
    }

    // #######################################################################
    // -------------------------------DATA------------------------------------
    // #######################################################################

    private final Map<String, String> IDENTIFIER_BLOCK = new LinkedHashMap<>();
    private final List<String> BLOCK_CONTEXT = new ArrayList<>();
    private String NAMESPACE_CONTEXT = "";
    private final Map<String, String> VARIABLES = new HashMap<>();
    private final List<Mixin> MIXINS = new ArrayList<>();
    private ScssParser.BlockContext MIXINS_CONTENT;
    private final String SPECIAL_CONTEXT_TAG = "@SassSpecialContext@";
    private boolean CUT_VALUES_WITH_PIPE = false;

    public String getBlockContext() {
        return BLOCK_CONTEXT.stream().filter(s -> !s.equals(SPECIAL_CONTEXT_TAG)).collect(Collectors.joining(" ")).replace(" [", "[");
    }

    public List<String> getParentContext() {
        String blockContext = getBlockContext();

        return Arrays.stream(blockContext.split(",")).map(String::trim).filter(s -> !s.isEmpty()).collect(Collectors.toList());
    }

    // #######################################################################
    // -----------------------------VISITORS----------------------------------
    // #######################################################################

    @Override
    public String visitStylesheet(ScssParser.StylesheetContext ctx) {
        //stylesheet
        //    : statement* EOF
        //    ;

        IDENTIFIER_BLOCK.clear();
        BLOCK_CONTEXT.clear();
        VARIABLES.clear();
        NAMESPACE_CONTEXT = "";
        MIXINS.clear();

        ctx.statement().forEach(this::visit);

        return IDENTIFIER_BLOCK.entrySet()
                .stream()
                .map(entry -> entry.getKey() + " {\n" + Utils.indent(entry.getValue()) + "}")
                .collect(Collectors.joining("\n\n"));
    }

    // #######################################################################
    // --------------------------DECLARATIONS---------------------------------
    // #######################################################################


    @Override
    public String visitVariableDeclaration(ScssParser.VariableDeclarationContext ctx) {
        //variableDeclaration
        //    : variableName Colon variableValue prio? Semi?
        //    ;

        ScssParser.PrioContext prioContext = ctx.prio();
        String prio = prioContext != null ? " " + prioContext.getText() : "";

        if (ctx.parent instanceof ScssParser.StatementContext) {
            String blockContext = String.join(" ", BLOCK_CONTEXT);
            String variableName = blockContext + NAMESPACE_CONTEXT + visit(ctx.variableName());
            VARIABLES.put(variableName, visit(ctx.variableValue()) + prio);
        }

        if (ctx.parent instanceof ScssParser.ParameterContext) {
            return ctx.variableName().getText()
                    + ": "
                    + visit(ctx.variableValue())
                    + prio;
        }

        return "VARIABLE DECLARATION NOT SUPPORTED IN THIS CONTEXT";
    }

    @Override
    public String visitVariableName(ScssParser.VariableNameContext ctx) {
        //variableName
        //    : (( Minus Minus) Dollar | plusMinus Dollar | Dollar) identifier
        //    | plusMinus? namespace_? Dollar ( identifier | measurment)
        //    | Variable
        //    ;

        if (ctx.parent instanceof ScssParser.VariableDeclarationContext) return ctx.getText();

        if (ctx.parent instanceof ScssParser.ValueContext) {
            if (ctx.parent.parent instanceof ScssParser.ParameterContext) {
                if (ctx.parent.parent.parent instanceof ScssParser.ParametersContext) {
                    if (ctx.parent.parent.parent.parent instanceof ScssParser.FunctionDeclarationContext
                            || ctx.parent.parent.parent.parent instanceof ScssParser.MixinDeclarationContext) {
                        return ctx.getText();
                    }
                }
            }
        }

        String varName = NAMESPACE_CONTEXT + ctx.getText();

        List<String> tempBlockContext = new ArrayList<>(BLOCK_CONTEXT);
        String blockContext = String.join(" ", tempBlockContext);
        while (!blockContext.isEmpty()) {
            if (VARIABLES.containsKey(blockContext + varName)) {
                return VARIABLES.get(blockContext + varName);
            }
            tempBlockContext.removeLast();
            blockContext = String.join(" ", tempBlockContext);
        }

        String value = VARIABLES.get(varName);
        if (value == null) throw new RuntimeException("the variable '" + ctx.getText() + "' is not declared");

        return value;
    }

    @Override
    public String visitNamespace_(ScssParser.Namespace_Context ctx) {
        //namespace_
        //    : (identifier Dot)+
        //    ;

        return ctx.children
                .stream()
                .map(this::visit)
                .collect(Collectors.joining(""))
                + ".";
    }

    @Override
    public String visitPropertyDeclaration(ScssParser.PropertyDeclarationContext ctx) {
        //propertyDeclaration
        //    : (identifier | interpolation) Colon propertyValue Semi?
        //    ;

        ParseTree identInter = (ctx.identifier() != null) ? ctx.identifier() : ctx.interpolation();
        String property = visit(identInter) + ": " + visit(ctx.propertyValue()) + ";\n";

        String blockContext = getBlockContext();
        String block = IDENTIFIER_BLOCK.getOrDefault(blockContext, "");
        IDENTIFIER_BLOCK.put(blockContext, block + property);

        return "";
    }

    @Override
    public String visitPrio(ScssParser.PrioContext ctx) {
        //prio
        //    : Important
        //    | Default
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitPropertyValue(ScssParser.PropertyValueContext ctx) {
        //propertyValue
        //    : (
        //        value
        //        | value? prio? block
        //        | variableName
        //        | listSpaceSeparated
        //        | listCommaSeparated
        //        | expression
        //        | functionCall
        //    ) prio?
        //    ;

        return ctx.children
                .stream()
                .map(this::visit)
                .collect(Collectors.joining(" "));
    }

    @Override
    public String visitMixinDeclaration(ScssParser.MixinDeclarationContext ctx) {
        //mixinDeclaration
        //    : Mixin (identifier | identifier Lparen parameters Rparen | interpolation) block
        //    ;

        String name = (ctx.identifier() != null) ? visit(ctx.identifier()) : visit(ctx.interpolation());
        List<Argument> args = new ArrayList<>();
        if (ctx.parameters() != null) {
            String stringParams = visit(ctx.parameters());
            args.addAll(Utils.argumentsFromString(stringParams));
        }

        Mixin mixin = new Mixin(name, args, ctx.block());
        if (MIXINS.contains(mixin)) throw new IllegalArgumentException(
                "The mixin '" + mixin.name() + "(" + mixin.args() + ") is declared multiple times");

        MIXINS.add(mixin);

        return "";
    }

    @Override
    public String visitContentDeclaration(ScssParser.ContentDeclarationContext ctx) {
        //contentDeclaration
        //    : Content (Lparen parameters Rparen)? Semi?
        //    ;

        if (MIXINS_CONTENT != null) {
            visit(MIXINS_CONTENT);
        }

        return "";
    }

    @Override
    public String visitIncludeDeclaration(ScssParser.IncludeDeclarationContext ctx) {
        //includeDeclaration
        //    : Include namespace_? (identifier | functionCall) (Semi | Using Lparen parameters Rparen)? block?
        //    ;

        BLOCK_CONTEXT.add(SPECIAL_CONTEXT_TAG);
        String blockContext = String.join(" ", BLOCK_CONTEXT);

        String namespace = (ctx.namespace_() != null) ? visit(ctx.namespace_()) : "";
        String prevNamespaceContext = NAMESPACE_CONTEXT;
        NAMESPACE_CONTEXT = namespace;

        ScssParser.BlockContext prevMixinContent = MIXINS_CONTENT;
        MIXINS_CONTENT = ctx.block();

        Mixin template;
        if (ctx.identifier() != null) {
            String name = NAMESPACE_CONTEXT + visit(ctx.identifier());
            List<Argument> args = new ArrayList<>();

            template = new Mixin(name, args, null);
        } else {
            String name = NAMESPACE_CONTEXT + visit(ctx.functionCall().identifier());
            String stringParams = visit(ctx.functionCall().parameters());
            List<Argument> args = new ArrayList<>(Utils.argumentsFromString(stringParams));

            template = new Mixin(name, args, null);
        }

        Optional<Mixin> bestMixin = Utils.findBestMixin(MIXINS, template);

        bestMixin.ifPresent(mixin -> {
            mixin.args().forEach(argument -> VARIABLES.put(blockContext + argument.name(), argument.defaultValue().orElseThrow()));
            visit(mixin.content());
        });

        if (bestMixin.isEmpty())
            throw new IllegalArgumentException("The mixin '" + template.name() + "' is used but not declared");

        NAMESPACE_CONTEXT = prevNamespaceContext;
        BLOCK_CONTEXT.removeLast();
        MIXINS_CONTENT = prevMixinContent;

        Map<String, String> temp = new HashMap<>(VARIABLES);
        for (String key : temp.keySet()) {
            if (key.startsWith(blockContext)) {
                VARIABLES.remove(key);
            }
        }

        return "";
    }

    @Override
    public String visitInterpolationDeclaration(ScssParser.InterpolationDeclarationContext ctx) {
        //interpolationDeclaration
        //    : interpolation Colon propertyValue Semi?
        //    ;

        return visit(ctx.interpolation()) + ": " + visit(ctx.propertyValue()) + ";";
    }

    // #######################################################################
    // ----------------------------STRUCTURE----------------------------------
    // #######################################################################

    @Override
    public String visitRuleset(ScssParser.RulesetContext ctx) {
        //ruleset
        //    : selectorGroup block
        //    ;

        BLOCK_CONTEXT.add(visit(ctx.selectorGroup()));
        visit(ctx.block());
        BLOCK_CONTEXT.removeLast();

        return "";
    }

    @Override
    public String visitBlock(ScssParser.BlockContext ctx) {
        //block
        //    : BlockStart statement* functionReturn? BlockEnd
        //    ;

        if (ctx.functionReturn() != null) {
            String blockContext = getBlockContext();
            String block = IDENTIFIER_BLOCK.getOrDefault(blockContext, "");
            IDENTIFIER_BLOCK.put(blockContext, block + "FUNCTIONRETURN NOT HANDLED\n");
            return "";
        }

        if (ctx.parent instanceof ScssParser.PropertyValueContext parent) {
            return "VISITBLOCK IN PROPERTYVALUE NOT HANDLED\n";
        }

        if (ctx.parent instanceof ScssParser.ValueContext parent) {
            return "VISITBLOCK IN VALUE NOT HANDLED\n";
        }

        ctx.statement().forEach(this::visit);
        return "";
    }

    // #######################################################################
    // ------------------------------SELECTORS--------------------------------
    // #######################################################################

    @Override
    public String visitSelectorGroup(ScssParser.SelectorGroupContext ctx) {
        //selectorGroup
        //    : selector (Comma selector)*
        //    ;

        return ctx.selector()
                .stream()
                .map(this::visit)
                .collect(Collectors.joining(", "));
    }

    @Override
    public String visitSelector(ScssParser.SelectorContext ctx) {
        //selector
        //    : combinator? selectorSequence (combinator selectorSequence)*
        //    ;

        List<String> combinators = new LinkedList<>();
        if (ctx.combinator().size() != ctx.selectorSequence().size()) {
            combinators.add("");
        }

        ctx.combinator()
                .stream()
                .map(RuleContext::getText)
                .forEachOrdered(combinators::add);

        Iterator<String> combinatorIterator = combinators.iterator();

        return ctx.selectorSequence()
                .stream()
                .map(selector -> combinatorIterator.next() + visit(selector))
                .collect(Collectors.joining());
    }

    @Override
    public String visitSelectorSequence(ScssParser.SelectorSequenceContext ctx) {
        //selectorSequence
        //    : (typeSelector | universal) (
        //        id
        //        | className
        //        | attrib
        //        | pseudo
        //        | negation
        //        | interpolation ( variableName | Percentage)?
        //        | parentRef
        //    )*
        //    | (
        //        typeSelector
        //        | id
        //        | className
        //        | attrib
        //        | pseudo
        //        | negation
        //        | interpolation ( variableName | Percentage)?
        //        | parentRef
        //    )+
        //    ;

        if (!ctx.parentRef().isEmpty()) {
            return Utils.evalParentContext(this, ctx.children, getParentContext());
        }

        return ctx.children
                .stream()
                .map(this::visit)
                .collect(Collectors.joining(" "));
    }

    @Override
    public String visitTypeSelector(ScssParser.TypeSelectorContext ctx) {
        //typeSelector
        //    : typeNamespacePrefix? (Percentage | parentRef)? (identifier | variableName)
        //    ;

        if (ctx.parentRef() != null) {
            return Utils.evalParentContext(this, ctx.children, getParentContext());
        }

        return ctx.children
                .stream()
                .map(parseTree -> {
                    if (parseTree instanceof TerminalNode) return parseTree.getText();
                    return visit(parseTree);
                })
                .collect(Collectors.joining(" "));
    }

    @Override
    public String visitClassName(ScssParser.ClassNameContext ctx) {
        //className
        //    : Dot (Minus | identifier | interpolation)+
        //    ;

        return ctx.children
                .stream()
                .map(child -> (child instanceof TerminalNode) ? child.getText() : visit(child))
                .collect(Collectors.joining(""));
    }

    @Override
    public String visitInterpolation(ScssParser.InterpolationContext ctx) {
        //interpolation
        //    : namespace_? Hash BlockStart namespace_? (ifExpression | value | parentRef) BlockEnd measurment?
        //    ;

        String headerNamespace = (ctx.getChild(0) instanceof ScssParser.Namespace_Context) ? visit(ctx.getChild(0)) : "";

        String prevNameSpaceContext = NAMESPACE_CONTEXT;
        NAMESPACE_CONTEXT = (headerNamespace.isEmpty())
                ? (!ctx.namespace_().isEmpty()) ? visit(ctx.namespace_().getLast()) : ""
                : (ctx.namespace_().size() > 1) ? visit(ctx.namespace_().getLast()) : "";

        String value = "";
        if (ctx.ifExpression() != null) {
            value = visit(ctx.ifExpression());
        } else if (ctx.value() != null) {
            value = visit(ctx.value());
        } else if (ctx.parentRef() != null) {
            value = Utils.evalParentContext(this, List.of(ctx.parentRef()), getParentContext());
        }

        NAMESPACE_CONTEXT = prevNameSpaceContext;


        return headerNamespace + value + ((ctx.measurment() != null) ? visit(ctx.measurment()) : "");
    }

    @Override
    public String visitAttrib(ScssParser.AttribContext ctx) {
        //attrib
        //    : Lbrack typeNamespacePrefix? identifier (
        //        (PrefixMatch | SuffixMatch | SubstringMatch | Eq | Includes | DashMatch) (
        //            identifier
        //            | String_
        //        )
        //    )? Rbrack
        //    ;

        return ctx.children.stream()
                .map(value ->
                        (value instanceof TerminalNode)
                                ? value.getText().replace("\"", "")
                                : visit(value)
                )
                .collect(Collectors.joining());
    }

    @Override
    public String visitPseudo(ScssParser.PseudoContext ctx) {
        //pseudo
        //    : Colon Colon? (interpolation | identifier | functionalPseudo)
        //    ;

        return ctx.children.stream()
                .map(c -> {
                    if (c instanceof TerminalNode) return c.getText();
                    return visit(c);
                })
                .collect(Collectors.joining());
    }

    // #######################################################################
    // ------------------------------OPERATORS--------------------------------
    // #######################################################################

    @Override
    public String visitOperator_(ScssParser.Operator_Context ctx) {
        //operator_
        //    : Div
        //    | Times
        //    | Minus
        //    | Plus
        //    | Greater
        //    | Less
        //    | Greater Eq
        //    | Less Eq
        //    | Eq Eq?
        //    | NotEq
        //    | And
        //    | Or
        //    | Not
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitValue(ScssParser.ValueContext ctx) {
        //value
        //    : unit
        //    | number
        //    | boolean
        //    | calc
        //    | rotate
        //    | rgba
        //    | var_
        //    | uri
        //    | repeat
        //    | Format
        //    | String_
        //    | functionCall
        //    | variableName
        //    | interpolation
        //    | hexcolor
        //    | identifier
        //    | expression
        //    | block
        //    | Lparen Rparen
        //    | measurment
        //    ;

        return ctx.children.stream()
                .map(value ->
                        (value instanceof TerminalNode)
                                ? value.getText()
                                : visit(value)
                )
                .collect(Collectors.joining());
    }

    // #######################################################################
    // ------------------------------FUNCTION---------------------------------
    // #######################################################################


    @Override
    public String visitParameters(ScssParser.ParametersContext ctx) {
        //parameters
        //    : parameter? (Comma parameter)*
        //    ;

        if (ctx.children == null) return "";

        return ctx.children.stream()
                .map(child -> {
                    if (child instanceof TerminalNode) return "";
                    return visit(child);
                })
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining("\n"));
    }

    @Override
    public String visitParameter(ScssParser.ParameterContext ctx) {
        //parameter
        //    : (value | variableDeclaration | listSpaceSeparated | mapDeclaration) arglist? prio?
        //    ;

        return ctx.children.stream()
                .map(child -> {
                    if (child instanceof TerminalNode) return child.getText();
                    return visit(child);
                })
                .collect(Collectors.joining(""))
                .replace("prio", " prio");
    }

    @Override
    public String visitFunctionCall(ScssParser.FunctionCallContext ctx) {
        //functionCall
        //    : namespace_? identifier Lparen parameters Rparen
        //    ;

        String identifier = visit(ctx.identifier());
        String[] parameters = visit(ctx.parameters()).split("\n");

        if (identifier.equals("length")) {
            if (parameters.length == 1) {
                String[] list = parameters[0].split("(,\\s|,|\\s)");
                return list.length + "";
            } else {
                return parameters.length + "";
            }
        }

        if (identifier.equals("nth")) {
            if (parameters.length == 2) {
                int n = Integer.parseInt(parameters[1].trim()) - 1;
                String[] list = parameters[0].split("(,\\s|,|\\s)");
                return list[n];
            } else {
                int n = Integer.parseInt(parameters[parameters.length - 1].trim());
                return parameters[n];
            }
        }

        if (identifier.equals("linear-gradient")) {
            return "linear-gradient(" + String.join(", ", parameters) + ")";
        }

        if (identifier.equals("darken") || identifier.equals("lighten")) {
            if (parameters.length != 2) throw new IllegalArgumentException("Darken/lighten takes exactly 2 arguments");
            if (!parameters[1].endsWith("%"))
                throw new IllegalArgumentException("2nd argument of darken/lighten must be a percentage");
            if (!parameters[0].startsWith("#"))
                return "DARKEN/LIGHTEN FUNCTION: other color types than '#' are not implemented";

            int percentage = Integer.parseInt(parameters[1].replace("%", "").trim());
            String hexColor = parameters[0].substring(1);
            if (hexColor.length() == 3)
                hexColor = hexColor.chars().mapToObj(c -> Character.toString(c) + Character.toString(c)).collect(Collectors.joining());

            int r = Integer.parseInt(hexColor.substring(0, 2), 16);
            int g = Integer.parseInt(hexColor.substring(2, 4), 16);
            int b = Integer.parseInt(hexColor.substring(4, 6), 16);

            int modifier;

            if (identifier.equals("darken")) {
                modifier = -255 * percentage / 100;
            } else {
                modifier = 255 * percentage / 100;
            }

            r = Math.min(Math.max(0, r + modifier), 255);
            g = Math.min(Math.max(0, g + modifier), 255);
            b = Math.min(Math.max(0, b + modifier), 255);

            return String.format("rgb(%d, %d, %d)", r, g, b);
        }

        return "Function '" + identifier + "' is not supported";
    }

    @Override
    public String visitExpression(ScssParser.ExpressionContext ctx) {
        //expression
        //    : Not? expressionPart (operator_ Not? expressionPart)*
        //    ;

        List<String> operations = new ArrayList<>();
        List<String> values = new ArrayList<>();

        for (int i = 0; i < ctx.children.size(); i++) {
            ParseTree child = ctx.children.get(i);

            switch (child) {
                case TerminalNode _ -> {
                    i++;
                    if (i >= ctx.children.size())
                        throw new ArithmeticException("A boolean \"not\" should always be followed by a value");
                    values.add(Utils.evalNotExpression(visit(ctx.getChild(i))));
                }
                case ScssParser.Operator_Context operator -> operations.add(visit(operator));
                case ScssParser.ExpressionPartContext expr -> values.add(visit(expr));
                default -> throw new IllegalStateException("Unexpected child: " + child);
            }
        }

        while (values.size() > 1 && operations.size() > 0) {
            int operationIndex = 0;
            String operation = operations.getFirst();
            int bestPriority = Utils.getPriority(operation);

            for (int i = 1; i < operations.size(); i++) {
                String temp = operations.get(i);
                int priority = Utils.getPriority(temp);
                if (Utils.getPriority(temp) < bestPriority) {
                    operation = temp;
                    bestPriority = priority;
                    operationIndex = i;
                }
            }

            operations.remove(operationIndex);

            String a = values.get(operationIndex);
            values.remove(operationIndex);
            String b = values.get(operationIndex);

            values.set(operationIndex, Utils.evalSingularExpression(a, b, operation));
        }

        if (!operations.isEmpty()) throw new ArithmeticException(operations + " arithmetics operators not used");
        if (values.size() > 1) throw new ArithmeticException("Not enough arithmetic operators");

        return values.getFirst();
    }

    @Override
    public String visitExpressionPart(ScssParser.ExpressionPartContext ctx) {
        //expressionPart
        //    : unit
        //    | identifier
        //    | variableName
        //    | var_
        //    | boolean
        //    | calc
        //    | rotate
        //    | rgba
        //    | number
        //    | uri
        //    | Format
        //    | String_
        //    | interpolation
        //    | hexcolor
        //    | ifExpression
        //    | functionCall
        //    | plusMinus? Lparen expression? Rparen
        //    | prio
        //    | measurment
        //    ;

        return ctx.children
                .stream()
                .map(child -> (child instanceof TerminalNode)
                        ? child.getText().replaceAll("[()]", "")
                        : visit(child))
                .collect(Collectors.joining(""));
    }

    // #######################################################################
    // -----------------------------LIST & MAP--------------------------------
    // #######################################################################


    @Override
    public String visitListCommaSeparated(ScssParser.ListCommaSeparatedContext ctx) {
        //listCommaSeparated
        //    : listElement (Comma listElement)* Comma?
        //    ;

        if (CUT_VALUES_WITH_PIPE && ctx.listElement().size() > 1) {
            CUT_VALUES_WITH_PIPE = false;
            return ctx.listElement().stream()
                    .map(this::visit)
                    .collect(Collectors.joining("|"));
        }

        return ctx.listElement().stream()
                .map(this::visit)
                .collect(Collectors.joining(", "))
                + ((ctx.children.getLast() instanceof TerminalNode) ? "," : "");
    }

    @Override
    public String visitListSpaceSeparated(ScssParser.ListSpaceSeparatedContext ctx) {
        //listSpaceSeparated
        //    : listElement+
        //    ;

        if (CUT_VALUES_WITH_PIPE && ctx.listElement().size() > 1) {
            CUT_VALUES_WITH_PIPE = false;
            return ctx.listElement().stream()
                    .map(this::visit)
                    .collect(Collectors.joining("|"));
        }

        return ctx.listElement().stream()
                .map(this::visit)
                .collect(Collectors.joining(" "));
    }

    @Override
    public String visitListBracketed(ScssParser.ListBracketedContext ctx) {
        //listBracketed
        //    : Lbrack (listSpaceSeparated | listCommaSeparated) Rbrack
        //    ;

        String list = (ctx.listSpaceSeparated() != null) ? visit(ctx.listSpaceSeparated()) : visit(ctx.listCommaSeparated());
        if (CUT_VALUES_WITH_PIPE) return list;
        return "[" + list + "]";
    }

    @Override
    public String visitListElement(ScssParser.ListElementContext ctx) {
        //listElement
        //    : Lparen? (value Comma?)+ Rparen? Comma?
        //    ;

        StringBuilder res = new StringBuilder();

        if (CUT_VALUES_WITH_PIPE) {
            CUT_VALUES_WITH_PIPE = false;
            return ctx.value().stream()
                    .map(this::visit)
                    .collect(Collectors.joining("|"));
        }

        String prev = "(";
        for (ParseTree child : ctx.children) {
            String childText = (child instanceof TerminalNode) ? child.getText() : visit(child);
            if (childText.equals(",")) res.append(childText);
            else {
                res.append((prev.equals("(") || prev.equals(")") ? childText : " " + childText));
            }
            prev = childText;
        }

        return res.toString();
    }

    @Override
    public String visitMapDeclaration(ScssParser.MapDeclarationContext ctx) {
        //mapDeclaration
        //    : Lparen mapEntries Rparen
        //    ;
        return "(" + visit(ctx.mapEntries()) + ")";
    }

    @Override
    public String visitMapEntries(ScssParser.MapEntriesContext ctx) {
        //mapEntries
        //    : mapEntry (Comma mapEntry)* Comma?
        //    ;

        if (CUT_VALUES_WITH_PIPE) {
            CUT_VALUES_WITH_PIPE = false;

            return ctx.children.stream()
                    .map(child -> {
                        if (child instanceof TerminalNode) return child.getText();
                        return visit(child);
                    })
                    .collect(Collectors.joining("|"));
        }

        return ctx.children.stream()
                .map(child -> {
                    if (child instanceof TerminalNode) return child.getText();
                    return visit(child);
                })
                .collect(Collectors.joining(", "));
    }

    @Override
    public String visitMapEntry(ScssParser.MapEntryContext ctx) {
        //mapEntry
        //    : mapKey Colon mapValue
        //    ;
        return ctx.children.stream()
                .map(child -> {
                    if (child instanceof TerminalNode) return child.getText();
                    return visit(child);
                })
                .collect(Collectors.joining(""));
    }

    @Override
    public String visitMapKey(ScssParser.MapKeyContext ctx) {
        //mapKey
        //    : value
        //    | listDeclaration
        //    | mapDeclaration
        //    ;

        return visit(ctx.children.getFirst());
    }

    @Override
    public String visitMapValue(ScssParser.MapValueContext ctx) {
        //mapValue
        //    : value
        //    | listDeclaration
        //    | mapDeclaration
        //    ;

        return visit(ctx.children.getFirst());
    }

    // #######################################################################
    // ----------------------------FLOW CONTROL-------------------------------
    // #######################################################################

    @Override
    public String visitIfDeclaration(ScssParser.IfDeclarationContext ctx) {
        //ifDeclaration
        //    : AtIf expression block (elseIfStatement | elseStatement)?
        //    ;

        String exprValue = visit(ctx.expression());

        if (exprValue.equals("true")) {
            visit(ctx.block());
        } else if (exprValue.equals("false")) {
            if (ctx.elseIfStatement() != null) {
                visit(ctx.elseIfStatement());
            } else if (ctx.elseStatement() != null) {
                visit(ctx.elseStatement());
            }
        } else {
            throw new IllegalArgumentException("Boolean expression expected, " + exprValue + " found instead");
        }

        return "";
    }

    @Override
    public String visitElseIfStatement(ScssParser.ElseIfStatementContext ctx) {
        //elseIfStatement
        //        : AtElse If expression block (elseIfStatement | elseStatement)?
        //        ;

        String exprValue = visit(ctx.expression());

        if (exprValue.equals("true")) {
            visit(ctx.block());
        } else if (exprValue.equals("false")) {
            if (ctx.elseIfStatement() != null) {
                visit(ctx.elseIfStatement());
            } else if (ctx.elseStatement() != null) {
                visit(ctx.elseStatement());
            }
        } else {
            throw new IllegalArgumentException("Boolean expression expected, " + exprValue + " found instead");
        }

        return "";
    }

    @Override
    public String visitElseStatement(ScssParser.ElseStatementContext ctx) {
        //elseStatement
        //        : AtElse block
        //        ;

        visit(ctx.block());
        return "";
    }

    @Override
    public String visitForDeclaration(ScssParser.ForDeclarationContext ctx) {
        //forDeclaration
        //    : AtFor variableName From Number (To | Through) through block
        //    ;

        BLOCK_CONTEXT.add(SPECIAL_CONTEXT_TAG);
        String blockContext = String.join(" ", BLOCK_CONTEXT);

        boolean excludeLast = ctx.To() != null;

        int from = Integer.parseInt(ctx.Number().getText());
        int to = Integer.parseInt(visit(ctx.through()));

        if (!excludeLast) to++;

        for (int i = from; i < to; i++) {
            VARIABLES.put(blockContext + ctx.variableName().getText(), i + "");
            visit(ctx.block());

            Map<String, String> temp = new HashMap<>(VARIABLES);
            for (String key : temp.keySet()) {
                if (key.startsWith(blockContext)) {
                    VARIABLES.remove(key);
                }
            }
        }

        BLOCK_CONTEXT.removeLast();
        return "";
    }

    @Override
    public String visitThrough(ScssParser.ThroughContext ctx) {
        //through
        //    : Number
        //    | functionCall
        //    | expression
        //    ;

        ParseTree child = ctx.children.getFirst();
        if (child instanceof TerminalNode) return child.getText();
        return visit(child);
    }


    @Override
    public String visitEachDeclaration(ScssParser.EachDeclarationContext ctx) {
        //eachDeclaration
        //    : AtEach variableName (Comma variableName)* In eachValueList block
        //    ;

        BLOCK_CONTEXT.add(SPECIAL_CONTEXT_TAG);
        String blockContext = String.join(" ", BLOCK_CONTEXT);

        String valueList = visit(ctx.eachValueList());
        String[] values;
        if (!valueList.contains("|") && (valueList.matches("^.+([,\\s].+)?$"))) {
            values = valueList.split("[,\\s]+");
        } else {
            values = valueList.split("\\|");
        }

        for (String value : values) {
            if (ctx.variableName().size() == 1) {
                VARIABLES.put(blockContext + ctx.variableName().getFirst().getText(), value);
            } else {
                ParseTree child = ctx.eachValueList().children.getFirst();

                if (child instanceof ScssParser.MapDeclarationContext) {
                    String[] splittedValues = value.split(":");
                    VARIABLES.put(blockContext + ctx.variableName().getFirst().getText(), splittedValues[0]);

                    int i = 1;

                    if (splittedValues.length == 2) {
                        i++;
                        VARIABLES.put(blockContext + ctx.variableName().get(1).getText(), splittedValues[1]);
                    }

                    for (; i < ctx.variableName().size(); i++) {
                        VARIABLES.put(blockContext + ctx.variableName().get(i).getText(), "null");
                    }
                } else if (child instanceof ScssParser.ListDeclarationContext) {
                    VARIABLES.put(blockContext + ctx.variableName().getFirst().getText(), value);

                    for (int i = 1; i < ctx.variableName().size(); i++) {
                        VARIABLES.put(blockContext + ctx.variableName().get(i).getText(), "null");
                    }
                }
            }

            visit(ctx.block());

            Map<String, String> temp = new HashMap<>(VARIABLES);
            for (String key : temp.keySet()) {
                if (key.startsWith(blockContext)) {
                    VARIABLES.remove(key);
                }
            }
        }
        return "";
    }

    @Override
    public String visitEachValueList(ScssParser.EachValueListContext ctx) {
        //eachValueList
        //    : listDeclaration
        //    | mapDeclaration
        //    ;

        CUT_VALUES_WITH_PIPE = true;
        String res = visitChildren(ctx);
        CUT_VALUES_WITH_PIPE = false;
        return res;
    }

    // #######################################################################
    // -------------------------EMBEDDED FUNCTIONS----------------------------
    // #######################################################################

    @Override
    public String visitVar_(ScssParser.Var_Context ctx) {
        //var_
        //    : Var Variable (Comma value)? Rparen
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitCalc(ScssParser.CalcContext ctx) {
        //calc
        //    : Calc expression Rparen
        //    ;
        return visit(ctx.expression());
    }

    @Override
    public String visitRotate(ScssParser.RotateContext ctx) {
        //rotate
        //    : Rotate degree Rparen
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitRgba(ScssParser.RgbaContext ctx) {
        //rgba
        //    : Rgba value (Comma? value)* Rparen // Rgba(value, value, value)
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitRepeat(ScssParser.RepeatContext ctx) {
        //repeat
        //    : Repeat value Comma number Freq Rparen
        //    ;
        return ctx.getText();
    }

    // #######################################################################
    // ----------------------------PRIMITIVES---------------------------------
    // #######################################################################
    @Override
    public String visitUnit(ScssParser.UnitContext ctx) {
        //unit
        //    : (length | dimension | percentage | degree)
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitLength(ScssParser.LengthContext ctx) {
        //length
        //    : plusMinus? Number (AbsLength | FontRelative | ViewportRelative)
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitDimension(ScssParser.DimensionContext ctx) {
        //dimension
        //    : plusMinus? Number (Time | Freq | Resolution | Angle)
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitPercentage(ScssParser.PercentageContext ctx) {
        //percentage
        //    : plusMinus? Number Percentage
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitDegree(ScssParser.DegreeContext ctx) {
        //degree
        //    : plusMinus? Number Angle
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitMeasurment(ScssParser.MeasurmentContext ctx) {
        //measurment
        //    : AbsLength
        //    | FontRelative
        //    | ViewportRelative
        //    | Time
        //    | Freq
        //    | Resolution
        //    | Angle
        //    | Percentage
        //    ;
        return super.visitMeasurment(ctx);
    }

    @Override
    public String visitUri(ScssParser.UriContext ctx) {
        //uri
        //    : Uri
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitArglist(ScssParser.ArglistContext ctx) {
        //arglist
        //    : Dot Dot Dot
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitPlusMinus(ScssParser.PlusMinusContext ctx) {
        //plusMinus
        //    : Plus
        //    | Minus
        //    ;
        return super.visitPlusMinus(ctx);
    }

    @Override
    public String visitHexcolor(ScssParser.HexcolorContext ctx) {
        //hexcolor
        //    : Hash color
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitColor(ScssParser.ColorContext ctx) {
        //color
        //    : (Number | Ident)+
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitBoolean(ScssParser.BooleanContext ctx) {
        //boolean
        //    : True
        //    | False
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitNumber(ScssParser.NumberContext ctx) {
        //number
        //    : plusMinus? Number
        //    ;
        return ctx.getText();
    }

    @Override
    public String visitIdentifier(ScssParser.IdentifierContext ctx) {
        //identifier
        //    : (VendorPrefix | Minus)? Ident
        //    | From
        //    | To
        //    | Interpolation
        //    ;
        return ctx.getText();
    }
}
