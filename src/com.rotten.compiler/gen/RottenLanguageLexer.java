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
		END=10, PRINT=11, INT=12, WHILE=13, IF=14, THEN=15, CALL=16, RETURN=17, 
		SEPARATOR=18, DELIMITER=19, ID=20, STRING=21, NUMBER=22, WS=23, PLUS=24, 
		MINUS=25, MULTIPLY=26, DIVIDE=27, NEGATION=28, EQUAL=29, NON_EQUAL=30, 
		LESS=31, LESS_OR_EQUALS=32, GREATER=33, GREATER_OR_EQUALS=34, O_BRACKET=35, 
		C_BRACKET=36, K_O_BRACKET=37, K_C_BRACKET=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "BEGIN", "SET", "ELEMENT", "ADD", "REMOVE", 
			"END", "PRINT", "INT", "WHILE", "IF", "THEN", "CALL", "RETURN", "SEPARATOR", 
			"DELIMITER", "ID", "STRING", "NUMBER", "WS", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", "LESS_OR_EQUALS", 
			"GREATER", "GREATER_OR_EQUALS", "O_BRACKET", "C_BRACKET", "K_O_BRACKET", 
			"K_C_BRACKET"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main_program'", "'='", "','", "'sub_program'", "'begin'", "'set'", 
			"'element'", "'add'", "'remove'", "'end'", "'print'", "'int'", "'while'", 
			"'if'", "'then'", "'call'", "'return'", "';'", "'.'", null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'!'", "'=='", "'!='", "'<'", "'<='", 
			"'>'", "'>='", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BEGIN", "SET", "ELEMENT", "ADD", "REMOVE", 
			"END", "PRINT", "INT", "WHILE", "IF", "THEN", "CALL", "RETURN", "SEPARATOR", 
			"DELIMITER", "ID", "STRING", "NUMBER", "WS", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", "LESS_OR_EQUALS", 
			"GREATER", "GREATER_OR_EQUALS", "O_BRACKET", "C_BRACKET", "K_O_BRACKET", 
			"K_C_BRACKET"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00f2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\7\25\u00b8\n\25\f\25\16\25\u00bb\13\25\3\26\3\26\6\26\u00bf\n\26"+
		"\r\26\16\26\u00c0\3\26\3\26\3\27\6\27\u00c6\n\27\r\27\16\27\u00c7\3\30"+
		"\6\30\u00cb\n\30\r\30\16\30\u00cc\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3"+
		"\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\u00c0\2(\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00f5"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5\\\3\2\2\2\7^\3\2\2\2"+
		"\t`\3\2\2\2\13l\3\2\2\2\rr\3\2\2\2\17v\3\2\2\2\21~\3\2\2\2\23\u0082\3"+
		"\2\2\2\25\u0089\3\2\2\2\27\u008d\3\2\2\2\31\u0093\3\2\2\2\33\u0097\3\2"+
		"\2\2\35\u009d\3\2\2\2\37\u00a0\3\2\2\2!\u00a5\3\2\2\2#\u00aa\3\2\2\2%"+
		"\u00b1\3\2\2\2\'\u00b3\3\2\2\2)\u00b5\3\2\2\2+\u00bc\3\2\2\2-\u00c5\3"+
		"\2\2\2/\u00ca\3\2\2\2\61\u00d0\3\2\2\2\63\u00d2\3\2\2\2\65\u00d4\3\2\2"+
		"\2\67\u00d6\3\2\2\29\u00d8\3\2\2\2;\u00da\3\2\2\2=\u00dd\3\2\2\2?\u00e0"+
		"\3\2\2\2A\u00e2\3\2\2\2C\u00e5\3\2\2\2E\u00e7\3\2\2\2G\u00ea\3\2\2\2I"+
		"\u00ec\3\2\2\2K\u00ee\3\2\2\2M\u00f0\3\2\2\2OP\7o\2\2PQ\7c\2\2QR\7k\2"+
		"\2RS\7p\2\2ST\7a\2\2TU\7r\2\2UV\7t\2\2VW\7q\2\2WX\7i\2\2XY\7t\2\2YZ\7"+
		"c\2\2Z[\7o\2\2[\4\3\2\2\2\\]\7?\2\2]\6\3\2\2\2^_\7.\2\2_\b\3\2\2\2`a\7"+
		"u\2\2ab\7w\2\2bc\7d\2\2cd\7a\2\2de\7r\2\2ef\7t\2\2fg\7q\2\2gh\7i\2\2h"+
		"i\7t\2\2ij\7c\2\2jk\7o\2\2k\n\3\2\2\2lm\7d\2\2mn\7g\2\2no\7i\2\2op\7k"+
		"\2\2pq\7p\2\2q\f\3\2\2\2rs\7u\2\2st\7g\2\2tu\7v\2\2u\16\3\2\2\2vw\7g\2"+
		"\2wx\7n\2\2xy\7g\2\2yz\7o\2\2z{\7g\2\2{|\7p\2\2|}\7v\2\2}\20\3\2\2\2~"+
		"\177\7c\2\2\177\u0080\7f\2\2\u0080\u0081\7f\2\2\u0081\22\3\2\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7o\2\2\u0085\u0086\7q\2\2"+
		"\u0086\u0087\7x\2\2\u0087\u0088\7g\2\2\u0088\24\3\2\2\2\u0089\u008a\7"+
		"g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7f\2\2\u008c\26\3\2\2\2\u008d\u008e"+
		"\7r\2\2\u008e\u008f\7t\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7v\2\2\u0092\30\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7v\2\2\u0096\32\3\2\2\2\u0097\u0098\7y\2\2\u0098\u0099\7j\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7n\2\2\u009b\u009c\7g\2\2\u009c\34\3\2\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7h\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\u00a2\7j\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7p\2\2\u00a4 \3\2\2\2\u00a5"+
		"\u00a6\7e\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7n\2\2"+
		"\u00a9\"\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7v"+
		"\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7p\2\2\u00b0$\3"+
		"\2\2\2\u00b1\u00b2\7=\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7\60\2\2\u00b4(\3"+
		"\2\2\2\u00b5\u00b9\t\2\2\2\u00b6\u00b8\t\3\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba*\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bc\u00be\7$\2\2\u00bd\u00bf\13\2\2\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3,\3\2\2\2\u00c4\u00c6\t\4\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8.\3\2\2\2\u00c9\u00cb\t\5\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00cf\b\30\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7-\2\2\u00d1\62\3\2\2\2\u00d2"+
		"\u00d3\7/\2\2\u00d3\64\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5\66\3\2\2\2\u00d6"+
		"\u00d7\7\61\2\2\u00d78\3\2\2\2\u00d8\u00d9\7#\2\2\u00d9:\3\2\2\2\u00da"+
		"\u00db\7?\2\2\u00db\u00dc\7?\2\2\u00dc<\3\2\2\2\u00dd\u00de\7#\2\2\u00de"+
		"\u00df\7?\2\2\u00df>\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1@\3\2\2\2\u00e2\u00e3"+
		"\7>\2\2\u00e3\u00e4\7?\2\2\u00e4B\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6D\3"+
		"\2\2\2\u00e7\u00e8\7@\2\2\u00e8\u00e9\7?\2\2\u00e9F\3\2\2\2\u00ea\u00eb"+
		"\7*\2\2\u00ebH\3\2\2\2\u00ec\u00ed\7+\2\2\u00edJ\3\2\2\2\u00ee\u00ef\7"+
		"}\2\2\u00efL\3\2\2\2\u00f0\u00f1\7\177\2\2\u00f1N\3\2\2\2\7\2\u00b9\u00c0"+
		"\u00c7\u00cc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}