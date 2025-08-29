// Generated from D:/AngularCompiler/Final/compiler1/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, LET=2, CONST=3, FUNCTION=4, CLASS=5, CONSTRUCTOR=6, INTERFACE=7, 
		IMPORT=8, FROM=9, EXPORT=10, AT=11, TRUE=12, FALSE=13, AT_COMPONENT=14, 
		SELECTOR=15, TEMPLATE=16, STANDALONE=17, IMPORTS=18, STYLES=19, BINDING=20, 
		TWO_WAY_BINDING=21, PROPERTY_BINDING=22, STYLE=23, Alt=24, Src=25, NG_FOR=26, 
		NG_IF=27, CLICK_EVENT=28, StringLiteral=29, NumberLiteral=30, BooleanLiteral=31, 
		Identifier=32, WHITESPACE=33, COMMENT=34, DOT=35, ARRAY_START=36, ARRAY_END=37, 
		LBRACE=38, RBRACE=39, LPAREN=40, RPAREN=41, COLON=42, COMMA=43, EQUAL=44, 
		BACKTICK=45, DIRECTIVE=46, EVENT_BINDING=47, HTML_TAG_OPEN=48, HTML_TAG_CLOSE=49, 
		HTML_TAG_END=50, HTML_SELF_CLOSING=51, DIV_TAG=52, P_TAG=53, IMG_TAG=54, 
		H2_TAG=55, THIS=56;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment = 2, RULE_decorator = 3, 
		RULE_componentDefinition = 4, RULE_componentOptions = 5, RULE_componentPropertyList = 6, 
		RULE_commaComponentProperty = 7, RULE_componentProperty = 8, RULE_template = 9, 
		RULE_htmlContent = 10, RULE_angularDirective = 11, RULE_htmlElement = 12, 
		RULE_divElement = 13, RULE_pElement = 14, RULE_imgElement = 15, RULE_imgAttributes = 16, 
		RULE_angularBinding = 17, RULE_angularExpression = 18, RULE_dotIdentifier = 19, 
		RULE_styleAttribute = 20, RULE_srcAttribute = 21, RULE_altAttribute = 22, 
		RULE_h2Element = 23, RULE_genericElement = 24, RULE_htmlAttributes = 25, 
		RULE_divAttributes = 26, RULE_pAttributes = 27, RULE_h2Attributes = 28, 
		RULE_angularEvent = 29, RULE_variableStatement = 30, RULE_array = 31, 
		RULE_arrayElements = 32, RULE_commaArrayElement = 33, RULE_arrayElement = 34, 
		RULE_object = 35, RULE_commaProperty = 36, RULE_property = 37, RULE_value = 38, 
		RULE_functionDeclaration = 39, RULE_interpolation = 40, RULE_classDeclaration = 41, 
		RULE_classBody = 42, RULE_constructorDeclaration = 43, RULE_interfaceDeclaration = 44, 
		RULE_interfaceBody = 45, RULE_importStatement = 46, RULE_importClause = 47, 
		RULE_commaImportSpecifier = 48, RULE_importSpecifier = 49, RULE_exportStatement = 50, 
		RULE_expression = 51, RULE_literal = 52, RULE_propertyBinding = 53, RULE_twoWayBinding = 54, 
		RULE_ngDirective = 55, RULE_parameterList = 56, RULE_commaParamterList = 57, 
		RULE_type = 58, RULE_commaIdentifier = 59, RULE_expressionList = 60, RULE_commaExpression = 61, 
		RULE_block = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment", "decorator", "componentDefinition", 
			"componentOptions", "componentPropertyList", "commaComponentProperty", 
			"componentProperty", "template", "htmlContent", "angularDirective", "htmlElement", 
			"divElement", "pElement", "imgElement", "imgAttributes", "angularBinding", 
			"angularExpression", "dotIdentifier", "styleAttribute", "srcAttribute", 
			"altAttribute", "h2Element", "genericElement", "htmlAttributes", "divAttributes", 
			"pAttributes", "h2Attributes", "angularEvent", "variableStatement", "array", 
			"arrayElements", "commaArrayElement", "arrayElement", "object", "commaProperty", 
			"property", "value", "functionDeclaration", "interpolation", "classDeclaration", 
			"classBody", "constructorDeclaration", "interfaceDeclaration", "interfaceBody", 
			"importStatement", "importClause", "commaImportSpecifier", "importSpecifier", 
			"exportStatement", "expression", "literal", "propertyBinding", "twoWayBinding", 
			"ngDirective", "parameterList", "commaParamterList", "type", "commaIdentifier", 
			"expressionList", "commaExpression", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'let'", "'const'", "'function'", "'class'", "'constructor'", 
			"'interface'", "'import'", "'from'", "'export'", "'@'", "'true'", "'false'", 
			"'@Component'", "'selector'", "'template'", "'standalone'", "'imports'", 
			"'styles'", null, null, null, "'style'", "'alt'", "'src'", "'*ngFor'", 
			"'*ngIf'", "'(click)'", null, null, null, null, null, null, "'.'", "'['", 
			"']'", "'{'", "'}'", "'('", "')'", "':'", "','", "'='", "'`'", "'\\*[a-zA-Z][a-zA-Z0-9_]*'", 
			"'\\([a-zA-Z][a-zA-Z0-9_]*\\)'", "'<'", "'>'", "'</'", "'/>'", "'div'", 
			"'p'", "'img'", "'h2'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMI", "LET", "CONST", "FUNCTION", "CLASS", "CONSTRUCTOR", "INTERFACE", 
			"IMPORT", "FROM", "EXPORT", "AT", "TRUE", "FALSE", "AT_COMPONENT", "SELECTOR", 
			"TEMPLATE", "STANDALONE", "IMPORTS", "STYLES", "BINDING", "TWO_WAY_BINDING", 
			"PROPERTY_BINDING", "STYLE", "Alt", "Src", "NG_FOR", "NG_IF", "CLICK_EVENT", 
			"StringLiteral", "NumberLiteral", "BooleanLiteral", "Identifier", "WHITESPACE", 
			"COMMENT", "DOT", "ARRAY_START", "ARRAY_END", "LBRACE", "RBRACE", "LPAREN", 
			"RPAREN", "COLON", "COMMA", "EQUAL", "BACKTICK", "DIRECTIVE", "EVENT_BINDING", 
			"HTML_TAG_OPEN", "HTML_TAG_CLOSE", "HTML_TAG_END", "HTML_SELF_CLOSING", 
			"DIV_TAG", "P_TAG", "IMG_TAG", "H2_TAG", "THIS"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294985120L) != 0)) {
				{
				{
				setState(126);
				statement();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStmntContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public AssignmentStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignmentStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignmentStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignmentStmnt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmntContext extends StatementContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStmnt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunDecContext extends StatementContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunDecContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDecContext extends StatementContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceDecContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDecContext extends StatementContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDecContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorLblContext extends StatementContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public DecoratorLblContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorLbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorLbl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompDefContext extends StatementContext {
		public ComponentDefinitionContext componentDefinition() {
			return getRuleContext(ComponentDefinitionContext.class,0);
		}
		public CompDefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCompDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCompDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCompDef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarStmntContext extends StatementContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public VarStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarStmnt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportStmntContext extends StatementContext {
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ExportStmntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStmnt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStmnt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImportStmntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				importStatement();
				}
				break;
			case 2:
				_localctx = new DecoratorLblContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				decorator();
				}
				break;
			case 3:
				_localctx = new CompDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				componentDefinition();
				}
				break;
			case 4:
				_localctx = new VarStmntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				variableStatement();
				}
				break;
			case 5:
				_localctx = new FunDecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				functionDeclaration();
				}
				break;
			case 6:
				_localctx = new ClassDecContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				classDeclaration();
				}
				break;
			case 7:
				_localctx = new InterfaceDecContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				interfaceDeclaration();
				}
				break;
			case 8:
				_localctx = new ExportStmntContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				exportStatement();
				}
				break;
			case 9:
				_localctx = new AssignmentStmntContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				assignment();
				setState(143);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(Identifier);
			setState(148);
			match(DOT);
			setState(149);
			match(Identifier);
			setState(150);
			match(EQUAL);
			setState(151);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT_COMPONENT() { return getToken(AngularParser.AT_COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public ComponentOptionsContext componentOptions() {
			return getRuleContext(ComponentOptionsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decorator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(AT_COMPONENT);
			setState(154);
			match(LPAREN);
			setState(155);
			match(LBRACE);
			setState(156);
			componentOptions();
			setState(157);
			match(RBRACE);
			setState(158);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDefinitionContext extends ParserRuleContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ComponentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDefinitionContext componentDefinition() throws RecognitionException {
		ComponentDefinitionContext _localctx = new ComponentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_componentDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			decorator();
			setState(161);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentOptionsContext extends ParserRuleContext {
		public ComponentPropertyListContext componentPropertyList() {
			return getRuleContext(ComponentPropertyListContext.class,0);
		}
		public ComponentOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentOptionsContext componentOptions() throws RecognitionException {
		ComponentOptionsContext _localctx = new ComponentOptionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1015808L) != 0)) {
				{
				setState(163);
				componentPropertyList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyListContext extends ParserRuleContext {
		public ComponentPropertyContext componentProperty() {
			return getRuleContext(ComponentPropertyContext.class,0);
		}
		public List<CommaComponentPropertyContext> commaComponentProperty() {
			return getRuleContexts(CommaComponentPropertyContext.class);
		}
		public CommaComponentPropertyContext commaComponentProperty(int i) {
			return getRuleContext(CommaComponentPropertyContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ComponentPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyListContext componentPropertyList() throws RecognitionException {
		ComponentPropertyListContext _localctx = new ComponentPropertyListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentPropertyList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			componentProperty();
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					commaComponentProperty();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(173);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaComponentPropertyContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ComponentPropertyContext componentProperty() {
			return getRuleContext(ComponentPropertyContext.class,0);
		}
		public CommaComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaComponentProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommaComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommaComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommaComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaComponentPropertyContext commaComponentProperty() throws RecognitionException {
		CommaComponentPropertyContext _localctx = new CommaComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commaComponentProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(COMMA);
			setState(177);
			componentProperty();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public TerminalNode STYLES() { return getToken(AngularParser.STYLES, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode TRUE() { return getToken(AngularParser.TRUE, 0); }
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertyContext componentProperty() throws RecognitionException {
		ComponentPropertyContext _localctx = new ComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_componentProperty);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(SELECTOR);
				setState(180);
				match(COLON);
				setState(181);
				match(StringLiteral);
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(TEMPLATE);
				setState(183);
				match(COLON);
				setState(184);
				template();
				}
				break;
			case STYLES:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(STYLES);
				setState(186);
				match(COLON);
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(187);
					match(LBRACE);
					}
				}

				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(190);
					match(RBRACE);
					}
					break;
				}
				}
				}
				break;
			case STANDALONE:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(STANDALONE);
				setState(194);
				match(COLON);
				setState(195);
				match(TRUE);
				}
				break;
			case IMPORTS:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(IMPORTS);
				setState(197);
				match(COLON);
				setState(198);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public List<TerminalNode> BACKTICK() { return getTokens(AngularParser.BACKTICK); }
		public TerminalNode BACKTICK(int i) {
			return getToken(AngularParser.BACKTICK, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(BACKTICK);
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(202);
				htmlContent();
				}
				break;
			}
			setState(205);
			match(BACKTICK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<AngularDirectiveContext> angularDirective() {
			return getRuleContexts(AngularDirectiveContext.class);
		}
		public AngularDirectiveContext angularDirective(int i) {
			return getRuleContext(AngularDirectiveContext.class,i);
		}
		public List<AngularEventContext> angularEvent() {
			return getRuleContexts(AngularEventContext.class);
		}
		public AngularEventContext angularEvent(int i) {
			return getRuleContext(AngularEventContext.class,i);
		}
		public List<AngularBindingContext> angularBinding() {
			return getRuleContexts(AngularBindingContext.class);
		}
		public AngularBindingContext angularBinding(int i) {
			return getRuleContext(AngularBindingContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281475451715584L) != 0)) {
				{
				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HTML_TAG_OPEN:
					{
					setState(207);
					htmlElement();
					}
					break;
				case PROPERTY_BINDING:
					{
					setState(208);
					interpolation();
					}
					break;
				case NG_FOR:
				case NG_IF:
					{
					setState(209);
					angularDirective();
					}
					break;
				case CLICK_EVENT:
					{
					setState(210);
					angularEvent();
					}
					break;
				case BINDING:
					{
					setState(211);
					angularBinding();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularDirectiveContext extends ParserRuleContext {
		public TerminalNode NG_FOR() { return getToken(AngularParser.NG_FOR, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode NG_IF() { return getToken(AngularParser.NG_IF, 0); }
		public AngularDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularDirectiveContext angularDirective() throws RecognitionException {
		AngularDirectiveContext _localctx = new AngularDirectiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_angularDirective);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NG_FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(NG_FOR);
				setState(218);
				match(EQUAL);
				setState(219);
				match(StringLiteral);
				}
				break;
			case NG_IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(NG_IF);
				setState(221);
				match(EQUAL);
				setState(222);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public DivElementContext divElement() {
			return getRuleContext(DivElementContext.class,0);
		}
		public PElementContext pElement() {
			return getRuleContext(PElementContext.class,0);
		}
		public ImgElementContext imgElement() {
			return getRuleContext(ImgElementContext.class,0);
		}
		public H2ElementContext h2Element() {
			return getRuleContext(H2ElementContext.class,0);
		}
		public GenericElementContext genericElement() {
			return getRuleContext(GenericElementContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_htmlElement);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				divElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				pElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				imgElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				h2Element();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				genericElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> DIV_TAG() { return getTokens(AngularParser.DIV_TAG); }
		public TerminalNode DIV_TAG(int i) {
			return getToken(AngularParser.DIV_TAG, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public DivElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDivElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDivElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDivElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivElementContext divElement() throws RecognitionException {
		DivElementContext _localctx = new DivElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_divElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(HTML_TAG_OPEN);
			setState(233);
			match(DIV_TAG);
			setState(234);
			match(HTML_TAG_CLOSE);
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(235);
				htmlContent();
				}
				break;
			}
			setState(238);
			match(HTML_TAG_END);
			setState(239);
			match(DIV_TAG);
			setState(240);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> P_TAG() { return getTokens(AngularParser.P_TAG); }
		public TerminalNode P_TAG(int i) {
			return getToken(AngularParser.P_TAG, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public PAttributesContext pAttributes() {
			return getRuleContext(PAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public PElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PElementContext pElement() throws RecognitionException {
		PElementContext _localctx = new PElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(HTML_TAG_OPEN);
			setState(243);
			match(P_TAG);
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(244);
				pAttributes();
				}
				break;
			}
			setState(247);
			match(HTML_TAG_CLOSE);
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(248);
				htmlContent();
				}
				break;
			}
			setState(251);
			match(HTML_TAG_END);
			setState(252);
			match(P_TAG);
			setState(253);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImgElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode HTML_SELF_CLOSING() { return getToken(AngularParser.HTML_SELF_CLOSING, 0); }
		public List<ImgAttributesContext> imgAttributes() {
			return getRuleContexts(ImgAttributesContext.class);
		}
		public ImgAttributesContext imgAttributes(int i) {
			return getRuleContext(ImgAttributesContext.class,i);
		}
		public ImgElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImgElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImgElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImgElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgElementContext imgElement() throws RecognitionException {
		ImgElementContext _localctx = new ImgElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imgElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(HTML_TAG_OPEN);
			setState(256);
			match(Identifier);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 59768832L) != 0)) {
				{
				{
				setState(257);
				imgAttributes();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(HTML_SELF_CLOSING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImgAttributesContext extends ParserRuleContext {
		public AngularBindingContext angularBinding() {
			return getRuleContext(AngularBindingContext.class,0);
		}
		public StyleAttributeContext styleAttribute() {
			return getRuleContext(StyleAttributeContext.class,0);
		}
		public SrcAttributeContext srcAttribute() {
			return getRuleContext(SrcAttributeContext.class,0);
		}
		public AltAttributeContext altAttribute() {
			return getRuleContext(AltAttributeContext.class,0);
		}
		public ImgAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imgAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImgAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImgAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImgAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgAttributesContext imgAttributes() throws RecognitionException {
		ImgAttributesContext _localctx = new ImgAttributesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_imgAttributes);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINDING:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				angularBinding();
				}
				break;
			case STYLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				styleAttribute();
				}
				break;
			case Src:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				srcAttribute();
				}
				break;
			case Alt:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				altAttribute();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularBindingContext extends ParserRuleContext {
		public TerminalNode BINDING() { return getToken(AngularParser.BINDING, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public AngularExpressionContext angularExpression() {
			return getRuleContext(AngularExpressionContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public AngularBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularBindingContext angularBinding() throws RecognitionException {
		AngularBindingContext _localctx = new AngularBindingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_angularBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(BINDING);
			setState(272);
			match(EQUAL);
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(273);
				angularExpression();
				}
				break;
			case StringLiteral:
				{
				setState(274);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public List<DotIdentifierContext> dotIdentifier() {
			return getRuleContexts(DotIdentifierContext.class);
		}
		public DotIdentifierContext dotIdentifier(int i) {
			return getRuleContext(DotIdentifierContext.class,i);
		}
		public AngularExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularExpressionContext angularExpression() throws RecognitionException {
		AngularExpressionContext _localctx = new AngularExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_angularExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(Identifier);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(278);
				dotIdentifier();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DotIdentifierContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public DotIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDotIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDotIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDotIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotIdentifierContext dotIdentifier() throws RecognitionException {
		DotIdentifierContext _localctx = new DotIdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dotIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(DOT);
			setState(285);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleAttributeContext extends ParserRuleContext {
		public TerminalNode STYLE() { return getToken(AngularParser.STYLE, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public StyleAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleAttributeContext styleAttribute() throws RecognitionException {
		StyleAttributeContext _localctx = new StyleAttributeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_styleAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(STYLE);
			setState(288);
			match(EQUAL);
			setState(289);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SrcAttributeContext extends ParserRuleContext {
		public TerminalNode Src() { return getToken(AngularParser.Src, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public AngularExpressionContext angularExpression() {
			return getRuleContext(AngularExpressionContext.class,0);
		}
		public SrcAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_srcAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSrcAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSrcAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSrcAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcAttributeContext srcAttribute() throws RecognitionException {
		SrcAttributeContext _localctx = new SrcAttributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_srcAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(Src);
			setState(292);
			match(EQUAL);
			setState(293);
			angularExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AltAttributeContext extends ParserRuleContext {
		public TerminalNode Alt() { return getToken(AngularParser.Alt, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public AngularExpressionContext angularExpression() {
			return getRuleContext(AngularExpressionContext.class,0);
		}
		public AltAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAltAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAltAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAltAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltAttributeContext altAttribute() throws RecognitionException {
		AltAttributeContext _localctx = new AltAttributeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_altAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(Alt);
			setState(296);
			match(EQUAL);
			setState(297);
			angularExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class H2ElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> H2_TAG() { return getTokens(AngularParser.H2_TAG); }
		public TerminalNode H2_TAG(int i) {
			return getToken(AngularParser.H2_TAG, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public H2ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h2Element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterH2Element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitH2Element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitH2Element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H2ElementContext h2Element() throws RecognitionException {
		H2ElementContext _localctx = new H2ElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_h2Element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(HTML_TAG_OPEN);
			setState(300);
			match(H2_TAG);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(301);
				htmlAttributes();
				}
				break;
			}
			setState(304);
			match(HTML_TAG_CLOSE);
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(305);
				htmlContent();
				}
				break;
			}
			setState(308);
			match(HTML_TAG_END);
			setState(309);
			match(H2_TAG);
			setState(310);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericElementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(AngularParser.HTML_TAG_OPEN, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> HTML_TAG_CLOSE() { return getTokens(AngularParser.HTML_TAG_CLOSE); }
		public TerminalNode HTML_TAG_CLOSE(int i) {
			return getToken(AngularParser.HTML_TAG_CLOSE, i);
		}
		public TerminalNode HTML_TAG_END() { return getToken(AngularParser.HTML_TAG_END, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public GenericElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGenericElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGenericElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGenericElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericElementContext genericElement() throws RecognitionException {
		GenericElementContext _localctx = new GenericElementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(HTML_TAG_OPEN);
			setState(313);
			match(Identifier);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(314);
				htmlAttributes();
				}
				break;
			}
			setState(317);
			match(HTML_TAG_CLOSE);
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(318);
				htmlContent();
				}
				break;
			}
			setState(321);
			match(HTML_TAG_END);
			setState(322);
			match(Identifier);
			setState(323);
			match(HTML_TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributesContext extends ParserRuleContext {
		public List<AngularDirectiveContext> angularDirective() {
			return getRuleContexts(AngularDirectiveContext.class);
		}
		public AngularDirectiveContext angularDirective(int i) {
			return getRuleContext(AngularDirectiveContext.class,i);
		}
		public List<AngularEventContext> angularEvent() {
			return getRuleContexts(AngularEventContext.class);
		}
		public AngularEventContext angularEvent(int i) {
			return getRuleContext(AngularEventContext.class,i);
		}
		public List<AngularBindingContext> angularBinding() {
			return getRuleContexts(AngularBindingContext.class);
		}
		public AngularBindingContext angularBinding(int i) {
			return getRuleContext(AngularBindingContext.class,i);
		}
		public List<StyleAttributeContext> styleAttribute() {
			return getRuleContexts(StyleAttributeContext.class);
		}
		public StyleAttributeContext styleAttribute(int i) {
			return getRuleContext(StyleAttributeContext.class,i);
		}
		public List<SrcAttributeContext> srcAttribute() {
			return getRuleContexts(SrcAttributeContext.class);
		}
		public SrcAttributeContext srcAttribute(int i) {
			return getRuleContext(SrcAttributeContext.class,i);
		}
		public List<AltAttributeContext> altAttribute() {
			return getRuleContexts(AltAttributeContext.class);
		}
		public AltAttributeContext altAttribute(int i) {
			return getRuleContext(AltAttributeContext.class,i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(AngularParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(AngularParser.StringLiteral, i);
		}
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_htmlAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1066401792L) != 0)) {
				{
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NG_FOR:
				case NG_IF:
					{
					setState(325);
					angularDirective();
					}
					break;
				case CLICK_EVENT:
					{
					setState(326);
					angularEvent();
					}
					break;
				case BINDING:
					{
					setState(327);
					angularBinding();
					}
					break;
				case STYLE:
					{
					setState(328);
					styleAttribute();
					}
					break;
				case Src:
					{
					setState(329);
					srcAttribute();
					}
					break;
				case Alt:
					{
					setState(330);
					altAttribute();
					}
					break;
				case StringLiteral:
					{
					setState(331);
					match(StringLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivAttributesContext extends ParserRuleContext {
		public List<AngularDirectiveContext> angularDirective() {
			return getRuleContexts(AngularDirectiveContext.class);
		}
		public AngularDirectiveContext angularDirective(int i) {
			return getRuleContext(AngularDirectiveContext.class,i);
		}
		public List<AngularEventContext> angularEvent() {
			return getRuleContexts(AngularEventContext.class);
		}
		public AngularEventContext angularEvent(int i) {
			return getRuleContext(AngularEventContext.class,i);
		}
		public List<AngularBindingContext> angularBinding() {
			return getRuleContexts(AngularBindingContext.class);
		}
		public AngularBindingContext angularBinding(int i) {
			return getRuleContext(AngularBindingContext.class,i);
		}
		public List<StyleAttributeContext> styleAttribute() {
			return getRuleContexts(StyleAttributeContext.class);
		}
		public StyleAttributeContext styleAttribute(int i) {
			return getRuleContext(StyleAttributeContext.class,i);
		}
		public DivAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDivAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDivAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDivAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivAttributesContext divAttributes() throws RecognitionException {
		DivAttributesContext _localctx = new DivAttributesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_divAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 479199232L) != 0)) {
				{
				setState(341);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NG_FOR:
				case NG_IF:
					{
					setState(337);
					angularDirective();
					}
					break;
				case CLICK_EVENT:
					{
					setState(338);
					angularEvent();
					}
					break;
				case BINDING:
					{
					setState(339);
					angularBinding();
					}
					break;
				case STYLE:
					{
					setState(340);
					styleAttribute();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PAttributesContext extends ParserRuleContext {
		public List<AngularBindingContext> angularBinding() {
			return getRuleContexts(AngularBindingContext.class);
		}
		public AngularBindingContext angularBinding(int i) {
			return getRuleContext(AngularBindingContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<StyleAttributeContext> styleAttribute() {
			return getRuleContexts(StyleAttributeContext.class);
		}
		public StyleAttributeContext styleAttribute(int i) {
			return getRuleContext(StyleAttributeContext.class,i);
		}
		public PAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PAttributesContext pAttributes() throws RecognitionException {
		PAttributesContext _localctx = new PAttributesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13631488L) != 0)) {
				{
				setState(349);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BINDING:
					{
					setState(346);
					angularBinding();
					}
					break;
				case PROPERTY_BINDING:
					{
					setState(347);
					interpolation();
					}
					break;
				case STYLE:
					{
					setState(348);
					styleAttribute();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class H2AttributesContext extends ParserRuleContext {
		public List<AngularBindingContext> angularBinding() {
			return getRuleContexts(AngularBindingContext.class);
		}
		public AngularBindingContext angularBinding(int i) {
			return getRuleContext(AngularBindingContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<StyleAttributeContext> styleAttribute() {
			return getRuleContexts(StyleAttributeContext.class);
		}
		public StyleAttributeContext styleAttribute(int i) {
			return getRuleContext(StyleAttributeContext.class,i);
		}
		public H2AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h2Attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterH2Attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitH2Attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitH2Attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H2AttributesContext h2Attributes() throws RecognitionException {
		H2AttributesContext _localctx = new H2AttributesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_h2Attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13631488L) != 0)) {
				{
				setState(357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BINDING:
					{
					setState(354);
					angularBinding();
					}
					break;
				case PROPERTY_BINDING:
					{
					setState(355);
					interpolation();
					}
					break;
				case STYLE:
					{
					setState(356);
					styleAttribute();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AngularEventContext extends ParserRuleContext {
		public TerminalNode CLICK_EVENT() { return getToken(AngularParser.CLICK_EVENT, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public AngularEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularEventContext angularEvent() throws RecognitionException {
		AngularEventContext _localctx = new AngularEventContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_angularEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(CLICK_EVENT);
			setState(363);
			match(EQUAL);
			setState(364);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(Identifier);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(367);
				match(COLON);
				setState(368);
				match(Identifier);
				}
			}

			setState(371);
			match(EQUAL);
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(372);
				value();
				}
				break;
			case 2:
				{
				setState(373);
				array();
				}
				break;
			case 3:
				{
				setState(374);
				object();
				}
				break;
			}
			setState(377);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ARRAY_START() { return getToken(AngularParser.ARRAY_START, 0); }
		public TerminalNode ARRAY_END() { return getToken(AngularParser.ARRAY_END, 0); }
		public ArrayElementsContext arrayElements() {
			return getRuleContext(ArrayElementsContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(ARRAY_START);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 351650447360L) != 0)) {
				{
				setState(380);
				arrayElements();
				}
			}

			setState(383);
			match(ARRAY_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementsContext extends ParserRuleContext {
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public List<CommaArrayElementContext> commaArrayElement() {
			return getRuleContexts(CommaArrayElementContext.class);
		}
		public CommaArrayElementContext commaArrayElement(int i) {
			return getRuleContext(CommaArrayElementContext.class,i);
		}
		public ArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementsContext arrayElements() throws RecognitionException {
		ArrayElementsContext _localctx = new ArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			arrayElement();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(386);
				commaArrayElement();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaArrayElementContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public CommaArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaArrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommaArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommaArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommaArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaArrayElementContext commaArrayElement() throws RecognitionException {
		CommaArrayElementContext _localctx = new CommaArrayElementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_commaArrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(COMMA);
			setState(393);
			arrayElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrayElement);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				object();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public List<CommaPropertyContext> commaProperty() {
			return getRuleContexts(CommaPropertyContext.class);
		}
		public CommaPropertyContext commaProperty(int i) {
			return getRuleContext(CommaPropertyContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(LBRACE);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral || _la==Identifier) {
				{
				setState(400);
				property();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(401);
					commaProperty();
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(409);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaPropertyContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public CommaPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommaProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommaProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommaProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaPropertyContext commaProperty() throws RecognitionException {
		CommaPropertyContext _localctx = new CommaPropertyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_commaProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(COMMA);
			setState(412);
			property();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(415);
			match(COLON);
			setState(416);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode NumberLiteral() { return getToken(AngularParser.NumberLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value);
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(StringLiteral);
				}
				break;
			case NumberLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(NumberLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(420);
				match(BooleanLiteral);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				object();
				}
				break;
			case ARRAY_START:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				array();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(423);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(Identifier);
			setState(427);
			match(LPAREN);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(428);
				parameterList();
				}
			}

			setState(431);
			match(RPAREN);
			setState(432);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode PROPERTY_BINDING() { return getToken(AngularParser.PROPERTY_BINDING, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(PROPERTY_BINDING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(CLASS);
			setState(437);
			match(Identifier);
			setState(438);
			match(LBRACE);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTRUCTOR || _la==Identifier) {
				{
				{
				setState(439);
				classBody();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classBody);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				variableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(CONSTRUCTOR);
			setState(453);
			match(LPAREN);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(454);
				parameterList();
				}
			}

			setState(457);
			match(RPAREN);
			setState(458);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<InterfaceBodyContext> interfaceBody() {
			return getRuleContexts(InterfaceBodyContext.class);
		}
		public InterfaceBodyContext interfaceBody(int i) {
			return getRuleContext(InterfaceBodyContext.class,i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(INTERFACE);
			setState(461);
			match(Identifier);
			setState(462);
			match(LBRACE);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(463);
				interfaceBody();
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_interfaceBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(Identifier);
			setState(472);
			match(COLON);
			setState(473);
			type();
			setState(474);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(IMPORT);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==LBRACE) {
				{
				setState(477);
				importClause();
				setState(478);
				match(FROM);
				setState(479);
				match(StringLiteral);
				}
			}

			setState(483);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportClauseContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public ImportSpecifierContext importSpecifier() {
			return getRuleContext(ImportSpecifierContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public List<CommaImportSpecifierContext> commaImportSpecifier() {
			return getRuleContexts(CommaImportSpecifierContext.class);
		}
		public CommaImportSpecifierContext commaImportSpecifier(int i) {
			return getRuleContext(CommaImportSpecifierContext.class,i);
		}
		public ImportClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportClauseContext importClause() throws RecognitionException {
		ImportClauseContext _localctx = new ImportClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_importClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(485);
				match(LBRACE);
				setState(486);
				importSpecifier();
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(487);
					commaImportSpecifier();
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493);
				match(RBRACE);
				}
				break;
			case Identifier:
				{
				setState(495);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaImportSpecifierContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ImportSpecifierContext importSpecifier() {
			return getRuleContext(ImportSpecifierContext.class,0);
		}
		public CommaImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaImportSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommaImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommaImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommaImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaImportSpecifierContext commaImportSpecifier() throws RecognitionException {
		CommaImportSpecifierContext _localctx = new CommaImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_commaImportSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(COMMA);
			setState(499);
			importSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_importSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exportStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(EXPORT);
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(504);
				variableStatement();
				}
				break;
			case 2:
				{
				setState(505);
				functionDeclaration();
				}
				break;
			case 3:
				{
				setState(506);
				classDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public PropertyBindingContext propertyBinding() {
			return getRuleContext(PropertyBindingContext.class,0);
		}
		public TwoWayBindingContext twoWayBinding() {
			return getRuleContext(TwoWayBindingContext.class,0);
		}
		public NgDirectiveContext ngDirective() {
			return getRuleContext(NgDirectiveContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expression);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
			case NumberLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(Identifier);
				}
				break;
			case BINDING:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				propertyBinding();
				}
				break;
			case TWO_WAY_BINDING:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				twoWayBinding();
				}
				break;
			case DIRECTIVE:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				ngDirective();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(514);
				match(LPAREN);
				setState(515);
				expression();
				setState(516);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode NumberLiteral() { return getToken(AngularParser.NumberLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBindingContext extends ParserRuleContext {
		public TerminalNode BINDING() { return getToken(AngularParser.BINDING, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public PropertyBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyBindingContext propertyBinding() throws RecognitionException {
		PropertyBindingContext _localctx = new PropertyBindingContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_propertyBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(BINDING);
			setState(523);
			match(EQUAL);
			setState(524);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TwoWayBindingContext extends ParserRuleContext {
		public TerminalNode TWO_WAY_BINDING() { return getToken(AngularParser.TWO_WAY_BINDING, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TwoWayBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoWayBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTwoWayBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTwoWayBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTwoWayBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwoWayBindingContext twoWayBinding() throws RecognitionException {
		TwoWayBindingContext _localctx = new TwoWayBindingContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_twoWayBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(TWO_WAY_BINDING);
			setState(527);
			match(EQUAL);
			setState(528);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgDirectiveContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE() { return getToken(AngularParser.DIRECTIVE, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public NgDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgDirectiveContext ngDirective() throws RecognitionException {
		NgDirectiveContext _localctx = new NgDirectiveContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ngDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(DIRECTIVE);
			setState(531);
			match(EQUAL);
			setState(532);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public List<CommaParamterListContext> commaParamterList() {
			return getRuleContexts(CommaParamterListContext.class);
		}
		public CommaParamterListContext commaParamterList(int i) {
			return getRuleContext(CommaParamterListContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(Identifier);
			setState(535);
			match(COLON);
			setState(536);
			match(Identifier);
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(537);
					commaParamterList();
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaParamterListContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CommaParamterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaParamterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommaParamterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommaParamterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommaParamterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaParamterListContext commaParamterList() throws RecognitionException {
		CommaParamterListContext _localctx = new CommaParamterListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_commaParamterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(COMMA);
			setState(544);
			parameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<CommaIdentifierContext> commaIdentifier() {
			return getRuleContexts(CommaIdentifierContext.class);
		}
		public CommaIdentifierContext commaIdentifier(int i) {
			return getRuleContext(CommaIdentifierContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(Identifier);
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(547);
				match(Identifier);
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(548);
					commaIdentifier();
					}
					}
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaIdentifierContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public CommaIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommaIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommaIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommaIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaIdentifierContext commaIdentifier() throws RecognitionException {
		CommaIdentifierContext _localctx = new CommaIdentifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_commaIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(COMMA);
			setState(557);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommaExpressionContext> commaExpression() {
			return getRuleContexts(CommaExpressionContext.class);
		}
		public CommaExpressionContext commaExpression(int i) {
			return getRuleContext(CommaExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			expression();
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(560);
				commaExpression();
				}
				}
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaExpressionContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaExpressionContext commaExpression() throws RecognitionException {
		CommaExpressionContext _localctx = new CommaExpressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_commaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(COMMA);
			setState(567);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(LBRACE);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294985120L) != 0)) {
				{
				{
				setState(570);
				statement();
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u0243\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000\u0005\u0000\u0080\b\u0000"+
		"\n\u0000\f\u0000\u0083\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0092\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005\u00a5"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u00a9\b\u0006\n\u0006\f\u0006"+
		"\u00ac\t\u0006\u0001\u0006\u0003\u0006\u00af\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00bd\b\b\u0001\b\u0003\b\u00c0\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c8\b\b\u0001\t\u0001"+
		"\t\u0003\t\u00cc\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00d5\b\n\n\n\f\n\u00d8\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e0\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e7\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00ed\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00f6\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00fa\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0103\b\u000f\n\u000f"+
		"\f\u000f\u0106\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u010e\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0114\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0118\b\u0012\n\u0012\f\u0012\u011b\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u012f"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0133\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u013c\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0140\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u014d\b\u0019\n\u0019\f\u0019\u0150\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0156\b\u001a\n\u001a\f\u001a\u0159"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u015e\b\u001b"+
		"\n\u001b\f\u001b\u0161\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u0166\b\u001c\n\u001c\f\u001c\u0169\t\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0172\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0178\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u017e\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0005 \u0184\b \n"+
		" \f \u0187\t \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u018e\b\"\u0001"+
		"#\u0001#\u0001#\u0005#\u0193\b#\n#\f#\u0196\t#\u0003#\u0198\b#\u0001#"+
		"\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u01a9\b&\u0001\'\u0001\'\u0001\'"+
		"\u0003\'\u01ae\b\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0005)\u01b9\b)\n)\f)\u01bc\t)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0003*\u01c3\b*\u0001+\u0001+\u0001+\u0003+\u01c8\b+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0005,\u01d1\b,\n,\f,\u01d4\t,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u01e2\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0005/\u01e9"+
		"\b/\n/\f/\u01ec\t/\u0001/\u0001/\u0001/\u0003/\u01f1\b/\u00010\u00010"+
		"\u00010\u00011\u00011\u00012\u00012\u00012\u00012\u00032\u01fc\b2\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u0207"+
		"\b3\u00014\u00014\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00058\u021b"+
		"\b8\n8\f8\u021e\t8\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0005:\u0226"+
		"\b:\n:\f:\u0229\t:\u0003:\u022b\b:\u0001;\u0001;\u0001;\u0001<\u0001<"+
		"\u0005<\u0232\b<\n<\f<\u0235\t<\u0001=\u0001=\u0001=\u0001>\u0001>\u0005"+
		">\u023c\b>\n>\f>\u023f\t>\u0001>\u0001>\u0001>\u0000\u0000?\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\u0000\u0002\u0002\u0000"+
		"\u001d\u001d  \u0001\u0000\u001d\u001f\u0260\u0000\u0081\u0001\u0000\u0000"+
		"\u0000\u0002\u0091\u0001\u0000\u0000\u0000\u0004\u0093\u0001\u0000\u0000"+
		"\u0000\u0006\u0099\u0001\u0000\u0000\u0000\b\u00a0\u0001\u0000\u0000\u0000"+
		"\n\u00a4\u0001\u0000\u0000\u0000\f\u00a6\u0001\u0000\u0000\u0000\u000e"+
		"\u00b0\u0001\u0000\u0000\u0000\u0010\u00c7\u0001\u0000\u0000\u0000\u0012"+
		"\u00c9\u0001\u0000\u0000\u0000\u0014\u00d6\u0001\u0000\u0000\u0000\u0016"+
		"\u00df\u0001\u0000\u0000\u0000\u0018\u00e6\u0001\u0000\u0000\u0000\u001a"+
		"\u00e8\u0001\u0000\u0000\u0000\u001c\u00f2\u0001\u0000\u0000\u0000\u001e"+
		"\u00ff\u0001\u0000\u0000\u0000 \u010d\u0001\u0000\u0000\u0000\"\u010f"+
		"\u0001\u0000\u0000\u0000$\u0115\u0001\u0000\u0000\u0000&\u011c\u0001\u0000"+
		"\u0000\u0000(\u011f\u0001\u0000\u0000\u0000*\u0123\u0001\u0000\u0000\u0000"+
		",\u0127\u0001\u0000\u0000\u0000.\u012b\u0001\u0000\u0000\u00000\u0138"+
		"\u0001\u0000\u0000\u00002\u014e\u0001\u0000\u0000\u00004\u0157\u0001\u0000"+
		"\u0000\u00006\u015f\u0001\u0000\u0000\u00008\u0167\u0001\u0000\u0000\u0000"+
		":\u016a\u0001\u0000\u0000\u0000<\u016e\u0001\u0000\u0000\u0000>\u017b"+
		"\u0001\u0000\u0000\u0000@\u0181\u0001\u0000\u0000\u0000B\u0188\u0001\u0000"+
		"\u0000\u0000D\u018d\u0001\u0000\u0000\u0000F\u018f\u0001\u0000\u0000\u0000"+
		"H\u019b\u0001\u0000\u0000\u0000J\u019e\u0001\u0000\u0000\u0000L\u01a8"+
		"\u0001\u0000\u0000\u0000N\u01aa\u0001\u0000\u0000\u0000P\u01b2\u0001\u0000"+
		"\u0000\u0000R\u01b4\u0001\u0000\u0000\u0000T\u01c2\u0001\u0000\u0000\u0000"+
		"V\u01c4\u0001\u0000\u0000\u0000X\u01cc\u0001\u0000\u0000\u0000Z\u01d7"+
		"\u0001\u0000\u0000\u0000\\\u01dc\u0001\u0000\u0000\u0000^\u01f0\u0001"+
		"\u0000\u0000\u0000`\u01f2\u0001\u0000\u0000\u0000b\u01f5\u0001\u0000\u0000"+
		"\u0000d\u01f7\u0001\u0000\u0000\u0000f\u0206\u0001\u0000\u0000\u0000h"+
		"\u0208\u0001\u0000\u0000\u0000j\u020a\u0001\u0000\u0000\u0000l\u020e\u0001"+
		"\u0000\u0000\u0000n\u0212\u0001\u0000\u0000\u0000p\u0216\u0001\u0000\u0000"+
		"\u0000r\u021f\u0001\u0000\u0000\u0000t\u0222\u0001\u0000\u0000\u0000v"+
		"\u022c\u0001\u0000\u0000\u0000x\u022f\u0001\u0000\u0000\u0000z\u0236\u0001"+
		"\u0000\u0000\u0000|\u0239\u0001\u0000\u0000\u0000~\u0080\u0003\u0002\u0001"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\u0000\u0000\u0001\u0085\u0001\u0001\u0000\u0000\u0000"+
		"\u0086\u0092\u0003\\.\u0000\u0087\u0092\u0003\u0006\u0003\u0000\u0088"+
		"\u0092\u0003\b\u0004\u0000\u0089\u0092\u0003<\u001e\u0000\u008a\u0092"+
		"\u0003N\'\u0000\u008b\u0092\u0003R)\u0000\u008c\u0092\u0003X,\u0000\u008d"+
		"\u0092\u0003d2\u0000\u008e\u008f\u0003\u0004\u0002\u0000\u008f\u0090\u0005"+
		"\u0001\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u0086\u0001"+
		"\u0000\u0000\u0000\u0091\u0087\u0001\u0000\u0000\u0000\u0091\u0088\u0001"+
		"\u0000\u0000\u0000\u0091\u0089\u0001\u0000\u0000\u0000\u0091\u008a\u0001"+
		"\u0000\u0000\u0000\u0091\u008b\u0001\u0000\u0000\u0000\u0091\u008c\u0001"+
		"\u0000\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e\u0001"+
		"\u0000\u0000\u0000\u0092\u0003\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		" \u0000\u0000\u0094\u0095\u0005#\u0000\u0000\u0095\u0096\u0005 \u0000"+
		"\u0000\u0096\u0097\u0005,\u0000\u0000\u0097\u0098\u0003f3\u0000\u0098"+
		"\u0005\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000e\u0000\u0000\u009a"+
		"\u009b\u0005(\u0000\u0000\u009b\u009c\u0005&\u0000\u0000\u009c\u009d\u0003"+
		"\n\u0005\u0000\u009d\u009e\u0005\'\u0000\u0000\u009e\u009f\u0005)\u0000"+
		"\u0000\u009f\u0007\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003\u0006\u0003"+
		"\u0000\u00a1\u00a2\u0003|>\u0000\u00a2\t\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a5\u0003\f\u0006\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u000b\u0001\u0000\u0000\u0000\u00a6\u00aa"+
		"\u0003\u0010\b\u0000\u00a7\u00a9\u0003\u000e\u0007\u0000\u00a8\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00af\u0005"+
		"+\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\r\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005+\u0000"+
		"\u0000\u00b1\u00b2\u0003\u0010\b\u0000\u00b2\u000f\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005\u000f\u0000\u0000\u00b4\u00b5\u0005*\u0000\u0000\u00b5"+
		"\u00c8\u0005\u001d\u0000\u0000\u00b6\u00b7\u0005\u0010\u0000\u0000\u00b7"+
		"\u00b8\u0005*\u0000\u0000\u00b8\u00c8\u0003\u0012\t\u0000\u00b9\u00ba"+
		"\u0005\u0013\u0000\u0000\u00ba\u00bc\u0005*\u0000\u0000\u00bb\u00bd\u0005"+
		"&\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00c0\u0005\'\u0000"+
		"\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c8\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u0011\u0000"+
		"\u0000\u00c2\u00c3\u0005*\u0000\u0000\u00c3\u00c8\u0005\f\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0012\u0000\u0000\u00c5\u00c6\u0005*\u0000\u0000\u00c6"+
		"\u00c8\u0003>\u001f\u0000\u00c7\u00b3\u0001\u0000\u0000\u0000\u00c7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00c7\u00b9\u0001\u0000\u0000\u0000\u00c7\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8\u0011"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005-\u0000\u0000\u00ca\u00cc\u0003"+
		"\u0014\n\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005-\u0000"+
		"\u0000\u00ce\u0013\u0001\u0000\u0000\u0000\u00cf\u00d5\u0003\u0018\f\u0000"+
		"\u00d0\u00d5\u0003P(\u0000\u00d1\u00d5\u0003\u0016\u000b\u0000\u00d2\u00d5"+
		"\u0003:\u001d\u0000\u00d3\u00d5\u0003\"\u0011\u0000\u00d4\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u0015\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"+
		"\u001a\u0000\u0000\u00da\u00db\u0005,\u0000\u0000\u00db\u00e0\u0005\u001d"+
		"\u0000\u0000\u00dc\u00dd\u0005\u001b\u0000\u0000\u00dd\u00de\u0005,\u0000"+
		"\u0000\u00de\u00e0\u0005\u001d\u0000\u0000\u00df\u00d9\u0001\u0000\u0000"+
		"\u0000\u00df\u00dc\u0001\u0000\u0000\u0000\u00e0\u0017\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e7\u0003\u001a\r\u0000\u00e2\u00e7\u0003\u001c\u000e\u0000"+
		"\u00e3\u00e7\u0003\u001e\u000f\u0000\u00e4\u00e7\u0003.\u0017\u0000\u00e5"+
		"\u00e7\u00030\u0018\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u0019"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u00050\u0000\u0000\u00e9\u00ea\u0005"+
		"4\u0000\u0000\u00ea\u00ec\u00051\u0000\u0000\u00eb\u00ed\u0003\u0014\n"+
		"\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u00052\u0000\u0000"+
		"\u00ef\u00f0\u00054\u0000\u0000\u00f0\u00f1\u00051\u0000\u0000\u00f1\u001b"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u00050\u0000\u0000\u00f3\u00f5\u0005"+
		"5\u0000\u0000\u00f4\u00f6\u00036\u001b\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f9\u00051\u0000\u0000\u00f8\u00fa\u0003\u0014\n\u0000"+
		"\u00f9\u00f8\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u00052\u0000\u0000\u00fc"+
		"\u00fd\u00055\u0000\u0000\u00fd\u00fe\u00051\u0000\u0000\u00fe\u001d\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u00050\u0000\u0000\u0100\u0104\u0005 \u0000"+
		"\u0000\u0101\u0103\u0003 \u0010\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u00053\u0000\u0000\u0108"+
		"\u001f\u0001\u0000\u0000\u0000\u0109\u010e\u0003\"\u0011\u0000\u010a\u010e"+
		"\u0003(\u0014\u0000\u010b\u010e\u0003*\u0015\u0000\u010c\u010e\u0003,"+
		"\u0016\u0000\u010d\u0109\u0001\u0000\u0000\u0000\u010d\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000"+
		"\u0000\u0000\u010e!\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u0014\u0000"+
		"\u0000\u0110\u0113\u0005,\u0000\u0000\u0111\u0114\u0003$\u0012\u0000\u0112"+
		"\u0114\u0005\u001d\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113"+
		"\u0112\u0001\u0000\u0000\u0000\u0114#\u0001\u0000\u0000\u0000\u0115\u0119"+
		"\u0005 \u0000\u0000\u0116\u0118\u0003&\u0013\u0000\u0117\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a%\u0001\u0000\u0000"+
		"\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u011d\u0005#\u0000\u0000"+
		"\u011d\u011e\u0005 \u0000\u0000\u011e\'\u0001\u0000\u0000\u0000\u011f"+
		"\u0120\u0005\u0017\u0000\u0000\u0120\u0121\u0005,\u0000\u0000\u0121\u0122"+
		"\u0005\u001d\u0000\u0000\u0122)\u0001\u0000\u0000\u0000\u0123\u0124\u0005"+
		"\u0019\u0000\u0000\u0124\u0125\u0005,\u0000\u0000\u0125\u0126\u0003$\u0012"+
		"\u0000\u0126+\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0018\u0000\u0000"+
		"\u0128\u0129\u0005,\u0000\u0000\u0129\u012a\u0003$\u0012\u0000\u012a-"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u00050\u0000\u0000\u012c\u012e\u0005"+
		"7\u0000\u0000\u012d\u012f\u00032\u0019\u0000\u012e\u012d\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0132\u00051\u0000\u0000\u0131\u0133\u0003\u0014\n\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u00052\u0000\u0000\u0135"+
		"\u0136\u00057\u0000\u0000\u0136\u0137\u00051\u0000\u0000\u0137/\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u00050\u0000\u0000\u0139\u013b\u0005 \u0000"+
		"\u0000\u013a\u013c\u00032\u0019\u0000\u013b\u013a\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000"+
		"\u013d\u013f\u00051\u0000\u0000\u013e\u0140\u0003\u0014\n\u0000\u013f"+
		"\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u00052\u0000\u0000\u0142\u0143"+
		"\u0005 \u0000\u0000\u0143\u0144\u00051\u0000\u0000\u01441\u0001\u0000"+
		"\u0000\u0000\u0145\u014d\u0003\u0016\u000b\u0000\u0146\u014d\u0003:\u001d"+
		"\u0000\u0147\u014d\u0003\"\u0011\u0000\u0148\u014d\u0003(\u0014\u0000"+
		"\u0149\u014d\u0003*\u0015\u0000\u014a\u014d\u0003,\u0016\u0000\u014b\u014d"+
		"\u0005\u001d\u0000\u0000\u014c\u0145\u0001\u0000\u0000\u0000\u014c\u0146"+
		"\u0001\u0000\u0000\u0000\u014c\u0147\u0001\u0000\u0000\u0000\u014c\u0148"+
		"\u0001\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014c\u014a"+
		"\u0001\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150"+
		"\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f3\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0156\u0003\u0016\u000b\u0000\u0152\u0156\u0003"+
		":\u001d\u0000\u0153\u0156\u0003\"\u0011\u0000\u0154\u0156\u0003(\u0014"+
		"\u0000\u0155\u0151\u0001\u0000\u0000\u0000\u0155\u0152\u0001\u0000\u0000"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000"+
		"\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u01585\u0001\u0000\u0000\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015e\u0003\"\u0011\u0000\u015b"+
		"\u015e\u0003P(\u0000\u015c\u015e\u0003(\u0014\u0000\u015d\u015a\u0001"+
		"\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001"+
		"\u0000\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u01607\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0166\u0003\"\u0011"+
		"\u0000\u0163\u0166\u0003P(\u0000\u0164\u0166\u0003(\u0014\u0000\u0165"+
		"\u0162\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165"+
		"\u0164\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167"+
		"\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"9\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0005\u001c\u0000\u0000\u016b\u016c\u0005,\u0000\u0000\u016c\u016d\u0005"+
		"\u001d\u0000\u0000\u016d;\u0001\u0000\u0000\u0000\u016e\u0171\u0005 \u0000"+
		"\u0000\u016f\u0170\u0005*\u0000\u0000\u0170\u0172\u0005 \u0000\u0000\u0171"+
		"\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0177\u0005,\u0000\u0000\u0174\u0178"+
		"\u0003L&\u0000\u0175\u0178\u0003>\u001f\u0000\u0176\u0178\u0003F#\u0000"+
		"\u0177\u0174\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0177\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0005\u0001\u0000\u0000\u017a=\u0001\u0000\u0000\u0000\u017b"+
		"\u017d\u0005$\u0000\u0000\u017c\u017e\u0003@ \u0000\u017d\u017c\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0005%\u0000\u0000\u0180?\u0001\u0000\u0000"+
		"\u0000\u0181\u0185\u0003D\"\u0000\u0182\u0184\u0003B!\u0000\u0183\u0182"+
		"\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186A\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0005"+
		"+\u0000\u0000\u0189\u018a\u0003D\"\u0000\u018aC\u0001\u0000\u0000\u0000"+
		"\u018b\u018e\u0003F#\u0000\u018c\u018e\u0003L&\u0000\u018d\u018b\u0001"+
		"\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018eE\u0001\u0000"+
		"\u0000\u0000\u018f\u0197\u0005&\u0000\u0000\u0190\u0194\u0003J%\u0000"+
		"\u0191\u0193\u0003H$\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0196"+
		"\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0197\u0190\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a"+
		"\u0005\'\u0000\u0000\u019aG\u0001\u0000\u0000\u0000\u019b\u019c\u0005"+
		"+\u0000\u0000\u019c\u019d\u0003J%\u0000\u019dI\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0007\u0000\u0000\u0000\u019f\u01a0\u0005*\u0000\u0000\u01a0"+
		"\u01a1\u0003L&\u0000\u01a1K\u0001\u0000\u0000\u0000\u01a2\u01a9\u0005"+
		"\u001d\u0000\u0000\u01a3\u01a9\u0005\u001e\u0000\u0000\u01a4\u01a9\u0005"+
		"\u001f\u0000\u0000\u01a5\u01a9\u0003F#\u0000\u01a6\u01a9\u0003>\u001f"+
		"\u0000\u01a7\u01a9\u0005 \u0000\u0000\u01a8\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a3\u0001\u0000\u0000\u0000\u01a8\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9M\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u0005 \u0000\u0000\u01ab\u01ad\u0005(\u0000\u0000\u01ac\u01ae\u0003"+
		"p8\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000"+
		"\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u0005)\u0000\u0000"+
		"\u01b0\u01b1\u0003|>\u0000\u01b1O\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u0005\u0016\u0000\u0000\u01b3Q\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005"+
		"\u0005\u0000\u0000\u01b5\u01b6\u0005 \u0000\u0000\u01b6\u01ba\u0005&\u0000"+
		"\u0000\u01b7\u01b9\u0003T*\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9"+
		"\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc"+
		"\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\'\u0000\u0000\u01beS"+
		"\u0001\u0000\u0000\u0000\u01bf\u01c3\u0003<\u001e\u0000\u01c0\u01c3\u0003"+
		"N\'\u0000\u01c1\u01c3\u0003V+\u0000\u01c2\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c3U\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005\u0006\u0000\u0000\u01c5"+
		"\u01c7\u0005(\u0000\u0000\u01c6\u01c8\u0003p8\u0000\u01c7\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c9\u01ca\u0005)\u0000\u0000\u01ca\u01cb\u0003|>"+
		"\u0000\u01cbW\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\u0007\u0000\u0000"+
		"\u01cd\u01ce\u0005 \u0000\u0000\u01ce\u01d2\u0005&\u0000\u0000\u01cf\u01d1"+
		"\u0003Z-\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0005\'\u0000\u0000\u01d6Y\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0005 \u0000\u0000\u01d8\u01d9\u0005*\u0000\u0000\u01d9"+
		"\u01da\u0003t:\u0000\u01da\u01db\u0005\u0001\u0000\u0000\u01db[\u0001"+
		"\u0000\u0000\u0000\u01dc\u01e1\u0005\b\u0000\u0000\u01dd\u01de\u0003^"+
		"/\u0000\u01de\u01df\u0005\t\u0000\u0000\u01df\u01e0\u0005\u001d\u0000"+
		"\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01dd\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0005\u0001\u0000\u0000\u01e4]\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0005&\u0000\u0000\u01e6\u01ea\u0003b1\u0000\u01e7\u01e9"+
		"\u0003`0\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ed\u01ee\u0005\'\u0000\u0000\u01ee\u01f1\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f1\u0005 \u0000\u0000\u01f0\u01e5\u0001\u0000\u0000\u0000"+
		"\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1_\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0005+\u0000\u0000\u01f3\u01f4\u0003b1\u0000\u01f4a\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f6\u0005 \u0000\u0000\u01f6c\u0001\u0000\u0000\u0000"+
		"\u01f7\u01fb\u0005\n\u0000\u0000\u01f8\u01fc\u0003<\u001e\u0000\u01f9"+
		"\u01fc\u0003N\'\u0000\u01fa\u01fc\u0003R)\u0000\u01fb\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fce\u0001\u0000\u0000\u0000\u01fd\u0207\u0003h4\u0000"+
		"\u01fe\u0207\u0005 \u0000\u0000\u01ff\u0207\u0003j5\u0000\u0200\u0207"+
		"\u0003l6\u0000\u0201\u0207\u0003n7\u0000\u0202\u0203\u0005(\u0000\u0000"+
		"\u0203\u0204\u0003f3\u0000\u0204\u0205\u0005)\u0000\u0000\u0205\u0207"+
		"\u0001\u0000\u0000\u0000\u0206\u01fd\u0001\u0000\u0000\u0000\u0206\u01fe"+
		"\u0001\u0000\u0000\u0000\u0206\u01ff\u0001\u0000\u0000\u0000\u0206\u0200"+
		"\u0001\u0000\u0000\u0000\u0206\u0201\u0001\u0000\u0000\u0000\u0206\u0202"+
		"\u0001\u0000\u0000\u0000\u0207g\u0001\u0000\u0000\u0000\u0208\u0209\u0007"+
		"\u0001\u0000\u0000\u0209i\u0001\u0000\u0000\u0000\u020a\u020b\u0005\u0014"+
		"\u0000\u0000\u020b\u020c\u0005,\u0000\u0000\u020c\u020d\u0005\u001d\u0000"+
		"\u0000\u020dk\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u0015\u0000\u0000"+
		"\u020f\u0210\u0005,\u0000\u0000\u0210\u0211\u0005\u001d\u0000\u0000\u0211"+
		"m\u0001\u0000\u0000\u0000\u0212\u0213\u0005.\u0000\u0000\u0213\u0214\u0005"+
		",\u0000\u0000\u0214\u0215\u0005\u001d\u0000\u0000\u0215o\u0001\u0000\u0000"+
		"\u0000\u0216\u0217\u0005 \u0000\u0000\u0217\u0218\u0005*\u0000\u0000\u0218"+
		"\u021c\u0005 \u0000\u0000\u0219\u021b\u0003r9\u0000\u021a\u0219\u0001"+
		"\u0000\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021a\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021dq\u0001\u0000"+
		"\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021f\u0220\u0005+\u0000"+
		"\u0000\u0220\u0221\u0003p8\u0000\u0221s\u0001\u0000\u0000\u0000\u0222"+
		"\u022a\u0005 \u0000\u0000\u0223\u0227\u0005 \u0000\u0000\u0224\u0226\u0003"+
		"v;\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226\u0229\u0001\u0000\u0000"+
		"\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000"+
		"\u0000\u0228\u022b\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000"+
		"\u0000\u022a\u0223\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000"+
		"\u0000\u022bu\u0001\u0000\u0000\u0000\u022c\u022d\u0005+\u0000\u0000\u022d"+
		"\u022e\u0005 \u0000\u0000\u022ew\u0001\u0000\u0000\u0000\u022f\u0233\u0003"+
		"f3\u0000\u0230\u0232\u0003z=\u0000\u0231\u0230\u0001\u0000\u0000\u0000"+
		"\u0232\u0235\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000"+
		"\u0233\u0234\u0001\u0000\u0000\u0000\u0234y\u0001\u0000\u0000\u0000\u0235"+
		"\u0233\u0001\u0000\u0000\u0000\u0236\u0237\u0005+\u0000\u0000\u0237\u0238"+
		"\u0003f3\u0000\u0238{\u0001\u0000\u0000\u0000\u0239\u023d\u0005&\u0000"+
		"\u0000\u023a\u023c\u0003\u0002\u0001\u0000\u023b\u023a\u0001\u0000\u0000"+
		"\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000"+
		"\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u0240\u0001\u0000\u0000"+
		"\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u0240\u0241\u0005\'\u0000\u0000"+
		"\u0241}\u0001\u0000\u0000\u00007\u0081\u0091\u00a4\u00aa\u00ae\u00bc\u00bf"+
		"\u00c7\u00cb\u00d4\u00d6\u00df\u00e6\u00ec\u00f5\u00f9\u0104\u010d\u0113"+
		"\u0119\u012e\u0132\u013b\u013f\u014c\u014e\u0155\u0157\u015d\u015f\u0165"+
		"\u0167\u0171\u0177\u017d\u0185\u018d\u0194\u0197\u01a8\u01ad\u01ba\u01c2"+
		"\u01c7\u01d2\u01e1\u01ea\u01f0\u01fb\u0206\u021c\u0227\u022a\u0233\u023d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}