// Generated from java-escape by ANTLR 4.11.1
package wj.template.parser.antlr4;
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
		TEXT_PLAIN=1, CLOSE_IF=2, OPEN_IF=3, ELSEIF=4, ELSE=5, OPEN_FOR=6, CLOSE_FOR=7, 
		VALUE_OPEN=8, WHITESPACE=9, AS=10, IDENTIFIER=11, DOT=12, QUESTION=13, 
		DOUBLEQ=14, NOT=15, COMMA=16, LPAREN=17, RPAREN=18, LBRACE=19, RBRACE=20, 
		GT=21, EQUAL=22, STRING_DOUBLE=23;
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
			null, null, "'</#if>'", "'<#if'", "'<#elseif'", "'<#else>'", "'<#list'", 
			"'</#list>'", "'${'", null, "'as'", null, "'.'", "'?'", "'??'", "'!'", 
			"','", "'('", "')'", "'{'", "'}'", "'>'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT_PLAIN", "CLOSE_IF", "OPEN_IF", "ELSEIF", "ELSE", "OPEN_FOR", 
			"CLOSE_FOR", "VALUE_OPEN", "WHITESPACE", "AS", "IDENTIFIER", "DOT", "QUESTION", 
			"DOUBLEQ", "NOT", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "GT", 
			"EQUAL", "STRING_DOUBLE"
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitTemplate(this);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitBlock(this);
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
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 330L) != 0) {
				{
				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXT_PLAIN:
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
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(TEXT_PLAIN);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitValue(this);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterExpression_buildmethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitExpression_buildmethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_buildmethod(this);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterExpression_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitExpression_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_identifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_fieldContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TemplateParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TemplateParser.IDENTIFIER, 0); }
		public Expression_fieldContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterExpression_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitExpression_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_field(this);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterExpression_is_exsit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitExpression_is_exsit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_is_exsit(this);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterExpression_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitExpression_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_method(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_default_valueContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TemplateParser.NOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_default_valueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterExpression_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitExpression_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_default_value(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Expression_binary_operatorContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(TemplateParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Expression_binary_operatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterExpression_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitExpression_binary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_binary_operator(this);
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new Expression_identifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(44);
				identifier();
				}
				break;
			case 2:
				{
				_localctx = new Expression_fieldContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				identifier();
				setState(46);
				match(DOT);
				setState(47);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				_localctx = new Expression_binary_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				identifier();
				setState(50);
				match(EQUAL);
				setState(51);
				constant();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_methodContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(55);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(56);
						match(QUESTION);
						setState(57);
						match(IDENTIFIER);
						setState(63);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(58);
							match(LPAREN);
							setState(60);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==IDENTIFIER) {
								{
								setState(59);
								expression_list();
								}
							}

							setState(62);
							match(RPAREN);
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new Expression_buildmethodContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						match(DOT);
						setState(67);
						match(IDENTIFIER);
						setState(73);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
						case 1:
							{
							setState(68);
							match(LPAREN);
							setState(70);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==IDENTIFIER) {
								{
								setState(69);
								expression_list();
								}
							}

							setState(72);
							match(RPAREN);
							}
							break;
						}
						}
						break;
					case 3:
						{
						_localctx = new Expression_is_exsitContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(76);
						match(DOUBLEQ);
						}
						break;
					case 4:
						{
						_localctx = new Expression_default_valueContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(77);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(78);
						match(NOT);
						setState(80);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
						case 1:
							{
							setState(79);
							identifier();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitExpression_list(this);
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
			setState(87);
			expression(0);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				expression(0);
				}
				}
				setState(94);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(STRING_DOUBLE);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_directive);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				directive_if();
				}
				break;
			case OPEN_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDirective_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDirective_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDirective_if(this);
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
			setState(103);
			match(OPEN_IF);
			setState(104);
			expression(0);
			setState(105);
			match(GT);
			setState(106);
			block();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(107);
				directive_elseif();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(113);
				directive_else();
				}
			}

			setState(116);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDirective_elseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDirective_elseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDirective_elseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_elseifContext directive_elseif() throws RecognitionException {
		Directive_elseifContext _localctx = new Directive_elseifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_directive_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ELSEIF);
			setState(119);
			expression(0);
			setState(120);
			match(GT);
			setState(121);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDirective_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDirective_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDirective_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_elseContext directive_else() throws RecognitionException {
		Directive_elseContext _localctx = new Directive_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_directive_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ELSE);
			setState(124);
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
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).enterDirective_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TemplateParserListener ) ((TemplateParserListener)listener).exitDirective_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateParserVisitor ) return ((TemplateParserVisitor<? extends T>)visitor).visitDirective_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Directive_forContext directive_for() throws RecognitionException {
		Directive_forContext _localctx = new Directive_forContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_directive_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(OPEN_FOR);
			setState(127);
			expression(0);
			setState(128);
			match(AS);
			setState(129);
			identifier();
			setState(130);
			match(GT);
			setState(131);
			block();
			setState(132);
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
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u0087\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004=\b"+
		"\u0004\u0001\u0004\u0003\u0004@\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0004\u0003"+
		"\u0004J\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004Q\b\u0004\u0005\u0004S\b\u0004\n\u0004\f\u0004V\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005[\b\u0005\n\u0005\f\u0005"+
		"^\t\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0003\bf\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tm\b\t\n"+
		"\t\f\tp\t\t\u0001\t\u0003\ts\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0001\b"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0000\u008b\u0000\u001a\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000"+
		"\u0000\u0004%\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000"+
		"\b5\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\f_\u0001\u0000"+
		"\u0000\u0000\u000ea\u0001\u0000\u0000\u0000\u0010e\u0001\u0000\u0000\u0000"+
		"\u0012g\u0001\u0000\u0000\u0000\u0014v\u0001\u0000\u0000\u0000\u0016{"+
		"\u0001\u0000\u0000\u0000\u0018~\u0001\u0000\u0000\u0000\u001a\u001b\u0003"+
		"\u0002\u0001\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001"+
		"\u0000\u0000\u0000\u001d!\u0003\u0004\u0002\u0000\u001e!\u0003\u0006\u0003"+
		"\u0000\u001f!\u0003\u0010\b\u0000 \u001d\u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0003"+
		"\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0005\u0001\u0000"+
		"\u0000&\u0005\u0001\u0000\u0000\u0000\'(\u0005\b\u0000\u0000()\u0003\b"+
		"\u0004\u0000)*\u0005\u0014\u0000\u0000*\u0007\u0001\u0000\u0000\u0000"+
		"+,\u0006\u0004\uffff\uffff\u0000,6\u0003\f\u0006\u0000-.\u0003\f\u0006"+
		"\u0000./\u0005\f\u0000\u0000/0\u0005\u000b\u0000\u000006\u0001\u0000\u0000"+
		"\u000012\u0003\f\u0006\u000023\u0005\u0016\u0000\u000034\u0003\u000e\u0007"+
		"\u000046\u0001\u0000\u0000\u00005+\u0001\u0000\u0000\u00005-\u0001\u0000"+
		"\u0000\u000051\u0001\u0000\u0000\u00006T\u0001\u0000\u0000\u000078\n\u0004"+
		"\u0000\u000089\u0005\r\u0000\u00009?\u0005\u000b\u0000\u0000:<\u0005\u0011"+
		"\u0000\u0000;=\u0003\n\u0005\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0005\u0012\u0000\u0000?:\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@S\u0001\u0000\u0000\u0000"+
		"AB\n\u0003\u0000\u0000BC\u0005\f\u0000\u0000CI\u0005\u000b\u0000\u0000"+
		"DF\u0005\u0011\u0000\u0000EG\u0003\n\u0005\u0000FE\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0005\u0012\u0000"+
		"\u0000ID\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JS\u0001\u0000"+
		"\u0000\u0000KL\n\u0002\u0000\u0000LS\u0005\u000e\u0000\u0000MN\n\u0001"+
		"\u0000\u0000NP\u0005\u000f\u0000\u0000OQ\u0003\f\u0006\u0000PO\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000R7\u0001"+
		"\u0000\u0000\u0000RA\u0001\u0000\u0000\u0000RK\u0001\u0000\u0000\u0000"+
		"RM\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000W\\\u0003\b\u0004\u0000XY\u0005\u0010\u0000\u0000Y[\u0003"+
		"\b\u0004\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z"+
		"\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u000b\u0001\u0000"+
		"\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\u000b\u0000\u0000`\r\u0001"+
		"\u0000\u0000\u0000ab\u0005\u0017\u0000\u0000b\u000f\u0001\u0000\u0000"+
		"\u0000cf\u0003\u0012\t\u0000df\u0003\u0018\f\u0000ec\u0001\u0000\u0000"+
		"\u0000ed\u0001\u0000\u0000\u0000f\u0011\u0001\u0000\u0000\u0000gh\u0005"+
		"\u0003\u0000\u0000hi\u0003\b\u0004\u0000ij\u0005\u0015\u0000\u0000jn\u0003"+
		"\u0002\u0001\u0000km\u0003\u0014\n\u0000lk\u0001\u0000\u0000\u0000mp\u0001"+
		"\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000qs\u0003\u0016\u000b"+
		"\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tu\u0005\u0002\u0000\u0000u\u0013\u0001\u0000\u0000\u0000"+
		"vw\u0005\u0004\u0000\u0000wx\u0003\b\u0004\u0000xy\u0005\u0015\u0000\u0000"+
		"yz\u0003\u0002\u0001\u0000z\u0015\u0001\u0000\u0000\u0000{|\u0005\u0005"+
		"\u0000\u0000|}\u0003\u0002\u0001\u0000}\u0017\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\u0006\u0000\u0000\u007f\u0080\u0003\b\u0004\u0000\u0080"+
		"\u0081\u0005\n\u0000\u0000\u0081\u0082\u0003\f\u0006\u0000\u0082\u0083"+
		"\u0005\u0015\u0000\u0000\u0083\u0084\u0003\u0002\u0001\u0000\u0084\u0085"+
		"\u0005\u0007\u0000\u0000\u0085\u0019\u0001\u0000\u0000\u0000\u000e \""+
		"5<?FIPRT\\enr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}