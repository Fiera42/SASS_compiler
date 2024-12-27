package scss.src.scss;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import scss.src.scss.lib.ScssParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Utils {
    public static String indent(String text) {
        StringBuilder sb = new StringBuilder();

        sb.append(Arrays.stream(text.split("\n"))
                .map(line -> (line.isEmpty() ? "" : "    " + line))
                .collect(Collectors.joining("\n")));

        if (text.endsWith("\n")) {
            sb.append("\n");
        }

        return sb.toString();
    }

    public static List<Argument> argumentsFromString(String text) {
        //text
        //    : parameter? (\n parameter)*
        //    ;
        //
        //parameter
        //    : (value | variableDeclaration | listSpaceSeparated | mapDeclaration) arglist? prio?
        //    ;

        String[] stringParams = text.split("\n");

        return Arrays.stream(stringParams)
                .map(param -> {
                    boolean isDotDotDot = false;
                    if (param.contains("...")) {
                        param = param.replace("...", "");
                        isDotDotDot = true;
                    }
                    String[] split = param.split(":");
                    String a = split[0].trim();
                    if (split.length == 2) return new Argument(a, Optional.of(split[1].trim()), isDotDotDot);
                    if (a.startsWith("$")) return new Argument(a, Optional.empty(), isDotDotDot);
                    return new Argument("", Optional.of(a), isDotDotDot);
                })
                .collect(Collectors.toList());
    }

    public static Optional<Mixin> findBestMixin(List<Mixin> mixins, Mixin template) {
        Optional<Mixin> bestMixin = Optional.empty();
        int bestScore = Integer.MAX_VALUE;

        for (Mixin mixin : mixins) {
            if (!mixin.name().equals(template.name())) continue;

            Optional<Mixin> foundMixin = mixin.fitArgs(template.args());

            if (foundMixin.isPresent()) {
                if (bestMixin.isPresent()) {
                    int myScore = Math.abs(foundMixin.get().argCount() - template.argCount());
                    if (myScore < bestScore) {
                        bestMixin = foundMixin;
                        bestScore = myScore;
                    } else if (foundMixin.get().isMoreSpecificThan(bestMixin.get())) {
                        bestMixin = foundMixin;
                        bestScore = myScore;
                    }
                } else {
                    bestMixin = foundMixin;
                }
            }
        }

        return bestMixin;
    }

    public static String evalParentContext(ScssToCssGenerator compilator, List<ParseTree> childs, List<String> parentContexts) {
        List<String> res = evalSubContext(compilator, childs, parentContexts);
        return String.join(", ", res);
    }

    private static List<String> evalSubContext(ScssToCssGenerator compilator, List<ParseTree> childs, List<String> parentContexts) {
        boolean haveEncounteredParentSelector = false;
        boolean insertResult = true;

        List<String> res = new ArrayList<>();

        for (String parentContext : parentContexts) {
            StringBuilder subBuilder = new StringBuilder();

            for (int i = 0; i < childs.size(); i++) {
                ParseTree child = childs.get(i);

                if (child instanceof ScssParser.ParentRefContext) {
                    if (!haveEncounteredParentSelector) {
                        haveEncounteredParentSelector = true;
                        subBuilder.append(parentContext);

                    } else {
                        List<String> subContexts = evalSubContext(compilator, childs.subList(i + 1, childs.size()), parentContexts);

                        res.addAll(
                                subContexts.stream()
                                        .map(s -> subBuilder + s)
                                        .toList()
                        );

                        insertResult = false;

                        break;
                    }
                } else {
                    String text = (child instanceof TerminalNode) ? child.getText() : compilator.visit(child);
                    subBuilder.append(text);
                }

                if (i + 1 < childs.size()) subBuilder.append(" ");
            }

            if (insertResult) {
                subBuilder.replace(0, subBuilder.length(), subBuilder.toString().replace(" :", ":"));
                res.add(subBuilder.toString());
            }
        }


        return res;
    }

    private enum ExprType {
        NUMBER,
        BOOLEAN,
        STRING,
    }

    private record ExprValue(double number, String type, ExprType exprType) {
        public static ExprValue fromString(String originalString) {
            Pattern pattern = Pattern.compile("[+-]?\\d+\\.?\\d*");
            Matcher matcher = pattern.matcher(originalString);
            boolean haveMatch = matcher.find();

            String numberString = (haveMatch ? matcher.group() : originalString);
            String typeString = originalString.replaceAll(numberString, "");

            boolean isBoolean = (originalString.equalsIgnoreCase("true") || originalString.equalsIgnoreCase("false"));
            boolean isString = (!isBoolean && !haveMatch);
            ExprType exprType;

            double number;
            String type;
            if (isBoolean) {
                number = (originalString.equalsIgnoreCase("true")) ? 1 : 0;
                type = "";
                exprType = ExprType.BOOLEAN;
            } else if (isString) {
                type = numberString;
                number = 0;
                exprType = ExprType.STRING;
            } else {
                try {
                    number = Double.parseDouble(numberString);
                    type = typeString;
                } catch (NumberFormatException e) {
                    System.err.println("Error parsing number: " + originalString);
                    number = Double.parseDouble(numberString);
                    type = typeString;
                }
                exprType = ExprType.NUMBER;
            }

            return new ExprValue(number, type, exprType);
        }

        @Override
        public String toString() {
            return switch (exprType) {
                case NUMBER -> number + type;
                case STRING -> type;
                case BOOLEAN -> (number == 1) ? "true" : "false";
            };
        }
    }

    // Eval anything except NOT
    public static String evalSingularExpression(String a, String b, String operator) {
        if (a.equals("null") || b.equals("null") || operator.equals("null")) return "null";

        if (a.isEmpty() && b.isEmpty()) {
            return "";
        } else if (a.isEmpty() && !b.isEmpty()) {
            return b;
        } else if (!a.isEmpty() && b.isEmpty()) {
            return a;
        }

        ExprValue exprValueA = ExprValue.fromString(a);
        ExprValue exprValueB = ExprValue.fromString(b);

        if (!exprValueA.type.isEmpty() && !exprValueB.type.isEmpty()) {
            if (!(exprValueA.exprType == ExprType.STRING) && !(exprValueB.exprType == ExprType.STRING))
                if (!exprValueA.type.equals(exprValueB.type)) {
                    throw new ArithmeticException("value 1 '" + exprValueA + "' does not match value 2 '" + exprValueB + "' type");
                }
        }

        if (exprValueA.exprType != exprValueB.exprType) {
            throw new ArithmeticException("value 1 '" + exprValueA + "' does not match value 2 '" + exprValueB + "' type");
        }

        if (exprValueA.exprType == ExprType.BOOLEAN && exprValueB.exprType == ExprType.BOOLEAN
                && !(
                operator.equalsIgnoreCase("==")
                        || operator.equalsIgnoreCase("!=")
                        || operator.equalsIgnoreCase("and")
                        || operator.equalsIgnoreCase("or"))
        ) {
            throw new ArithmeticException("operation '" + a + operator + b + " is not allowed");
        }

        if (exprValueA.exprType == ExprType.NUMBER && exprValueB.exprType == ExprType.NUMBER && (operator.equalsIgnoreCase("and") || operator.equalsIgnoreCase("or"))) {
            throw new ArithmeticException("operation '" + a + operator + b + " is not allowed");
        }

        if (exprValueA.exprType == ExprType.STRING && exprValueB.exprType == ExprType.STRING && !(operator.equalsIgnoreCase("==") || operator.equalsIgnoreCase("!="))) {
            throw new ArithmeticException("operation '" + a + operator + b + " is not allowed");
        }

        String res = switch (operator) {
            case "+" -> "" + (exprValueA.number + exprValueB.number);
            case "-" -> "" + (exprValueA.number - exprValueB.number);
            case "*" -> "" + (exprValueA.number * exprValueB.number);
            case "/" -> "" + (exprValueA.number / exprValueB.number);
            case "%" -> "" + (exprValueA.number % exprValueB.number);
            case ">" -> (exprValueA.number > exprValueB.number) ? "true" : "false";
            case "<" -> (exprValueA.number < exprValueB.number) ? "true" : "false";
            case ">=" -> (exprValueA.number >= exprValueB.number) ? "true" : "false";
            case "<=" -> (exprValueA.number <= exprValueB.number) ? "true" : "false";
            case "==" -> {
                if (exprValueA.exprType != ExprType.STRING)
                    yield (exprValueA.number == exprValueB.number) ? "true" : "false";
                yield exprValueA.type.equalsIgnoreCase(exprValueB.type) ? "true" : "false";
            }
            case "!=" -> {
                if (exprValueA.exprType != ExprType.STRING)
                    yield (exprValueA.number != exprValueB.number) ? "true" : "false";
                yield !exprValueA.type.equalsIgnoreCase(exprValueB.type) ? "true" : "false";
            }
            case "and" -> (exprValueA.number == 1 && exprValueB.number == 1) ? "true" : "false";
            case "or" -> (exprValueA.number == 1 || exprValueB.number == 1) ? "true" : "false";
            default -> "unsupported operator '" + operator + "'";
        };

        String finalType;
        if (exprValueA.type.isEmpty() && !exprValueB.type.isEmpty()) {
            finalType = exprValueB.type;
        } else if (!exprValueA.type.isEmpty() && exprValueB.type.isEmpty()) {
            finalType = exprValueA.type;
        } else {
            finalType = exprValueA.type;
        }

        res = res.replaceFirst("0+$", "").replaceFirst("\\.$", "");
        if (res.equals("true") || res.equals("false")) return res;
        if (a.trim().startsWith("#") || b.trim().startsWith("#")) return finalType + res;
        return res + finalType;
    }

    public static String evalNotExpression(String expr) {
        //Boolean.parseBoolean(expr);
        return expr;
    }

    public static int getPriority(String operator) {
        return switch (operator) {
            case "*", "/", "%" -> 1;
            case "+", "-" -> 2;
            case ">", "<=", ">=", "<" -> 3;
            case "==", "!=" -> 4;
            case "and" -> 5;
            case "or" -> 6;
            default -> -1;
        };
    }
}
