// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TemplateLexer extends Lexer {
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
		INSIDE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TEXT_PLAIN", "CLOSE_IF", "OPEN_IF", "ELSEIF", "ELSE", "OPEN_FOR", "CLOSE_FOR", 
			"VALUE_OPEN", "WHITESPACE", "AS", "IDENTIFIER", "DOT", "QUESTION", "DOUBLEQ", 
			"NOT", "COMMA", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "GT", "EQUAL", 
			"STRING_DOUBLE", "OTHERS"
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


	public TemplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TemplateLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u00a7\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000"+
		"\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003"+
		"\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006"+
		"\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002"+
		"\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002"+
		"\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002"+
		"\u0017\u0007\u0017\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u0000"+
		"5\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0004\bq\b\b\u000b\b\f\br\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n|\b\n\n\n\f\n\u007f"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u009f"+
		"\b\u0016\n\u0016\f\u0016\u00a2\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u00a0\u0000\u0018\u0002\u0001\u0004\u0002\u0006\u0003"+
		"\b\u0004\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012\t\u0014\n\u0016\u000b"+
		"\u0018\f\u001a\r\u001c\u000e\u001e\u000f \u0010\"\u0011$\u0012&\u0013"+
		"(\u0014*\u0015,\u0016.\u00170\u0000\u0002\u0000\u0001\u0004\u0002\u0000"+
		"$$<<\u0003\u0000\t\n\r\r  \u0004\u000009AZ__az\u0003\u0000\n\n\r\r\\\\"+
		"\u00a8\u0000\u0002\u0001\u0000\u0000\u0000\u0000\u0004\u0001\u0000\u0000"+
		"\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000\u0000\u0000"+
		"\u0000\n\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000\u0000\u0000\u0000"+
		"\u000e\u0001\u0000\u0000\u0000\u0000\u0010\u0001\u0000\u0000\u0000\u0001"+
		"\u0012\u0001\u0000\u0000\u0000\u0001\u0014\u0001\u0000\u0000\u0000\u0001"+
		"\u0016\u0001\u0000\u0000\u0000\u0001\u0018\u0001\u0000\u0000\u0000\u0001"+
		"\u001a\u0001\u0000\u0000\u0000\u0001\u001c\u0001\u0000\u0000\u0000\u0001"+
		"\u001e\u0001\u0000\u0000\u0000\u0001 \u0001\u0000\u0000\u0000\u0001\""+
		"\u0001\u0000\u0000\u0000\u0001$\u0001\u0000\u0000\u0000\u0001&\u0001\u0000"+
		"\u0000\u0000\u0001(\u0001\u0000\u0000\u0000\u0001*\u0001\u0000\u0000\u0000"+
		"\u0001,\u0001\u0000\u0000\u0000\u0001.\u0001\u0000\u0000\u0000\u00023"+
		"\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006>\u0001\u0000"+
		"\u0000\u0000\bE\u0001\u0000\u0000\u0000\nP\u0001\u0000\u0000\u0000\fX"+
		"\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000\u0000\u0010j\u0001\u0000"+
		"\u0000\u0000\u0012p\u0001\u0000\u0000\u0000\u0014v\u0001\u0000\u0000\u0000"+
		"\u0016y\u0001\u0000\u0000\u0000\u0018\u0080\u0001\u0000\u0000\u0000\u001a"+
		"\u0082\u0001\u0000\u0000\u0000\u001c\u0084\u0001\u0000\u0000\u0000\u001e"+
		"\u0087\u0001\u0000\u0000\u0000 \u0089\u0001\u0000\u0000\u0000\"\u008b"+
		"\u0001\u0000\u0000\u0000$\u008d\u0001\u0000\u0000\u0000&\u008f\u0001\u0000"+
		"\u0000\u0000(\u0091\u0001\u0000\u0000\u0000*\u0095\u0001\u0000\u0000\u0000"+
		",\u0099\u0001\u0000\u0000\u0000.\u009c\u0001\u0000\u0000\u00000\u00a5"+
		"\u0001\u0000\u0000\u000024\b\u0000\u0000\u000032\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u00006\u0003\u0001\u0000\u0000\u000078\u0005<\u0000\u000089\u0005/\u0000"+
		"\u00009:\u0005#\u0000\u0000:;\u0005i\u0000\u0000;<\u0005f\u0000\u0000"+
		"<=\u0005>\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0005<\u0000\u0000"+
		"?@\u0005#\u0000\u0000@A\u0005i\u0000\u0000AB\u0005f\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CD\u0006\u0002\u0000\u0000D\u0007\u0001\u0000\u0000"+
		"\u0000EF\u0005<\u0000\u0000FG\u0005#\u0000\u0000GH\u0005e\u0000\u0000"+
		"HI\u0005l\u0000\u0000IJ\u0005s\u0000\u0000JK\u0005e\u0000\u0000KL\u0005"+
		"i\u0000\u0000LM\u0005f\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0006\u0003"+
		"\u0000\u0000O\t\u0001\u0000\u0000\u0000PQ\u0005<\u0000\u0000QR\u0005#"+
		"\u0000\u0000RS\u0005e\u0000\u0000ST\u0005l\u0000\u0000TU\u0005s\u0000"+
		"\u0000UV\u0005e\u0000\u0000VW\u0005>\u0000\u0000W\u000b\u0001\u0000\u0000"+
		"\u0000XY\u0005<\u0000\u0000YZ\u0005#\u0000\u0000Z[\u0005l\u0000\u0000"+
		"[\\\u0005i\u0000\u0000\\]\u0005s\u0000\u0000]^\u0005t\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_`\u0006\u0005\u0000\u0000`\r\u0001\u0000\u0000\u0000"+
		"ab\u0005<\u0000\u0000bc\u0005/\u0000\u0000cd\u0005#\u0000\u0000de\u0005"+
		"l\u0000\u0000ef\u0005i\u0000\u0000fg\u0005s\u0000\u0000gh\u0005t\u0000"+
		"\u0000hi\u0005>\u0000\u0000i\u000f\u0001\u0000\u0000\u0000jk\u0005$\u0000"+
		"\u0000kl\u0005{\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006\u0007\u0000"+
		"\u0000n\u0011\u0001\u0000\u0000\u0000oq\u0007\u0001\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0006\b\u0001\u0000"+
		"u\u0013\u0001\u0000\u0000\u0000vw\u0005a\u0000\u0000wx\u0005s\u0000\u0000"+
		"x\u0015\u0001\u0000\u0000\u0000y}\u0007\u0002\u0000\u0000z|\u0007\u0002"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0017\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005.\u0000\u0000"+
		"\u0081\u0019\u0001\u0000\u0000\u0000\u0082\u0083\u0005?\u0000\u0000\u0083"+
		"\u001b\u0001\u0000\u0000\u0000\u0084\u0085\u0005?\u0000\u0000\u0085\u0086"+
		"\u0005?\u0000\u0000\u0086\u001d\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"!\u0000\u0000\u0088\u001f\u0001\u0000\u0000\u0000\u0089\u008a\u0005,\u0000"+
		"\u0000\u008a!\u0001\u0000\u0000\u0000\u008b\u008c\u0005(\u0000\u0000\u008c"+
		"#\u0001\u0000\u0000\u0000\u008d\u008e\u0005)\u0000\u0000\u008e%\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005{\u0000\u0000\u0090\'\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005}\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0006\u0013\u0002\u0000\u0094)\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005>\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0006\u0014\u0002\u0000\u0098+\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005=\u0000\u0000\u009a\u009b\u0005=\u0000\u0000\u009b-\u0001\u0000"+
		"\u0000\u0000\u009c\u00a0\u0005\"\u0000\u0000\u009d\u009f\u00030\u0017"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0005\"\u0000\u0000\u00a4/\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\b\u0003\u0000\u0000\u00a61\u0001\u0000\u0000\u0000\u0006"+
		"\u0000\u00015r}\u00a0\u0003\u0005\u0001\u0000\u0006\u0000\u0000\u0004"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}