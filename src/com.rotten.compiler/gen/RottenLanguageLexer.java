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
		T__0=1, T__1=2, BEGIN=3, END=4, PRINT=5, INT=6, STRING=7, SEPARATOR=8, 
		ID=9, NUMBER=10, WS=11, PLUS=12, MINUS=13, MULTIPLY=14, DIVIDE=15, O_BRACKET=16, 
		C_BRACKET=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "BEGIN", "END", "PRINT", "INT", "STRING", "SEPARATOR", 
			"ID", "NUMBER", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "O_BRACKET", 
			"C_BRACKET"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main_program'", "'='", "'begin'", "'end'", "'print'", "'int'", 
			"'string'", "';'", null, null, null, "'+'", "'-'", "'*'", "'/'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "BEGIN", "END", "PRINT", "INT", "STRING", "SEPARATOR", 
			"ID", "NUMBER", "WS", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "O_BRACKET", 
			"C_BRACKET"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\7\nT\n\n\f\n\16\nW\13\n\3"+
		"\13\6\13Z\n\13\r\13\16\13[\3\f\6\f_\n\f\r\f\16\f`\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\6"+
		"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2r\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2"+
		"\5\62\3\2\2\2\7\64\3\2\2\2\t:\3\2\2\2\13>\3\2\2\2\rD\3\2\2\2\17H\3\2\2"+
		"\2\21O\3\2\2\2\23Q\3\2\2\2\25Y\3\2\2\2\27^\3\2\2\2\31d\3\2\2\2\33f\3\2"+
		"\2\2\35h\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#n\3\2\2\2%&\7o\2\2&\'\7c\2\2\'"+
		"(\7k\2\2()\7p\2\2)*\7a\2\2*+\7r\2\2+,\7t\2\2,-\7q\2\2-.\7i\2\2./\7t\2"+
		"\2/\60\7c\2\2\60\61\7o\2\2\61\4\3\2\2\2\62\63\7?\2\2\63\6\3\2\2\2\64\65"+
		"\7d\2\2\65\66\7g\2\2\66\67\7i\2\2\678\7k\2\289\7p\2\29\b\3\2\2\2:;\7g"+
		"\2\2;<\7p\2\2<=\7f\2\2=\n\3\2\2\2>?\7r\2\2?@\7t\2\2@A\7k\2\2AB\7p\2\2"+
		"BC\7v\2\2C\f\3\2\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2G\16\3\2\2\2HI\7u\2\2I"+
		"J\7v\2\2JK\7t\2\2KL\7k\2\2LM\7p\2\2MN\7i\2\2N\20\3\2\2\2OP\7=\2\2P\22"+
		"\3\2\2\2QU\t\2\2\2RT\t\3\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V"+
		"\24\3\2\2\2WU\3\2\2\2XZ\t\4\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\\26\3\2\2\2]_\t\5\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3"+
		"\2\2\2bc\b\f\2\2c\30\3\2\2\2de\7-\2\2e\32\3\2\2\2fg\7/\2\2g\34\3\2\2\2"+
		"hi\7,\2\2i\36\3\2\2\2jk\7\61\2\2k \3\2\2\2lm\7*\2\2m\"\3\2\2\2no\7+\2"+
		"\2o$\3\2\2\2\6\2U[`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}