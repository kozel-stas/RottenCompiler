package com.rotten.compiler.gen;// Generated from C:/Users/a4tec/Desktop/RottenCompiler\RottenLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RottenLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, BEGIN=4, END=5, PRINT=6, INT=7, WHILE=8, IF=9, 
		THEN=10, SEPARATOR=11, ID=12, STRING=13, NUMBER=14, WS=15, PLUS=16, MINUS=17, 
		MULTIPLY=18, DIVIDE=19, NEGATION=20, EQUAL=21, NON_EQUAL=22, LESS=23, 
		LESS_OR_EQUALS=24, GREATER=25, GREATER_OR_EQUALS=26, O_BRACKET=27, C_BRACKET=28;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_digit_expression = 4, RULE_assign_int = 5, RULE_print_int = 6, RULE_print_string = 7, 
		RULE_operations = 8, RULE_simple_compare = 9, RULE_hard_compare = 10, 
		RULE_while_cicle = 11, RULE_if_then = 12, RULE_global_program = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "expression", "digit_expression", "assign_int", 
			"print_int", "print_string", "operations", "simple_compare", "hard_compare", 
			"while_cicle", "if_then", "global_program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main_program'", "'='", "'\"'", "'begin'", "'end'", "'print'", 
			"'int'", "'while'", "'if'", "'then'", "';'", null, null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'!'", "'=='", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "BEGIN", "END", "PRINT", "INT", "WHILE", "IF", 
			"THEN", "SEPARATOR", "ID", "STRING", "NUMBER", "WS", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", "LESS_OR_EQUALS", 
			"GREATER", "GREATER_OR_EQUALS", "O_BRACKET", "C_BRACKET"
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
	public String getGrammarFileName() { return "RottenLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RottenLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(RottenLanguageParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(RottenLanguageParser.END, 0); }
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
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(31);
			match(BEGIN);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << WHILE) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(32);
				statement();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_intContext assign_int() {
			return getRuleContext(Assign_intContext.class,0);
		}
		public Print_intContext print_int() {
			return getRuleContext(Print_intContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public While_cicleContext while_cicle() {
			return getRuleContext(While_cicleContext.class,0);
		}
		public Print_stringContext print_string() {
			return getRuleContext(Print_stringContext.class,0);
		}
		public If_thenContext if_then() {
			return getRuleContext(If_thenContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				assign_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				print_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				operations();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				while_cicle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				print_string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				if_then();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public TerminalNode MULTIPLY() { return getToken(RottenLanguageParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(RottenLanguageParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(RottenLanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RottenLanguageParser.MINUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(49);
				match(ID);
				}
				break;
			case O_BRACKET:
				{
				setState(50);
				match(O_BRACKET);
				setState(51);
				expression(0);
				setState(52);
				match(C_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(57);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(58);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(59);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(60);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(61);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Digit_expressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(RottenLanguageParser.NUMBER, 0); }
		public TerminalNode MULTIPLY() { return getToken(RottenLanguageParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(RottenLanguageParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(RottenLanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RottenLanguageParser.MINUS, 0); }
		public Digit_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterDigit_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitDigit_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitDigit_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digit_expressionContext digit_expression() throws RecognitionException {
		return digit_expression(0);
	}

	private Digit_expressionContext digit_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Digit_expressionContext _localctx = new Digit_expressionContext(_ctx, _parentState);
		Digit_expressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_digit_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(68);
				match(ID);
				}
				break;
			case O_BRACKET:
				{
				setState(69);
				match(O_BRACKET);
				setState(70);
				digit_expression(0);
				setState(71);
				match(C_BRACKET);
				}
				break;
			case NUMBER:
				{
				setState(73);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(76);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(77);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						digit_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(79);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(80);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						digit_expression(5);
						}
						break;
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Assign_intContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RottenLanguageParser.INT, 0); }
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public Assign_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterAssign_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitAssign_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitAssign_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_intContext assign_int() throws RecognitionException {
		Assign_intContext _localctx = new Assign_intContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(INT);
			setState(88);
			match(ID);
			setState(89);
			match(T__1);
			setState(90);
			digit_expression(0);
			setState(91);
			match(SEPARATOR);
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

	public static class Print_intContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(RottenLanguageParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public Print_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterPrint_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitPrint_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitPrint_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_intContext print_int() throws RecognitionException {
		Print_intContext _localctx = new Print_intContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(PRINT);
			setState(94);
			match(O_BRACKET);
			{
			setState(95);
			digit_expression(0);
			}
			setState(96);
			match(C_BRACKET);
			setState(97);
			match(SEPARATOR);
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

	public static class Print_stringContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(RottenLanguageParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public Print_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterPrint_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitPrint_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitPrint_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stringContext print_string() throws RecognitionException {
		Print_stringContext _localctx = new Print_stringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(PRINT);
			setState(100);
			match(O_BRACKET);
			{
			setState(101);
			match(T__2);
			setState(102);
			match(ID);
			setState(103);
			match(T__2);
			}
			setState(105);
			match(C_BRACKET);
			setState(106);
			match(SEPARATOR);
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

	public static class OperationsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(T__1);
			setState(110);
			digit_expression(0);
			setState(111);
			match(SEPARATOR);
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

	public static class Simple_compareContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(RottenLanguageParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(RottenLanguageParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(RottenLanguageParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(RottenLanguageParser.GREATER, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(RottenLanguageParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(RottenLanguageParser.GREATER_OR_EQUALS, 0); }
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public Simple_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterSimple_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitSimple_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitSimple_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_compareContext simple_compare() throws RecognitionException {
		Simple_compareContext _localctx = new Simple_compareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simple_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(113);
			digit_expression(0);
			}
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(115);
			digit_expression(0);
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

	public static class Hard_compareContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public TerminalNode NEGATION() { return getToken(RottenLanguageParser.NEGATION, 0); }
		public Hard_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hard_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterHard_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitHard_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitHard_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hard_compareContext hard_compare() throws RecognitionException {
		Hard_compareContext _localctx = new Hard_compareContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hard_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(117);
				match(NEGATION);
				}
			}

			setState(120);
			match(O_BRACKET);
			setState(121);
			simple_compare();
			setState(122);
			match(C_BRACKET);
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

	public static class While_cicleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RottenLanguageParser.WHILE, 0); }
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Hard_compareContext hard_compare() {
			return getRuleContext(Hard_compareContext.class,0);
		}
		public While_cicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterWhile_cicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitWhile_cicle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitWhile_cicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cicleContext while_cicle() throws RecognitionException {
		While_cicleContext _localctx = new While_cicleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_cicle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(WHILE);
			setState(125);
			match(O_BRACKET);
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(126);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(127);
				hard_compare();
				}
				break;
			}
			setState(130);
			match(C_BRACKET);
			setState(131);
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

	public static class If_thenContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RottenLanguageParser.IF, 0); }
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode THEN() { return getToken(RottenLanguageParser.THEN, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Hard_compareContext hard_compare() {
			return getRuleContext(Hard_compareContext.class,0);
		}
		public If_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterIf_then(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitIf_then(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitIf_then(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_thenContext if_then() throws RecognitionException {
		If_thenContext _localctx = new If_thenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(IF);
			setState(134);
			match(O_BRACKET);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(135);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(136);
				hard_compare();
				}
				break;
			}
			setState(139);
			match(C_BRACKET);
			setState(140);
			block();
			setState(141);
			match(THEN);
			setState(142);
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

	public static class Global_programContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Global_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterGlobal_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitGlobal_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitGlobal_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_programContext global_program() throws RecognitionException {
		Global_programContext _localctx = new Global_programContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_global_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			program();
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 4:
			return digit_expression_sempred((Digit_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean digit_expression_sempred(Digit_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\7\3$\n\3"+
		"\f\3\16\3\'\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\59\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16\5D\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6U\n"+
		"\6\f\6\16\6X\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\5\fy\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\5\16\u008c\n\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\2\4\b\n\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\3\2"+
		"\24\25\3\2\22\23\3\2\27\34\2\u0097\2\36\3\2\2\2\4!\3\2\2\2\6\60\3\2\2"+
		"\2\b8\3\2\2\2\nL\3\2\2\2\fY\3\2\2\2\16_\3\2\2\2\20e\3\2\2\2\22n\3\2\2"+
		"\2\24s\3\2\2\2\26x\3\2\2\2\30~\3\2\2\2\32\u0087\3\2\2\2\34\u0092\3\2\2"+
		"\2\36\37\7\3\2\2\37 \5\4\3\2 \3\3\2\2\2!%\7\6\2\2\"$\5\6\4\2#\"\3\2\2"+
		"\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\7\2\2)\5\3"+
		"\2\2\2*\61\5\f\7\2+\61\5\16\b\2,\61\5\22\n\2-\61\5\30\r\2.\61\5\20\t\2"+
		"/\61\5\32\16\2\60*\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2"+
		"\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\63\b\5\1\2\639\7\16\2\2\64\65\7\35\2"+
		"\2\65\66\5\b\5\2\66\67\7\36\2\2\679\3\2\2\28\62\3\2\2\28\64\3\2\2\29B"+
		"\3\2\2\2:;\f\6\2\2;<\t\2\2\2<A\5\b\5\7=>\f\5\2\2>?\t\3\2\2?A\5\b\5\6@"+
		":\3\2\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t\3\2\2\2DB\3\2\2\2"+
		"EF\b\6\1\2FM\7\16\2\2GH\7\35\2\2HI\5\n\6\2IJ\7\36\2\2JM\3\2\2\2KM\7\20"+
		"\2\2LE\3\2\2\2LG\3\2\2\2LK\3\2\2\2MV\3\2\2\2NO\f\7\2\2OP\t\2\2\2PU\5\n"+
		"\6\bQR\f\6\2\2RS\t\3\2\2SU\5\n\6\7TN\3\2\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2\2YZ\7\t\2\2Z[\7\16\2\2[\\\7\4\2\2\\"+
		"]\5\n\6\2]^\7\r\2\2^\r\3\2\2\2_`\7\b\2\2`a\7\35\2\2ab\5\n\6\2bc\7\36\2"+
		"\2cd\7\r\2\2d\17\3\2\2\2ef\7\b\2\2fg\7\35\2\2gh\7\5\2\2hi\7\16\2\2ij\7"+
		"\5\2\2jk\3\2\2\2kl\7\36\2\2lm\7\r\2\2m\21\3\2\2\2no\7\16\2\2op\7\4\2\2"+
		"pq\5\n\6\2qr\7\r\2\2r\23\3\2\2\2st\5\n\6\2tu\t\4\2\2uv\5\n\6\2v\25\3\2"+
		"\2\2wy\7\26\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\35\2\2{|\5\24\13\2|"+
		"}\7\36\2\2}\27\3\2\2\2~\177\7\n\2\2\177\u0082\7\35\2\2\u0080\u0083\5\24"+
		"\13\2\u0081\u0083\5\26\f\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\7\36\2\2\u0085\u0086\5\4\3\2\u0086\31\3\2\2"+
		"\2\u0087\u0088\7\13\2\2\u0088\u008b\7\35\2\2\u0089\u008c\5\24\13\2\u008a"+
		"\u008c\5\26\f\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u008e\7\36\2\2\u008e\u008f\5\4\3\2\u008f\u0090\7\f\2\2\u0090"+
		"\u0091\5\4\3\2\u0091\33\3\2\2\2\u0092\u0093\5\2\2\2\u0093\u0094\b\17\1"+
		"\2\u0094\35\3\2\2\2\r%\608@BLTVx\u0082\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}