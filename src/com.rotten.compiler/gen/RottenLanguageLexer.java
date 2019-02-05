package com.rotten.compiler.gen;// Generated from C:/Users/a4tec/Desktop/RottenCompiler\RottenLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RottenLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BEGIN=5, SET=6, ELEMENT=7, ADD=8, REMOVE=9, 
		END=10, PRINT=11, INT=12, WHILE=13, FOR=14, CONST=15, IF=16, THEN=17, 
		CALL=18, RETURN=19, SEPARATOR=20, DELIMITER=21, COLON=22, GLOBAL=23, ID=24, 
		STRING=25, NUMBER=26, WS=27, PLUS=28, MINUS=29, MULTIPLY=30, DIVIDE=31, 
		NEGATION=32, EQUAL=33, NON_EQUAL=34, LESS=35, LESS_OR_EQUALS=36, GREATER=37, 
		GREATER_OR_EQUALS=38, O_BRACKET=39, C_BRACKET=40, K_O_BRACKET=41, K_C_BRACKET=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "BEGIN", "SET", "ELEMENT", "ADD", "REMOVE", 
			"END", "PRINT", "INT", "WHILE", "FOR", "CONST", "IF", "THEN", "CALL", 
			"RETURN", "SEPARATOR", "DELIMITER", "COLON", "GLOBAL", "ID", "STRING", 
			"NUMBER", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "NEGATION", "EQUAL", 
			"NON_EQUAL", "LESS", "LESS_OR_EQUALS", "GREATER", "GREATER_OR_EQUALS", 
			"O_BRACKET", "C_BRACKET", "K_O_BRACKET", "K_C_BRACKET"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main_program'", "','", "'='", "'sub_program'", "'begin'", "'set'", 
			"'element'", "'add'", "'remove'", "'end'", "'print'", "'int'", "'while'", 
			"'for'", "'const'", "'if'", "'then'", "'call'", "'return'", "';'", "'.'", 
			"':'", "'global'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'!'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BEGIN", "SET", "ELEMENT", "ADD", "REMOVE", 
			"END", "PRINT", "INT", "WHILE", "FOR", "CONST", "IF", "THEN", "CALL", 
			"RETURN", "SEPARATOR", "DELIMITER", "COLON", "GLOBAL", "ID", "STRING", 
			"NUMBER", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "NEGATION", "EQUAL", 
			"NON_EQUAL", "LESS", "LESS_OR_EQUALS", "GREATER", "GREATER_OR_EQUALS", 
			"O_BRACKET", "C_BRACKET", "K_O_BRACKET", "K_C_BRACKET"
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


	public RottenLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RottenLanguage.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u00d3\n\31"+
		"\f\31\16\31\u00d6\13\31\3\32\3\32\6\32\u00da\n\32\r\32\16\32\u00db\3\32"+
		"\3\32\3\33\6\33\u00e1\n\33\r\33\16\33\u00e2\3\34\6\34\u00e6\n\34\r\34"+
		"\16\34\u00e7\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+"+
		"\3+\3\u00db\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\6\5\2C\\aac|\6\2\62;C\\"+
		"aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u0110\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5d\3\2\2"+
		"\2\7f\3\2\2\2\th\3\2\2\2\13t\3\2\2\2\rz\3\2\2\2\17~\3\2\2\2\21\u0086\3"+
		"\2\2\2\23\u008a\3\2\2\2\25\u0091\3\2\2\2\27\u0095\3\2\2\2\31\u009b\3\2"+
		"\2\2\33\u009f\3\2\2\2\35\u00a5\3\2\2\2\37\u00a9\3\2\2\2!\u00af\3\2\2\2"+
		"#\u00b2\3\2\2\2%\u00b7\3\2\2\2\'\u00bc\3\2\2\2)\u00c3\3\2\2\2+\u00c5\3"+
		"\2\2\2-\u00c7\3\2\2\2/\u00c9\3\2\2\2\61\u00d0\3\2\2\2\63\u00d7\3\2\2\2"+
		"\65\u00e0\3\2\2\2\67\u00e5\3\2\2\29\u00eb\3\2\2\2;\u00ed\3\2\2\2=\u00ef"+
		"\3\2\2\2?\u00f1\3\2\2\2A\u00f3\3\2\2\2C\u00f5\3\2\2\2E\u00f8\3\2\2\2G"+
		"\u00fb\3\2\2\2I\u00fd\3\2\2\2K\u0100\3\2\2\2M\u0102\3\2\2\2O\u0105\3\2"+
		"\2\2Q\u0107\3\2\2\2S\u0109\3\2\2\2U\u010b\3\2\2\2WX\7o\2\2XY\7c\2\2YZ"+
		"\7k\2\2Z[\7p\2\2[\\\7a\2\2\\]\7r\2\2]^\7t\2\2^_\7q\2\2_`\7i\2\2`a\7t\2"+
		"\2ab\7c\2\2bc\7o\2\2c\4\3\2\2\2de\7.\2\2e\6\3\2\2\2fg\7?\2\2g\b\3\2\2"+
		"\2hi\7u\2\2ij\7w\2\2jk\7d\2\2kl\7a\2\2lm\7r\2\2mn\7t\2\2no\7q\2\2op\7"+
		"i\2\2pq\7t\2\2qr\7c\2\2rs\7o\2\2s\n\3\2\2\2tu\7d\2\2uv\7g\2\2vw\7i\2\2"+
		"wx\7k\2\2xy\7p\2\2y\f\3\2\2\2z{\7u\2\2{|\7g\2\2|}\7v\2\2}\16\3\2\2\2~"+
		"\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\u0082\7o\2\2\u0082"+
		"\u0083\7g\2\2\u0083\u0084\7p\2\2\u0084\u0085\7v\2\2\u0085\20\3\2\2\2\u0086"+
		"\u0087\7c\2\2\u0087\u0088\7f\2\2\u0088\u0089\7f\2\2\u0089\22\3\2\2\2\u008a"+
		"\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7o\2\2\u008d\u008e\7q\2\2"+
		"\u008e\u008f\7x\2\2\u008f\u0090\7g\2\2\u0090\24\3\2\2\2\u0091\u0092\7"+
		"g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7f\2\2\u0094\26\3\2\2\2\u0095\u0096"+
		"\7r\2\2\u0096\u0097\7t\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099"+
		"\u009a\7v\2\2\u009a\30\3\2\2\2\u009b\u009c\7k\2\2\u009c\u009d\7p\2\2\u009d"+
		"\u009e\7v\2\2\u009e\32\3\2\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7j\2\2\u00a1"+
		"\u00a2\7k\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2\u00a4\34\3\2\2\2\u00a5"+
		"\u00a6\7h\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7t\2\2\u00a8\36\3\2\2\2\u00a9"+
		"\u00aa\7e\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7u\2\2"+
		"\u00ad\u00ae\7v\2\2\u00ae \3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7h\2"+
		"\2\u00b1\"\3\2\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7"+
		"g\2\2\u00b5\u00b6\7p\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9"+
		"\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7n\2\2\u00bb&\3\2\2\2\u00bc\u00bd"+
		"\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7w\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\u00c2\7p\2\2\u00c2(\3\2\2\2\u00c3\u00c4\7=\2\2\u00c4"+
		"*\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6,\3\2\2\2\u00c7\u00c8\7<\2\2\u00c8"+
		".\3\2\2\2\u00c9\u00ca\7i\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7q\2\2\u00cc"+
		"\u00cd\7d\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7n\2\2\u00cf\60\3\2\2\2\u00d0"+
		"\u00d4\t\2\2\2\u00d1\u00d3\t\3\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\62\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7\u00d9\7$\2\2\u00d8\u00da\13\2\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\7$\2\2\u00de\64\3\2\2\2\u00df\u00e1\t\4\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\66\3\2\2\2\u00e4\u00e6\t\5\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2"+
		"\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea"+
		"\b\34\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec:\3\2\2\2\u00ed\u00ee"+
		"\7/\2\2\u00ee<\3\2\2\2\u00ef\u00f0\7,\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7"+
		"\61\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7#\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7"+
		"?\2\2\u00f6\u00f7\7?\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7#\2\2\u00f9\u00fa"+
		"\7?\2\2\u00faF\3\2\2\2\u00fb\u00fc\7>\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7"+
		">\2\2\u00fe\u00ff\7?\2\2\u00ffJ\3\2\2\2\u0100\u0101\7@\2\2\u0101L\3\2"+
		"\2\2\u0102\u0103\7@\2\2\u0103\u0104\7?\2\2\u0104N\3\2\2\2\u0105\u0106"+
		"\7*\2\2\u0106P\3\2\2\2\u0107\u0108\7+\2\2\u0108R\3\2\2\2\u0109\u010a\7"+
		"}\2\2\u010aT\3\2\2\2\u010b\u010c\7\177\2\2\u010cV\3\2\2\2\7\2\u00d4\u00db"+
		"\u00e2\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}