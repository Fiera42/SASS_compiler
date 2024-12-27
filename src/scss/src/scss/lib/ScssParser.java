// Generated from C:/Users/anaig/OneDrive/Documents/Prog/IUT/S5/compilation/antlr/src/scss/src/ScssParser.g4 by ANTLR 4.13.2
package scss.src.scss.lib;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ScssParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            Comment = 1, MultiLineComment = 2, LineComment = 3, Space = 4, Uri = 5, Format = 6,
            AbsLength = 7, FontRelative = 8, ViewportRelative = 9, Angle = 10, Resolution = 11,
            Freq = 12, Time = 13, Percentage = 14, Import = 15, Include = 16, Use = 17, Require = 18,
            Charset = 19, Mixin = 20, Function = 21, FontFace = 22, Forward = 23, Content = 24,
            Keyframes = 25, Return = 26, Media = 27, Extend = 28, Warn = 29, Error = 30, If = 31,
            AtIf = 32, AtFor = 33, AtElse = 34, AtWhile = 35, AtEach = 36, From = 37, To = 38, Through = 39,
            Only = 40, Not = 41, And = 42, Using = 43, As = 44, With = 45, Or = 46, In = 47, Default = 48,
            Important = 49, Lparen = 50, Rparen = 51, Lbrack = 52, Rbrack = 53, BlockStart = 54,
            BlockEnd = 55, Dot = 56, Comma = 57, Colon = 58, Semi = 59, Tilde = 60, Under = 61,
            Dollar = 62, At = 63, Amp = 64, Hash = 65, True = 66, False = 67, Plus = 68, Div = 69,
            Minus = 70, Times = 71, Eq = 72, NotEq = 73, Greater = 74, Less = 75, Includes = 76,
            DashMatch = 77, Pipe = 78, Cdo = 79, Cdc = 80, PseudoNot = 81, Calc = 82, Rotate = 83,
            Var = 84, Rgba = 85, Repeat = 86, PrefixMatch = 87, SuffixMatch = 88, SubstringMatch = 89,
            VendorPrefix = 90, Variable = 91, Number = 92, String_ = 93, Ident = 94;
    public static final int
            RULE_stylesheet = 0, RULE_statement = 1, RULE_importDeclaration = 2, RULE_importPath = 3,
            RULE_asClause = 4, RULE_withClause = 5, RULE_variableDeclaration = 6,
            RULE_variableValue = 7, RULE_variableName = 8, RULE_namespace_ = 9, RULE_propertyDeclaration = 10,
            RULE_prio = 11, RULE_propertyValue = 12, RULE_mediaDeclaration = 13, RULE_mediaQueryList = 14,
            RULE_mediaQuery = 15, RULE_mediaExpression = 16, RULE_mixinDeclaration = 17,
            RULE_contentDeclaration = 18, RULE_fontFaceDeclaration = 19, RULE_keyframesDeclaration = 20,
            RULE_keyframesBlock = 21, RULE_percentageStatement = 22, RULE_includeDeclaration = 23,
            RULE_interpolationDeclaration = 24, RULE_extendDeclaration = 25, RULE_warndingDeclaration = 26,
            RULE_errorDeclaration = 27, RULE_atStatementDeclaration = 28, RULE_ruleset = 29,
            RULE_block = 30, RULE_selectorGroup = 31, RULE_selector = 32, RULE_combinator = 33,
            RULE_selectorSequence = 34, RULE_id = 35, RULE_typeSelector = 36, RULE_typeNamespacePrefix = 37,
            RULE_universal = 38, RULE_className = 39, RULE_interpolation = 40, RULE_parentRef = 41,
            RULE_attrib = 42, RULE_pseudo = 43, RULE_functionalPseudo = 44, RULE_pseudoParameter = 45,
            RULE_negation = 46, RULE_negationArg = 47, RULE_operator_ = 48, RULE_value = 49,
            RULE_functionDeclaration = 50, RULE_parameters = 51, RULE_parameter = 52,
            RULE_functionBody = 53, RULE_functionReturn = 54, RULE_functionStatement = 55,
            RULE_functionCall = 56, RULE_expression = 57, RULE_expressionPart = 58,
            RULE_ifExpression = 59, RULE_listDeclaration = 60, RULE_listCommaSeparated = 61,
            RULE_listSpaceSeparated = 62, RULE_listBracketed = 63, RULE_listElement = 64,
            RULE_mapDeclaration = 65, RULE_mapEntries = 66, RULE_mapEntry = 67, RULE_mapKey = 68,
            RULE_mapValue = 69, RULE_ifDeclaration = 70, RULE_elseIfStatement = 71,
            RULE_elseStatement = 72, RULE_forDeclaration = 73, RULE_through = 74,
            RULE_whileDeclaration = 75, RULE_eachDeclaration = 76, RULE_eachValueList = 77,
            RULE_var_ = 78, RULE_calc = 79, RULE_rotate = 80, RULE_rgba = 81, RULE_repeat = 82,
            RULE_unit = 83, RULE_length = 84, RULE_dimension = 85, RULE_percentage = 86,
            RULE_degree = 87, RULE_measurment = 88, RULE_uri = 89, RULE_arglist = 90,
            RULE_plusMinus = 91, RULE_hexcolor = 92, RULE_color = 93, RULE_boolean = 94,
            RULE_number = 95, RULE_identifier = 96;

    private static String[] makeRuleNames() {
        return new String[]{
                "stylesheet", "statement", "importDeclaration", "importPath", "asClause",
                "withClause", "variableDeclaration", "variableValue", "variableName",
                "namespace_", "propertyDeclaration", "prio", "propertyValue", "mediaDeclaration",
                "mediaQueryList", "mediaQuery", "mediaExpression", "mixinDeclaration",
                "contentDeclaration", "fontFaceDeclaration", "keyframesDeclaration",
                "keyframesBlock", "percentageStatement", "includeDeclaration", "interpolationDeclaration",
                "extendDeclaration", "warndingDeclaration", "errorDeclaration", "atStatementDeclaration",
                "ruleset", "block", "selectorGroup", "selector", "combinator", "selectorSequence",
                "id", "typeSelector", "typeNamespacePrefix", "universal", "className",
                "interpolation", "parentRef", "attrib", "pseudo", "functionalPseudo",
                "pseudoParameter", "negation", "negationArg", "operator_", "value", "functionDeclaration",
                "parameters", "parameter", "functionBody", "functionReturn", "functionStatement",
                "functionCall", "expression", "expressionPart", "ifExpression", "listDeclaration",
                "listCommaSeparated", "listSpaceSeparated", "listBracketed", "listElement",
                "mapDeclaration", "mapEntries", "mapEntry", "mapKey", "mapValue", "ifDeclaration",
                "elseIfStatement", "elseStatement", "forDeclaration", "through", "whileDeclaration",
                "eachDeclaration", "eachValueList", "var_", "calc", "rotate", "rgba",
                "repeat", "unit", "length", "dimension", "percentage", "degree", "measurment",
                "uri", "arglist", "plusMinus", "hexcolor", "color", "boolean", "number",
                "identifier"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, "'%'", "'@import'", "'@include'", "'@use'", "'@require'",
                "'@charset '", "'@mixin'", "'@function'", "'@font-face'", "'@forward'",
                "'@content'", "'@keyframes'", "'@return'", "'@media'", "'@extend'", "'@warn'",
                "'@error'", "'if'", "'@if'", "'@for'", "'@else'", "'@while'", "'@each'",
                "'from'", "'to'", "'through'", "'only'", "'not'", "'and'", "'using'",
                "'as'", "'with'", "'or'", "'in'", "'!default'", "'!important'", "'('",
                "')'", "'['", "']'", "'{'", "'}'", "'.'", "','", "':'", "';'", "'~'",
                "'_'", "'$'", "'@'", "'&'", "'#'", "'true'", "'false'", "'+'", "'/'",
                "'-'", "'*'", "'='", "'!='", "'>'", "'<'", "'~='", "'|='", "'|'", "'<!--'",
                "'-->'", "':not('", "'calc('", "'rotate('", "'var('", "'rgba('", "'repeat('",
                "'^='", "'$='", "'*='"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "Comment", "MultiLineComment", "LineComment", "Space", "Uri", "Format",
                "AbsLength", "FontRelative", "ViewportRelative", "Angle", "Resolution",
                "Freq", "Time", "Percentage", "Import", "Include", "Use", "Require",
                "Charset", "Mixin", "Function", "FontFace", "Forward", "Content", "Keyframes",
                "Return", "Media", "Extend", "Warn", "Error", "If", "AtIf", "AtFor",
                "AtElse", "AtWhile", "AtEach", "From", "To", "Through", "Only", "Not",
                "And", "Using", "As", "With", "Or", "In", "Default", "Important", "Lparen",
                "Rparen", "Lbrack", "Rbrack", "BlockStart", "BlockEnd", "Dot", "Comma",
                "Colon", "Semi", "Tilde", "Under", "Dollar", "At", "Amp", "Hash", "True",
                "False", "Plus", "Div", "Minus", "Times", "Eq", "NotEq", "Greater", "Less",
                "Includes", "DashMatch", "Pipe", "Cdo", "Cdc", "PseudoNot", "Calc", "Rotate",
                "Var", "Rgba", "Repeat", "PrefixMatch", "SuffixMatch", "SubstringMatch",
                "VendorPrefix", "Variable", "Number", "String_", "Ident"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "ScssParser.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public ScssParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StylesheetContext extends ParserRuleContext {
        public TerminalNode EOF() {
            return getToken(ScssParser.EOF, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public StylesheetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stylesheet;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterStylesheet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitStylesheet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitStylesheet(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StylesheetContext stylesheet() throws RecognitionException {
        StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_stylesheet);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(197);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -788129404429025264L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1543652563L) != 0)) {
                    {
                        {
                            setState(194);
                            statement();
                        }
                    }
                    setState(199);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(200);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StatementContext extends ParserRuleContext {
        public ImportDeclarationContext importDeclaration() {
            return getRuleContext(ImportDeclarationContext.class, 0);
        }

        public VariableDeclarationContext variableDeclaration() {
            return getRuleContext(VariableDeclarationContext.class, 0);
        }

        public PropertyDeclarationContext propertyDeclaration() {
            return getRuleContext(PropertyDeclarationContext.class, 0);
        }

        public InterpolationDeclarationContext interpolationDeclaration() {
            return getRuleContext(InterpolationDeclarationContext.class, 0);
        }

        public MediaDeclarationContext mediaDeclaration() {
            return getRuleContext(MediaDeclarationContext.class, 0);
        }

        public MixinDeclarationContext mixinDeclaration() {
            return getRuleContext(MixinDeclarationContext.class, 0);
        }

        public ContentDeclarationContext contentDeclaration() {
            return getRuleContext(ContentDeclarationContext.class, 0);
        }

        public FunctionDeclarationContext functionDeclaration() {
            return getRuleContext(FunctionDeclarationContext.class, 0);
        }

        public IfDeclarationContext ifDeclaration() {
            return getRuleContext(IfDeclarationContext.class, 0);
        }

        public ForDeclarationContext forDeclaration() {
            return getRuleContext(ForDeclarationContext.class, 0);
        }

        public WhileDeclarationContext whileDeclaration() {
            return getRuleContext(WhileDeclarationContext.class, 0);
        }

        public EachDeclarationContext eachDeclaration() {
            return getRuleContext(EachDeclarationContext.class, 0);
        }

        public FontFaceDeclarationContext fontFaceDeclaration() {
            return getRuleContext(FontFaceDeclarationContext.class, 0);
        }

        public KeyframesDeclarationContext keyframesDeclaration() {
            return getRuleContext(KeyframesDeclarationContext.class, 0);
        }

        public IncludeDeclarationContext includeDeclaration() {
            return getRuleContext(IncludeDeclarationContext.class, 0);
        }

        public ExtendDeclarationContext extendDeclaration() {
            return getRuleContext(ExtendDeclarationContext.class, 0);
        }

        public WarndingDeclarationContext warndingDeclaration() {
            return getRuleContext(WarndingDeclarationContext.class, 0);
        }

        public ErrorDeclarationContext errorDeclaration() {
            return getRuleContext(ErrorDeclarationContext.class, 0);
        }

        public RulesetContext ruleset() {
            return getRuleContext(RulesetContext.class, 0);
        }

        public AtStatementDeclarationContext atStatementDeclaration() {
            return getRuleContext(AtStatementDeclarationContext.class, 0);
        }

        public PercentageStatementContext percentageStatement() {
            return getRuleContext(PercentageStatementContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            setState(223);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(202);
                    importDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(203);
                    variableDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(204);
                    propertyDeclaration();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(205);
                    interpolationDeclaration();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(206);
                    mediaDeclaration();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(207);
                    mixinDeclaration();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(208);
                    contentDeclaration();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(209);
                    functionDeclaration();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(210);
                    ifDeclaration();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(211);
                    forDeclaration();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(212);
                    whileDeclaration();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(213);
                    eachDeclaration();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(214);
                    fontFaceDeclaration();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(215);
                    keyframesDeclaration();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(216);
                    includeDeclaration();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(217);
                    extendDeclaration();
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(218);
                    warndingDeclaration();
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(219);
                    errorDeclaration();
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(220);
                    ruleset();
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(221);
                    atStatementDeclaration();
                }
                break;
                case 21:
                    enterOuterAlt(_localctx, 21);
                {
                    setState(222);
                    percentageStatement();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ImportDeclarationContext extends ParserRuleContext {
        public TerminalNode Import() {
            return getToken(ScssParser.Import, 0);
        }

        public ImportPathContext importPath() {
            return getRuleContext(ImportPathContext.class, 0);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public TerminalNode Require() {
            return getToken(ScssParser.Require, 0);
        }

        public TerminalNode Use() {
            return getToken(ScssParser.Use, 0);
        }

        public AsClauseContext asClause() {
            return getRuleContext(AsClauseContext.class, 0);
        }

        public WithClauseContext withClause() {
            return getRuleContext(WithClauseContext.class, 0);
        }

        public TerminalNode Forward() {
            return getToken(ScssParser.Forward, 0);
        }

        public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterImportDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitImportDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitImportDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ImportDeclarationContext importDeclaration() throws RecognitionException {
        ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_importDeclaration);
        int _la;
        try {
            setState(248);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Import:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(225);
                    match(Import);
                    setState(226);
                    importPath();
                    setState(228);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Semi) {
                        {
                            setState(227);
                            match(Semi);
                        }
                    }

                }
                break;
                case Require:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(230);
                    match(Require);
                    setState(231);
                    importPath();
                    setState(233);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Semi) {
                        {
                            setState(232);
                            match(Semi);
                        }
                    }

                }
                break;
                case Use:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(235);
                    match(Use);
                    setState(236);
                    importPath();
                    setState(238);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == As) {
                        {
                            setState(237);
                            asClause();
                        }
                    }

                    setState(241);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == With) {
                        {
                            setState(240);
                            withClause();
                        }
                    }

                    setState(244);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Semi) {
                        {
                            setState(243);
                            match(Semi);
                        }
                    }

                }
                break;
                case Forward:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(246);
                    match(Forward);
                    setState(247);
                    importPath();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ImportPathContext extends ParserRuleContext {
        public UriContext uri() {
            return getRuleContext(UriContext.class, 0);
        }

        public TerminalNode String_() {
            return getToken(ScssParser.String_, 0);
        }

        public ImportPathContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importPath;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterImportPath(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitImportPath(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitImportPath(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ImportPathContext importPath() throws RecognitionException {
        ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_importPath);
        try {
            setState(252);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Uri:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(250);
                    uri();
                }
                break;
                case String_:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(251);
                    match(String_);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AsClauseContext extends ParserRuleContext {
        public TerminalNode As() {
            return getToken(ScssParser.As, 0);
        }

        public TerminalNode Times() {
            return getToken(ScssParser.Times, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public AsClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_asClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterAsClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitAsClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitAsClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AsClauseContext asClause() throws RecognitionException {
        AsClauseContext _localctx = new AsClauseContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_asClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
                match(As);
                setState(257);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case Times: {
                        setState(255);
                        match(Times);
                    }
                    break;
                    case From:
                    case To:
                    case Under:
                    case Minus:
                    case VendorPrefix:
                    case Ident: {
                        setState(256);
                        identifier();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WithClauseContext extends ParserRuleContext {
        public TerminalNode With() {
            return getToken(ScssParser.With, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public WithClauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_withClause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterWithClause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitWithClause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitWithClause(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WithClauseContext withClause() throws RecognitionException {
        WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_withClause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(259);
                match(With);
                setState(260);
                match(Lparen);
                setState(261);
                parameters();
                setState(262);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class VariableDeclarationContext extends ParserRuleContext {
        public VariableNameContext variableName() {
            return getRuleContext(VariableNameContext.class, 0);
        }

        public TerminalNode Colon() {
            return getToken(ScssParser.Colon, 0);
        }

        public VariableValueContext variableValue() {
            return getRuleContext(VariableValueContext.class, 0);
        }

        public PrioContext prio() {
            return getRuleContext(PrioContext.class, 0);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterVariableDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitVariableDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitVariableDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
        VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_variableDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(264);
                variableName();
                setState(265);
                match(Colon);
                setState(266);
                variableValue();
                setState(268);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                    case 1: {
                        setState(267);
                        prio();
                    }
                    break;
                }
                setState(271);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Semi) {
                    {
                        setState(270);
                        match(Semi);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class VariableValueContext extends ParserRuleContext {
        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public FunctionDeclarationContext functionDeclaration() {
            return getRuleContext(FunctionDeclarationContext.class, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public List<MapDeclarationContext> mapDeclaration() {
            return getRuleContexts(MapDeclarationContext.class);
        }

        public MapDeclarationContext mapDeclaration(int i) {
            return getRuleContext(MapDeclarationContext.class, i);
        }

        public List<ListDeclarationContext> listDeclaration() {
            return getRuleContexts(ListDeclarationContext.class);
        }

        public ListDeclarationContext listDeclaration(int i) {
            return getRuleContext(ListDeclarationContext.class, i);
        }

        public VariableNameContext variableName() {
            return getRuleContext(VariableNameContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public VariableValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterVariableValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitVariableValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitVariableValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VariableValueContext variableValue() throws RecognitionException {
        VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_variableValue);
        try {
            int _alt;
            setState(288);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(273);
                    value();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(274);
                    functionDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(275);
                    functionCall();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(277);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                {
                                    setState(276);
                                    mapDeclaration();
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(279);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(282);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                {
                                    setState(281);
                                    listDeclaration();
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(284);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(286);
                    variableName();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(287);
                    identifier();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class VariableNameContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode Dollar() {
            return getToken(ScssParser.Dollar, 0);
        }

        public PlusMinusContext plusMinus() {
            return getRuleContext(PlusMinusContext.class, 0);
        }

        public List<TerminalNode> Minus() {
            return getTokens(ScssParser.Minus);
        }

        public TerminalNode Minus(int i) {
            return getToken(ScssParser.Minus, i);
        }

        public MeasurmentContext measurment() {
            return getRuleContext(MeasurmentContext.class, 0);
        }

        public Namespace_Context namespace_() {
            return getRuleContext(Namespace_Context.class, 0);
        }

        public TerminalNode Variable() {
            return getToken(ScssParser.Variable, 0);
        }

        public VariableNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_variableName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterVariableName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitVariableName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitVariableName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final VariableNameContext variableName() throws RecognitionException {
        VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_variableName);
        int _la;
        try {
            setState(313);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(298);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
                        case 1: {
                            {
                                setState(290);
                                match(Minus);
                                setState(291);
                                match(Minus);
                            }
                            setState(293);
                            match(Dollar);
                        }
                        break;
                        case 2: {
                            setState(294);
                            plusMinus();
                            setState(295);
                            match(Dollar);
                        }
                        break;
                        case 3: {
                            setState(297);
                            match(Dollar);
                        }
                        break;
                    }
                    setState(300);
                    identifier();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(302);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                        case 1: {
                            setState(301);
                            plusMinus();
                        }
                        break;
                    }
                    setState(305);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 153122395937308675L) != 0)) {
                        {
                            setState(304);
                            namespace_();
                        }
                    }

                    setState(307);
                    match(Dollar);
                    setState(310);
                    _errHandler.sync(this);
                    switch (_input.LA(1)) {
                        case From:
                        case To:
                        case Under:
                        case Minus:
                        case VendorPrefix:
                        case Ident: {
                            setState(308);
                            identifier();
                        }
                        break;
                        case AbsLength:
                        case FontRelative:
                        case ViewportRelative:
                        case Angle:
                        case Resolution:
                        case Freq:
                        case Time:
                        case Percentage: {
                            setState(309);
                            measurment();
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(312);
                    match(Variable);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Namespace_Context extends ParserRuleContext {
        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public List<TerminalNode> Dot() {
            return getTokens(ScssParser.Dot);
        }

        public TerminalNode Dot(int i) {
            return getToken(ScssParser.Dot, i);
        }

        public Namespace_Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_namespace_;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterNamespace_(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitNamespace_(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitNamespace_(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Namespace_Context namespace_() throws RecognitionException {
        Namespace_Context _localctx = new Namespace_Context(_ctx, getState());
        enterRule(_localctx, 18, RULE_namespace_);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(318);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(315);
                                identifier();
                                setState(316);
                                match(Dot);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(320);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 20, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PropertyDeclarationContext extends ParserRuleContext {
        public TerminalNode Colon() {
            return getToken(ScssParser.Colon, 0);
        }

        public PropertyValueContext propertyValue() {
            return getRuleContext(PropertyValueContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public InterpolationContext interpolation() {
            return getRuleContext(InterpolationContext.class, 0);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_propertyDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterPropertyDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitPropertyDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitPropertyDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
        PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_propertyDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(324);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                    case 1: {
                        setState(322);
                        identifier();
                    }
                    break;
                    case 2: {
                        setState(323);
                        interpolation();
                    }
                    break;
                }
                setState(326);
                match(Colon);
                setState(327);
                propertyValue();
                setState(329);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Semi) {
                    {
                        setState(328);
                        match(Semi);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PrioContext extends ParserRuleContext {
        public TerminalNode Important() {
            return getToken(ScssParser.Important, 0);
        }

        public TerminalNode Default() {
            return getToken(ScssParser.Default, 0);
        }

        public PrioContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prio;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterPrio(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitPrio(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor) return ((ScssParserVisitor<? extends T>) visitor).visitPrio(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PrioContext prio() throws RecognitionException {
        PrioContext _localctx = new PrioContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_prio);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(331);
                _la = _input.LA(1);
                if (!(_la == Default || _la == Important)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PropertyValueContext extends ParserRuleContext {
        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public VariableNameContext variableName() {
            return getRuleContext(VariableNameContext.class, 0);
        }

        public ListSpaceSeparatedContext listSpaceSeparated() {
            return getRuleContext(ListSpaceSeparatedContext.class, 0);
        }

        public ListCommaSeparatedContext listCommaSeparated() {
            return getRuleContext(ListCommaSeparatedContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public List<PrioContext> prio() {
            return getRuleContexts(PrioContext.class);
        }

        public PrioContext prio(int i) {
            return getRuleContext(PrioContext.class, i);
        }

        public PropertyValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_propertyValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterPropertyValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitPropertyValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitPropertyValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PropertyValueContext propertyValue() throws RecognitionException {
        PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_propertyValue);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(346);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                    case 1: {
                        setState(333);
                        value();
                    }
                    break;
                    case 2: {
                        setState(335);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                            case 1: {
                                setState(334);
                                value();
                            }
                            break;
                        }
                        setState(338);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == Default || _la == Important) {
                            {
                                setState(337);
                                prio();
                            }
                        }

                        setState(340);
                        block();
                    }
                    break;
                    case 3: {
                        setState(341);
                        variableName();
                    }
                    break;
                    case 4: {
                        setState(342);
                        listSpaceSeparated();
                    }
                    break;
                    case 5: {
                        setState(343);
                        listCommaSeparated();
                    }
                    break;
                    case 6: {
                        setState(344);
                        expression();
                    }
                    break;
                    case 7: {
                        setState(345);
                        functionCall();
                    }
                    break;
                }
                setState(349);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                    case 1: {
                        setState(348);
                        prio();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MediaDeclarationContext extends ParserRuleContext {
        public TerminalNode Media() {
            return getToken(ScssParser.Media, 0);
        }

        public MediaQueryListContext mediaQueryList() {
            return getRuleContext(MediaQueryListContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public MediaDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mediaDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMediaDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMediaDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMediaDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MediaDeclarationContext mediaDeclaration() throws RecognitionException {
        MediaDeclarationContext _localctx = new MediaDeclarationContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_mediaDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(351);
                match(Media);
                setState(352);
                mediaQueryList();
                setState(353);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MediaQueryListContext extends ParserRuleContext {
        public List<MediaQueryContext> mediaQuery() {
            return getRuleContexts(MediaQueryContext.class);
        }

        public MediaQueryContext mediaQuery(int i) {
            return getRuleContext(MediaQueryContext.class, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ScssParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ScssParser.Comma, i);
        }

        public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mediaQueryList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMediaQueryList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMediaQueryList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMediaQueryList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MediaQueryListContext mediaQueryList() throws RecognitionException {
        MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_mediaQueryList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(363);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
                    case 1: {
                        setState(355);
                        mediaQuery();
                        setState(360);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == Comma) {
                            {
                                {
                                    setState(356);
                                    match(Comma);
                                    setState(357);
                                    mediaQuery();
                                }
                            }
                            setState(362);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MediaQueryContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public List<TerminalNode> And() {
            return getTokens(ScssParser.And);
        }

        public TerminalNode And(int i) {
            return getToken(ScssParser.And, i);
        }

        public List<MediaExpressionContext> mediaExpression() {
            return getRuleContexts(MediaExpressionContext.class);
        }

        public MediaExpressionContext mediaExpression(int i) {
            return getRuleContext(MediaExpressionContext.class, i);
        }

        public TerminalNode Only() {
            return getToken(ScssParser.Only, 0);
        }

        public TerminalNode Not() {
            return getToken(ScssParser.Not, 0);
        }

        public MediaQueryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mediaQuery;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMediaQuery(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMediaQuery(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMediaQuery(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MediaQueryContext mediaQuery() throws RecognitionException {
        MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_mediaQuery);
        int _la;
        try {
            setState(387);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 33, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(366);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
                        case 1: {
                            setState(365);
                            _la = _input.LA(1);
                            if (!(_la == Only || _la == Not)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                        break;
                    }
                    setState(370);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
                        case 1: {
                            setState(368);
                            identifier();
                        }
                        break;
                        case 2: {
                            setState(369);
                            value();
                        }
                        break;
                    }
                    setState(376);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == And) {
                        {
                            {
                                setState(372);
                                match(And);
                                setState(373);
                                mediaExpression();
                            }
                        }
                        setState(378);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(379);
                    mediaExpression();
                    setState(384);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == And) {
                        {
                            {
                                setState(380);
                                match(And);
                                setState(381);
                                mediaExpression();
                            }
                        }
                        setState(386);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MediaExpressionContext extends ParserRuleContext {
        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public TerminalNode Colon() {
            return getToken(ScssParser.Colon, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public MediaExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mediaExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMediaExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMediaExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMediaExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MediaExpressionContext mediaExpression() throws RecognitionException {
        MediaExpressionContext _localctx = new MediaExpressionContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_mediaExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(389);
                match(Lparen);
                setState(390);
                identifier();
                setState(393);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Colon) {
                    {
                        setState(391);
                        match(Colon);
                        setState(392);
                        value();
                    }
                }

                setState(395);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MixinDeclarationContext extends ParserRuleContext {
        public TerminalNode Mixin() {
            return getToken(ScssParser.Mixin, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public InterpolationContext interpolation() {
            return getRuleContext(InterpolationContext.class, 0);
        }

        public MixinDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mixinDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMixinDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMixinDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMixinDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MixinDeclarationContext mixinDeclaration() throws RecognitionException {
        MixinDeclarationContext _localctx = new MixinDeclarationContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_mixinDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(397);
                match(Mixin);
                setState(405);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
                    case 1: {
                        setState(398);
                        identifier();
                    }
                    break;
                    case 2: {
                        setState(399);
                        identifier();
                        setState(400);
                        match(Lparen);
                        setState(401);
                        parameters();
                        setState(402);
                        match(Rparen);
                    }
                    break;
                    case 3: {
                        setState(404);
                        interpolation();
                    }
                    break;
                }
                setState(407);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ContentDeclarationContext extends ParserRuleContext {
        public TerminalNode Content() {
            return getToken(ScssParser.Content, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public ContentDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_contentDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterContentDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitContentDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitContentDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ContentDeclarationContext contentDeclaration() throws RecognitionException {
        ContentDeclarationContext _localctx = new ContentDeclarationContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_contentDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(409);
                match(Content);
                setState(414);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
                    case 1: {
                        setState(410);
                        match(Lparen);
                        setState(411);
                        parameters();
                        setState(412);
                        match(Rparen);
                    }
                    break;
                }
                setState(417);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Semi) {
                    {
                        setState(416);
                        match(Semi);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FontFaceDeclarationContext extends ParserRuleContext {
        public TerminalNode FontFace() {
            return getToken(ScssParser.FontFace, 0);
        }

        public TerminalNode BlockStart() {
            return getToken(ScssParser.BlockStart, 0);
        }

        public TerminalNode BlockEnd() {
            return getToken(ScssParser.BlockEnd, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public FontFaceDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fontFaceDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterFontFaceDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitFontFaceDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitFontFaceDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FontFaceDeclarationContext fontFaceDeclaration() throws RecognitionException {
        FontFaceDeclarationContext _localctx = new FontFaceDeclarationContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_fontFaceDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(419);
                match(FontFace);
                setState(420);
                match(BlockStart);
                setState(424);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -788129404429025264L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1543652563L) != 0)) {
                    {
                        {
                            setState(421);
                            statement();
                        }
                    }
                    setState(426);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(427);
                match(BlockEnd);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class KeyframesDeclarationContext extends ParserRuleContext {
        public TerminalNode Keyframes() {
            return getToken(ScssParser.Keyframes, 0);
        }

        public KeyframesBlockContext keyframesBlock() {
            return getRuleContext(KeyframesBlockContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public InterpolationContext interpolation() {
            return getRuleContext(InterpolationContext.class, 0);
        }

        public KeyframesDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_keyframesDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterKeyframesDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitKeyframesDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitKeyframesDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final KeyframesDeclarationContext keyframesDeclaration() throws RecognitionException {
        KeyframesDeclarationContext _localctx = new KeyframesDeclarationContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_keyframesDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(429);
                match(Keyframes);
                setState(432);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                    case 1: {
                        setState(430);
                        identifier();
                    }
                    break;
                    case 2: {
                        setState(431);
                        interpolation();
                    }
                    break;
                }
                setState(434);
                keyframesBlock();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class KeyframesBlockContext extends ParserRuleContext {
        public TerminalNode BlockStart() {
            return getToken(ScssParser.BlockStart, 0);
        }

        public TerminalNode BlockEnd() {
            return getToken(ScssParser.BlockEnd, 0);
        }

        public List<PercentageStatementContext> percentageStatement() {
            return getRuleContexts(PercentageStatementContext.class);
        }

        public PercentageStatementContext percentageStatement(int i) {
            return getRuleContext(PercentageStatementContext.class, i);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public KeyframesBlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_keyframesBlock;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterKeyframesBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitKeyframesBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitKeyframesBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public final KeyframesBlockContext keyframesBlock() throws RecognitionException {
        KeyframesBlockContext _localctx = new KeyframesBlockContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_keyframesBlock);
        int _la;
        try {
            setState(445);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 41, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(436);
                    match(BlockStart);
                    setState(440);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 16777221L) != 0)) {
                        {
                            {
                                setState(437);
                                percentageStatement();
                            }
                        }
                        setState(442);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(443);
                    match(BlockEnd);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(444);
                    block();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PercentageStatementContext extends ParserRuleContext {
        public PercentageContext percentage() {
            return getRuleContext(PercentageContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public PercentageStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_percentageStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterPercentageStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitPercentageStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitPercentageStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PercentageStatementContext percentageStatement() throws RecognitionException {
        PercentageStatementContext _localctx = new PercentageStatementContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_percentageStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(447);
                percentage();
                setState(448);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IncludeDeclarationContext extends ParserRuleContext {
        public TerminalNode Include() {
            return getToken(ScssParser.Include, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public Namespace_Context namespace_() {
            return getRuleContext(Namespace_Context.class, 0);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public TerminalNode Using() {
            return getToken(ScssParser.Using, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public IncludeDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_includeDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterIncludeDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitIncludeDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitIncludeDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IncludeDeclarationContext includeDeclaration() throws RecognitionException {
        IncludeDeclarationContext _localctx = new IncludeDeclarationContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_includeDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(450);
                match(Include);
                setState(452);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
                    case 1: {
                        setState(451);
                        namespace_();
                    }
                    break;
                }
                setState(456);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
                    case 1: {
                        setState(454);
                        identifier();
                    }
                    break;
                    case 2: {
                        setState(455);
                        functionCall();
                    }
                    break;
                }
                setState(464);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case Semi: {
                        setState(458);
                        match(Semi);
                    }
                    break;
                    case Using: {
                        setState(459);
                        match(Using);
                        setState(460);
                        match(Lparen);
                        setState(461);
                        parameters();
                        setState(462);
                        match(Rparen);
                    }
                    break;
                    case EOF:
                    case Space:
                    case Uri:
                    case Format:
                    case AbsLength:
                    case FontRelative:
                    case ViewportRelative:
                    case Angle:
                    case Resolution:
                    case Freq:
                    case Time:
                    case Percentage:
                    case Import:
                    case Include:
                    case Use:
                    case Require:
                    case Mixin:
                    case Function:
                    case FontFace:
                    case Forward:
                    case Content:
                    case Keyframes:
                    case Return:
                    case Media:
                    case Extend:
                    case Warn:
                    case Error:
                    case If:
                    case AtIf:
                    case AtFor:
                    case AtWhile:
                    case AtEach:
                    case From:
                    case To:
                    case Not:
                    case Default:
                    case Important:
                    case Lparen:
                    case Lbrack:
                    case BlockStart:
                    case BlockEnd:
                    case Dot:
                    case Colon:
                    case Tilde:
                    case Under:
                    case Dollar:
                    case At:
                    case Amp:
                    case Hash:
                    case True:
                    case False:
                    case Plus:
                    case Minus:
                    case Times:
                    case Greater:
                    case Pipe:
                    case PseudoNot:
                    case Calc:
                    case Rotate:
                    case Var:
                    case Rgba:
                    case VendorPrefix:
                    case Variable:
                    case Number:
                    case String_:
                    case Ident:
                        break;
                    default:
                        break;
                }
                setState(467);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == BlockStart) {
                    {
                        setState(466);
                        block();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InterpolationDeclarationContext extends ParserRuleContext {
        public InterpolationContext interpolation() {
            return getRuleContext(InterpolationContext.class, 0);
        }

        public TerminalNode Colon() {
            return getToken(ScssParser.Colon, 0);
        }

        public PropertyValueContext propertyValue() {
            return getRuleContext(PropertyValueContext.class, 0);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public InterpolationDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interpolationDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener)
                ((ScssParserListener) listener).enterInterpolationDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener)
                ((ScssParserListener) listener).exitInterpolationDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitInterpolationDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final InterpolationDeclarationContext interpolationDeclaration() throws RecognitionException {
        InterpolationDeclarationContext _localctx = new InterpolationDeclarationContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_interpolationDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(469);
                interpolation();
                setState(470);
                match(Colon);
                setState(471);
                propertyValue();
                setState(473);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Semi) {
                    {
                        setState(472);
                        match(Semi);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExtendDeclarationContext extends ParserRuleContext {
        public TerminalNode Extend() {
            return getToken(ScssParser.Extend, 0);
        }

        public TerminalNode Percentage() {
            return getToken(ScssParser.Percentage, 0);
        }

        public List<ParentRefContext> parentRef() {
            return getRuleContexts(ParentRefContext.class);
        }

        public ParentRefContext parentRef(int i) {
            return getRuleContext(ParentRefContext.class, i);
        }

        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public List<TypeSelectorContext> typeSelector() {
            return getRuleContexts(TypeSelectorContext.class);
        }

        public TypeSelectorContext typeSelector(int i) {
            return getRuleContext(TypeSelectorContext.class, i);
        }

        public List<UniversalContext> universal() {
            return getRuleContexts(UniversalContext.class);
        }

        public UniversalContext universal(int i) {
            return getRuleContext(UniversalContext.class, i);
        }

        public List<ClassNameContext> className() {
            return getRuleContexts(ClassNameContext.class);
        }

        public ClassNameContext className(int i) {
            return getRuleContext(ClassNameContext.class, i);
        }

        public List<AttribContext> attrib() {
            return getRuleContexts(AttribContext.class);
        }

        public AttribContext attrib(int i) {
            return getRuleContext(AttribContext.class, i);
        }

        public List<PseudoContext> pseudo() {
            return getRuleContexts(PseudoContext.class);
        }

        public PseudoContext pseudo(int i) {
            return getRuleContext(PseudoContext.class, i);
        }

        public List<InterpolationContext> interpolation() {
            return getRuleContexts(InterpolationContext.class);
        }

        public InterpolationContext interpolation(int i) {
            return getRuleContext(InterpolationContext.class, i);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public ExtendDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_extendDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterExtendDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitExtendDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitExtendDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExtendDeclarationContext extendDeclaration() throws RecognitionException {
        ExtendDeclarationContext _localctx = new ExtendDeclarationContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_extendDeclaration);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(475);
                match(Extend);
                setState(478);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 47, _ctx)) {
                    case 1: {
                        setState(476);
                        match(Percentage);
                    }
                    break;
                    case 2: {
                        setState(477);
                        parentRef();
                    }
                    break;
                }
                setState(488);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            setState(488);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
                                case 1: {
                                    setState(480);
                                    id();
                                }
                                break;
                                case 2: {
                                    setState(481);
                                    typeSelector();
                                }
                                break;
                                case 3: {
                                    setState(482);
                                    universal();
                                }
                                break;
                                case 4: {
                                    setState(483);
                                    className();
                                }
                                break;
                                case 5: {
                                    setState(484);
                                    attrib();
                                }
                                break;
                                case 6: {
                                    setState(485);
                                    pseudo();
                                }
                                break;
                                case 7: {
                                    setState(486);
                                    interpolation();
                                }
                                break;
                                case 8: {
                                    setState(487);
                                    parentRef();
                                }
                                break;
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(490);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 49, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                setState(493);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Semi) {
                    {
                        setState(492);
                        match(Semi);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WarndingDeclarationContext extends ParserRuleContext {
        public TerminalNode Warn() {
            return getToken(ScssParser.Warn, 0);
        }

        public TerminalNode String_() {
            return getToken(ScssParser.String_, 0);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public WarndingDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_warndingDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterWarndingDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitWarndingDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitWarndingDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WarndingDeclarationContext warndingDeclaration() throws RecognitionException {
        WarndingDeclarationContext _localctx = new WarndingDeclarationContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_warndingDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(495);
                match(Warn);
                setState(496);
                match(String_);
                setState(497);
                match(Semi);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ErrorDeclarationContext extends ParserRuleContext {
        public TerminalNode Error() {
            return getToken(ScssParser.Error, 0);
        }

        public TerminalNode String_() {
            return getToken(ScssParser.String_, 0);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public ErrorDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_errorDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterErrorDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitErrorDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitErrorDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ErrorDeclarationContext errorDeclaration() throws RecognitionException {
        ErrorDeclarationContext _localctx = new ErrorDeclarationContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_errorDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(499);
                match(Error);
                setState(500);
                match(String_);
                setState(501);
                match(Semi);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AtStatementDeclarationContext extends ParserRuleContext {
        public TerminalNode At() {
            return getToken(ScssParser.At, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public AtStatementDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_atStatementDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener)
                ((ScssParserListener) listener).enterAtStatementDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener)
                ((ScssParserListener) listener).exitAtStatementDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitAtStatementDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AtStatementDeclarationContext atStatementDeclaration() throws RecognitionException {
        AtStatementDeclarationContext _localctx = new AtStatementDeclarationContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_atStatementDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(503);
                match(At);
                setState(510);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 51, _ctx)) {
                    case 1: {
                        setState(504);
                        identifier();
                        setState(505);
                        match(Lparen);
                        setState(506);
                        parameters();
                        setState(507);
                        match(Rparen);
                    }
                    break;
                    case 2: {
                        setState(509);
                        identifier();
                    }
                    break;
                }
                setState(512);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RulesetContext extends ParserRuleContext {
        public SelectorGroupContext selectorGroup() {
            return getRuleContext(SelectorGroupContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public RulesetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ruleset;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterRuleset(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitRuleset(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitRuleset(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RulesetContext ruleset() throws RecognitionException {
        RulesetContext _localctx = new RulesetContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_ruleset);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(514);
                selectorGroup();
                setState(515);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BlockContext extends ParserRuleContext {
        public TerminalNode BlockStart() {
            return getToken(ScssParser.BlockStart, 0);
        }

        public TerminalNode BlockEnd() {
            return getToken(ScssParser.BlockEnd, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public FunctionReturnContext functionReturn() {
            return getRuleContext(FunctionReturnContext.class, 0);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_block);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(517);
                match(BlockStart);
                setState(521);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -788129404429025264L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1543652563L) != 0)) {
                    {
                        {
                            setState(518);
                            statement();
                        }
                    }
                    setState(523);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(525);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Return) {
                    {
                        setState(524);
                        functionReturn();
                    }
                }

                setState(527);
                match(BlockEnd);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SelectorGroupContext extends ParserRuleContext {
        public List<SelectorContext> selector() {
            return getRuleContexts(SelectorContext.class);
        }

        public SelectorContext selector(int i) {
            return getRuleContext(SelectorContext.class, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ScssParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ScssParser.Comma, i);
        }

        public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectorGroup;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterSelectorGroup(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitSelectorGroup(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitSelectorGroup(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectorGroupContext selectorGroup() throws RecognitionException {
        SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_selectorGroup);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(529);
                selector();
                setState(534);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(530);
                            match(Comma);
                            setState(531);
                            selector();
                        }
                    }
                    setState(536);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SelectorContext extends ParserRuleContext {
        public List<SelectorSequenceContext> selectorSequence() {
            return getRuleContexts(SelectorSequenceContext.class);
        }

        public SelectorSequenceContext selectorSequence(int i) {
            return getRuleContext(SelectorSequenceContext.class, i);
        }

        public List<CombinatorContext> combinator() {
            return getRuleContexts(CombinatorContext.class);
        }

        public CombinatorContext combinator(int i) {
            return getRuleContext(CombinatorContext.class, i);
        }

        public SelectorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selector;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterSelector(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitSelector(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitSelector(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectorContext selector() throws RecognitionException {
        SelectorContext _localctx = new SelectorContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_selector);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(538);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
                    case 1: {
                        setState(537);
                        combinator();
                    }
                    break;
                }
                setState(540);
                selectorSequence();
                setState(546);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Space || _la == Tilde || _la == Plus || _la == Greater) {
                    {
                        {
                            setState(541);
                            combinator();
                            setState(542);
                            selectorSequence();
                        }
                    }
                    setState(548);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CombinatorContext extends ParserRuleContext {
        public TerminalNode Plus() {
            return getToken(ScssParser.Plus, 0);
        }

        public TerminalNode Greater() {
            return getToken(ScssParser.Greater, 0);
        }

        public TerminalNode Tilde() {
            return getToken(ScssParser.Tilde, 0);
        }

        public TerminalNode Space() {
            return getToken(ScssParser.Space, 0);
        }

        public CombinatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_combinator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterCombinator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitCombinator(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitCombinator(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CombinatorContext combinator() throws RecognitionException {
        CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_combinator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(549);
                _la = _input.LA(1);
                if (!(_la == Space || _la == Tilde || _la == Plus || _la == Greater)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SelectorSequenceContext extends ParserRuleContext {
        public List<TypeSelectorContext> typeSelector() {
            return getRuleContexts(TypeSelectorContext.class);
        }

        public TypeSelectorContext typeSelector(int i) {
            return getRuleContext(TypeSelectorContext.class, i);
        }

        public UniversalContext universal() {
            return getRuleContext(UniversalContext.class, 0);
        }

        public List<IdContext> id() {
            return getRuleContexts(IdContext.class);
        }

        public IdContext id(int i) {
            return getRuleContext(IdContext.class, i);
        }

        public List<ClassNameContext> className() {
            return getRuleContexts(ClassNameContext.class);
        }

        public ClassNameContext className(int i) {
            return getRuleContext(ClassNameContext.class, i);
        }

        public List<AttribContext> attrib() {
            return getRuleContexts(AttribContext.class);
        }

        public AttribContext attrib(int i) {
            return getRuleContext(AttribContext.class, i);
        }

        public List<PseudoContext> pseudo() {
            return getRuleContexts(PseudoContext.class);
        }

        public PseudoContext pseudo(int i) {
            return getRuleContext(PseudoContext.class, i);
        }

        public List<NegationContext> negation() {
            return getRuleContexts(NegationContext.class);
        }

        public NegationContext negation(int i) {
            return getRuleContext(NegationContext.class, i);
        }

        public List<InterpolationContext> interpolation() {
            return getRuleContexts(InterpolationContext.class);
        }

        public InterpolationContext interpolation(int i) {
            return getRuleContext(InterpolationContext.class, i);
        }

        public List<ParentRefContext> parentRef() {
            return getRuleContexts(ParentRefContext.class);
        }

        public ParentRefContext parentRef(int i) {
            return getRuleContext(ParentRefContext.class, i);
        }

        public List<VariableNameContext> variableName() {
            return getRuleContexts(VariableNameContext.class);
        }

        public VariableNameContext variableName(int i) {
            return getRuleContext(VariableNameContext.class, i);
        }

        public List<TerminalNode> Percentage() {
            return getTokens(ScssParser.Percentage);
        }

        public TerminalNode Percentage(int i) {
            return getToken(ScssParser.Percentage, i);
        }

        public SelectorSequenceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_selectorSequence;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterSelectorSequence(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitSelectorSequence(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitSelectorSequence(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectorSequenceContext selectorSequence() throws RecognitionException {
        SelectorSequenceContext _localctx = new SelectorSequenceContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_selectorSequence);
        int _la;
        try {
            int _alt;
            setState(587);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 64, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(553);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 57, _ctx)) {
                        case 1: {
                            setState(551);
                            typeSelector();
                        }
                        break;
                        case 2: {
                            setState(552);
                            universal();
                        }
                        break;
                    }
                    setState(568);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 153139988528660483L) != 0)) {
                        {
                            setState(566);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
                                case 1: {
                                    setState(555);
                                    id();
                                }
                                break;
                                case 2: {
                                    setState(556);
                                    className();
                                }
                                break;
                                case 3: {
                                    setState(557);
                                    attrib();
                                }
                                break;
                                case 4: {
                                    setState(558);
                                    pseudo();
                                }
                                break;
                                case 5: {
                                    setState(559);
                                    negation();
                                }
                                break;
                                case 6: {
                                    setState(560);
                                    interpolation();
                                    setState(563);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 58, _ctx)) {
                                        case 1: {
                                            setState(561);
                                            variableName();
                                        }
                                        break;
                                        case 2: {
                                            setState(562);
                                            match(Percentage);
                                        }
                                        break;
                                    }
                                }
                                break;
                                case 7: {
                                    setState(565);
                                    parentRef();
                                }
                                break;
                            }
                        }
                        setState(570);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(583);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                        switch (_alt) {
                            case 1: {
                                setState(583);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 62, _ctx)) {
                                    case 1: {
                                        setState(571);
                                        typeSelector();
                                    }
                                    break;
                                    case 2: {
                                        setState(572);
                                        id();
                                    }
                                    break;
                                    case 3: {
                                        setState(573);
                                        className();
                                    }
                                    break;
                                    case 4: {
                                        setState(574);
                                        attrib();
                                    }
                                    break;
                                    case 5: {
                                        setState(575);
                                        pseudo();
                                    }
                                    break;
                                    case 6: {
                                        setState(576);
                                        negation();
                                    }
                                    break;
                                    case 7: {
                                        setState(577);
                                        interpolation();
                                        setState(580);
                                        _errHandler.sync(this);
                                        switch (getInterpreter().adaptivePredict(_input, 61, _ctx)) {
                                            case 1: {
                                                setState(578);
                                                variableName();
                                            }
                                            break;
                                            case 2: {
                                                setState(579);
                                                match(Percentage);
                                            }
                                            break;
                                        }
                                    }
                                    break;
                                    case 8: {
                                        setState(582);
                                        parentRef();
                                    }
                                    break;
                                }
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(585);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 63, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdContext extends ParserRuleContext {
        public TerminalNode Hash() {
            return getToken(ScssParser.Hash, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public IdContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_id;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitId(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor) return ((ScssParserVisitor<? extends T>) visitor).visitId(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdContext id() throws RecognitionException {
        IdContext _localctx = new IdContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_id);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(589);
                match(Hash);
                setState(590);
                identifier();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TypeSelectorContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public VariableNameContext variableName() {
            return getRuleContext(VariableNameContext.class, 0);
        }

        public TypeNamespacePrefixContext typeNamespacePrefix() {
            return getRuleContext(TypeNamespacePrefixContext.class, 0);
        }

        public TerminalNode Percentage() {
            return getToken(ScssParser.Percentage, 0);
        }

        public ParentRefContext parentRef() {
            return getRuleContext(ParentRefContext.class, 0);
        }

        public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeSelector;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterTypeSelector(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitTypeSelector(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitTypeSelector(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TypeSelectorContext typeSelector() throws RecognitionException {
        TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_typeSelector);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(593);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 65, _ctx)) {
                    case 1: {
                        setState(592);
                        typeNamespacePrefix();
                    }
                    break;
                }
                setState(597);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case Percentage: {
                        setState(595);
                        match(Percentage);
                    }
                    break;
                    case Amp: {
                        setState(596);
                        parentRef();
                    }
                    break;
                    case From:
                    case To:
                    case Under:
                    case Dollar:
                    case Plus:
                    case Minus:
                    case VendorPrefix:
                    case Variable:
                    case Ident:
                        break;
                    default:
                        break;
                }
                setState(601);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 67, _ctx)) {
                    case 1: {
                        setState(599);
                        identifier();
                    }
                    break;
                    case 2: {
                        setState(600);
                        variableName();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TypeNamespacePrefixContext extends ParserRuleContext {
        public TerminalNode Pipe() {
            return getToken(ScssParser.Pipe, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode Times() {
            return getToken(ScssParser.Times, 0);
        }

        public TypeNamespacePrefixContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_typeNamespacePrefix;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterTypeNamespacePrefix(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitTypeNamespacePrefix(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitTypeNamespacePrefix(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TypeNamespacePrefixContext typeNamespacePrefix() throws RecognitionException {
        TypeNamespacePrefixContext _localctx = new TypeNamespacePrefixContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_typeNamespacePrefix);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(605);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case From:
                    case To:
                    case Under:
                    case Minus:
                    case VendorPrefix:
                    case Ident: {
                        setState(603);
                        identifier();
                    }
                    break;
                    case Times: {
                        setState(604);
                        match(Times);
                    }
                    break;
                    case Pipe:
                        break;
                    default:
                        break;
                }
                setState(607);
                match(Pipe);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class UniversalContext extends ParserRuleContext {
        public TerminalNode Times() {
            return getToken(ScssParser.Times, 0);
        }

        public TypeNamespacePrefixContext typeNamespacePrefix() {
            return getRuleContext(TypeNamespacePrefixContext.class, 0);
        }

        public UniversalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_universal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterUniversal(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitUniversal(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitUniversal(this);
            else return visitor.visitChildren(this);
        }
    }

    public final UniversalContext universal() throws RecognitionException {
        UniversalContext _localctx = new UniversalContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_universal);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(610);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
                    case 1: {
                        setState(609);
                        typeNamespacePrefix();
                    }
                    break;
                }
                setState(612);
                match(Times);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ClassNameContext extends ParserRuleContext {
        public TerminalNode Dot() {
            return getToken(ScssParser.Dot, 0);
        }

        public List<TerminalNode> Minus() {
            return getTokens(ScssParser.Minus);
        }

        public TerminalNode Minus(int i) {
            return getToken(ScssParser.Minus, i);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public List<InterpolationContext> interpolation() {
            return getRuleContexts(InterpolationContext.class);
        }

        public InterpolationContext interpolation(int i) {
            return getRuleContext(InterpolationContext.class, i);
        }

        public ClassNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_className;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterClassName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitClassName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitClassName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ClassNameContext className() throws RecognitionException {
        ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_className);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(614);
                match(Dot);
                setState(618);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            setState(618);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 70, _ctx)) {
                                case 1: {
                                    setState(615);
                                    match(Minus);
                                }
                                break;
                                case 2: {
                                    setState(616);
                                    identifier();
                                }
                                break;
                                case 3: {
                                    setState(617);
                                    interpolation();
                                }
                                break;
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(620);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 71, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class InterpolationContext extends ParserRuleContext {
        public TerminalNode Hash() {
            return getToken(ScssParser.Hash, 0);
        }

        public TerminalNode BlockStart() {
            return getToken(ScssParser.BlockStart, 0);
        }

        public TerminalNode BlockEnd() {
            return getToken(ScssParser.BlockEnd, 0);
        }

        public IfExpressionContext ifExpression() {
            return getRuleContext(IfExpressionContext.class, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public ParentRefContext parentRef() {
            return getRuleContext(ParentRefContext.class, 0);
        }

        public List<Namespace_Context> namespace_() {
            return getRuleContexts(Namespace_Context.class);
        }

        public Namespace_Context namespace_(int i) {
            return getRuleContext(Namespace_Context.class, i);
        }

        public MeasurmentContext measurment() {
            return getRuleContext(MeasurmentContext.class, 0);
        }

        public InterpolationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_interpolation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterInterpolation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitInterpolation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitInterpolation(this);
            else return visitor.visitChildren(this);
        }
    }

    public final InterpolationContext interpolation() throws RecognitionException {
        InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_interpolation);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(623);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 153122395937308675L) != 0)) {
                    {
                        setState(622);
                        namespace_();
                    }
                }

                setState(625);
                match(Hash);
                setState(626);
                match(BlockStart);
                setState(628);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 73, _ctx)) {
                    case 1: {
                        setState(627);
                        namespace_();
                    }
                    break;
                }
                setState(633);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
                    case 1: {
                        setState(630);
                        ifExpression();
                    }
                    break;
                    case 2: {
                        setState(631);
                        value();
                    }
                    break;
                    case 3: {
                        setState(632);
                        parentRef();
                    }
                    break;
                }
                setState(635);
                match(BlockEnd);
                setState(637);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 75, _ctx)) {
                    case 1: {
                        setState(636);
                        measurment();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ParentRefContext extends ParserRuleContext {
        public TerminalNode Amp() {
            return getToken(ScssParser.Amp, 0);
        }

        public ParentRefContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parentRef;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterParentRef(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitParentRef(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitParentRef(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParentRefContext parentRef() throws RecognitionException {
        ParentRefContext _localctx = new ParentRefContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_parentRef);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(639);
                match(Amp);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AttribContext extends ParserRuleContext {
        public TerminalNode Lbrack() {
            return getToken(ScssParser.Lbrack, 0);
        }

        public List<IdentifierContext> identifier() {
            return getRuleContexts(IdentifierContext.class);
        }

        public IdentifierContext identifier(int i) {
            return getRuleContext(IdentifierContext.class, i);
        }

        public TerminalNode Rbrack() {
            return getToken(ScssParser.Rbrack, 0);
        }

        public TypeNamespacePrefixContext typeNamespacePrefix() {
            return getRuleContext(TypeNamespacePrefixContext.class, 0);
        }

        public TerminalNode PrefixMatch() {
            return getToken(ScssParser.PrefixMatch, 0);
        }

        public TerminalNode SuffixMatch() {
            return getToken(ScssParser.SuffixMatch, 0);
        }

        public TerminalNode SubstringMatch() {
            return getToken(ScssParser.SubstringMatch, 0);
        }

        public TerminalNode Eq() {
            return getToken(ScssParser.Eq, 0);
        }

        public TerminalNode Includes() {
            return getToken(ScssParser.Includes, 0);
        }

        public TerminalNode DashMatch() {
            return getToken(ScssParser.DashMatch, 0);
        }

        public TerminalNode String_() {
            return getToken(ScssParser.String_, 0);
        }

        public AttribContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_attrib;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterAttrib(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitAttrib(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitAttrib(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AttribContext attrib() throws RecognitionException {
        AttribContext _localctx = new AttribContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_attrib);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(641);
                match(Lbrack);
                setState(643);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 76, _ctx)) {
                    case 1: {
                        setState(642);
                        typeNamespacePrefix();
                    }
                    break;
                }
                setState(645);
                identifier();
                setState(651);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 229425L) != 0)) {
                    {
                        setState(646);
                        _la = _input.LA(1);
                        if (!(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 229425L) != 0))) {
                            _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(649);
                        _errHandler.sync(this);
                        switch (_input.LA(1)) {
                            case From:
                            case To:
                            case Under:
                            case Minus:
                            case VendorPrefix:
                            case Ident: {
                                setState(647);
                                identifier();
                            }
                            break;
                            case String_: {
                                setState(648);
                                match(String_);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                }

                setState(653);
                match(Rbrack);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PseudoContext extends ParserRuleContext {
        public List<TerminalNode> Colon() {
            return getTokens(ScssParser.Colon);
        }

        public TerminalNode Colon(int i) {
            return getToken(ScssParser.Colon, i);
        }

        public InterpolationContext interpolation() {
            return getRuleContext(InterpolationContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public FunctionalPseudoContext functionalPseudo() {
            return getRuleContext(FunctionalPseudoContext.class, 0);
        }

        public PseudoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pseudo;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterPseudo(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitPseudo(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitPseudo(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PseudoContext pseudo() throws RecognitionException {
        PseudoContext _localctx = new PseudoContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_pseudo);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(655);
                match(Colon);
                setState(657);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Colon) {
                    {
                        setState(656);
                        match(Colon);
                    }
                }

                setState(662);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 80, _ctx)) {
                    case 1: {
                        setState(659);
                        interpolation();
                    }
                    break;
                    case 2: {
                        setState(660);
                        identifier();
                    }
                    break;
                    case 3: {
                        setState(661);
                        functionalPseudo();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionalPseudoContext extends ParserRuleContext {
        public TerminalNode Ident() {
            return getToken(ScssParser.Ident, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public List<PseudoParameterContext> pseudoParameter() {
            return getRuleContexts(PseudoParameterContext.class);
        }

        public PseudoParameterContext pseudoParameter(int i) {
            return getRuleContext(PseudoParameterContext.class, i);
        }

        public FunctionalPseudoContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionalPseudo;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterFunctionalPseudo(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitFunctionalPseudo(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitFunctionalPseudo(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionalPseudoContext functionalPseudo() throws RecognitionException {
        FunctionalPseudoContext _localctx = new FunctionalPseudoContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_functionalPseudo);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(664);
                match(Ident);
                setState(665);
                match(Lparen);
                setState(667);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(666);
                            pseudoParameter();
                        }
                    }
                    setState(669);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7009573958513098720L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1044250671L) != 0));
                setState(671);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PseudoParameterContext extends ParserRuleContext {
        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public ClassNameContext className() {
            return getRuleContext(ClassNameContext.class, 0);
        }

        public InterpolationContext interpolation() {
            return getRuleContext(InterpolationContext.class, 0);
        }

        public TerminalNode Comma() {
            return getToken(ScssParser.Comma, 0);
        }

        public PseudoParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pseudoParameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterPseudoParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitPseudoParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitPseudoParameter(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PseudoParameterContext pseudoParameter() throws RecognitionException {
        PseudoParameterContext _localctx = new PseudoParameterContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_pseudoParameter);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(676);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 82, _ctx)) {
                        case 1: {
                            setState(673);
                            value();
                        }
                        break;
                        case 2: {
                            setState(674);
                            className();
                        }
                        break;
                        case 3: {
                            setState(675);
                            interpolation();
                        }
                        break;
                    }
                    setState(679);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Comma) {
                        {
                            setState(678);
                            match(Comma);
                        }
                    }

                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NegationContext extends ParserRuleContext {
        public TerminalNode PseudoNot() {
            return getToken(ScssParser.PseudoNot, 0);
        }

        public NegationArgContext negationArg() {
            return getRuleContext(NegationArgContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public NegationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_negation;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterNegation(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitNegation(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitNegation(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NegationContext negation() throws RecognitionException {
        NegationContext _localctx = new NegationContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_negation);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(681);
                match(PseudoNot);
                setState(682);
                negationArg();
                setState(683);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NegationArgContext extends ParserRuleContext {
        public TypeSelectorContext typeSelector() {
            return getRuleContext(TypeSelectorContext.class, 0);
        }

        public UniversalContext universal() {
            return getRuleContext(UniversalContext.class, 0);
        }

        public TerminalNode Hash() {
            return getToken(ScssParser.Hash, 0);
        }

        public ClassNameContext className() {
            return getRuleContext(ClassNameContext.class, 0);
        }

        public AttribContext attrib() {
            return getRuleContext(AttribContext.class, 0);
        }

        public PseudoContext pseudo() {
            return getRuleContext(PseudoContext.class, 0);
        }

        public NegationArgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_negationArg;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterNegationArg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitNegationArg(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitNegationArg(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NegationArgContext negationArg() throws RecognitionException {
        NegationArgContext _localctx = new NegationArgContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_negationArg);
        try {
            setState(691);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 84, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(685);
                    typeSelector();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(686);
                    universal();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(687);
                    match(Hash);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(688);
                    className();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(689);
                    attrib();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(690);
                    pseudo();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Operator_Context extends ParserRuleContext {
        public TerminalNode Div() {
            return getToken(ScssParser.Div, 0);
        }

        public TerminalNode Times() {
            return getToken(ScssParser.Times, 0);
        }

        public TerminalNode Minus() {
            return getToken(ScssParser.Minus, 0);
        }

        public TerminalNode Plus() {
            return getToken(ScssParser.Plus, 0);
        }

        public TerminalNode Greater() {
            return getToken(ScssParser.Greater, 0);
        }

        public TerminalNode Less() {
            return getToken(ScssParser.Less, 0);
        }

        public List<TerminalNode> Eq() {
            return getTokens(ScssParser.Eq);
        }

        public TerminalNode Eq(int i) {
            return getToken(ScssParser.Eq, i);
        }

        public TerminalNode NotEq() {
            return getToken(ScssParser.NotEq, 0);
        }

        public TerminalNode And() {
            return getToken(ScssParser.And, 0);
        }

        public TerminalNode Or() {
            return getToken(ScssParser.Or, 0);
        }

        public TerminalNode Not() {
            return getToken(ScssParser.Not, 0);
        }

        public Operator_Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_operator_;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterOperator_(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitOperator_(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitOperator_(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Operator_Context operator_() throws RecognitionException {
        Operator_Context _localctx = new Operator_Context(_ctx, getState());
        enterRule(_localctx, 96, RULE_operator_);
        int _la;
        try {
            setState(711);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 86, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(693);
                    match(Div);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(694);
                    match(Times);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(695);
                    match(Minus);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(696);
                    match(Plus);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(697);
                    match(Greater);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(698);
                    match(Less);
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(699);
                    match(Greater);
                    setState(700);
                    match(Eq);
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(701);
                    match(Less);
                    setState(702);
                    match(Eq);
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(703);
                    match(Eq);
                    setState(705);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Eq) {
                        {
                            setState(704);
                            match(Eq);
                        }
                    }

                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(707);
                    match(NotEq);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(708);
                    match(And);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(709);
                    match(Or);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(710);
                    match(Not);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ValueContext extends ParserRuleContext {
        public UnitContext unit() {
            return getRuleContext(UnitContext.class, 0);
        }

        public NumberContext number() {
            return getRuleContext(NumberContext.class, 0);
        }

        public BooleanContext boolean_() {
            return getRuleContext(BooleanContext.class, 0);
        }

        public CalcContext calc() {
            return getRuleContext(CalcContext.class, 0);
        }

        public RotateContext rotate() {
            return getRuleContext(RotateContext.class, 0);
        }

        public RgbaContext rgba() {
            return getRuleContext(RgbaContext.class, 0);
        }

        public Var_Context var_() {
            return getRuleContext(Var_Context.class, 0);
        }

        public UriContext uri() {
            return getRuleContext(UriContext.class, 0);
        }

        public RepeatContext repeat() {
            return getRuleContext(RepeatContext.class, 0);
        }

        public TerminalNode Format() {
            return getToken(ScssParser.Format, 0);
        }

        public TerminalNode String_() {
            return getToken(ScssParser.String_, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public VariableNameContext variableName() {
            return getRuleContext(VariableNameContext.class, 0);
        }

        public InterpolationContext interpolation() {
            return getRuleContext(InterpolationContext.class, 0);
        }

        public HexcolorContext hexcolor() {
            return getRuleContext(HexcolorContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public MeasurmentContext measurment() {
            return getRuleContext(MeasurmentContext.class, 0);
        }

        public ValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ValueContext value() throws RecognitionException {
        ValueContext _localctx = new ValueContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_value);
        try {
            setState(734);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 87, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(713);
                    unit();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(714);
                    number();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(715);
                    boolean_();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(716);
                    calc();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(717);
                    rotate();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(718);
                    rgba();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(719);
                    var_();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(720);
                    uri();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(721);
                    repeat();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(722);
                    match(Format);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(723);
                    match(String_);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(724);
                    functionCall();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(725);
                    variableName();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(726);
                    interpolation();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(727);
                    hexcolor();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(728);
                    identifier();
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(729);
                    expression();
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(730);
                    block();
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(731);
                    match(Lparen);
                    setState(732);
                    match(Rparen);
                }
                break;
                case 20:
                    enterOuterAlt(_localctx, 20);
                {
                    setState(733);
                    measurment();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionDeclarationContext extends ParserRuleContext {
        public TerminalNode Function() {
            return getToken(ScssParser.Function, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public TerminalNode BlockStart() {
            return getToken(ScssParser.BlockStart, 0);
        }

        public TerminalNode BlockEnd() {
            return getToken(ScssParser.BlockEnd, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public FunctionBodyContext functionBody() {
            return getRuleContext(FunctionBodyContext.class, 0);
        }

        public Namespace_Context namespace_() {
            return getRuleContext(Namespace_Context.class, 0);
        }

        public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterFunctionDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitFunctionDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitFunctionDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
        FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_functionDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(736);
                match(Function);
                setState(741);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 153122395937308675L) != 0)) {
                    {
                        setState(738);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 88, _ctx)) {
                            case 1: {
                                setState(737);
                                namespace_();
                            }
                            break;
                        }
                        setState(740);
                        identifier();
                    }
                }

                setState(743);
                match(Lparen);
                setState(744);
                parameters();
                setState(745);
                match(Rparen);
                setState(746);
                match(BlockStart);
                setState(748);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 90, _ctx)) {
                    case 1: {
                        setState(747);
                        functionBody();
                    }
                    break;
                }
                setState(750);
                match(BlockEnd);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ParametersContext extends ParserRuleContext {
        public List<ParameterContext> parameter() {
            return getRuleContexts(ParameterContext.class);
        }

        public ParameterContext parameter(int i) {
            return getRuleContext(ParameterContext.class, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ScssParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ScssParser.Comma, i);
        }

        public ParametersContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameters;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterParameters(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitParameters(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitParameters(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParametersContext parameters() throws RecognitionException {
        ParametersContext _localctx = new ParametersContext(_ctx, getState());
        enterRule(_localctx, 102, RULE_parameters);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(753);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6937516364475170784L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1044250671L) != 0)) {
                    {
                        setState(752);
                        parameter();
                    }
                }

                setState(759);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(755);
                            match(Comma);
                            setState(756);
                            parameter();
                        }
                    }
                    setState(761);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ParameterContext extends ParserRuleContext {
        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public VariableDeclarationContext variableDeclaration() {
            return getRuleContext(VariableDeclarationContext.class, 0);
        }

        public ListSpaceSeparatedContext listSpaceSeparated() {
            return getRuleContext(ListSpaceSeparatedContext.class, 0);
        }

        public MapDeclarationContext mapDeclaration() {
            return getRuleContext(MapDeclarationContext.class, 0);
        }

        public ArglistContext arglist() {
            return getRuleContext(ArglistContext.class, 0);
        }

        public PrioContext prio() {
            return getRuleContext(PrioContext.class, 0);
        }

        public ParameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_parameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitParameter(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ParameterContext parameter() throws RecognitionException {
        ParameterContext _localctx = new ParameterContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_parameter);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(766);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 93, _ctx)) {
                    case 1: {
                        setState(762);
                        value();
                    }
                    break;
                    case 2: {
                        setState(763);
                        variableDeclaration();
                    }
                    break;
                    case 3: {
                        setState(764);
                        listSpaceSeparated();
                    }
                    break;
                    case 4: {
                        setState(765);
                        mapDeclaration();
                    }
                    break;
                }
                setState(769);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Dot) {
                    {
                        setState(768);
                        arglist();
                    }
                }

                setState(772);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Default || _la == Important) {
                    {
                        setState(771);
                        prio();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionBodyContext extends ParserRuleContext {
        public List<FunctionStatementContext> functionStatement() {
            return getRuleContexts(FunctionStatementContext.class);
        }

        public FunctionStatementContext functionStatement(int i) {
            return getRuleContext(FunctionStatementContext.class, i);
        }

        public FunctionReturnContext functionReturn() {
            return getRuleContext(FunctionReturnContext.class, 0);
        }

        public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionBody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterFunctionBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitFunctionBody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitFunctionBody(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionBodyContext functionBody() throws RecognitionException {
        FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_functionBody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(777);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -786156878421295120L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2084455647L) != 0)) {
                    {
                        {
                            setState(774);
                            functionStatement();
                        }
                    }
                    setState(779);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(781);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Return) {
                    {
                        setState(780);
                        functionReturn();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionReturnContext extends ParserRuleContext {
        public TerminalNode Return() {
            return getToken(ScssParser.Return, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ScssParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ScssParser.Comma, i);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionReturn;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterFunctionReturn(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitFunctionReturn(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitFunctionReturn(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionReturnContext functionReturn() throws RecognitionException {
        FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_functionReturn);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(783);
                match(Return);
                setState(784);
                expression();
                setState(789);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(785);
                            match(Comma);
                            setState(786);
                            expression();
                        }
                    }
                    setState(791);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(793);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Semi) {
                    {
                        setState(792);
                        match(Semi);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionStatementContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode Semi() {
            return getToken(ScssParser.Semi, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterFunctionStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitFunctionStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitFunctionStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionStatementContext functionStatement() throws RecognitionException {
        FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_functionStatement);
        try {
            setState(799);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 100, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(795);
                    expression();
                    setState(796);
                    match(Semi);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(798);
                    statement();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FunctionCallContext extends ParserRuleContext {
        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public ParametersContext parameters() {
            return getRuleContext(ParametersContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public Namespace_Context namespace_() {
            return getRuleContext(Namespace_Context.class, 0);
        }

        public FunctionCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_functionCall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterFunctionCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitFunctionCall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitFunctionCall(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FunctionCallContext functionCall() throws RecognitionException {
        FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_functionCall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(802);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 101, _ctx)) {
                    case 1: {
                        setState(801);
                        namespace_();
                    }
                    break;
                }
                setState(804);
                identifier();
                setState(805);
                match(Lparen);
                setState(806);
                parameters();
                setState(807);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExpressionContext extends ParserRuleContext {
        public List<ExpressionPartContext> expressionPart() {
            return getRuleContexts(ExpressionPartContext.class);
        }

        public ExpressionPartContext expressionPart(int i) {
            return getRuleContext(ExpressionPartContext.class, i);
        }

        public List<TerminalNode> Not() {
            return getTokens(ScssParser.Not);
        }

        public TerminalNode Not(int i) {
            return getToken(ScssParser.Not, i);
        }

        public List<Operator_Context> operator_() {
            return getRuleContexts(Operator_Context.class);
        }

        public Operator_Context operator_(int i) {
            return getRuleContext(Operator_Context.class, i);
        }

        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_expression);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(810);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Not) {
                    {
                        setState(809);
                        match(Not);
                    }
                }

                setState(812);
                expressionPart();
                setState(821);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 104, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(813);
                                operator_();
                                setState(815);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == Not) {
                                    {
                                        setState(814);
                                        match(Not);
                                    }
                                }

                                setState(817);
                                expressionPart();
                            }
                        }
                    }
                    setState(823);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 104, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExpressionPartContext extends ParserRuleContext {
        public UnitContext unit() {
            return getRuleContext(UnitContext.class, 0);
        }

        public IdentifierContext identifier() {
            return getRuleContext(IdentifierContext.class, 0);
        }

        public VariableNameContext variableName() {
            return getRuleContext(VariableNameContext.class, 0);
        }

        public Var_Context var_() {
            return getRuleContext(Var_Context.class, 0);
        }

        public BooleanContext boolean_() {
            return getRuleContext(BooleanContext.class, 0);
        }

        public CalcContext calc() {
            return getRuleContext(CalcContext.class, 0);
        }

        public RotateContext rotate() {
            return getRuleContext(RotateContext.class, 0);
        }

        public RgbaContext rgba() {
            return getRuleContext(RgbaContext.class, 0);
        }

        public NumberContext number() {
            return getRuleContext(NumberContext.class, 0);
        }

        public UriContext uri() {
            return getRuleContext(UriContext.class, 0);
        }

        public TerminalNode Format() {
            return getToken(ScssParser.Format, 0);
        }

        public TerminalNode String_() {
            return getToken(ScssParser.String_, 0);
        }

        public InterpolationContext interpolation() {
            return getRuleContext(InterpolationContext.class, 0);
        }

        public HexcolorContext hexcolor() {
            return getRuleContext(HexcolorContext.class, 0);
        }

        public IfExpressionContext ifExpression() {
            return getRuleContext(IfExpressionContext.class, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public PlusMinusContext plusMinus() {
            return getRuleContext(PlusMinusContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public PrioContext prio() {
            return getRuleContext(PrioContext.class, 0);
        }

        public MeasurmentContext measurment() {
            return getRuleContext(MeasurmentContext.class, 0);
        }

        public ExpressionPartContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expressionPart;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterExpressionPart(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitExpressionPart(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitExpressionPart(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ExpressionPartContext expressionPart() throws RecognitionException {
        ExpressionPartContext _localctx = new ExpressionPartContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_expressionPart);
        int _la;
        try {
            setState(850);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 107, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(824);
                    unit();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(825);
                    identifier();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(826);
                    variableName();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(827);
                    var_();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(828);
                    boolean_();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(829);
                    calc();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(830);
                    rotate();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(831);
                    rgba();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(832);
                    number();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(833);
                    uri();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(834);
                    match(Format);
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(835);
                    match(String_);
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(836);
                    interpolation();
                }
                break;
                case 14:
                    enterOuterAlt(_localctx, 14);
                {
                    setState(837);
                    hexcolor();
                }
                break;
                case 15:
                    enterOuterAlt(_localctx, 15);
                {
                    setState(838);
                    ifExpression();
                }
                break;
                case 16:
                    enterOuterAlt(_localctx, 16);
                {
                    setState(839);
                    functionCall();
                }
                break;
                case 17:
                    enterOuterAlt(_localctx, 17);
                {
                    setState(841);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Plus || _la == Minus) {
                        {
                            setState(840);
                            plusMinus();
                        }
                    }

                    setState(843);
                    match(Lparen);
                    setState(845);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6919501965965688800L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1042153519L) != 0)) {
                        {
                            setState(844);
                            expression();
                        }
                    }

                    setState(847);
                    match(Rparen);
                }
                break;
                case 18:
                    enterOuterAlt(_localctx, 18);
                {
                    setState(848);
                    prio();
                }
                break;
                case 19:
                    enterOuterAlt(_localctx, 19);
                {
                    setState(849);
                    measurment();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IfExpressionContext extends ParserRuleContext {
        public TerminalNode If() {
            return getToken(ScssParser.If, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ScssParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ScssParser.Comma, i);
        }

        public List<ValueContext> value() {
            return getRuleContexts(ValueContext.class);
        }

        public ValueContext value(int i) {
            return getRuleContext(ValueContext.class, i);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ParentRefContext parentRef() {
            return getRuleContext(ParentRefContext.class, 0);
        }

        public MeasurmentContext measurment() {
            return getRuleContext(MeasurmentContext.class, 0);
        }

        public PrioContext prio() {
            return getRuleContext(PrioContext.class, 0);
        }

        public IfExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifExpression;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterIfExpression(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitIfExpression(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitIfExpression(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IfExpressionContext ifExpression() throws RecognitionException {
        IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_ifExpression);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(852);
                match(If);
                setState(853);
                match(Lparen);
                setState(856);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case Uri:
                    case Format:
                    case AbsLength:
                    case FontRelative:
                    case ViewportRelative:
                    case Angle:
                    case Resolution:
                    case Freq:
                    case Time:
                    case Percentage:
                    case If:
                    case From:
                    case To:
                    case Not:
                    case Default:
                    case Important:
                    case Lparen:
                    case Under:
                    case Dollar:
                    case Hash:
                    case True:
                    case False:
                    case Plus:
                    case Minus:
                    case Calc:
                    case Rotate:
                    case Var:
                    case Rgba:
                    case VendorPrefix:
                    case Variable:
                    case Number:
                    case String_:
                    case Ident: {
                        setState(854);
                        expression();
                    }
                    break;
                    case Amp: {
                        setState(855);
                        parentRef();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(858);
                match(Comma);
                setState(859);
                value();
                setState(860);
                match(Comma);
                setState(861);
                value();
                setState(862);
                match(Rparen);
                setState(864);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 109, _ctx)) {
                    case 1: {
                        setState(863);
                        measurment();
                    }
                    break;
                }
                setState(867);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 110, _ctx)) {
                    case 1: {
                        setState(866);
                        prio();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ListDeclarationContext extends ParserRuleContext {
        public ListBracketedContext listBracketed() {
            return getRuleContext(ListBracketedContext.class, 0);
        }

        public ListCommaSeparatedContext listCommaSeparated() {
            return getRuleContext(ListCommaSeparatedContext.class, 0);
        }

        public ListSpaceSeparatedContext listSpaceSeparated() {
            return getRuleContext(ListSpaceSeparatedContext.class, 0);
        }

        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public ListDeclarationContext listDeclaration() {
            return getRuleContext(ListDeclarationContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterListDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitListDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitListDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ListDeclarationContext listDeclaration() throws RecognitionException {
        ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_listDeclaration);
        try {
            setState(878);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 112, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(872);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 111, _ctx)) {
                        case 1: {
                            setState(869);
                            listBracketed();
                        }
                        break;
                        case 2: {
                            setState(870);
                            listCommaSeparated();
                        }
                        break;
                        case 3: {
                            setState(871);
                            listSpaceSeparated();
                        }
                        break;
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(874);
                    match(Lparen);
                    setState(875);
                    listDeclaration();
                    setState(876);
                    match(Rparen);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ListCommaSeparatedContext extends ParserRuleContext {
        public List<ListElementContext> listElement() {
            return getRuleContexts(ListElementContext.class);
        }

        public ListElementContext listElement(int i) {
            return getRuleContext(ListElementContext.class, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ScssParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ScssParser.Comma, i);
        }

        public ListCommaSeparatedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listCommaSeparated;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterListCommaSeparated(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitListCommaSeparated(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitListCommaSeparated(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ListCommaSeparatedContext listCommaSeparated() throws RecognitionException {
        ListCommaSeparatedContext _localctx = new ListCommaSeparatedContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_listCommaSeparated);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(880);
                listElement();
                setState(885);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 113, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(881);
                                match(Comma);
                                setState(882);
                                listElement();
                            }
                        }
                    }
                    setState(887);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 113, _ctx);
                }
                setState(889);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 114, _ctx)) {
                    case 1: {
                        setState(888);
                        match(Comma);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ListSpaceSeparatedContext extends ParserRuleContext {
        public List<ListElementContext> listElement() {
            return getRuleContexts(ListElementContext.class);
        }

        public ListElementContext listElement(int i) {
            return getRuleContext(ListElementContext.class, i);
        }

        public ListSpaceSeparatedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listSpaceSeparated;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterListSpaceSeparated(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitListSpaceSeparated(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitListSpaceSeparated(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ListSpaceSeparatedContext listSpaceSeparated() throws RecognitionException {
        ListSpaceSeparatedContext _localctx = new ListSpaceSeparatedContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_listSpaceSeparated);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(892);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(891);
                                listElement();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(894);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 115, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ListBracketedContext extends ParserRuleContext {
        public TerminalNode Lbrack() {
            return getToken(ScssParser.Lbrack, 0);
        }

        public TerminalNode Rbrack() {
            return getToken(ScssParser.Rbrack, 0);
        }

        public ListSpaceSeparatedContext listSpaceSeparated() {
            return getRuleContext(ListSpaceSeparatedContext.class, 0);
        }

        public ListCommaSeparatedContext listCommaSeparated() {
            return getRuleContext(ListCommaSeparatedContext.class, 0);
        }

        public ListBracketedContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listBracketed;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterListBracketed(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitListBracketed(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitListBracketed(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ListBracketedContext listBracketed() throws RecognitionException {
        ListBracketedContext _localctx = new ListBracketedContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_listBracketed);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(896);
                match(Lbrack);
                setState(899);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 116, _ctx)) {
                    case 1: {
                        setState(897);
                        listSpaceSeparated();
                    }
                    break;
                    case 2: {
                        setState(898);
                        listCommaSeparated();
                    }
                    break;
                }
                setState(901);
                match(Rbrack);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ListElementContext extends ParserRuleContext {
        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public List<ValueContext> value() {
            return getRuleContexts(ValueContext.class);
        }

        public ValueContext value(int i) {
            return getRuleContext(ValueContext.class, i);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ScssParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ScssParser.Comma, i);
        }

        public ListElementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listElement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterListElement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitListElement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitListElement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ListElementContext listElement() throws RecognitionException {
        ListElementContext _localctx = new ListElementContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_listElement);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(904);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 117, _ctx)) {
                    case 1: {
                        setState(903);
                        match(Lparen);
                    }
                    break;
                }
                setState(910);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(906);
                                value();
                                setState(908);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 118, _ctx)) {
                                    case 1: {
                                        setState(907);
                                        match(Comma);
                                    }
                                    break;
                                }
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(912);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 119, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                setState(915);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 120, _ctx)) {
                    case 1: {
                        setState(914);
                        match(Rparen);
                    }
                    break;
                }
                setState(918);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 121, _ctx)) {
                    case 1: {
                        setState(917);
                        match(Comma);
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MapDeclarationContext extends ParserRuleContext {
        public TerminalNode Lparen() {
            return getToken(ScssParser.Lparen, 0);
        }

        public MapEntriesContext mapEntries() {
            return getRuleContext(MapEntriesContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public MapDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMapDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMapDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMapDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MapDeclarationContext mapDeclaration() throws RecognitionException {
        MapDeclarationContext _localctx = new MapDeclarationContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_mapDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(920);
                match(Lparen);
                setState(921);
                mapEntries();
                setState(922);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MapEntriesContext extends ParserRuleContext {
        public List<MapEntryContext> mapEntry() {
            return getRuleContexts(MapEntryContext.class);
        }

        public MapEntryContext mapEntry(int i) {
            return getRuleContext(MapEntryContext.class, i);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ScssParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ScssParser.Comma, i);
        }

        public MapEntriesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapEntries;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMapEntries(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMapEntries(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMapEntries(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MapEntriesContext mapEntries() throws RecognitionException {
        MapEntriesContext _localctx = new MapEntriesContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_mapEntries);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(924);
                mapEntry();
                setState(929);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 122, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(925);
                                match(Comma);
                                setState(926);
                                mapEntry();
                            }
                        }
                    }
                    setState(931);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 122, _ctx);
                }
                setState(933);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Comma) {
                    {
                        setState(932);
                        match(Comma);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MapEntryContext extends ParserRuleContext {
        public MapKeyContext mapKey() {
            return getRuleContext(MapKeyContext.class, 0);
        }

        public TerminalNode Colon() {
            return getToken(ScssParser.Colon, 0);
        }

        public MapValueContext mapValue() {
            return getRuleContext(MapValueContext.class, 0);
        }

        public MapEntryContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapEntry;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMapEntry(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMapEntry(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMapEntry(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MapEntryContext mapEntry() throws RecognitionException {
        MapEntryContext _localctx = new MapEntryContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_mapEntry);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(935);
                mapKey();
                setState(936);
                match(Colon);
                setState(937);
                mapValue();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MapKeyContext extends ParserRuleContext {
        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public ListDeclarationContext listDeclaration() {
            return getRuleContext(ListDeclarationContext.class, 0);
        }

        public MapDeclarationContext mapDeclaration() {
            return getRuleContext(MapDeclarationContext.class, 0);
        }

        public MapKeyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapKey;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMapKey(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMapKey(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMapKey(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MapKeyContext mapKey() throws RecognitionException {
        MapKeyContext _localctx = new MapKeyContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_mapKey);
        try {
            setState(942);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 124, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(939);
                    value();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(940);
                    listDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(941);
                    mapDeclaration();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MapValueContext extends ParserRuleContext {
        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public ListDeclarationContext listDeclaration() {
            return getRuleContext(ListDeclarationContext.class, 0);
        }

        public MapDeclarationContext mapDeclaration() {
            return getRuleContext(MapDeclarationContext.class, 0);
        }

        public MapValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapValue;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMapValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMapValue(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMapValue(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MapValueContext mapValue() throws RecognitionException {
        MapValueContext _localctx = new MapValueContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_mapValue);
        try {
            setState(947);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 125, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(944);
                    value();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(945);
                    listDeclaration();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(946);
                    mapDeclaration();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IfDeclarationContext extends ParserRuleContext {
        public TerminalNode AtIf() {
            return getToken(ScssParser.AtIf, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ElseIfStatementContext elseIfStatement() {
            return getRuleContext(ElseIfStatementContext.class, 0);
        }

        public ElseStatementContext elseStatement() {
            return getRuleContext(ElseStatementContext.class, 0);
        }

        public IfDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterIfDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitIfDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitIfDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IfDeclarationContext ifDeclaration() throws RecognitionException {
        IfDeclarationContext _localctx = new IfDeclarationContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_ifDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(949);
                match(AtIf);
                setState(950);
                expression();
                setState(951);
                block();
                setState(954);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 126, _ctx)) {
                    case 1: {
                        setState(952);
                        elseIfStatement();
                    }
                    break;
                    case 2: {
                        setState(953);
                        elseStatement();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ElseIfStatementContext extends ParserRuleContext {
        public TerminalNode AtElse() {
            return getToken(ScssParser.AtElse, 0);
        }

        public TerminalNode If() {
            return getToken(ScssParser.If, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ElseIfStatementContext elseIfStatement() {
            return getRuleContext(ElseIfStatementContext.class, 0);
        }

        public ElseStatementContext elseStatement() {
            return getRuleContext(ElseStatementContext.class, 0);
        }

        public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseIfStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterElseIfStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitElseIfStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitElseIfStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
        ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_elseIfStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(956);
                match(AtElse);
                setState(957);
                match(If);
                setState(958);
                expression();
                setState(959);
                block();
                setState(962);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 127, _ctx)) {
                    case 1: {
                        setState(960);
                        elseIfStatement();
                    }
                    break;
                    case 2: {
                        setState(961);
                        elseStatement();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ElseStatementContext extends ParserRuleContext {
        public TerminalNode AtElse() {
            return getToken(ScssParser.AtElse, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public ElseStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterElseStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitElseStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitElseStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ElseStatementContext elseStatement() throws RecognitionException {
        ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_elseStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(964);
                match(AtElse);
                setState(965);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ForDeclarationContext extends ParserRuleContext {
        public TerminalNode AtFor() {
            return getToken(ScssParser.AtFor, 0);
        }

        public VariableNameContext variableName() {
            return getRuleContext(VariableNameContext.class, 0);
        }

        public TerminalNode From() {
            return getToken(ScssParser.From, 0);
        }

        public TerminalNode Number() {
            return getToken(ScssParser.Number, 0);
        }

        public ThroughContext through() {
            return getRuleContext(ThroughContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public TerminalNode To() {
            return getToken(ScssParser.To, 0);
        }

        public TerminalNode Through() {
            return getToken(ScssParser.Through, 0);
        }

        public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_forDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterForDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitForDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitForDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ForDeclarationContext forDeclaration() throws RecognitionException {
        ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_forDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(967);
                match(AtFor);
                setState(968);
                variableName();
                setState(969);
                match(From);
                setState(970);
                match(Number);
                setState(971);
                _la = _input.LA(1);
                if (!(_la == To || _la == Through)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(972);
                through();
                setState(973);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ThroughContext extends ParserRuleContext {
        public TerminalNode Number() {
            return getToken(ScssParser.Number, 0);
        }

        public FunctionCallContext functionCall() {
            return getRuleContext(FunctionCallContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ThroughContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_through;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterThrough(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitThrough(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitThrough(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ThroughContext through() throws RecognitionException {
        ThroughContext _localctx = new ThroughContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_through);
        try {
            setState(978);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 128, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(975);
                    match(Number);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(976);
                    functionCall();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(977);
                    expression();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class WhileDeclarationContext extends ParserRuleContext {
        public TerminalNode AtWhile() {
            return getToken(ScssParser.AtWhile, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public WhileDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterWhileDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitWhileDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitWhileDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WhileDeclarationContext whileDeclaration() throws RecognitionException {
        WhileDeclarationContext _localctx = new WhileDeclarationContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_whileDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(980);
                match(AtWhile);
                setState(981);
                expression();
                setState(982);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class EachDeclarationContext extends ParserRuleContext {
        public TerminalNode AtEach() {
            return getToken(ScssParser.AtEach, 0);
        }

        public List<VariableNameContext> variableName() {
            return getRuleContexts(VariableNameContext.class);
        }

        public VariableNameContext variableName(int i) {
            return getRuleContext(VariableNameContext.class, i);
        }

        public TerminalNode In() {
            return getToken(ScssParser.In, 0);
        }

        public EachValueListContext eachValueList() {
            return getRuleContext(EachValueListContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ScssParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ScssParser.Comma, i);
        }

        public EachDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_eachDeclaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterEachDeclaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitEachDeclaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitEachDeclaration(this);
            else return visitor.visitChildren(this);
        }
    }

    public final EachDeclarationContext eachDeclaration() throws RecognitionException {
        EachDeclarationContext _localctx = new EachDeclarationContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_eachDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(984);
                match(AtEach);
                setState(985);
                variableName();
                setState(990);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == Comma) {
                    {
                        {
                            setState(986);
                            match(Comma);
                            setState(987);
                            variableName();
                        }
                    }
                    setState(992);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(993);
                match(In);
                setState(994);
                eachValueList();
                setState(995);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class EachValueListContext extends ParserRuleContext {
        public ListDeclarationContext listDeclaration() {
            return getRuleContext(ListDeclarationContext.class, 0);
        }

        public MapDeclarationContext mapDeclaration() {
            return getRuleContext(MapDeclarationContext.class, 0);
        }

        public EachValueListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_eachValueList;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterEachValueList(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitEachValueList(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitEachValueList(this);
            else return visitor.visitChildren(this);
        }
    }

    public final EachValueListContext eachValueList() throws RecognitionException {
        EachValueListContext _localctx = new EachValueListContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_eachValueList);
        try {
            setState(999);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 130, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(997);
                    listDeclaration();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(998);
                    mapDeclaration();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class Var_Context extends ParserRuleContext {
        public TerminalNode Var() {
            return getToken(ScssParser.Var, 0);
        }

        public TerminalNode Variable() {
            return getToken(ScssParser.Variable, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public TerminalNode Comma() {
            return getToken(ScssParser.Comma, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public Var_Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_var_;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterVar_(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitVar_(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor) return ((ScssParserVisitor<? extends T>) visitor).visitVar_(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Var_Context var_() throws RecognitionException {
        Var_Context _localctx = new Var_Context(_ctx, getState());
        enterRule(_localctx, 156, RULE_var_);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1001);
                match(Var);
                setState(1002);
                match(Variable);
                setState(1005);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Comma) {
                    {
                        setState(1003);
                        match(Comma);
                        setState(1004);
                        value();
                    }
                }

                setState(1007);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CalcContext extends ParserRuleContext {
        public TerminalNode Calc() {
            return getToken(ScssParser.Calc, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public CalcContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_calc;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterCalc(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitCalc(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor) return ((ScssParserVisitor<? extends T>) visitor).visitCalc(this);
            else return visitor.visitChildren(this);
        }
    }

    public final CalcContext calc() throws RecognitionException {
        CalcContext _localctx = new CalcContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_calc);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1009);
                match(Calc);
                setState(1010);
                expression();
                setState(1011);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RotateContext extends ParserRuleContext {
        public TerminalNode Rotate() {
            return getToken(ScssParser.Rotate, 0);
        }

        public DegreeContext degree() {
            return getRuleContext(DegreeContext.class, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public RotateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rotate;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterRotate(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitRotate(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitRotate(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RotateContext rotate() throws RecognitionException {
        RotateContext _localctx = new RotateContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_rotate);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1013);
                match(Rotate);
                setState(1014);
                degree();
                setState(1015);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RgbaContext extends ParserRuleContext {
        public TerminalNode Rgba() {
            return getToken(ScssParser.Rgba, 0);
        }

        public List<ValueContext> value() {
            return getRuleContexts(ValueContext.class);
        }

        public ValueContext value(int i) {
            return getRuleContext(ValueContext.class, i);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public List<TerminalNode> Comma() {
            return getTokens(ScssParser.Comma);
        }

        public TerminalNode Comma(int i) {
            return getToken(ScssParser.Comma, i);
        }

        public RgbaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rgba;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterRgba(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitRgba(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor) return ((ScssParserVisitor<? extends T>) visitor).visitRgba(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RgbaContext rgba() throws RecognitionException {
        RgbaContext _localctx = new RgbaContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_rgba);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1017);
                match(Rgba);
                setState(1018);
                value();
                setState(1025);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7081631552551026656L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1044250671L) != 0)) {
                    {
                        {
                            setState(1020);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            if (_la == Comma) {
                                {
                                    setState(1019);
                                    match(Comma);
                                }
                            }

                            setState(1022);
                            value();
                        }
                    }
                    setState(1027);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1028);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RepeatContext extends ParserRuleContext {
        public TerminalNode Repeat() {
            return getToken(ScssParser.Repeat, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public TerminalNode Comma() {
            return getToken(ScssParser.Comma, 0);
        }

        public NumberContext number() {
            return getRuleContext(NumberContext.class, 0);
        }

        public TerminalNode Freq() {
            return getToken(ScssParser.Freq, 0);
        }

        public TerminalNode Rparen() {
            return getToken(ScssParser.Rparen, 0);
        }

        public RepeatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_repeat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterRepeat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitRepeat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitRepeat(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RepeatContext repeat() throws RecognitionException {
        RepeatContext _localctx = new RepeatContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_repeat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1030);
                match(Repeat);
                setState(1031);
                value();
                setState(1032);
                match(Comma);
                setState(1033);
                number();
                setState(1034);
                match(Freq);
                setState(1035);
                match(Rparen);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class UnitContext extends ParserRuleContext {
        public LengthContext length() {
            return getRuleContext(LengthContext.class, 0);
        }

        public DimensionContext dimension() {
            return getRuleContext(DimensionContext.class, 0);
        }

        public PercentageContext percentage() {
            return getRuleContext(PercentageContext.class, 0);
        }

        public DegreeContext degree() {
            return getRuleContext(DegreeContext.class, 0);
        }

        public UnitContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unit;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterUnit(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitUnit(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor) return ((ScssParserVisitor<? extends T>) visitor).visitUnit(this);
            else return visitor.visitChildren(this);
        }
    }

    public final UnitContext unit() throws RecognitionException {
        UnitContext _localctx = new UnitContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_unit);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1041);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 134, _ctx)) {
                    case 1: {
                        setState(1037);
                        length();
                    }
                    break;
                    case 2: {
                        setState(1038);
                        dimension();
                    }
                    break;
                    case 3: {
                        setState(1039);
                        percentage();
                    }
                    break;
                    case 4: {
                        setState(1040);
                        degree();
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LengthContext extends ParserRuleContext {
        public TerminalNode Number() {
            return getToken(ScssParser.Number, 0);
        }

        public TerminalNode AbsLength() {
            return getToken(ScssParser.AbsLength, 0);
        }

        public TerminalNode FontRelative() {
            return getToken(ScssParser.FontRelative, 0);
        }

        public TerminalNode ViewportRelative() {
            return getToken(ScssParser.ViewportRelative, 0);
        }

        public PlusMinusContext plusMinus() {
            return getRuleContext(PlusMinusContext.class, 0);
        }

        public LengthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_length;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterLength(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitLength(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitLength(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LengthContext length() throws RecognitionException {
        LengthContext _localctx = new LengthContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_length);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1044);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Plus || _la == Minus) {
                    {
                        setState(1043);
                        plusMinus();
                    }
                }

                setState(1046);
                match(Number);
                setState(1047);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DimensionContext extends ParserRuleContext {
        public TerminalNode Number() {
            return getToken(ScssParser.Number, 0);
        }

        public TerminalNode Time() {
            return getToken(ScssParser.Time, 0);
        }

        public TerminalNode Freq() {
            return getToken(ScssParser.Freq, 0);
        }

        public TerminalNode Resolution() {
            return getToken(ScssParser.Resolution, 0);
        }

        public TerminalNode Angle() {
            return getToken(ScssParser.Angle, 0);
        }

        public PlusMinusContext plusMinus() {
            return getRuleContext(PlusMinusContext.class, 0);
        }

        public DimensionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dimension;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterDimension(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitDimension(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitDimension(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DimensionContext dimension() throws RecognitionException {
        DimensionContext _localctx = new DimensionContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_dimension);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1050);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Plus || _la == Minus) {
                    {
                        setState(1049);
                        plusMinus();
                    }
                }

                setState(1052);
                match(Number);
                setState(1053);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PercentageContext extends ParserRuleContext {
        public TerminalNode Number() {
            return getToken(ScssParser.Number, 0);
        }

        public TerminalNode Percentage() {
            return getToken(ScssParser.Percentage, 0);
        }

        public PlusMinusContext plusMinus() {
            return getRuleContext(PlusMinusContext.class, 0);
        }

        public PercentageContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_percentage;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterPercentage(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitPercentage(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitPercentage(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PercentageContext percentage() throws RecognitionException {
        PercentageContext _localctx = new PercentageContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_percentage);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1056);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Plus || _la == Minus) {
                    {
                        setState(1055);
                        plusMinus();
                    }
                }

                setState(1058);
                match(Number);
                setState(1059);
                match(Percentage);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DegreeContext extends ParserRuleContext {
        public TerminalNode Number() {
            return getToken(ScssParser.Number, 0);
        }

        public TerminalNode Angle() {
            return getToken(ScssParser.Angle, 0);
        }

        public PlusMinusContext plusMinus() {
            return getRuleContext(PlusMinusContext.class, 0);
        }

        public DegreeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_degree;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterDegree(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitDegree(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitDegree(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DegreeContext degree() throws RecognitionException {
        DegreeContext _localctx = new DegreeContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_degree);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1062);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Plus || _la == Minus) {
                    {
                        setState(1061);
                        plusMinus();
                    }
                }

                setState(1064);
                match(Number);
                setState(1065);
                match(Angle);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class MeasurmentContext extends ParserRuleContext {
        public TerminalNode AbsLength() {
            return getToken(ScssParser.AbsLength, 0);
        }

        public TerminalNode FontRelative() {
            return getToken(ScssParser.FontRelative, 0);
        }

        public TerminalNode ViewportRelative() {
            return getToken(ScssParser.ViewportRelative, 0);
        }

        public TerminalNode Time() {
            return getToken(ScssParser.Time, 0);
        }

        public TerminalNode Freq() {
            return getToken(ScssParser.Freq, 0);
        }

        public TerminalNode Resolution() {
            return getToken(ScssParser.Resolution, 0);
        }

        public TerminalNode Angle() {
            return getToken(ScssParser.Angle, 0);
        }

        public TerminalNode Percentage() {
            return getToken(ScssParser.Percentage, 0);
        }

        public MeasurmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_measurment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterMeasurment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitMeasurment(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitMeasurment(this);
            else return visitor.visitChildren(this);
        }
    }

    public final MeasurmentContext measurment() throws RecognitionException {
        MeasurmentContext _localctx = new MeasurmentContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_measurment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1067);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 32640L) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class UriContext extends ParserRuleContext {
        public TerminalNode Uri() {
            return getToken(ScssParser.Uri, 0);
        }

        public UriContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_uri;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterUri(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitUri(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor) return ((ScssParserVisitor<? extends T>) visitor).visitUri(this);
            else return visitor.visitChildren(this);
        }
    }

    public final UriContext uri() throws RecognitionException {
        UriContext _localctx = new UriContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_uri);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1069);
                match(Uri);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ArglistContext extends ParserRuleContext {
        public List<TerminalNode> Dot() {
            return getTokens(ScssParser.Dot);
        }

        public TerminalNode Dot(int i) {
            return getToken(ScssParser.Dot, i);
        }

        public ArglistContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arglist;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterArglist(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitArglist(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitArglist(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ArglistContext arglist() throws RecognitionException {
        ArglistContext _localctx = new ArglistContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_arglist);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1071);
                match(Dot);
                setState(1072);
                match(Dot);
                setState(1073);
                match(Dot);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PlusMinusContext extends ParserRuleContext {
        public TerminalNode Plus() {
            return getToken(ScssParser.Plus, 0);
        }

        public TerminalNode Minus() {
            return getToken(ScssParser.Minus, 0);
        }

        public PlusMinusContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_plusMinus;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterPlusMinus(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitPlusMinus(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitPlusMinus(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PlusMinusContext plusMinus() throws RecognitionException {
        PlusMinusContext _localctx = new PlusMinusContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_plusMinus);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1075);
                _la = _input.LA(1);
                if (!(_la == Plus || _la == Minus)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class HexcolorContext extends ParserRuleContext {
        public TerminalNode Hash() {
            return getToken(ScssParser.Hash, 0);
        }

        public ColorContext color() {
            return getRuleContext(ColorContext.class, 0);
        }

        public HexcolorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_hexcolor;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterHexcolor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitHexcolor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitHexcolor(this);
            else return visitor.visitChildren(this);
        }
    }

    public final HexcolorContext hexcolor() throws RecognitionException {
        HexcolorContext _localctx = new HexcolorContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_hexcolor);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1077);
                match(Hash);
                setState(1078);
                color();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ColorContext extends ParserRuleContext {
        public List<TerminalNode> Number() {
            return getTokens(ScssParser.Number);
        }

        public TerminalNode Number(int i) {
            return getToken(ScssParser.Number, i);
        }

        public List<TerminalNode> Ident() {
            return getTokens(ScssParser.Ident);
        }

        public TerminalNode Ident(int i) {
            return getToken(ScssParser.Ident, i);
        }

        public ColorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_color;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterColor(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitColor(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitColor(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ColorContext color() throws RecognitionException {
        ColorContext _localctx = new ColorContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_color);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1081);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(1080);
                                _la = _input.LA(1);
                                if (!(_la == Number || _la == Ident)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(1083);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 139, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BooleanContext extends ParserRuleContext {
        public TerminalNode True() {
            return getToken(ScssParser.True, 0);
        }

        public TerminalNode False() {
            return getToken(ScssParser.False, 0);
        }

        public BooleanContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_boolean;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterBoolean(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitBoolean(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitBoolean(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BooleanContext boolean_() throws RecognitionException {
        BooleanContext _localctx = new BooleanContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_boolean);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1085);
                _la = _input.LA(1);
                if (!(_la == True || _la == False)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NumberContext extends ParserRuleContext {
        public TerminalNode Number() {
            return getToken(ScssParser.Number, 0);
        }

        public PlusMinusContext plusMinus() {
            return getRuleContext(PlusMinusContext.class, 0);
        }

        public NumberContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_number;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterNumber(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitNumber(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitNumber(this);
            else return visitor.visitChildren(this);
        }
    }

    public final NumberContext number() throws RecognitionException {
        NumberContext _localctx = new NumberContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_number);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(1088);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Plus || _la == Minus) {
                    {
                        setState(1087);
                        plusMinus();
                    }
                }

                setState(1090);
                match(Number);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IdentifierContext extends ParserRuleContext {
        public TerminalNode Ident() {
            return getToken(ScssParser.Ident, 0);
        }

        public TerminalNode VendorPrefix() {
            return getToken(ScssParser.VendorPrefix, 0);
        }

        public TerminalNode Minus() {
            return getToken(ScssParser.Minus, 0);
        }

        public TerminalNode From() {
            return getToken(ScssParser.From, 0);
        }

        public TerminalNode To() {
            return getToken(ScssParser.To, 0);
        }

        public TerminalNode Under() {
            return getToken(ScssParser.Under, 0);
        }

        public IdentifierContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_identifier;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).enterIdentifier(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ScssParserListener) ((ScssParserListener) listener).exitIdentifier(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ScssParserVisitor)
                return ((ScssParserVisitor<? extends T>) visitor).visitIdentifier(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IdentifierContext identifier() throws RecognitionException {
        IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
        enterRule(_localctx, 192, RULE_identifier);
        int _la;
        try {
            setState(1099);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case Minus:
                case VendorPrefix:
                case Ident:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(1093);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Minus || _la == VendorPrefix) {
                        {
                            setState(1092);
                            _la = _input.LA(1);
                            if (!(_la == Minus || _la == VendorPrefix)) {
                                _errHandler.recoverInline(this);
                            } else {
                                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                _errHandler.reportMatch(this);
                                consume();
                            }
                        }
                    }

                    setState(1095);
                    match(Ident);
                }
                break;
                case From:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(1096);
                    match(From);
                }
                break;
                case To:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(1097);
                    match(To);
                }
                break;
                case Under:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(1098);
                    match(Under);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
            "\u0004\u0001^\u044e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
                    "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015" +
                    "\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018" +
                    "\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b" +
                    "\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e" +
                    "\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002" +
                    "#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002" +
                    "(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002" +
                    "-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002" +
                    "2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002" +
                    "7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002" +
                    "<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002" +
                    "A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002" +
                    "F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002" +
                    "K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002" +
                    "P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002" +
                    "U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002" +
                    "Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002" +
                    "_\u0007_\u0002`\u0007`\u0001\u0000\u0005\u0000\u00c4\b\u0000\n\u0000\f" +
                    "\u0000\u00c7\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0003\u0001\u00e0\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003" +
                    "\u0002\u00e5\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ea" +
                    "\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ef\b\u0002" +
                    "\u0001\u0002\u0003\u0002\u00f2\b\u0002\u0001\u0002\u0003\u0002\u00f5\b" +
                    "\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00f9\b\u0002\u0001\u0003\u0001" +
                    "\u0003\u0003\u0003\u00fd\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003" +
                    "\u0004\u0102\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
                    "\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u010d" +
                    "\b\u0006\u0001\u0006\u0003\u0006\u0110\b\u0006\u0001\u0007\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0004\u0007\u0116\b\u0007\u000b\u0007\f\u0007" +
                    "\u0117\u0001\u0007\u0004\u0007\u011b\b\u0007\u000b\u0007\f\u0007\u011c" +
                    "\u0001\u0007\u0001\u0007\u0003\u0007\u0121\b\u0007\u0001\b\u0001\b\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u012b\b\b\u0001\b\u0001" +
                    "\b\u0003\b\u012f\b\b\u0001\b\u0003\b\u0132\b\b\u0001\b\u0001\b\u0001\b" +
                    "\u0003\b\u0137\b\b\u0001\b\u0003\b\u013a\b\b\u0001\t\u0001\t\u0001\t\u0004" +
                    "\t\u013f\b\t\u000b\t\f\t\u0140\u0001\n\u0001\n\u0003\n\u0145\b\n\u0001" +
                    "\n\u0001\n\u0001\n\u0003\n\u014a\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001" +
                    "\f\u0003\f\u0150\b\f\u0001\f\u0003\f\u0153\b\f\u0001\f\u0001\f\u0001\f" +
                    "\u0001\f\u0001\f\u0001\f\u0003\f\u015b\b\f\u0001\f\u0003\f\u015e\b\f\u0001" +
                    "\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e" +
                    "\u0167\b\u000e\n\u000e\f\u000e\u016a\t\u000e\u0003\u000e\u016c\b\u000e" +
                    "\u0001\u000f\u0003\u000f\u016f\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f" +
                    "\u0173\b\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0177\b\u000f\n\u000f" +
                    "\f\u000f\u017a\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f" +
                    "\u017f\b\u000f\n\u000f\f\u000f\u0182\t\u000f\u0003\u000f\u0184\b\u000f" +
                    "\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u018a\b\u0010" +
                    "\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011" +
                    "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0196\b\u0011" +
                    "\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012" +
                    "\u0001\u0012\u0003\u0012\u019f\b\u0012\u0001\u0012\u0003\u0012\u01a2\b" +
                    "\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01a7\b\u0013\n" +
                    "\u0013\f\u0013\u01aa\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001" +
                    "\u0014\u0001\u0014\u0003\u0014\u01b1\b\u0014\u0001\u0014\u0001\u0014\u0001" +
                    "\u0015\u0001\u0015\u0005\u0015\u01b7\b\u0015\n\u0015\f\u0015\u01ba\t\u0015" +
                    "\u0001\u0015\u0001\u0015\u0003\u0015\u01be\b\u0015\u0001\u0016\u0001\u0016" +
                    "\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u01c5\b\u0017\u0001\u0017" +
                    "\u0001\u0017\u0003\u0017\u01c9\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017" +
                    "\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01d1\b\u0017\u0001\u0017" +
                    "\u0003\u0017\u01d4\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018" +
                    "\u0003\u0018\u01da\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019" +
                    "\u01df\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019" +
                    "\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u01e9\b\u0019\u000b\u0019" +
                    "\f\u0019\u01ea\u0001\u0019\u0003\u0019\u01ee\b\u0019\u0001\u001a\u0001" +
                    "\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001" +
                    "\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001" +
                    "\u001c\u0001\u001c\u0003\u001c\u01ff\b\u001c\u0001\u001c\u0001\u001c\u0001" +
                    "\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u0208" +
                    "\b\u001e\n\u001e\f\u001e\u020b\t\u001e\u0001\u001e\u0003\u001e\u020e\b" +
                    "\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005" +
                    "\u001f\u0215\b\u001f\n\u001f\f\u001f\u0218\t\u001f\u0001 \u0003 \u021b" +
                    "\b \u0001 \u0001 \u0001 \u0001 \u0005 \u0221\b \n \f \u0224\t \u0001!" +
                    "\u0001!\u0001\"\u0001\"\u0003\"\u022a\b\"\u0001\"\u0001\"\u0001\"\u0001" +
                    "\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0234\b\"\u0001\"\u0005\"\u0237" +
                    "\b\"\n\"\f\"\u023a\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"" +
                    "\u0001\"\u0001\"\u0001\"\u0003\"\u0245\b\"\u0001\"\u0004\"\u0248\b\"\u000b" +
                    "\"\f\"\u0249\u0003\"\u024c\b\"\u0001#\u0001#\u0001#\u0001$\u0003$\u0252" +
                    "\b$\u0001$\u0001$\u0003$\u0256\b$\u0001$\u0001$\u0003$\u025a\b$\u0001" +
                    "%\u0001%\u0003%\u025e\b%\u0001%\u0001%\u0001&\u0003&\u0263\b&\u0001&\u0001" +
                    "&\u0001\'\u0001\'\u0001\'\u0001\'\u0004\'\u026b\b\'\u000b\'\f\'\u026c" +
                    "\u0001(\u0003(\u0270\b(\u0001(\u0001(\u0001(\u0003(\u0275\b(\u0001(\u0001" +
                    "(\u0001(\u0003(\u027a\b(\u0001(\u0001(\u0003(\u027e\b(\u0001)\u0001)\u0001" +
                    "*\u0001*\u0003*\u0284\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u028a\b*\u0003" +
                    "*\u028c\b*\u0001*\u0001*\u0001+\u0001+\u0003+\u0292\b+\u0001+\u0001+\u0001" +
                    "+\u0003+\u0297\b+\u0001,\u0001,\u0001,\u0004,\u029c\b,\u000b,\f,\u029d" +
                    "\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u02a5\b-\u0001-\u0003-\u02a8" +
                    "\b-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001" +
                    "/\u0003/\u02b4\b/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001" +
                    "0\u00010\u00010\u00010\u00010\u00030\u02c2\b0\u00010\u00010\u00010\u0001" +
                    "0\u00030\u02c8\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001" +
                    "1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001" +
                    "1\u00011\u00011\u00011\u00031\u02df\b1\u00012\u00012\u00032\u02e3\b2\u0001" +
                    "2\u00032\u02e6\b2\u00012\u00012\u00012\u00012\u00012\u00032\u02ed\b2\u0001" +
                    "2\u00012\u00013\u00033\u02f2\b3\u00013\u00013\u00053\u02f6\b3\n3\f3\u02f9" +
                    "\t3\u00014\u00014\u00014\u00014\u00034\u02ff\b4\u00014\u00034\u0302\b" +
                    "4\u00014\u00034\u0305\b4\u00015\u00055\u0308\b5\n5\f5\u030b\t5\u00015" +
                    "\u00035\u030e\b5\u00016\u00016\u00016\u00016\u00056\u0314\b6\n6\f6\u0317" +
                    "\t6\u00016\u00036\u031a\b6\u00017\u00017\u00017\u00017\u00037\u0320\b" +
                    "7\u00018\u00038\u0323\b8\u00018\u00018\u00018\u00018\u00018\u00019\u0003" +
                    "9\u032b\b9\u00019\u00019\u00019\u00039\u0330\b9\u00019\u00019\u00059\u0334" +
                    "\b9\n9\f9\u0337\t9\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001" +
                    ":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003" +
                    ":\u034a\b:\u0001:\u0001:\u0003:\u034e\b:\u0001:\u0001:\u0001:\u0003:\u0353" +
                    "\b:\u0001;\u0001;\u0001;\u0001;\u0003;\u0359\b;\u0001;\u0001;\u0001;\u0001" +
                    ";\u0001;\u0001;\u0003;\u0361\b;\u0001;\u0003;\u0364\b;\u0001<\u0001<\u0001" +
                    "<\u0003<\u0369\b<\u0001<\u0001<\u0001<\u0001<\u0003<\u036f\b<\u0001=\u0001" +
                    "=\u0001=\u0005=\u0374\b=\n=\f=\u0377\t=\u0001=\u0003=\u037a\b=\u0001>" +
                    "\u0004>\u037d\b>\u000b>\f>\u037e\u0001?\u0001?\u0001?\u0003?\u0384\b?" +
                    "\u0001?\u0001?\u0001@\u0003@\u0389\b@\u0001@\u0001@\u0003@\u038d\b@\u0004" +
                    "@\u038f\b@\u000b@\f@\u0390\u0001@\u0003@\u0394\b@\u0001@\u0003@\u0397" +
                    "\b@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0005B\u03a0\bB\n" +
                    "B\fB\u03a3\tB\u0001B\u0003B\u03a6\bB\u0001C\u0001C\u0001C\u0001C\u0001" +
                    "D\u0001D\u0001D\u0003D\u03af\bD\u0001E\u0001E\u0001E\u0003E\u03b4\bE\u0001" +
                    "F\u0001F\u0001F\u0001F\u0001F\u0003F\u03bb\bF\u0001G\u0001G\u0001G\u0001" +
                    "G\u0001G\u0001G\u0003G\u03c3\bG\u0001H\u0001H\u0001H\u0001I\u0001I\u0001" +
                    "I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0003J\u03d3" +
                    "\bJ\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0005L\u03dd" +
                    "\bL\nL\fL\u03e0\tL\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0003M\u03e8" +
                    "\bM\u0001N\u0001N\u0001N\u0001N\u0003N\u03ee\bN\u0001N\u0001N\u0001O\u0001" +
                    "O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0003" +
                    "Q\u03fd\bQ\u0001Q\u0005Q\u0400\bQ\nQ\fQ\u0403\tQ\u0001Q\u0001Q\u0001R" +
                    "\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001" +
                    "S\u0003S\u0412\bS\u0001T\u0003T\u0415\bT\u0001T\u0001T\u0001T\u0001U\u0003" +
                    "U\u041b\bU\u0001U\u0001U\u0001U\u0001V\u0003V\u0421\bV\u0001V\u0001V\u0001" +
                    "V\u0001W\u0003W\u0427\bW\u0001W\u0001W\u0001W\u0001X\u0001X\u0001Y\u0001" +
                    "Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001" +
                    "]\u0004]\u043a\b]\u000b]\f]\u043b\u0001^\u0001^\u0001_\u0003_\u0441\b" +
                    "_\u0001_\u0001_\u0001`\u0003`\u0446\b`\u0001`\u0001`\u0001`\u0001`\u0003" +
                    "`\u044c\b`\u0001`\u0000\u0000a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010" +
                    "\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR" +
                    "TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e" +
                    "\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6" +
                    "\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be" +
                    "\u00c0\u0000\f\u0001\u000001\u0001\u0000()\u0004\u0000\u0004\u0004<<D" +
                    "DJJ\u0003\u0000HHLMWY\u0001\u0000&\'\u0001\u0000\u0007\t\u0001\u0000\n" +
                    "\r\u0001\u0000\u0007\u000e\u0002\u0000DDFF\u0002\u0000\\\\^^\u0001\u0000" +
                    "BC\u0002\u0000FFZZ\u04f7\u0000\u00c5\u0001\u0000\u0000\u0000\u0002\u00df" +
                    "\u0001\u0000\u0000\u0000\u0004\u00f8\u0001\u0000\u0000\u0000\u0006\u00fc" +
                    "\u0001\u0000\u0000\u0000\b\u00fe\u0001\u0000\u0000\u0000\n\u0103\u0001" +
                    "\u0000\u0000\u0000\f\u0108\u0001\u0000\u0000\u0000\u000e\u0120\u0001\u0000" +
                    "\u0000\u0000\u0010\u0139\u0001\u0000\u0000\u0000\u0012\u013e\u0001\u0000" +
                    "\u0000\u0000\u0014\u0144\u0001\u0000\u0000\u0000\u0016\u014b\u0001\u0000" +
                    "\u0000\u0000\u0018\u015a\u0001\u0000\u0000\u0000\u001a\u015f\u0001\u0000" +
                    "\u0000\u0000\u001c\u016b\u0001\u0000\u0000\u0000\u001e\u0183\u0001\u0000" +
                    "\u0000\u0000 \u0185\u0001\u0000\u0000\u0000\"\u018d\u0001\u0000\u0000" +
                    "\u0000$\u0199\u0001\u0000\u0000\u0000&\u01a3\u0001\u0000\u0000\u0000(" +
                    "\u01ad\u0001\u0000\u0000\u0000*\u01bd\u0001\u0000\u0000\u0000,\u01bf\u0001" +
                    "\u0000\u0000\u0000.\u01c2\u0001\u0000\u0000\u00000\u01d5\u0001\u0000\u0000" +
                    "\u00002\u01db\u0001\u0000\u0000\u00004\u01ef\u0001\u0000\u0000\u00006" +
                    "\u01f3\u0001\u0000\u0000\u00008\u01f7\u0001\u0000\u0000\u0000:\u0202\u0001" +
                    "\u0000\u0000\u0000<\u0205\u0001\u0000\u0000\u0000>\u0211\u0001\u0000\u0000" +
                    "\u0000@\u021a\u0001\u0000\u0000\u0000B\u0225\u0001\u0000\u0000\u0000D" +
                    "\u024b\u0001\u0000\u0000\u0000F\u024d\u0001\u0000\u0000\u0000H\u0251\u0001" +
                    "\u0000\u0000\u0000J\u025d\u0001\u0000\u0000\u0000L\u0262\u0001\u0000\u0000" +
                    "\u0000N\u0266\u0001\u0000\u0000\u0000P\u026f\u0001\u0000\u0000\u0000R" +
                    "\u027f\u0001\u0000\u0000\u0000T\u0281\u0001\u0000\u0000\u0000V\u028f\u0001" +
                    "\u0000\u0000\u0000X\u0298\u0001\u0000\u0000\u0000Z\u02a4\u0001\u0000\u0000" +
                    "\u0000\\\u02a9\u0001\u0000\u0000\u0000^\u02b3\u0001\u0000\u0000\u0000" +
                    "`\u02c7\u0001\u0000\u0000\u0000b\u02de\u0001\u0000\u0000\u0000d\u02e0" +
                    "\u0001\u0000\u0000\u0000f\u02f1\u0001\u0000\u0000\u0000h\u02fe\u0001\u0000" +
                    "\u0000\u0000j\u0309\u0001\u0000\u0000\u0000l\u030f\u0001\u0000\u0000\u0000" +
                    "n\u031f\u0001\u0000\u0000\u0000p\u0322\u0001\u0000\u0000\u0000r\u032a" +
                    "\u0001\u0000\u0000\u0000t\u0352\u0001\u0000\u0000\u0000v\u0354\u0001\u0000" +
                    "\u0000\u0000x\u036e\u0001\u0000\u0000\u0000z\u0370\u0001\u0000\u0000\u0000" +
                    "|\u037c\u0001\u0000\u0000\u0000~\u0380\u0001\u0000\u0000\u0000\u0080\u0388" +
                    "\u0001\u0000\u0000\u0000\u0082\u0398\u0001\u0000\u0000\u0000\u0084\u039c" +
                    "\u0001\u0000\u0000\u0000\u0086\u03a7\u0001\u0000\u0000\u0000\u0088\u03ae" +
                    "\u0001\u0000\u0000\u0000\u008a\u03b3\u0001\u0000\u0000\u0000\u008c\u03b5" +
                    "\u0001\u0000\u0000\u0000\u008e\u03bc\u0001\u0000\u0000\u0000\u0090\u03c4" +
                    "\u0001\u0000\u0000\u0000\u0092\u03c7\u0001\u0000\u0000\u0000\u0094\u03d2" +
                    "\u0001\u0000\u0000\u0000\u0096\u03d4\u0001\u0000\u0000\u0000\u0098\u03d8" +
                    "\u0001\u0000\u0000\u0000\u009a\u03e7\u0001\u0000\u0000\u0000\u009c\u03e9" +
                    "\u0001\u0000\u0000\u0000\u009e\u03f1\u0001\u0000\u0000\u0000\u00a0\u03f5" +
                    "\u0001\u0000\u0000\u0000\u00a2\u03f9\u0001\u0000\u0000\u0000\u00a4\u0406" +
                    "\u0001\u0000\u0000\u0000\u00a6\u0411\u0001\u0000\u0000\u0000\u00a8\u0414" +
                    "\u0001\u0000\u0000\u0000\u00aa\u041a\u0001\u0000\u0000\u0000\u00ac\u0420" +
                    "\u0001\u0000\u0000\u0000\u00ae\u0426\u0001\u0000\u0000\u0000\u00b0\u042b" +
                    "\u0001\u0000\u0000\u0000\u00b2\u042d\u0001\u0000\u0000\u0000\u00b4\u042f" +
                    "\u0001\u0000\u0000\u0000\u00b6\u0433\u0001\u0000\u0000\u0000\u00b8\u0435" +
                    "\u0001\u0000\u0000\u0000\u00ba\u0439\u0001\u0000\u0000\u0000\u00bc\u043d" +
                    "\u0001\u0000\u0000\u0000\u00be\u0440\u0001\u0000\u0000\u0000\u00c0\u044b" +
                    "\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003\u0002\u0001\u0000\u00c3\u00c2" +
                    "\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3" +
                    "\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8" +
                    "\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9" +
                    "\u0005\u0000\u0000\u0001\u00c9\u0001\u0001\u0000\u0000\u0000\u00ca\u00e0" +
                    "\u0003\u0004\u0002\u0000\u00cb\u00e0\u0003\f\u0006\u0000\u00cc\u00e0\u0003" +
                    "\u0014\n\u0000\u00cd\u00e0\u00030\u0018\u0000\u00ce\u00e0\u0003\u001a" +
                    "\r\u0000\u00cf\u00e0\u0003\"\u0011\u0000\u00d0\u00e0\u0003$\u0012\u0000" +
                    "\u00d1\u00e0\u0003d2\u0000\u00d2\u00e0\u0003\u008cF\u0000\u00d3\u00e0" +
                    "\u0003\u0092I\u0000\u00d4\u00e0\u0003\u0096K\u0000\u00d5\u00e0\u0003\u0098" +
                    "L\u0000\u00d6\u00e0\u0003&\u0013\u0000\u00d7\u00e0\u0003(\u0014\u0000" +
                    "\u00d8\u00e0\u0003.\u0017\u0000\u00d9\u00e0\u00032\u0019\u0000\u00da\u00e0" +
                    "\u00034\u001a\u0000\u00db\u00e0\u00036\u001b\u0000\u00dc\u00e0\u0003:" +
                    "\u001d\u0000\u00dd\u00e0\u00038\u001c\u0000\u00de\u00e0\u0003,\u0016\u0000" +
                    "\u00df\u00ca\u0001\u0000\u0000\u0000\u00df\u00cb\u0001\u0000\u0000\u0000" +
                    "\u00df\u00cc\u0001\u0000\u0000\u0000\u00df\u00cd\u0001\u0000\u0000\u0000" +
                    "\u00df\u00ce\u0001\u0000\u0000\u0000\u00df\u00cf\u0001\u0000\u0000\u0000" +
                    "\u00df\u00d0\u0001\u0000\u0000\u0000\u00df\u00d1\u0001\u0000\u0000\u0000" +
                    "\u00df\u00d2\u0001\u0000\u0000\u0000\u00df\u00d3\u0001\u0000\u0000\u0000" +
                    "\u00df\u00d4\u0001\u0000\u0000\u0000\u00df\u00d5\u0001\u0000\u0000\u0000" +
                    "\u00df\u00d6\u0001\u0000\u0000\u0000\u00df\u00d7\u0001\u0000\u0000\u0000" +
                    "\u00df\u00d8\u0001\u0000\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000" +
                    "\u00df\u00da\u0001\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000" +
                    "\u00df\u00dc\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000" +
                    "\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u0003\u0001\u0000\u0000\u0000" +
                    "\u00e1\u00e2\u0005\u000f\u0000\u0000\u00e2\u00e4\u0003\u0006\u0003\u0000" +
                    "\u00e3\u00e5\u0005;\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4" +
                    "\u00e5\u0001\u0000\u0000\u0000\u00e5\u00f9\u0001\u0000\u0000\u0000\u00e6" +
                    "\u00e7\u0005\u0012\u0000\u0000\u00e7\u00e9\u0003\u0006\u0003\u0000\u00e8" +
                    "\u00ea\u0005;\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9\u00ea" +
                    "\u0001\u0000\u0000\u0000\u00ea\u00f9\u0001\u0000\u0000\u0000\u00eb\u00ec" +
                    "\u0005\u0011\u0000\u0000\u00ec\u00ee\u0003\u0006\u0003\u0000\u00ed\u00ef" +
                    "\u0003\b\u0004\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001" +
                    "\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00f2\u0003" +
                    "\n\u0005\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000" +
                    "\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3\u00f5\u0005;\u0000" +
                    "\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000" +
                    "\u0000\u00f5\u00f9\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0017\u0000" +
                    "\u0000\u00f7\u00f9\u0003\u0006\u0003\u0000\u00f8\u00e1\u0001\u0000\u0000" +
                    "\u0000\u00f8\u00e6\u0001\u0000\u0000\u0000\u00f8\u00eb\u0001\u0000\u0000" +
                    "\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u0005\u0001\u0000\u0000" +
                    "\u0000\u00fa\u00fd\u0003\u00b2Y\u0000\u00fb\u00fd\u0005]\u0000\u0000\u00fc" +
                    "\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd" +
                    "\u0007\u0001\u0000\u0000\u0000\u00fe\u0101\u0005,\u0000\u0000\u00ff\u0102" +
                    "\u0005G\u0000\u0000\u0100\u0102\u0003\u00c0`\u0000\u0101\u00ff\u0001\u0000" +
                    "\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102\t\u0001\u0000\u0000" +
                    "\u0000\u0103\u0104\u0005-\u0000\u0000\u0104\u0105\u00052\u0000\u0000\u0105" +
                    "\u0106\u0003f3\u0000\u0106\u0107\u00053\u0000\u0000\u0107\u000b\u0001" +
                    "\u0000\u0000\u0000\u0108\u0109\u0003\u0010\b\u0000\u0109\u010a\u0005:" +
                    "\u0000\u0000\u010a\u010c\u0003\u000e\u0007\u0000\u010b\u010d\u0003\u0016" +
                    "\u000b\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000" +
                    "\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0110\u0005;\u0000" +
                    "\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000" +
                    "\u0000\u0110\r\u0001\u0000\u0000\u0000\u0111\u0121\u0003b1\u0000\u0112" +
                    "\u0121\u0003d2\u0000\u0113\u0121\u0003p8\u0000\u0114\u0116\u0003\u0082" +
                    "A\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000" +
                    "\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000" +
                    "\u0000\u0118\u0121\u0001\u0000\u0000\u0000\u0119\u011b\u0003x<\u0000\u011a" +
                    "\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c" +
                    "\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d" +
                    "\u0121\u0001\u0000\u0000\u0000\u011e\u0121\u0003\u0010\b\u0000\u011f\u0121" +
                    "\u0003\u00c0`\u0000\u0120\u0111\u0001\u0000\u0000\u0000\u0120\u0112\u0001" +
                    "\u0000\u0000\u0000\u0120\u0113\u0001\u0000\u0000\u0000\u0120\u0115\u0001" +
                    "\u0000\u0000\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120\u011e\u0001" +
                    "\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u000f\u0001" +
                    "\u0000\u0000\u0000\u0122\u0123\u0005F\u0000\u0000\u0123\u0124\u0005F\u0000" +
                    "\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u012b\u0005>\u0000\u0000" +
                    "\u0126\u0127\u0003\u00b6[\u0000\u0127\u0128\u0005>\u0000\u0000\u0128\u012b" +
                    "\u0001\u0000\u0000\u0000\u0129\u012b\u0005>\u0000\u0000\u012a\u0122\u0001" +
                    "\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u0129\u0001" +
                    "\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u013a\u0003" +
                    "\u00c0`\u0000\u012d\u012f\u0003\u00b6[\u0000\u012e\u012d\u0001\u0000\u0000" +
                    "\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000" +
                    "\u0000\u0130\u0132\u0003\u0012\t\u0000\u0131\u0130\u0001\u0000\u0000\u0000" +
                    "\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000" +
                    "\u0133\u0136\u0005>\u0000\u0000\u0134\u0137\u0003\u00c0`\u0000\u0135\u0137" +
                    "\u0003\u00b0X\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0135\u0001" +
                    "\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u013a\u0005" +
                    "[\u0000\u0000\u0139\u012a\u0001\u0000\u0000\u0000\u0139\u012e\u0001\u0000" +
                    "\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u0011\u0001\u0000" +
                    "\u0000\u0000\u013b\u013c\u0003\u00c0`\u0000\u013c\u013d\u00058\u0000\u0000" +
                    "\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013b\u0001\u0000\u0000\u0000" +
                    "\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000" +
                    "\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0013\u0001\u0000\u0000\u0000" +
                    "\u0142\u0145\u0003\u00c0`\u0000\u0143\u0145\u0003P(\u0000\u0144\u0142" +
                    "\u0001\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0146" +
                    "\u0001\u0000\u0000\u0000\u0146\u0147\u0005:\u0000\u0000\u0147\u0149\u0003" +
                    "\u0018\f\u0000\u0148\u014a\u0005;\u0000\u0000\u0149\u0148\u0001\u0000" +
                    "\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u0015\u0001\u0000" +
                    "\u0000\u0000\u014b\u014c\u0007\u0000\u0000\u0000\u014c\u0017\u0001\u0000" +
                    "\u0000\u0000\u014d\u015b\u0003b1\u0000\u014e\u0150\u0003b1\u0000\u014f" +
                    "\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150" +
                    "\u0152\u0001\u0000\u0000\u0000\u0151\u0153\u0003\u0016\u000b\u0000\u0152" +
                    "\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153" +
                    "\u0154\u0001\u0000\u0000\u0000\u0154\u015b\u0003<\u001e\u0000\u0155\u015b" +
                    "\u0003\u0010\b\u0000\u0156\u015b\u0003|>\u0000\u0157\u015b\u0003z=\u0000" +
                    "\u0158\u015b\u0003r9\u0000\u0159\u015b\u0003p8\u0000\u015a\u014d\u0001" +
                    "\u0000\u0000\u0000\u015a\u014f\u0001\u0000\u0000\u0000\u015a\u0155\u0001" +
                    "\u0000\u0000\u0000\u015a\u0156\u0001\u0000\u0000\u0000\u015a\u0157\u0001" +
                    "\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u0159\u0001" +
                    "\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000\u0000\u015c\u015e\u0003" +
                    "\u0016\u000b\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001" +
                    "\u0000\u0000\u0000\u015e\u0019\u0001\u0000\u0000\u0000\u015f\u0160\u0005" +
                    "\u001b\u0000\u0000\u0160\u0161\u0003\u001c\u000e\u0000\u0161\u0162\u0003" +
                    "<\u001e\u0000\u0162\u001b\u0001\u0000\u0000\u0000\u0163\u0168\u0003\u001e" +
                    "\u000f\u0000\u0164\u0165\u00059\u0000\u0000\u0165\u0167\u0003\u001e\u000f" +
                    "\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000" +
                    "\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000" +
                    "\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000" +
                    "\u0000\u016b\u0163\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000" +
                    "\u0000\u016c\u001d\u0001\u0000\u0000\u0000\u016d\u016f\u0007\u0001\u0000" +
                    "\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000" +
                    "\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u0173\u0003\u00c0`\u0000" +
                    "\u0171\u0173\u0003b1\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0171" +
                    "\u0001\u0000\u0000\u0000\u0173\u0178\u0001\u0000\u0000\u0000\u0174\u0175" +
                    "\u0005*\u0000\u0000\u0175\u0177\u0003 \u0010\u0000\u0176\u0174\u0001\u0000" +
                    "\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000" +
                    "\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u0184\u0001\u0000" +
                    "\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u0180\u0003 \u0010" +
                    "\u0000\u017c\u017d\u0005*\u0000\u0000\u017d\u017f\u0003 \u0010\u0000\u017e" +
                    "\u017c\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180" +
                    "\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181" +
                    "\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183" +
                    "\u016e\u0001\u0000\u0000\u0000\u0183\u017b\u0001\u0000\u0000\u0000\u0184" +
                    "\u001f\u0001\u0000\u0000\u0000\u0185\u0186\u00052\u0000\u0000\u0186\u0189" +
                    "\u0003\u00c0`\u0000\u0187\u0188\u0005:\u0000\u0000\u0188\u018a\u0003b" +
                    "1\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000" +
                    "\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u00053\u0000\u0000" +
                    "\u018c!\u0001\u0000\u0000\u0000\u018d\u0195\u0005\u0014\u0000\u0000\u018e" +
                    "\u0196\u0003\u00c0`\u0000\u018f\u0190\u0003\u00c0`\u0000\u0190\u0191\u0005" +
                    "2\u0000\u0000\u0191\u0192\u0003f3\u0000\u0192\u0193\u00053\u0000\u0000" +
                    "\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0196\u0003P(\u0000\u0195\u018e" +
                    "\u0001\u0000\u0000\u0000\u0195\u018f\u0001\u0000\u0000\u0000\u0195\u0194" +
                    "\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0198" +
                    "\u0003<\u001e\u0000\u0198#\u0001\u0000\u0000\u0000\u0199\u019e\u0005\u0018" +
                    "\u0000\u0000\u019a\u019b\u00052\u0000\u0000\u019b\u019c\u0003f3\u0000" +
                    "\u019c\u019d\u00053\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e" +
                    "\u019a\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f" +
                    "\u01a1\u0001\u0000\u0000\u0000\u01a0\u01a2\u0005;\u0000\u0000\u01a1\u01a0" +
                    "\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2%\u0001" +
                    "\u0000\u0000\u0000\u01a3\u01a4\u0005\u0016\u0000\u0000\u01a4\u01a8\u0005" +
                    "6\u0000\u0000\u01a5\u01a7\u0003\u0002\u0001\u0000\u01a6\u01a5\u0001\u0000" +
                    "\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000" +
                    "\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u0001\u0000" +
                    "\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ac\u00057\u0000" +
                    "\u0000\u01ac\'\u0001\u0000\u0000\u0000\u01ad\u01b0\u0005\u0019\u0000\u0000" +
                    "\u01ae\u01b1\u0003\u00c0`\u0000\u01af\u01b1\u0003P(\u0000\u01b0\u01ae" +
                    "\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0\u01b1" +
                    "\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3" +
                    "\u0003*\u0015\u0000\u01b3)\u0001\u0000\u0000\u0000\u01b4\u01b8\u00056" +
                    "\u0000\u0000\u01b5\u01b7\u0003,\u0016\u0000\u01b6\u01b5\u0001\u0000\u0000" +
                    "\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000" +
                    "\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000" +
                    "\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01be\u00057\u0000\u0000" +
                    "\u01bc\u01be\u0003<\u001e\u0000\u01bd\u01b4\u0001\u0000\u0000\u0000\u01bd" +
                    "\u01bc\u0001\u0000\u0000\u0000\u01be+\u0001\u0000\u0000\u0000\u01bf\u01c0" +
                    "\u0003\u00acV\u0000\u01c0\u01c1\u0003<\u001e\u0000\u01c1-\u0001\u0000" +
                    "\u0000\u0000\u01c2\u01c4\u0005\u0010\u0000\u0000\u01c3\u01c5\u0003\u0012" +
                    "\t\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000" +
                    "\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c9\u0003\u00c0`\u0000" +
                    "\u01c7\u01c9\u0003p8\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c7" +
                    "\u0001\u0000\u0000\u0000\u01c9\u01d0\u0001\u0000\u0000\u0000\u01ca\u01d1" +
                    "\u0005;\u0000\u0000\u01cb\u01cc\u0005+\u0000\u0000\u01cc\u01cd\u00052" +
                    "\u0000\u0000\u01cd\u01ce\u0003f3\u0000\u01ce\u01cf\u00053\u0000\u0000" +
                    "\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01ca\u0001\u0000\u0000\u0000" +
                    "\u01d0\u01cb\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000" +
                    "\u01d1\u01d3\u0001\u0000\u0000\u0000\u01d2\u01d4\u0003<\u001e\u0000\u01d3" +
                    "\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4" +
                    "/\u0001\u0000\u0000\u0000\u01d5\u01d6\u0003P(\u0000\u01d6\u01d7\u0005" +
                    ":\u0000\u0000\u01d7\u01d9\u0003\u0018\f\u0000\u01d8\u01da\u0005;\u0000" +
                    "\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000" +
                    "\u0000\u01da1\u0001\u0000\u0000\u0000\u01db\u01de\u0005\u001c\u0000\u0000" +
                    "\u01dc\u01df\u0005\u000e\u0000\u0000\u01dd\u01df\u0003R)\u0000\u01de\u01dc" +
                    "\u0001\u0000\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df" +
                    "\u0001\u0000\u0000\u0000\u01df\u01e8\u0001\u0000\u0000\u0000\u01e0\u01e9" +
                    "\u0003F#\u0000\u01e1\u01e9\u0003H$\u0000\u01e2\u01e9\u0003L&\u0000\u01e3" +
                    "\u01e9\u0003N\'\u0000\u01e4\u01e9\u0003T*\u0000\u01e5\u01e9\u0003V+\u0000" +
                    "\u01e6\u01e9\u0003P(\u0000\u01e7\u01e9\u0003R)\u0000\u01e8\u01e0\u0001" +
                    "\u0000\u0000\u0000\u01e8\u01e1\u0001\u0000\u0000\u0000\u01e8\u01e2\u0001" +
                    "\u0000\u0000\u0000\u01e8\u01e3\u0001\u0000\u0000\u0000\u01e8\u01e4\u0001" +
                    "\u0000\u0000\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001" +
                    "\u0000\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001" +
                    "\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001" +
                    "\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01ee\u0005" +
                    ";\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000" +
                    "\u0000\u0000\u01ee3\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\u001d\u0000" +
                    "\u0000\u01f0\u01f1\u0005]\u0000\u0000\u01f1\u01f2\u0005;\u0000\u0000\u01f2" +
                    "5\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005\u001e\u0000\u0000\u01f4\u01f5" +
                    "\u0005]\u0000\u0000\u01f5\u01f6\u0005;\u0000\u0000\u01f67\u0001\u0000" +
                    "\u0000\u0000\u01f7\u01fe\u0005?\u0000\u0000\u01f8\u01f9\u0003\u00c0`\u0000" +
                    "\u01f9\u01fa\u00052\u0000\u0000\u01fa\u01fb\u0003f3\u0000\u01fb\u01fc" +
                    "\u00053\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01ff\u0003" +
                    "\u00c0`\u0000\u01fe\u01f8\u0001\u0000\u0000\u0000\u01fe\u01fd\u0001\u0000" +
                    "\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0003<\u001e" +
                    "\u0000\u02019\u0001\u0000\u0000\u0000\u0202\u0203\u0003>\u001f\u0000\u0203" +
                    "\u0204\u0003<\u001e\u0000\u0204;\u0001\u0000\u0000\u0000\u0205\u0209\u0005" +
                    "6\u0000\u0000\u0206\u0208\u0003\u0002\u0001\u0000\u0207\u0206\u0001\u0000" +
                    "\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000" +
                    "\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u020d\u0001\u0000" +
                    "\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u020e\u0003l6\u0000" +
                    "\u020d\u020c\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000" +
                    "\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u00057\u0000\u0000\u0210" +
                    "=\u0001\u0000\u0000\u0000\u0211\u0216\u0003@ \u0000\u0212\u0213\u0005" +
                    "9\u0000\u0000\u0213\u0215\u0003@ \u0000\u0214\u0212\u0001\u0000\u0000" +
                    "\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000" +
                    "\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217?\u0001\u0000\u0000\u0000" +
                    "\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u021b\u0003B!\u0000\u021a\u0219" +
                    "\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c" +
                    "\u0001\u0000\u0000\u0000\u021c\u0222\u0003D\"\u0000\u021d\u021e\u0003" +
                    "B!\u0000\u021e\u021f\u0003D\"\u0000\u021f\u0221\u0001\u0000\u0000\u0000" +
                    "\u0220\u021d\u0001\u0000\u0000\u0000\u0221\u0224\u0001\u0000\u0000\u0000" +
                    "\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000" +
                    "\u0223A\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0225" +
                    "\u0226\u0007\u0002\u0000\u0000\u0226C\u0001\u0000\u0000\u0000\u0227\u022a" +
                    "\u0003H$\u0000\u0228\u022a\u0003L&\u0000\u0229\u0227\u0001\u0000\u0000" +
                    "\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022a\u0238\u0001\u0000\u0000" +
                    "\u0000\u022b\u0237\u0003F#\u0000\u022c\u0237\u0003N\'\u0000\u022d\u0237" +
                    "\u0003T*\u0000\u022e\u0237\u0003V+\u0000\u022f\u0237\u0003\\.\u0000\u0230" +
                    "\u0233\u0003P(\u0000\u0231\u0234\u0003\u0010\b\u0000\u0232\u0234\u0005" +
                    "\u000e\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0232\u0001" +
                    "\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234\u0237\u0001" +
                    "\u0000\u0000\u0000\u0235\u0237\u0003R)\u0000\u0236\u022b\u0001\u0000\u0000" +
                    "\u0000\u0236\u022c\u0001\u0000\u0000\u0000\u0236\u022d\u0001\u0000\u0000" +
                    "\u0000\u0236\u022e\u0001\u0000\u0000\u0000\u0236\u022f\u0001\u0000\u0000" +
                    "\u0000\u0236\u0230\u0001\u0000\u0000\u0000\u0236\u0235\u0001\u0000\u0000" +
                    "\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238\u0236\u0001\u0000\u0000" +
                    "\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u024c\u0001\u0000\u0000" +
                    "\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023b\u0248\u0003H$\u0000\u023c" +
                    "\u0248\u0003F#\u0000\u023d\u0248\u0003N\'\u0000\u023e\u0248\u0003T*\u0000" +
                    "\u023f\u0248\u0003V+\u0000\u0240\u0248\u0003\\.\u0000\u0241\u0244\u0003" +
                    "P(\u0000\u0242\u0245\u0003\u0010\b\u0000\u0243\u0245\u0005\u000e\u0000" +
                    "\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0243\u0001\u0000\u0000" +
                    "\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0248\u0001\u0000\u0000" +
                    "\u0000\u0246\u0248\u0003R)\u0000\u0247\u023b\u0001\u0000\u0000\u0000\u0247" +
                    "\u023c\u0001\u0000\u0000\u0000\u0247\u023d\u0001\u0000\u0000\u0000\u0247" +
                    "\u023e\u0001\u0000\u0000\u0000\u0247\u023f\u0001\u0000\u0000\u0000\u0247" +
                    "\u0240\u0001\u0000\u0000\u0000\u0247\u0241\u0001\u0000\u0000\u0000\u0247" +
                    "\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249" +
                    "\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a" +
                    "\u024c\u0001\u0000\u0000\u0000\u024b\u0229\u0001\u0000\u0000\u0000\u024b" +
                    "\u0247\u0001\u0000\u0000\u0000\u024cE\u0001\u0000\u0000\u0000\u024d\u024e" +
                    "\u0005A\u0000\u0000\u024e\u024f\u0003\u00c0`\u0000\u024fG\u0001\u0000" +
                    "\u0000\u0000\u0250\u0252\u0003J%\u0000\u0251\u0250\u0001\u0000\u0000\u0000" +
                    "\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0255\u0001\u0000\u0000\u0000" +
                    "\u0253\u0256\u0005\u000e\u0000\u0000\u0254\u0256\u0003R)\u0000\u0255\u0253" +
                    "\u0001\u0000\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0255\u0256" +
                    "\u0001\u0000\u0000\u0000\u0256\u0259\u0001\u0000\u0000\u0000\u0257\u025a" +
                    "\u0003\u00c0`\u0000\u0258\u025a\u0003\u0010\b\u0000\u0259\u0257\u0001" +
                    "\u0000\u0000\u0000\u0259\u0258\u0001\u0000\u0000\u0000\u025aI\u0001\u0000" +
                    "\u0000\u0000\u025b\u025e\u0003\u00c0`\u0000\u025c\u025e\u0005G\u0000\u0000" +
                    "\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000" +
                    "\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000" +
                    "\u025f\u0260\u0005N\u0000\u0000\u0260K\u0001\u0000\u0000\u0000\u0261\u0263" +
                    "\u0003J%\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000" +
                    "\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0265\u0005G\u0000" +
                    "\u0000\u0265M\u0001\u0000\u0000\u0000\u0266\u026a\u00058\u0000\u0000\u0267" +
                    "\u026b\u0005F\u0000\u0000\u0268\u026b\u0003\u00c0`\u0000\u0269\u026b\u0003" +
                    "P(\u0000\u026a\u0267\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000" +
                    "\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000" +
                    "\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000" +
                    "\u0000\u026dO\u0001\u0000\u0000\u0000\u026e\u0270\u0003\u0012\t\u0000" +
                    "\u026f\u026e\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000" +
                    "\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0005A\u0000\u0000\u0272" +
                    "\u0274\u00056\u0000\u0000\u0273\u0275\u0003\u0012\t\u0000\u0274\u0273" +
                    "\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0279" +
                    "\u0001\u0000\u0000\u0000\u0276\u027a\u0003v;\u0000\u0277\u027a\u0003b" +
                    "1\u0000\u0278\u027a\u0003R)\u0000\u0279\u0276\u0001\u0000\u0000\u0000" +
                    "\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000" +
                    "\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027d\u00057\u0000\u0000\u027c" +
                    "\u027e\u0003\u00b0X\u0000\u027d\u027c\u0001\u0000\u0000\u0000\u027d\u027e" +
                    "\u0001\u0000\u0000\u0000\u027eQ\u0001\u0000\u0000\u0000\u027f\u0280\u0005" +
                    "@\u0000\u0000\u0280S\u0001\u0000\u0000\u0000\u0281\u0283\u00054\u0000" +
                    "\u0000\u0282\u0284\u0003J%\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0283" +
                    "\u0284\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285" +
                    "\u028b\u0003\u00c0`\u0000\u0286\u0289\u0007\u0003\u0000\u0000\u0287\u028a" +
                    "\u0003\u00c0`\u0000\u0288\u028a\u0005]\u0000\u0000\u0289\u0287\u0001\u0000" +
                    "\u0000\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u028a\u028c\u0001\u0000" +
                    "\u0000\u0000\u028b\u0286\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000" +
                    "\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u028e\u00055\u0000" +
                    "\u0000\u028eU\u0001\u0000\u0000\u0000\u028f\u0291\u0005:\u0000\u0000\u0290" +
                    "\u0292\u0005:\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0291\u0292" +
                    "\u0001\u0000\u0000\u0000\u0292\u0296\u0001\u0000\u0000\u0000\u0293\u0297" +
                    "\u0003P(\u0000\u0294\u0297\u0003\u00c0`\u0000\u0295\u0297\u0003X,\u0000" +
                    "\u0296\u0293\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000" +
                    "\u0296\u0295\u0001\u0000\u0000\u0000\u0297W\u0001\u0000\u0000\u0000\u0298" +
                    "\u0299\u0005^\u0000\u0000\u0299\u029b\u00052\u0000\u0000\u029a\u029c\u0003" +
                    "Z-\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000" +
                    "\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000" +
                    "\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f\u02a0\u00053\u0000\u0000" +
                    "\u02a0Y\u0001\u0000\u0000\u0000\u02a1\u02a5\u0003b1\u0000\u02a2\u02a5" +
                    "\u0003N\'\u0000\u02a3\u02a5\u0003P(\u0000\u02a4\u02a1\u0001\u0000\u0000" +
                    "\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a4\u02a3\u0001\u0000\u0000" +
                    "\u0000\u02a5\u02a7\u0001\u0000\u0000\u0000\u02a6\u02a8\u00059\u0000\u0000" +
                    "\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000" +
                    "\u02a8[\u0001\u0000\u0000\u0000\u02a9\u02aa\u0005Q\u0000\u0000\u02aa\u02ab" +
                    "\u0003^/\u0000\u02ab\u02ac\u00053\u0000\u0000\u02ac]\u0001\u0000\u0000" +
                    "\u0000\u02ad\u02b4\u0003H$\u0000\u02ae\u02b4\u0003L&\u0000\u02af\u02b4" +
                    "\u0005A\u0000\u0000\u02b0\u02b4\u0003N\'\u0000\u02b1\u02b4\u0003T*\u0000" +
                    "\u02b2\u02b4\u0003V+\u0000\u02b3\u02ad\u0001\u0000\u0000\u0000\u02b3\u02ae" +
                    "\u0001\u0000\u0000\u0000\u02b3\u02af\u0001\u0000\u0000\u0000\u02b3\u02b0" +
                    "\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b2" +
                    "\u0001\u0000\u0000\u0000\u02b4_\u0001\u0000\u0000\u0000\u02b5\u02c8\u0005" +
                    "E\u0000\u0000\u02b6\u02c8\u0005G\u0000\u0000\u02b7\u02c8\u0005F\u0000" +
                    "\u0000\u02b8\u02c8\u0005D\u0000\u0000\u02b9\u02c8\u0005J\u0000\u0000\u02ba" +
                    "\u02c8\u0005K\u0000\u0000\u02bb\u02bc\u0005J\u0000\u0000\u02bc\u02c8\u0005" +
                    "H\u0000\u0000\u02bd\u02be\u0005K\u0000\u0000\u02be\u02c8\u0005H\u0000" +
                    "\u0000\u02bf\u02c1\u0005H\u0000\u0000\u02c0\u02c2\u0005H\u0000\u0000\u02c1" +
                    "\u02c0\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2" +
                    "\u02c8\u0001\u0000\u0000\u0000\u02c3\u02c8\u0005I\u0000\u0000\u02c4\u02c8" +
                    "\u0005*\u0000\u0000\u02c5\u02c8\u0005.\u0000\u0000\u02c6\u02c8\u0005)" +
                    "\u0000\u0000\u02c7\u02b5\u0001\u0000\u0000\u0000\u02c7\u02b6\u0001\u0000" +
                    "\u0000\u0000\u02c7\u02b7\u0001\u0000\u0000\u0000\u02c7\u02b8\u0001\u0000" +
                    "\u0000\u0000\u02c7\u02b9\u0001\u0000\u0000\u0000\u02c7\u02ba\u0001\u0000" +
                    "\u0000\u0000\u02c7\u02bb\u0001\u0000\u0000\u0000\u02c7\u02bd\u0001\u0000" +
                    "\u0000\u0000\u02c7\u02bf\u0001\u0000\u0000\u0000\u02c7\u02c3\u0001\u0000" +
                    "\u0000\u0000\u02c7\u02c4\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000" +
                    "\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c8a\u0001\u0000\u0000" +
                    "\u0000\u02c9\u02df\u0003\u00a6S\u0000\u02ca\u02df\u0003\u00be_\u0000\u02cb" +
                    "\u02df\u0003\u00bc^\u0000\u02cc\u02df\u0003\u009eO\u0000\u02cd\u02df\u0003" +
                    "\u00a0P\u0000\u02ce\u02df\u0003\u00a2Q\u0000\u02cf\u02df\u0003\u009cN" +
                    "\u0000\u02d0\u02df\u0003\u00b2Y\u0000\u02d1\u02df\u0003\u00a4R\u0000\u02d2" +
                    "\u02df\u0005\u0006\u0000\u0000\u02d3\u02df\u0005]\u0000\u0000\u02d4\u02df" +
                    "\u0003p8\u0000\u02d5\u02df\u0003\u0010\b\u0000\u02d6\u02df\u0003P(\u0000" +
                    "\u02d7\u02df\u0003\u00b8\\\u0000\u02d8\u02df\u0003\u00c0`\u0000\u02d9" +
                    "\u02df\u0003r9\u0000\u02da\u02df\u0003<\u001e\u0000\u02db\u02dc\u0005" +
                    "2\u0000\u0000\u02dc\u02df\u00053\u0000\u0000\u02dd\u02df\u0003\u00b0X" +
                    "\u0000\u02de\u02c9\u0001\u0000\u0000\u0000\u02de\u02ca\u0001\u0000\u0000" +
                    "\u0000\u02de\u02cb\u0001\u0000\u0000\u0000\u02de\u02cc\u0001\u0000\u0000" +
                    "\u0000\u02de\u02cd\u0001\u0000\u0000\u0000\u02de\u02ce\u0001\u0000\u0000" +
                    "\u0000\u02de\u02cf\u0001\u0000\u0000\u0000\u02de\u02d0\u0001\u0000\u0000" +
                    "\u0000\u02de\u02d1\u0001\u0000\u0000\u0000\u02de\u02d2\u0001\u0000\u0000" +
                    "\u0000\u02de\u02d3\u0001\u0000\u0000\u0000\u02de\u02d4\u0001\u0000\u0000" +
                    "\u0000\u02de\u02d5\u0001\u0000\u0000\u0000\u02de\u02d6\u0001\u0000\u0000" +
                    "\u0000\u02de\u02d7\u0001\u0000\u0000\u0000\u02de\u02d8\u0001\u0000\u0000" +
                    "\u0000\u02de\u02d9\u0001\u0000\u0000\u0000\u02de\u02da\u0001\u0000\u0000" +
                    "\u0000\u02de\u02db\u0001\u0000\u0000\u0000\u02de\u02dd\u0001\u0000\u0000" +
                    "\u0000\u02dfc\u0001\u0000\u0000\u0000\u02e0\u02e5\u0005\u0015\u0000\u0000" +
                    "\u02e1\u02e3\u0003\u0012\t\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e2" +
                    "\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000\u02e4" +
                    "\u02e6\u0003\u00c0`\u0000\u02e5\u02e2\u0001\u0000\u0000\u0000\u02e5\u02e6" +
                    "\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e8" +
                    "\u00052\u0000\u0000\u02e8\u02e9\u0003f3\u0000\u02e9\u02ea\u00053\u0000" +
                    "\u0000\u02ea\u02ec\u00056\u0000\u0000\u02eb\u02ed\u0003j5\u0000\u02ec" +
                    "\u02eb\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed" +
                    "\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u00057\u0000\u0000\u02efe\u0001" +
                    "\u0000\u0000\u0000\u02f0\u02f2\u0003h4\u0000\u02f1\u02f0\u0001\u0000\u0000" +
                    "\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f7\u0001\u0000\u0000" +
                    "\u0000\u02f3\u02f4\u00059\u0000\u0000\u02f4\u02f6\u0003h4\u0000\u02f5" +
                    "\u02f3\u0001\u0000\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7" +
                    "\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8" +
                    "g\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02ff" +
                    "\u0003b1\u0000\u02fb\u02ff\u0003\f\u0006\u0000\u02fc\u02ff\u0003|>\u0000" +
                    "\u02fd\u02ff\u0003\u0082A\u0000\u02fe\u02fa\u0001\u0000\u0000\u0000\u02fe" +
                    "\u02fb\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02fe" +
                    "\u02fd\u0001\u0000\u0000\u0000\u02ff\u0301\u0001\u0000\u0000\u0000\u0300" +
                    "\u0302\u0003\u00b4Z\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0301\u0302" +
                    "\u0001\u0000\u0000\u0000\u0302\u0304\u0001\u0000\u0000\u0000\u0303\u0305" +
                    "\u0003\u0016\u000b\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0304\u0305" +
                    "\u0001\u0000\u0000\u0000\u0305i\u0001\u0000\u0000\u0000\u0306\u0308\u0003" +
                    "n7\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000" +
                    "\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000" +
                    "\u0000\u030a\u030d\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000" +
                    "\u0000\u030c\u030e\u0003l6\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030d" +
                    "\u030e\u0001\u0000\u0000\u0000\u030ek\u0001\u0000\u0000\u0000\u030f\u0310" +
                    "\u0005\u001a\u0000\u0000\u0310\u0315\u0003r9\u0000\u0311\u0312\u00059" +
                    "\u0000\u0000\u0312\u0314\u0003r9\u0000\u0313\u0311\u0001\u0000\u0000\u0000" +
                    "\u0314\u0317\u0001\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000" +
                    "\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0319\u0001\u0000\u0000\u0000" +
                    "\u0317\u0315\u0001\u0000\u0000\u0000\u0318\u031a\u0005;\u0000\u0000\u0319" +
                    "\u0318\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a" +
                    "m\u0001\u0000\u0000\u0000\u031b\u031c\u0003r9\u0000\u031c\u031d\u0005" +
                    ";\u0000\u0000\u031d\u0320\u0001\u0000\u0000\u0000\u031e\u0320\u0003\u0002" +
                    "\u0001\u0000\u031f\u031b\u0001\u0000\u0000\u0000\u031f\u031e\u0001\u0000" +
                    "\u0000\u0000\u0320o\u0001\u0000\u0000\u0000\u0321\u0323\u0003\u0012\t" +
                    "\u0000\u0322\u0321\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000" +
                    "\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0325\u0003\u00c0`\u0000" +
                    "\u0325\u0326\u00052\u0000\u0000\u0326\u0327\u0003f3\u0000\u0327\u0328" +
                    "\u00053\u0000\u0000\u0328q\u0001\u0000\u0000\u0000\u0329\u032b\u0005)" +
                    "\u0000\u0000\u032a\u0329\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000" +
                    "\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u0335\u0003t:\u0000" +
                    "\u032d\u032f\u0003`0\u0000\u032e\u0330\u0005)\u0000\u0000\u032f\u032e" +
                    "\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0331" +
                    "\u0001\u0000\u0000\u0000\u0331\u0332\u0003t:\u0000\u0332\u0334\u0001\u0000" +
                    "\u0000\u0000\u0333\u032d\u0001\u0000\u0000\u0000\u0334\u0337\u0001\u0000" +
                    "\u0000\u0000\u0335\u0333\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000" +
                    "\u0000\u0000\u0336s\u0001\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000" +
                    "\u0000\u0338\u0353\u0003\u00a6S\u0000\u0339\u0353\u0003\u00c0`\u0000\u033a" +
                    "\u0353\u0003\u0010\b\u0000\u033b\u0353\u0003\u009cN\u0000\u033c\u0353" +
                    "\u0003\u00bc^\u0000\u033d\u0353\u0003\u009eO\u0000\u033e\u0353\u0003\u00a0" +
                    "P\u0000\u033f\u0353\u0003\u00a2Q\u0000\u0340\u0353\u0003\u00be_\u0000" +
                    "\u0341\u0353\u0003\u00b2Y\u0000\u0342\u0353\u0005\u0006\u0000\u0000\u0343" +
                    "\u0353\u0005]\u0000\u0000\u0344\u0353\u0003P(\u0000\u0345\u0353\u0003" +
                    "\u00b8\\\u0000\u0346\u0353\u0003v;\u0000\u0347\u0353\u0003p8\u0000\u0348" +
                    "\u034a\u0003\u00b6[\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a" +
                    "\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034d" +
                    "\u00052\u0000\u0000\u034c\u034e\u0003r9\u0000\u034d\u034c\u0001\u0000" +
                    "\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000" +
                    "\u0000\u0000\u034f\u0353\u00053\u0000\u0000\u0350\u0353\u0003\u0016\u000b" +
                    "\u0000\u0351\u0353\u0003\u00b0X\u0000\u0352\u0338\u0001\u0000\u0000\u0000" +
                    "\u0352\u0339\u0001\u0000\u0000\u0000\u0352\u033a\u0001\u0000\u0000\u0000" +
                    "\u0352\u033b\u0001\u0000\u0000\u0000\u0352\u033c\u0001\u0000\u0000\u0000" +
                    "\u0352\u033d\u0001\u0000\u0000\u0000\u0352\u033e\u0001\u0000\u0000\u0000" +
                    "\u0352\u033f\u0001\u0000\u0000\u0000\u0352\u0340\u0001\u0000\u0000\u0000" +
                    "\u0352\u0341\u0001\u0000\u0000\u0000\u0352\u0342\u0001\u0000\u0000\u0000" +
                    "\u0352\u0343\u0001\u0000\u0000\u0000\u0352\u0344\u0001\u0000\u0000\u0000" +
                    "\u0352\u0345\u0001\u0000\u0000\u0000\u0352\u0346\u0001\u0000\u0000\u0000" +
                    "\u0352\u0347\u0001\u0000\u0000\u0000\u0352\u0349\u0001\u0000\u0000\u0000" +
                    "\u0352\u0350\u0001\u0000\u0000\u0000\u0352\u0351\u0001\u0000\u0000\u0000" +
                    "\u0353u\u0001\u0000\u0000\u0000\u0354\u0355\u0005\u001f\u0000\u0000\u0355" +
                    "\u0358\u00052\u0000\u0000\u0356\u0359\u0003r9\u0000\u0357\u0359\u0003" +
                    "R)\u0000\u0358\u0356\u0001\u0000\u0000\u0000\u0358\u0357\u0001\u0000\u0000" +
                    "\u0000\u0359\u035a\u0001\u0000\u0000\u0000\u035a\u035b\u00059\u0000\u0000" +
                    "\u035b\u035c\u0003b1\u0000\u035c\u035d\u00059\u0000\u0000\u035d\u035e" +
                    "\u0003b1\u0000\u035e\u0360\u00053\u0000\u0000\u035f\u0361\u0003\u00b0" +
                    "X\u0000\u0360\u035f\u0001\u0000\u0000\u0000\u0360\u0361\u0001\u0000\u0000" +
                    "\u0000\u0361\u0363\u0001\u0000\u0000\u0000\u0362\u0364\u0003\u0016\u000b" +
                    "\u0000\u0363\u0362\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000" +
                    "\u0000\u0364w\u0001\u0000\u0000\u0000\u0365\u0369\u0003~?\u0000\u0366" +
                    "\u0369\u0003z=\u0000\u0367\u0369\u0003|>\u0000\u0368\u0365\u0001\u0000" +
                    "\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0368\u0367\u0001\u0000" +
                    "\u0000\u0000\u0369\u036f\u0001\u0000\u0000\u0000\u036a\u036b\u00052\u0000" +
                    "\u0000\u036b\u036c\u0003x<\u0000\u036c\u036d\u00053\u0000\u0000\u036d" +
                    "\u036f\u0001\u0000\u0000\u0000\u036e\u0368\u0001\u0000\u0000\u0000\u036e" +
                    "\u036a\u0001\u0000\u0000\u0000\u036fy\u0001\u0000\u0000\u0000\u0370\u0375" +
                    "\u0003\u0080@\u0000\u0371\u0372\u00059\u0000\u0000\u0372\u0374\u0003\u0080" +
                    "@\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0374\u0377\u0001\u0000\u0000" +
                    "\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000" +
                    "\u0000\u0376\u0379\u0001\u0000\u0000\u0000\u0377\u0375\u0001\u0000\u0000" +
                    "\u0000\u0378\u037a\u00059\u0000\u0000\u0379\u0378\u0001\u0000\u0000\u0000" +
                    "\u0379\u037a\u0001\u0000\u0000\u0000\u037a{\u0001\u0000\u0000\u0000\u037b" +
                    "\u037d\u0003\u0080@\u0000\u037c\u037b\u0001\u0000\u0000\u0000\u037d\u037e" +
                    "\u0001\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000\u0000\u037e\u037f" +
                    "\u0001\u0000\u0000\u0000\u037f}\u0001\u0000\u0000\u0000\u0380\u0383\u0005" +
                    "4\u0000\u0000\u0381\u0384\u0003|>\u0000\u0382\u0384\u0003z=\u0000\u0383" +
                    "\u0381\u0001\u0000\u0000\u0000\u0383\u0382\u0001\u0000\u0000\u0000\u0384" +
                    "\u0385\u0001\u0000\u0000\u0000\u0385\u0386\u00055\u0000\u0000\u0386\u007f" +
                    "\u0001\u0000\u0000\u0000\u0387\u0389\u00052\u0000\u0000\u0388\u0387\u0001" +
                    "\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u038e\u0001" +
                    "\u0000\u0000\u0000\u038a\u038c\u0003b1\u0000\u038b\u038d\u00059\u0000" +
                    "\u0000\u038c\u038b\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000" +
                    "\u0000\u038d\u038f\u0001\u0000\u0000\u0000\u038e\u038a\u0001\u0000\u0000" +
                    "\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u038e\u0001\u0000\u0000" +
                    "\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391\u0393\u0001\u0000\u0000" +
                    "\u0000\u0392\u0394\u00053\u0000\u0000\u0393\u0392\u0001\u0000\u0000\u0000" +
                    "\u0393\u0394\u0001\u0000\u0000\u0000\u0394\u0396\u0001\u0000\u0000\u0000" +
                    "\u0395\u0397\u00059\u0000\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0396" +
                    "\u0397\u0001\u0000\u0000\u0000\u0397\u0081\u0001\u0000\u0000\u0000\u0398" +
                    "\u0399\u00052\u0000\u0000\u0399\u039a\u0003\u0084B\u0000\u039a\u039b\u0005" +
                    "3\u0000\u0000\u039b\u0083\u0001\u0000\u0000\u0000\u039c\u03a1\u0003\u0086" +
                    "C\u0000\u039d\u039e\u00059\u0000\u0000\u039e\u03a0\u0003\u0086C\u0000" +
                    "\u039f\u039d\u0001\u0000\u0000\u0000\u03a0\u03a3\u0001\u0000\u0000\u0000" +
                    "\u03a1\u039f\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000" +
                    "\u03a2\u03a5\u0001\u0000\u0000\u0000\u03a3\u03a1\u0001\u0000\u0000\u0000" +
                    "\u03a4\u03a6\u00059\u0000\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a5" +
                    "\u03a6\u0001\u0000\u0000\u0000\u03a6\u0085\u0001\u0000\u0000\u0000\u03a7" +
                    "\u03a8\u0003\u0088D\u0000\u03a8\u03a9\u0005:\u0000\u0000\u03a9\u03aa\u0003" +
                    "\u008aE\u0000\u03aa\u0087\u0001\u0000\u0000\u0000\u03ab\u03af\u0003b1" +
                    "\u0000\u03ac\u03af\u0003x<\u0000\u03ad\u03af\u0003\u0082A\u0000\u03ae" +
                    "\u03ab\u0001\u0000\u0000\u0000\u03ae\u03ac\u0001\u0000\u0000\u0000\u03ae" +
                    "\u03ad\u0001\u0000\u0000\u0000\u03af\u0089\u0001\u0000\u0000\u0000\u03b0" +
                    "\u03b4\u0003b1\u0000\u03b1\u03b4\u0003x<\u0000\u03b2\u03b4\u0003\u0082" +
                    "A\u0000\u03b3\u03b0\u0001\u0000\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000" +
                    "\u0000\u03b3\u03b2\u0001\u0000\u0000\u0000\u03b4\u008b\u0001\u0000\u0000" +
                    "\u0000\u03b5\u03b6\u0005 \u0000\u0000\u03b6\u03b7\u0003r9\u0000\u03b7" +
                    "\u03ba\u0003<\u001e\u0000\u03b8\u03bb\u0003\u008eG\u0000\u03b9\u03bb\u0003" +
                    "\u0090H\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03ba\u03b9\u0001\u0000" +
                    "\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u008d\u0001\u0000" +
                    "\u0000\u0000\u03bc\u03bd\u0005\"\u0000\u0000\u03bd\u03be\u0005\u001f\u0000" +
                    "\u0000\u03be\u03bf\u0003r9\u0000\u03bf\u03c2\u0003<\u001e\u0000\u03c0" +
                    "\u03c3\u0003\u008eG\u0000\u03c1\u03c3\u0003\u0090H\u0000\u03c2\u03c0\u0001" +
                    "\u0000\u0000\u0000\u03c2\u03c1\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001" +
                    "\u0000\u0000\u0000\u03c3\u008f\u0001\u0000\u0000\u0000\u03c4\u03c5\u0005" +
                    "\"\u0000\u0000\u03c5\u03c6\u0003<\u001e\u0000\u03c6\u0091\u0001\u0000" +
                    "\u0000\u0000\u03c7\u03c8\u0005!\u0000\u0000\u03c8\u03c9\u0003\u0010\b" +
                    "\u0000\u03c9\u03ca\u0005%\u0000\u0000\u03ca\u03cb\u0005\\\u0000\u0000" +
                    "\u03cb\u03cc\u0007\u0004\u0000\u0000\u03cc\u03cd\u0003\u0094J\u0000\u03cd" +
                    "\u03ce\u0003<\u001e\u0000\u03ce\u0093\u0001\u0000\u0000\u0000\u03cf\u03d3" +
                    "\u0005\\\u0000\u0000\u03d0\u03d3\u0003p8\u0000\u03d1\u03d3\u0003r9\u0000" +
                    "\u03d2\u03cf\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000" +
                    "\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d3\u0095\u0001\u0000\u0000\u0000" +
                    "\u03d4\u03d5\u0005#\u0000\u0000\u03d5\u03d6\u0003r9\u0000\u03d6\u03d7" +
                    "\u0003<\u001e\u0000\u03d7\u0097\u0001\u0000\u0000\u0000\u03d8\u03d9\u0005" +
                    "$\u0000\u0000\u03d9\u03de\u0003\u0010\b\u0000\u03da\u03db\u00059\u0000" +
                    "\u0000\u03db\u03dd\u0003\u0010\b\u0000\u03dc\u03da\u0001\u0000\u0000\u0000" +
                    "\u03dd\u03e0\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000" +
                    "\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e1\u0001\u0000\u0000\u0000" +
                    "\u03e0\u03de\u0001\u0000\u0000\u0000\u03e1\u03e2\u0005/\u0000\u0000\u03e2" +
                    "\u03e3\u0003\u009aM\u0000\u03e3\u03e4\u0003<\u001e\u0000\u03e4\u0099\u0001" +
                    "\u0000\u0000\u0000\u03e5\u03e8\u0003x<\u0000\u03e6\u03e8\u0003\u0082A" +
                    "\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e7\u03e6\u0001\u0000\u0000" +
                    "\u0000\u03e8\u009b\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005T\u0000\u0000" +
                    "\u03ea\u03ed\u0005[\u0000\u0000\u03eb\u03ec\u00059\u0000\u0000\u03ec\u03ee" +
                    "\u0003b1\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000" +
                    "\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef\u03f0\u00053\u0000" +
                    "\u0000\u03f0\u009d\u0001\u0000\u0000\u0000\u03f1\u03f2\u0005R\u0000\u0000" +
                    "\u03f2\u03f3\u0003r9\u0000\u03f3\u03f4\u00053\u0000\u0000\u03f4\u009f" +
                    "\u0001\u0000\u0000\u0000\u03f5\u03f6\u0005S\u0000\u0000\u03f6\u03f7\u0003" +
                    "\u00aeW\u0000\u03f7\u03f8\u00053\u0000\u0000\u03f8\u00a1\u0001\u0000\u0000" +
                    "\u0000\u03f9\u03fa\u0005U\u0000\u0000\u03fa\u0401\u0003b1\u0000\u03fb" +
                    "\u03fd\u00059\u0000\u0000\u03fc\u03fb\u0001\u0000\u0000\u0000\u03fc\u03fd" +
                    "\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000\u0000\u03fe\u0400" +
                    "\u0003b1\u0000\u03ff\u03fc\u0001\u0000\u0000\u0000\u0400\u0403\u0001\u0000" +
                    "\u0000\u0000\u0401\u03ff\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000" +
                    "\u0000\u0000\u0402\u0404\u0001\u0000\u0000\u0000\u0403\u0401\u0001\u0000" +
                    "\u0000\u0000\u0404\u0405\u00053\u0000\u0000\u0405\u00a3\u0001\u0000\u0000" +
                    "\u0000\u0406\u0407\u0005V\u0000\u0000\u0407\u0408\u0003b1\u0000\u0408" +
                    "\u0409\u00059\u0000\u0000\u0409\u040a\u0003\u00be_\u0000\u040a\u040b\u0005" +
                    "\f\u0000\u0000\u040b\u040c\u00053\u0000\u0000\u040c\u00a5\u0001\u0000" +
                    "\u0000\u0000\u040d\u0412\u0003\u00a8T\u0000\u040e\u0412\u0003\u00aaU\u0000" +
                    "\u040f\u0412\u0003\u00acV\u0000\u0410\u0412\u0003\u00aeW\u0000\u0411\u040d" +
                    "\u0001\u0000\u0000\u0000\u0411\u040e\u0001\u0000\u0000\u0000\u0411\u040f" +
                    "\u0001\u0000\u0000\u0000\u0411\u0410\u0001\u0000\u0000\u0000\u0412\u00a7" +
                    "\u0001\u0000\u0000\u0000\u0413\u0415\u0003\u00b6[\u0000\u0414\u0413\u0001" +
                    "\u0000\u0000\u0000\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u0416\u0001" +
                    "\u0000\u0000\u0000\u0416\u0417\u0005\\\u0000\u0000\u0417\u0418\u0007\u0005" +
                    "\u0000\u0000\u0418\u00a9\u0001\u0000\u0000\u0000\u0419\u041b\u0003\u00b6" +
                    "[\u0000\u041a\u0419\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000" +
                    "\u0000\u041b\u041c\u0001\u0000\u0000\u0000\u041c\u041d\u0005\\\u0000\u0000" +
                    "\u041d\u041e\u0007\u0006\u0000\u0000\u041e\u00ab\u0001\u0000\u0000\u0000" +
                    "\u041f\u0421\u0003\u00b6[\u0000\u0420\u041f\u0001\u0000\u0000\u0000\u0420" +
                    "\u0421\u0001\u0000\u0000\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422" +
                    "\u0423\u0005\\\u0000\u0000\u0423\u0424\u0005\u000e\u0000\u0000\u0424\u00ad" +
                    "\u0001\u0000\u0000\u0000\u0425\u0427\u0003\u00b6[\u0000\u0426\u0425\u0001" +
                    "\u0000\u0000\u0000\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u0428\u0001" +
                    "\u0000\u0000\u0000\u0428\u0429\u0005\\\u0000\u0000\u0429\u042a\u0005\n" +
                    "\u0000\u0000\u042a\u00af\u0001\u0000\u0000\u0000\u042b\u042c\u0007\u0007" +
                    "\u0000\u0000\u042c\u00b1\u0001\u0000\u0000\u0000\u042d\u042e\u0005\u0005" +
                    "\u0000\u0000\u042e\u00b3\u0001\u0000\u0000\u0000\u042f\u0430\u00058\u0000" +
                    "\u0000\u0430\u0431\u00058\u0000\u0000\u0431\u0432\u00058\u0000\u0000\u0432" +
                    "\u00b5\u0001\u0000\u0000\u0000\u0433\u0434\u0007\b\u0000\u0000\u0434\u00b7" +
                    "\u0001\u0000\u0000\u0000\u0435\u0436\u0005A\u0000\u0000\u0436\u0437\u0003" +
                    "\u00ba]\u0000\u0437\u00b9\u0001\u0000\u0000\u0000\u0438\u043a\u0007\t" +
                    "\u0000\u0000\u0439\u0438\u0001\u0000\u0000\u0000\u043a\u043b\u0001\u0000" +
                    "\u0000\u0000\u043b\u0439\u0001\u0000\u0000\u0000\u043b\u043c\u0001\u0000" +
                    "\u0000\u0000\u043c\u00bb\u0001\u0000\u0000\u0000\u043d\u043e\u0007\n\u0000" +
                    "\u0000\u043e\u00bd\u0001\u0000\u0000\u0000\u043f\u0441\u0003\u00b6[\u0000" +
                    "\u0440\u043f\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000\u0000\u0000" +
                    "\u0441\u0442\u0001\u0000\u0000\u0000\u0442\u0443\u0005\\\u0000\u0000\u0443" +
                    "\u00bf\u0001\u0000\u0000\u0000\u0444\u0446\u0007\u000b\u0000\u0000\u0445" +
                    "\u0444\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446" +
                    "\u0447\u0001\u0000\u0000\u0000\u0447\u044c\u0005^\u0000\u0000\u0448\u044c" +
                    "\u0005%\u0000\u0000\u0449\u044c\u0005&\u0000\u0000\u044a\u044c\u0005=" +
                    "\u0000\u0000\u044b\u0445\u0001\u0000\u0000\u0000\u044b\u0448\u0001\u0000" +
                    "\u0000\u0000\u044b\u0449\u0001\u0000\u0000\u0000\u044b\u044a\u0001\u0000" +
                    "\u0000\u0000\u044c\u00c1\u0001\u0000\u0000\u0000\u008f\u00c5\u00df\u00e4" +
                    "\u00e9\u00ee\u00f1\u00f4\u00f8\u00fc\u0101\u010c\u010f\u0117\u011c\u0120" +
                    "\u012a\u012e\u0131\u0136\u0139\u0140\u0144\u0149\u014f\u0152\u015a\u015d" +
                    "\u0168\u016b\u016e\u0172\u0178\u0180\u0183\u0189\u0195\u019e\u01a1\u01a8" +
                    "\u01b0\u01b8\u01bd\u01c4\u01c8\u01d0\u01d3\u01d9\u01de\u01e8\u01ea\u01ed" +
                    "\u01fe\u0209\u020d\u0216\u021a\u0222\u0229\u0233\u0236\u0238\u0244\u0247" +
                    "\u0249\u024b\u0251\u0255\u0259\u025d\u0262\u026a\u026c\u026f\u0274\u0279" +
                    "\u027d\u0283\u0289\u028b\u0291\u0296\u029d\u02a4\u02a7\u02b3\u02c1\u02c7" +
                    "\u02de\u02e2\u02e5\u02ec\u02f1\u02f7\u02fe\u0301\u0304\u0309\u030d\u0315" +
                    "\u0319\u031f\u0322\u032a\u032f\u0335\u0349\u034d\u0352\u0358\u0360\u0363" +
                    "\u0368\u036e\u0375\u0379\u037e\u0383\u0388\u038c\u0390\u0393\u0396\u03a1" +
                    "\u03a5\u03ae\u03b3\u03ba\u03c2\u03d2\u03de\u03e7\u03ed\u03fc\u0401\u0411" +
                    "\u0414\u041a\u0420\u0426\u043b\u0440\u0445\u044b";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}