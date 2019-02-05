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
		T__0=1, T__1=2, T__2=3, T__3=4, BEGIN=5, SET=6, ELEMENT=7, ADD=8, REMOVE=9, 
		END=10, PRINT=11, INT=12, WHILE=13, FOR=14, CONST=15, IF=16, THEN=17, 
		CALL=18, RETURN=19, SEPARATOR=20, DELIMITER=21, COLON=22, GLOBAL=23, ID=24, 
		STRING=25, NUMBER=26, WS=27, PLUS=28, MINUS=29, MULTIPLY=30, DIVIDE=31, 
		NEGATION=32, EQUAL=33, NON_EQUAL=34, LESS=35, LESS_OR_EQUALS=36, GREATER=37, 
		GREATER_OR_EQUALS=38, O_BRACKET=39, C_BRACKET=40, K_O_BRACKET=41, K_C_BRACKET=42;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_digit_expression = 3, 
		RULE_intialize_set = 4, RULE_intialize_element = 5, RULE_assign_var_method_invocation = 6, 
		RULE_assign_set = 7, RULE_assign_var = 8, RULE_print = 9, RULE_operations = 10, 
		RULE_operarions_with_set = 11, RULE_simple_compare = 12, RULE_hard_compare = 13, 
		RULE_while_cicle = 14, RULE_if_then = 15, RULE_for_each = 16, RULE_global_assign_set = 17, 
		RULE_global_assign_var = 18, RULE_type = 19, RULE_type_1 = 20, RULE_signature = 21, 
		RULE_subprogram_return = 22, RULE_subprogram_non_return = 23, RULE_block_return = 24, 
		RULE_block_non_return = 25, RULE_signature_method_invokation = 26, RULE_method_invokation = 27, 
		RULE_global_program = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "digit_expression", "intialize_set", 
			"intialize_element", "assign_var_method_invocation", "assign_set", "assign_var", 
			"print", "operations", "operarions_with_set", "simple_compare", "hard_compare", 
			"while_cicle", "if_then", "for_each", "global_assign_set", "global_assign_var", 
			"type", "type_1", "signature", "subprogram_return", "subprogram_non_return", 
			"block_return", "block_non_return", "signature_method_invokation", "method_invokation", 
			"global_program"
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
			setState(58);
			match(T__0);
			setState(59);
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
			setState(61);
			match(BEGIN);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << PRINT) | (1L << INT) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Assign_setContext assign_set() {
			return getRuleContext(Assign_setContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public Assign_var_method_invocationContext assign_var_method_invocation() {
			return getRuleContext(Assign_var_method_invocationContext.class,0);
		}
		public While_cicleContext while_cicle() {
			return getRuleContext(While_cicleContext.class,0);
		}
		public If_thenContext if_then() {
			return getRuleContext(If_thenContext.class,0);
		}
		public Method_invokationContext method_invokation() {
			return getRuleContext(Method_invokationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Operarions_with_setContext operarions_with_set() {
			return getRuleContext(Operarions_with_setContext.class,0);
		}
		public For_eachContext for_each() {
			return getRuleContext(For_eachContext.class,0);
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
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				assign_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				assign_set();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				operations();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				assign_var_method_invocation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				while_cicle();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				if_then();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				method_invokation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				print();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				operarions_with_set();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				for_each();
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_digit_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(83);
				match(ID);
				}
				break;
			case O_BRACKET:
				{
				setState(84);
				match(O_BRACKET);
				setState(85);
				digit_expression(0);
				setState(86);
				match(C_BRACKET);
				}
				break;
			case NUMBER:
				{
				setState(88);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(91);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(92);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						digit_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(94);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(95);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						digit_expression(5);
						}
						break;
					}
					} 
				}
				setState(101);
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

	public static class Intialize_setContext extends ParserRuleContext {
		public TerminalNode K_C_BRACKET() { return getToken(RottenLanguageParser.K_C_BRACKET, 0); }
		public TerminalNode K_O_BRACKET() { return getToken(RottenLanguageParser.K_O_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(RottenLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RottenLanguageParser.ID, i);
		}
		public TerminalNode MULTIPLY() { return getToken(RottenLanguageParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(RottenLanguageParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(RottenLanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(RottenLanguageParser.MINUS, 0); }
		public Intialize_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intialize_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterIntialize_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitIntialize_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitIntialize_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intialize_setContext intialize_set() throws RecognitionException {
		Intialize_setContext _localctx = new Intialize_setContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intialize_set);
		int _la;
		try {
			int _alt;
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_C_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102);
				match(K_C_BRACKET);
				setState(103);
				match(K_O_BRACKET);
				}
				}
				break;
			case K_O_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(104);
				match(K_O_BRACKET);
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(105);
						match(ID);
						setState(106);
						match(T__1);
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				{
				setState(112);
				match(ID);
				}
				setState(113);
				match(K_C_BRACKET);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(114);
				match(ID);
				setState(115);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << DIVIDE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				match(ID);
				}
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

	public static class Intialize_elementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(RottenLanguageParser.STRING, 0); }
		public Intialize_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intialize_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterIntialize_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitIntialize_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitIntialize_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intialize_elementContext intialize_element() throws RecognitionException {
		Intialize_elementContext _localctx = new Intialize_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intialize_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(STRING);
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

	public static class Assign_var_method_invocationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public Method_invokationContext method_invokation() {
			return getRuleContext(Method_invokationContext.class,0);
		}
		public TerminalNode CONST() { return getToken(RottenLanguageParser.CONST, 0); }
		public Assign_var_method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterAssign_var_method_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitAssign_var_method_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitAssign_var_method_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_var_method_invocationContext assign_var_method_invocation() throws RecognitionException {
		Assign_var_method_invocationContext _localctx = new Assign_var_method_invocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_var_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			type();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(122);
				match(CONST);
				}
			}

			setState(125);
			match(ID);
			setState(126);
			match(T__2);
			setState(127);
			method_invokation();
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

	public static class Assign_setContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(RottenLanguageParser.SET, 0); }
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public Intialize_setContext intialize_set() {
			return getRuleContext(Intialize_setContext.class,0);
		}
		public TerminalNode CONST() { return getToken(RottenLanguageParser.CONST, 0); }
		public Assign_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterAssign_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitAssign_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitAssign_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_setContext assign_set() throws RecognitionException {
		Assign_setContext _localctx = new Assign_setContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(SET);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(130);
				match(CONST);
				}
			}

			setState(133);
			match(ID);
			setState(134);
			match(T__2);
			{
			setState(135);
			intialize_set();
			}
			setState(136);
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

	public static class Assign_varContext extends ParserRuleContext {
		public Type_1Context type_1() {
			return getRuleContext(Type_1Context.class,0);
		}
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public Intialize_elementContext intialize_element() {
			return getRuleContext(Intialize_elementContext.class,0);
		}
		public TerminalNode CONST() { return getToken(RottenLanguageParser.CONST, 0); }
		public Assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varContext assign_var() throws RecognitionException {
		Assign_varContext _localctx = new Assign_varContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			type_1();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(139);
				match(CONST);
				}
			}

			setState(142);
			match(ID);
			setState(143);
			match(T__2);
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case NUMBER:
			case O_BRACKET:
				{
				setState(144);
				digit_expression(0);
				}
				break;
			case STRING:
				{
				setState(145);
				intialize_element();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(RottenLanguageParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(RottenLanguageParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(RottenLanguageParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(PRINT);
			setState(151);
			match(O_BRACKET);
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(153);
			match(C_BRACKET);
			setState(154);
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
		enterRule(_localctx, 20, RULE_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			match(T__2);
			setState(158);
			digit_expression(0);
			setState(159);
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

	public static class Operarions_with_setContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RottenLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RottenLanguageParser.ID, i);
		}
		public TerminalNode DELIMITER() { return getToken(RottenLanguageParser.DELIMITER, 0); }
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public TerminalNode ADD() { return getToken(RottenLanguageParser.ADD, 0); }
		public TerminalNode REMOVE() { return getToken(RottenLanguageParser.REMOVE, 0); }
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public Operarions_with_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operarions_with_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterOperarions_with_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitOperarions_with_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitOperarions_with_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operarions_with_setContext operarions_with_set() throws RecognitionException {
		Operarions_with_setContext _localctx = new Operarions_with_setContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operarions_with_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			match(DELIMITER);
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==REMOVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(164);
			match(O_BRACKET);
			setState(165);
			match(ID);
			setState(166);
			match(C_BRACKET);
			}
			setState(168);
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
		enterRule(_localctx, 24, RULE_simple_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			digit_expression(0);
			}
			setState(171);
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
			setState(172);
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
		enterRule(_localctx, 26, RULE_hard_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(174);
				match(NEGATION);
				}
			}

			setState(177);
			match(O_BRACKET);
			setState(178);
			simple_compare();
			setState(179);
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
		enterRule(_localctx, 28, RULE_while_cicle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WHILE);
			setState(182);
			match(O_BRACKET);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(183);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(184);
				hard_compare();
				}
				break;
			}
			setState(187);
			match(C_BRACKET);
			setState(188);
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
		enterRule(_localctx, 30, RULE_if_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IF);
			setState(191);
			match(O_BRACKET);
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(192);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(193);
				hard_compare();
				}
				break;
			}
			setState(196);
			match(C_BRACKET);
			setState(197);
			block();
			setState(198);
			match(THEN);
			setState(199);
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

	public static class For_eachContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(RottenLanguageParser.FOR, 0); }
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode ELEMENT() { return getToken(RottenLanguageParser.ELEMENT, 0); }
		public List<TerminalNode> ID() { return getTokens(RottenLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RottenLanguageParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(RottenLanguageParser.COLON, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterFor_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitFor_each(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitFor_each(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_eachContext for_each() throws RecognitionException {
		For_eachContext _localctx = new For_eachContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(FOR);
			setState(202);
			match(O_BRACKET);
			setState(203);
			match(ELEMENT);
			setState(204);
			match(ID);
			setState(205);
			match(COLON);
			setState(206);
			match(ID);
			setState(207);
			match(C_BRACKET);
			setState(208);
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

	public static class Global_assign_setContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(RottenLanguageParser.GLOBAL, 0); }
		public Assign_setContext assign_set() {
			return getRuleContext(Assign_setContext.class,0);
		}
		public Global_assign_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_assign_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterGlobal_assign_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitGlobal_assign_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitGlobal_assign_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_assign_setContext global_assign_set() throws RecognitionException {
		Global_assign_setContext _localctx = new Global_assign_setContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_global_assign_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(GLOBAL);
			setState(211);
			assign_set();
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

	public static class Global_assign_varContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(RottenLanguageParser.GLOBAL, 0); }
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Global_assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterGlobal_assign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitGlobal_assign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitGlobal_assign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_assign_varContext global_assign_var() throws RecognitionException {
		Global_assign_varContext _localctx = new Global_assign_varContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_global_assign_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(GLOBAL);
			setState(214);
			assign_var();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RottenLanguageParser.INT, 0); }
		public TerminalNode ELEMENT() { return getToken(RottenLanguageParser.ELEMENT, 0); }
		public TerminalNode SET() { return getToken(RottenLanguageParser.SET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << INT))) != 0)) ) {
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

	public static class Type_1Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RottenLanguageParser.INT, 0); }
		public TerminalNode ELEMENT() { return getToken(RottenLanguageParser.ELEMENT, 0); }
		public Type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterType_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitType_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitType_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_1Context type_1() throws RecognitionException {
		Type_1Context _localctx = new Type_1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==ELEMENT || _la==INT) ) {
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

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(RottenLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RottenLanguageParser.ID, i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_signature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(220);
			match(O_BRACKET);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					type();
					setState(222);
					match(ID);
					setState(223);
					match(T__1);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			{
			setState(230);
			type();
			setState(231);
			match(ID);
			}
			setState(233);
			match(C_BRACKET);
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

	public static class Subprogram_returnContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public Block_returnContext block_return() {
			return getRuleContext(Block_returnContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public Subprogram_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterSubprogram_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitSubprogram_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitSubprogram_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_returnContext subprogram_return() throws RecognitionException {
		Subprogram_returnContext _localctx = new Subprogram_returnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subprogram_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__3);
			setState(236);
			type();
			setState(237);
			match(ID);
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(238);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(239);
				match(O_BRACKET);
				setState(240);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(243);
			block_return();
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

	public static class Subprogram_non_returnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Block_non_returnContext block_non_return() {
			return getRuleContext(Block_non_returnContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public Subprogram_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterSubprogram_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitSubprogram_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitSubprogram_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_non_returnContext subprogram_non_return() throws RecognitionException {
		Subprogram_non_returnContext _localctx = new Subprogram_non_returnContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subprogram_non_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__3);
			setState(246);
			match(ID);
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(247);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(248);
				match(O_BRACKET);
				setState(249);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(252);
				block_non_return();
				}
				break;
			case 2:
				{
				setState(253);
				block();
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

	public static class Block_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(RottenLanguageParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(RottenLanguageParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public TerminalNode END() { return getToken(RottenLanguageParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterBlock_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitBlock_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitBlock_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_returnContext block_return() throws RecognitionException {
		Block_returnContext _localctx = new Block_returnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_block_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(BEGIN);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << PRINT) | (1L << INT) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(257);
				statement();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			match(RETURN);
			setState(264);
			match(ID);
			setState(265);
			match(SEPARATOR);
			setState(266);
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

	public static class Block_non_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(RottenLanguageParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(RottenLanguageParser.RETURN, 0); }
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public TerminalNode END() { return getToken(RottenLanguageParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterBlock_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitBlock_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitBlock_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_non_returnContext block_non_return() throws RecognitionException {
		Block_non_returnContext _localctx = new Block_non_returnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_block_non_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(BEGIN);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ELEMENT) | (1L << PRINT) | (1L << INT) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << CALL) | (1L << ID))) != 0)) {
				{
				{
				setState(269);
				statement();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(RETURN);
			setState(276);
			match(SEPARATOR);
			setState(277);
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

	public static class Signature_method_invokationContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(RottenLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RottenLanguageParser.ID, i);
		}
		public Signature_method_invokationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature_method_invokation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterSignature_method_invokation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitSignature_method_invokation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitSignature_method_invokation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signature_method_invokationContext signature_method_invokation() throws RecognitionException {
		Signature_method_invokationContext _localctx = new Signature_method_invokationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_signature_method_invokation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(279);
			match(O_BRACKET);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280);
					match(ID);
					setState(281);
					match(T__1);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			{
			setState(287);
			match(ID);
			}
			setState(288);
			match(C_BRACKET);
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

	public static class Method_invokationContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(RottenLanguageParser.CALL, 0); }
		public TerminalNode ID() { return getToken(RottenLanguageParser.ID, 0); }
		public TerminalNode SEPARATOR() { return getToken(RottenLanguageParser.SEPARATOR, 0); }
		public Signature_method_invokationContext signature_method_invokation() {
			return getRuleContext(Signature_method_invokationContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(RottenLanguageParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(RottenLanguageParser.C_BRACKET, 0); }
		public Method_invokationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invokation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).enterMethod_invokation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RottenLanguageListener ) ((RottenLanguageListener)listener).exitMethod_invokation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RottenLanguageVisitor ) return ((RottenLanguageVisitor<? extends T>)visitor).visitMethod_invokation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_invokationContext method_invokation() throws RecognitionException {
		Method_invokationContext _localctx = new Method_invokationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_method_invokation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(CALL);
			setState(291);
			match(ID);
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(292);
				signature_method_invokation();
				}
				break;
			case 2:
				{
				{
				setState(293);
				match(O_BRACKET);
				setState(294);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(297);
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

	public static class Global_programContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<Global_assign_setContext> global_assign_set() {
			return getRuleContexts(Global_assign_setContext.class);
		}
		public Global_assign_setContext global_assign_set(int i) {
			return getRuleContext(Global_assign_setContext.class,i);
		}
		public List<Global_assign_varContext> global_assign_var() {
			return getRuleContexts(Global_assign_varContext.class);
		}
		public Global_assign_varContext global_assign_var(int i) {
			return getRuleContext(Global_assign_varContext.class,i);
		}
		public List<Subprogram_non_returnContext> subprogram_non_return() {
			return getRuleContexts(Subprogram_non_returnContext.class);
		}
		public Subprogram_non_returnContext subprogram_non_return(int i) {
			return getRuleContext(Subprogram_non_returnContext.class,i);
		}
		public List<Subprogram_returnContext> subprogram_return() {
			return getRuleContexts(Subprogram_returnContext.class);
		}
		public Subprogram_returnContext subprogram_return(int i) {
			return getRuleContext(Subprogram_returnContext.class,i);
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
		enterRule(_localctx, 56, RULE_global_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				setState(301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(299);
					global_assign_set();
					}
					break;
				case 2:
					{
					setState(300);
					global_assign_var();
					}
					break;
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			program();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(308);
					subprogram_non_return();
					}
					break;
				case 2:
					{
					setState(309);
					subprogram_return();
					}
					break;
				}
				}
				setState(314);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return digit_expression_sempred((Digit_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean digit_expression_sempred(Digit_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\3\3\3"+
		"\7\3B\n\3\f\3\16\3E\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4S\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5d\n\5\f\5\16\5g\13\5\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3\7\3\7\3\b\3\b\5\b~\n\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\5\t\u0086\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u008f\n\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0095\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\5\17\u00b2\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00bc"+
		"\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00c5\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u00e4"+
		"\n\27\f\27\16\27\u00e7\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u00f4\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u00fd\n\31\3\31\3\31\5\31\u0101\n\31\3\32\3\32\7\32\u0105\n\32\f\32\16"+
		"\32\u0108\13\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\7\33\u0111\n\33\f\33"+
		"\16\33\u0114\13\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u011d\n\34"+
		"\f\34\16\34\u0120\13\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u012a"+
		"\n\35\3\35\3\35\3\36\3\36\7\36\u0130\n\36\f\36\16\36\u0133\13\36\3\36"+
		"\3\36\3\36\3\36\7\36\u0139\n\36\f\36\16\36\u013c\13\36\3\36\2\3\b\37\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\n\3\2 "+
		"!\3\2\36\37\3\2\36!\3\2\32\34\3\2\n\13\3\2#(\4\2\b\t\16\16\4\2\t\t\16"+
		"\16\2\u0144\2<\3\2\2\2\4?\3\2\2\2\6R\3\2\2\2\b[\3\2\2\2\nw\3\2\2\2\fy"+
		"\3\2\2\2\16{\3\2\2\2\20\u0083\3\2\2\2\22\u008c\3\2\2\2\24\u0098\3\2\2"+
		"\2\26\u009e\3\2\2\2\30\u00a3\3\2\2\2\32\u00ac\3\2\2\2\34\u00b1\3\2\2\2"+
		"\36\u00b7\3\2\2\2 \u00c0\3\2\2\2\"\u00cb\3\2\2\2$\u00d4\3\2\2\2&\u00d7"+
		"\3\2\2\2(\u00da\3\2\2\2*\u00dc\3\2\2\2,\u00de\3\2\2\2.\u00ed\3\2\2\2\60"+
		"\u00f7\3\2\2\2\62\u0102\3\2\2\2\64\u010e\3\2\2\2\66\u0119\3\2\2\28\u0124"+
		"\3\2\2\2:\u0131\3\2\2\2<=\7\3\2\2=>\5\4\3\2>\3\3\2\2\2?C\7\7\2\2@B\5\6"+
		"\4\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\f"+
		"\2\2G\5\3\2\2\2HS\5\22\n\2IS\5\20\t\2JS\5\26\f\2KS\5\16\b\2LS\5\36\20"+
		"\2MS\5 \21\2NS\58\35\2OS\5\24\13\2PS\5\30\r\2QS\5\"\22\2RH\3\2\2\2RI\3"+
		"\2\2\2RJ\3\2\2\2RK\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3"+
		"\2\2\2RQ\3\2\2\2S\7\3\2\2\2TU\b\5\1\2U\\\7\32\2\2VW\7)\2\2WX\5\b\5\2X"+
		"Y\7*\2\2Y\\\3\2\2\2Z\\\7\34\2\2[T\3\2\2\2[V\3\2\2\2[Z\3\2\2\2\\e\3\2\2"+
		"\2]^\f\7\2\2^_\t\2\2\2_d\5\b\5\b`a\f\6\2\2ab\t\3\2\2bd\5\b\5\7c]\3\2\2"+
		"\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\t\3\2\2\2ge\3\2\2\2hi\7,\2"+
		"\2ix\7+\2\2jo\7+\2\2kl\7\32\2\2ln\7\4\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\32\2\2sx\7,\2\2tu\7\32\2\2uv\t\4"+
		"\2\2vx\7\32\2\2wh\3\2\2\2wj\3\2\2\2wt\3\2\2\2x\13\3\2\2\2yz\7\33\2\2z"+
		"\r\3\2\2\2{}\5(\25\2|~\7\21\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\7\32\2\2\u0080\u0081\7\5\2\2\u0081\u0082\58\35\2\u0082\17\3\2\2\2\u0083"+
		"\u0085\7\b\2\2\u0084\u0086\7\21\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\32\2\2\u0088\u0089\7\5\2\2\u0089"+
		"\u008a\5\n\6\2\u008a\u008b\7\26\2\2\u008b\21\3\2\2\2\u008c\u008e\5*\26"+
		"\2\u008d\u008f\7\21\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\7\32\2\2\u0091\u0094\7\5\2\2\u0092\u0095\5"+
		"\b\5\2\u0093\u0095\5\f\7\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\7\26\2\2\u0097\23\3\2\2\2\u0098\u0099\7\r\2"+
		"\2\u0099\u009a\7)\2\2\u009a\u009b\t\5\2\2\u009b\u009c\7*\2\2\u009c\u009d"+
		"\7\26\2\2\u009d\25\3\2\2\2\u009e\u009f\7\32\2\2\u009f\u00a0\7\5\2\2\u00a0"+
		"\u00a1\5\b\5\2\u00a1\u00a2\7\26\2\2\u00a2\27\3\2\2\2\u00a3\u00a4\7\32"+
		"\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\t\6\2\2\u00a6\u00a7\7)\2\2\u00a7"+
		"\u00a8\7\32\2\2\u00a8\u00a9\7*\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\26"+
		"\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae\t\7\2\2\u00ae\u00af"+
		"\5\b\5\2\u00af\33\3\2\2\2\u00b0\u00b2\7\"\2\2\u00b1\u00b0\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7)\2\2\u00b4\u00b5\5\32"+
		"\16\2\u00b5\u00b6\7*\2\2\u00b6\35\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00bb"+
		"\7)\2\2\u00b9\u00bc\5\32\16\2\u00ba\u00bc\5\34\17\2\u00bb\u00b9\3\2\2"+
		"\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7*\2\2\u00be\u00bf"+
		"\5\4\3\2\u00bf\37\3\2\2\2\u00c0\u00c1\7\22\2\2\u00c1\u00c4\7)\2\2\u00c2"+
		"\u00c5\5\32\16\2\u00c3\u00c5\5\34\17\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7\u00c8\5\4\3\2\u00c8"+
		"\u00c9\7\23\2\2\u00c9\u00ca\5\4\3\2\u00ca!\3\2\2\2\u00cb\u00cc\7\20\2"+
		"\2\u00cc\u00cd\7)\2\2\u00cd\u00ce\7\t\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d0"+
		"\7\30\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00d2\7*\2\2\u00d2\u00d3\5\4\3\2"+
		"\u00d3#\3\2\2\2\u00d4\u00d5\7\31\2\2\u00d5\u00d6\5\20\t\2\u00d6%\3\2\2"+
		"\2\u00d7\u00d8\7\31\2\2\u00d8\u00d9\5\22\n\2\u00d9\'\3\2\2\2\u00da\u00db"+
		"\t\b\2\2\u00db)\3\2\2\2\u00dc\u00dd\t\t\2\2\u00dd+\3\2\2\2\u00de\u00e5"+
		"\7)\2\2\u00df\u00e0\5(\25\2\u00e0\u00e1\7\32\2\2\u00e1\u00e2\7\4\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\5(\25\2\u00e9\u00ea\7\32\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7"+
		"*\2\2\u00ec-\3\2\2\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5(\25\2\u00ef\u00f3"+
		"\7\32\2\2\u00f0\u00f4\5,\27\2\u00f1\u00f2\7)\2\2\u00f2\u00f4\7*\2\2\u00f3"+
		"\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5\62"+
		"\32\2\u00f6/\3\2\2\2\u00f7\u00f8\7\6\2\2\u00f8\u00fc\7\32\2\2\u00f9\u00fd"+
		"\5,\27\2\u00fa\u00fb\7)\2\2\u00fb\u00fd\7*\2\2\u00fc\u00f9\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u0101\5\64\33\2\u00ff\u0101\5"+
		"\4\3\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\61\3\2\2\2\u0102"+
		"\u0106\7\7\2\2\u0103\u0105\5\6\4\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7\25\2\2\u010a\u010b\7\32\2\2\u010b\u010c\7"+
		"\26\2\2\u010c\u010d\7\f\2\2\u010d\63\3\2\2\2\u010e\u0112\7\7\2\2\u010f"+
		"\u0111\5\6\4\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\7\25\2\2\u0116\u0117\7\26\2\2\u0117\u0118\7\f\2\2\u0118\65\3\2"+
		"\2\2\u0119\u011e\7)\2\2\u011a\u011b\7\32\2\2\u011b\u011d\7\4\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\32\2\2\u0122"+
		"\u0123\7*\2\2\u0123\67\3\2\2\2\u0124\u0125\7\24\2\2\u0125\u0129\7\32\2"+
		"\2\u0126\u012a\5\66\34\2\u0127\u0128\7)\2\2\u0128\u012a\7*\2\2\u0129\u0126"+
		"\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\26\2\2"+
		"\u012c9\3\2\2\2\u012d\u0130\5$\23\2\u012e\u0130\5&\24\2\u012f\u012d\3"+
		"\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5\2"+
		"\2\2\u0135\u013a\b\36\1\2\u0136\u0139\5\60\31\2\u0137\u0139\5.\30\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b;\3\2\2\2\u013c\u013a\3\2\2\2\34CR[ceow"+
		"}\u0085\u008e\u0094\u00b1\u00bb\u00c4\u00e5\u00f3\u00fc\u0100\u0106\u0112"+
		"\u011e\u0129\u012f\u0131\u0138\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}