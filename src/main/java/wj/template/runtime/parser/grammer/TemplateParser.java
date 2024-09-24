package wj.template.runtime.parser.grammer;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TemplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEXT_PLAIN=1, TEXT_CHAR_SINGLE=2, CLOSE_IF=3, OPEN_IF=4, ELSEIF=5, ELSE=6, 
		OPEN_FOR=7, CLOSE_FOR=8, VALUE_OPEN=9, WHITESPACE=10, AS=11, TRUE=12, 
		AND=13, OR=14, DOT=15, QUESTION=16, DOUBLEQ=17, NOT=18, COMMA=19, LPAREN=20, 
		RPAREN=21, LBRACE=22, RBRACE=23, GT=24, EQUAL=25, NE=26, GTO=27, LTO=28, 
		PLUS=29, MINUS=30, MUL=31, DIV=32, MOD=33, IDENTIFIER=34, STRING_DOUBLE=35, 
		STRING_SINGLE=36, INTEGER=37;
	public static final int
		RULE_template = 0, RULE_block = 1, RULE_text = 2, RULE_value = 3, RULE_expression = 4, 
		RULE_expression_list = 5, RULE_identifier = 6, RULE_constant = 7, RULE_directive = 8, 
		RULE_directive_if = 9, RULE_directive_elseif = 10, RULE_directive_else = 11, 
		RULE_directive_for = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "block", "text", "value", "expression", "expression_list", 
			"identifier", "constant", "directive", "directive_if", "directive_elseif", 
			"directive_else", "directive_for"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'</#if>'", "'<#if'", "'<#elseif'", "'<#else>'", "'<#list'", 
			"'</#list>'", "'${'", null, "'as'", "'true'", "'&&'", "'||'", "'.'", 
			"'?'", "'??'", "'!'", "','", "'('", "')'", "'{'", "'}'", "'>'", "'=='", 
			"'!='", "'gt'", "'lt'", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT_PLAIN", "TEXT_CHAR_SINGLE", "CLOSE_IF", "OPEN_IF", "ELSEIF", 
			"ELSE", "OPEN_FOR", "CLOSE_FOR", "VALUE_OPEN", "WHITESPACE", "AS", "TRUE", 
			"AND", "OR", "DOT", "QUESTION", "DOUBLEQ", "NOT", "COMMA", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "GT", "EQUAL", "NE", "GTO", "LTO", "PLUS", 
			"MINUS", "MUL", "DIV", "MOD", "IDENTIFIER", "STRING_DOUBLE", "STRING_SINGLE", 
			"INTEGER"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TemplateParser.EOF, 0); }
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			block();
			setState(27);
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
	public static class BlockContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 662L) != 0) {
				{
				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT_PLAIN:
				case TEXT_CHAR_SINGLE:
					{
					setState(29);
					text();
					}
					break;
				case VALUE_OPEN:
					{
					setState(30);
					value();
					}
					break;
				case OPEN_IF:
				case OPEN_FOR:
					{
					setState(31);
					directive();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36);
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
	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT_PLAIN() { return getToken(TemplateParser.TEXT_PLAIN, 0); }
		public TerminalNode TEXT_CHAR_SINGLE() { return getToken(TemplateParser.TEXT_CHAR_SINGLE, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_la = _input.LA(1);
			if ( !(_la==TEXT_PLAIN || _la==TEXT_CHAR_SINGLE) ) {
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VALUE_OPEN() { return getToken(TemplateParser.VALUE_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateParser.RBRACE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(VALUE_OPEN);
			setState(40);
			expression(0);
			setState(41);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_buildmethodContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TemplateParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TemplateParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TemplateParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TemplateParser.RPAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_buildmethodContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterExpression_buildmethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitExpression_buildmethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_buildmethod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_identifierContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_identifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterExpression_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitExpression_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_identifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_fieldContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TemplateParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TemplateParser.IDENTIFIER, 0); }
		public Expression_fieldContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterExpression_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitExpression_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_field(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_is_exsitContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLEQ() { return getToken(TemplateParser.DOUBLEQ, 0); }
		public Expression_is_exsitContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterExpression_is_exsit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitExpression_is_exsit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_is_exsit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_constantContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Expression_constantContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterExpression_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitExpression_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_constant(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_methodContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(TemplateParser.QUESTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TemplateParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TemplateParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TemplateParser.RPAREN, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public Expression_methodContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterExpression_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitExpression_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_method(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_default_valueContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TemplateParser.NOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TemplateParser.IDENTIFIER, 0); }
		public Expression_default_valueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterExpression_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitExpression_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_default_value(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_binary_operatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(TemplateParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TemplateParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TemplateParser.MOD, 0); }
		public TerminalNode EQUAL() { return getToken(TemplateParser.EQUAL, 0); }
		public TerminalNode NE() { return getToken(TemplateParser.NE, 0); }
		public TerminalNode GTO() { return getToken(TemplateParser.GTO, 0); }
		public TerminalNode LTO() { return getToken(TemplateParser.LTO, 0); }
		public TerminalNode PLUS() { return getToken(TemplateParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TemplateParser.MINUS, 0); }
		public TerminalNode AND() { return getToken(TemplateParser.AND, 0); }
		public TerminalNode OR() { return getToken(TemplateParser.OR, 0); }
		public Expression_binary_operatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterExpression_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitExpression_binary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case STRING_DOUBLE:
			case STRING_SINGLE:
			case INTEGER:
				{
				_localctx = new Expression_constantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				constant();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new Expression_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(48);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(49);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(50);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(51);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(52);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(53);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(54);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(55);
						_la = _input.LA(1);
						if ( !(_la==GTO || _la==LTO) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(56);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(58);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(59);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new Expression_binary_operatorContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(61);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(62);
						expression(2);
						}
						break;
					case 6:
						{
						_localctx = new Expression_fieldContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(64);
						match(DOT);
						setState(65);
						match(IDENTIFIER);
						}
						break;
					case 7:
						{
						_localctx = new Expression_methodContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(66);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(67);
						match(QUESTION);
						setState(68);
						match(IDENTIFIER);
						setState(74);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(69);
							match(LPAREN);
							setState(71);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698041856L) != 0) {
								{
								setState(70);
								expression_list();
								}
							}

							setState(73);
							match(RPAREN);
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new Expression_buildmethodContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(76);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(77);
						match(DOT);
						setState(78);
						match(IDENTIFIER);
						{
						setState(79);
						match(LPAREN);
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((_la) & ~0x3f) == 0 && ((1L << _la) & 257698041856L) != 0) {
							{
							setState(80);
							expression_list();
							}
						}

						setState(83);
						match(RPAREN);
						}
						}
						break;
					case 9:
						{
						_localctx = new Expression_is_exsitContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						match(DOUBLEQ);
						}
						break;
					case 10:
						{
						_localctx = new Expression_default_valueContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(87);
						match(NOT);
						setState(89);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(88);
							match(IDENTIFIER);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TemplateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TemplateParser.COMMA, i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			expression(0);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97);
				match(COMMA);
				setState(98);
				expression(0);
				}
				}
				setState(103);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENTIFIER);
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
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode STRING_DOUBLE() { return getToken(TemplateParser.STRING_DOUBLE, 0); }
		public TerminalNode STRING_SINGLE() { return getToken(TemplateParser.STRING_SINGLE, 0); }
		public TerminalNode INTEGER() { return getToken(TemplateParser.INTEGER, 0); }
		public TerminalNode TRUE() { return getToken(TemplateParser.TRUE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 240518172672L) != 0) ) {
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
	public static class DirectiveContext extends ParserRuleContext {
		public Directive_ifContext directive_if() {
			return getRuleContext(Directive_ifContext.class,0);
		}
		public Directive_forContext directive_for() {
			return getRuleContext(Directive_forContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_directive);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				directive_if();
				}
				break;
			case OPEN_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				directive_for();
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
	public static class Directive_ifContext extends ParserRuleContext {
		public TerminalNode OPEN_IF() { return getToken(TemplateParser.OPEN_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GT() { return getToken(TemplateParser.GT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CLOSE_IF() { return getToken(TemplateParser.CLOSE_IF, 0); }
		public List<Directive_elseifContext> directive_elseif() {
			return getRuleContexts(Directive_elseifContext.class);
		}
		public Directive_elseifContext directive_elseif(int i) {
			return getRuleContext(Directive_elseifContext.class,i);
		}
		public Directive_elseContext directive_else() {
			return getRuleContext(Directive_elseContext.class,0);
		}
		public Directive_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterDirective_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitDirective_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitDirective_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_ifContext directive_if() throws RecognitionException {
		Directive_ifContext _localctx = new Directive_ifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_directive_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(OPEN_IF);
			setState(113);
			expression(0);
			setState(114);
			match(GT);
			setState(115);
			block();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(116);
				directive_elseif();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(122);
				directive_else();
				}
			}

			setState(125);
			match(CLOSE_IF);
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
	public static class Directive_elseifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(TemplateParser.ELSEIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode GT() { return getToken(TemplateParser.GT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Directive_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterDirective_elseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitDirective_elseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitDirective_elseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_elseifContext directive_elseif() throws RecognitionException {
		Directive_elseifContext _localctx = new Directive_elseifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_directive_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ELSEIF);
			setState(128);
			expression(0);
			setState(129);
			match(GT);
			setState(130);
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
	public static class Directive_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TemplateParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Directive_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterDirective_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitDirective_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitDirective_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_elseContext directive_else() throws RecognitionException {
		Directive_elseContext _localctx = new Directive_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_directive_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ELSE);
			setState(133);
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
	public static class Directive_forContext extends ParserRuleContext {
		public TerminalNode OPEN_FOR() { return getToken(TemplateParser.OPEN_FOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(TemplateParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode GT() { return getToken(TemplateParser.GT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CLOSE_FOR() { return getToken(TemplateParser.CLOSE_FOR, 0); }
		public Directive_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).enterDirective_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener) ((TemplateParserListener)listener).exitDirective_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor) return ((TemplateParserVisitor<? extends T>)visitor).visitDirective_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_forContext directive_for() throws RecognitionException {
		Directive_forContext _localctx = new Directive_forContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_directive_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(OPEN_FOR);
			setState(136);
			expression(0);
			setState(137);
			match(AS);
			setState(138);
			identifier();
			setState(139);
			match(GT);
			setState(140);
			block();
			setState(141);
			match(CLOSE_FOR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0090\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004/\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0004"+
		"\u0003\u0004K\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004R\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0005\u0004"+
		"\\\b\u0004\n\u0004\f\u0004_\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005d\b\u0005\n\u0005\f\u0005g\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\bo\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0005\tv\b\t\n\t\f\ty\t\t\u0001\t\u0003\t|\b"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0000\u0001\b\r\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0007\u0001\u0000\u0001\u0002"+
		"\u0001\u0000\u001f!\u0001\u0000\u0019\u001a\u0001\u0000\u001b\u001c\u0001"+
		"\u0000\u001d\u001e\u0001\u0000\r\u000e\u0002\u0000\f\f#%\u0098\u0000\u001a"+
		"\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004%\u0001"+
		"\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000"+
		"\u0000\n`\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000\u000ej\u0001"+
		"\u0000\u0000\u0000\u0010n\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000"+
		"\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016\u0084\u0001\u0000\u0000"+
		"\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001"+
		"\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000"+
		"\u0000\u001d!\u0003\u0004\u0002\u0000\u001e!\u0003\u0006\u0003\u0000\u001f"+
		"!\u0003\u0010\b\u0000 \u001d\u0001\u0000\u0000\u0000 \u001e\u0001\u0000"+
		"\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000"+
		"\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0003\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0007\u0000\u0000\u0000&\u0005"+
		"\u0001\u0000\u0000\u0000\'(\u0005\t\u0000\u0000()\u0003\b\u0004\u0000"+
		")*\u0005\u0017\u0000\u0000*\u0007\u0001\u0000\u0000\u0000+,\u0006\u0004"+
		"\uffff\uffff\u0000,/\u0003\u000e\u0007\u0000-/\u0003\f\u0006\u0000.+\u0001"+
		"\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/]\u0001\u0000\u0000\u0000"+
		"01\n\t\u0000\u000012\u0007\u0001\u0000\u00002\\\u0003\b\u0004\n34\n\b"+
		"\u0000\u000045\u0007\u0002\u0000\u00005\\\u0003\b\u0004\t67\n\u0007\u0000"+
		"\u000078\u0007\u0003\u0000\u00008\\\u0003\b\u0004\b9:\n\u0006\u0000\u0000"+
		":;\u0007\u0004\u0000\u0000;\\\u0003\b\u0004\u0007<=\n\u0001\u0000\u0000"+
		"=>\u0007\u0005\u0000\u0000>\\\u0003\b\u0004\u0002?@\n\n\u0000\u0000@A"+
		"\u0005\u000f\u0000\u0000A\\\u0005\"\u0000\u0000BC\n\u0005\u0000\u0000"+
		"CD\u0005\u0010\u0000\u0000DJ\u0005\"\u0000\u0000EG\u0005\u0014\u0000\u0000"+
		"FH\u0003\n\u0005\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IK\u0005\u0015\u0000\u0000JE\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000K\\\u0001\u0000\u0000\u0000LM\n\u0004"+
		"\u0000\u0000MN\u0005\u000f\u0000\u0000NO\u0005\"\u0000\u0000OQ\u0005\u0014"+
		"\u0000\u0000PR\u0003\n\u0005\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000S\\\u0005\u0015\u0000\u0000TU\n"+
		"\u0003\u0000\u0000U\\\u0005\u0011\u0000\u0000VW\n\u0002\u0000\u0000WY"+
		"\u0005\u0012\u0000\u0000XZ\u0005\"\u0000\u0000YX\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[0\u0001\u0000\u0000"+
		"\u0000[3\u0001\u0000\u0000\u0000[6\u0001\u0000\u0000\u0000[9\u0001\u0000"+
		"\u0000\u0000[<\u0001\u0000\u0000\u0000[?\u0001\u0000\u0000\u0000[B\u0001"+
		"\u0000\u0000\u0000[L\u0001\u0000\u0000\u0000[T\u0001\u0000\u0000\u0000"+
		"[V\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^\t\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000`e\u0003\b\u0004\u0000ab\u0005\u0013\u0000\u0000bd\u0003\b"+
		"\u0004\u0000ca\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u000b\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000hi\u0005\"\u0000\u0000i\r\u0001\u0000"+
		"\u0000\u0000jk\u0007\u0006\u0000\u0000k\u000f\u0001\u0000\u0000\u0000"+
		"lo\u0003\u0012\t\u0000mo\u0003\u0018\f\u0000nl\u0001\u0000\u0000\u0000"+
		"nm\u0001\u0000\u0000\u0000o\u0011\u0001\u0000\u0000\u0000pq\u0005\u0004"+
		"\u0000\u0000qr\u0003\b\u0004\u0000rs\u0005\u0018\u0000\u0000sw\u0003\u0002"+
		"\u0001\u0000tv\u0003\u0014\n\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x{\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0003\u0016\u000b\u0000"+
		"{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0005\u0003\u0000\u0000~\u0013\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\u0005\u0000\u0000\u0080\u0081\u0003\b\u0004\u0000\u0081\u0082"+
		"\u0005\u0018\u0000\u0000\u0082\u0083\u0003\u0002\u0001\u0000\u0083\u0015"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0006\u0000\u0000\u0085\u0086"+
		"\u0003\u0002\u0001\u0000\u0086\u0017\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005\u0007\u0000\u0000\u0088\u0089\u0003\b\u0004\u0000\u0089\u008a\u0005"+
		"\u000b\u0000\u0000\u008a\u008b\u0003\f\u0006\u0000\u008b\u008c\u0005\u0018"+
		"\u0000\u0000\u008c\u008d\u0003\u0002\u0001\u0000\u008d\u008e\u0005\b\u0000"+
		"\u0000\u008e\u0019\u0001\u0000\u0000\u0000\r \".GJQY[]enw{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}