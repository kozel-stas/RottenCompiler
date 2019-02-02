package com.rotten.compiler.gen;// Generated from C:/Users/a4tec/Desktop/RottenCompiler\RottenLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RottenLanguageParser}.
 */
public interface RottenLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RottenLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RottenLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RottenLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RottenLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RottenLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RottenLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RottenLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RottenLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void enterDigit_expression(RottenLanguageParser.Digit_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#digit_expression}.
	 * @param ctx the parse tree
	 */
	void exitDigit_expression(RottenLanguageParser.Digit_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#assign_int}.
	 * @param ctx the parse tree
	 */
	void enterAssign_int(RottenLanguageParser.Assign_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#assign_int}.
	 * @param ctx the parse tree
	 */
	void exitAssign_int(RottenLanguageParser.Assign_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#print_int}.
	 * @param ctx the parse tree
	 */
	void enterPrint_int(RottenLanguageParser.Print_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#print_int}.
	 * @param ctx the parse tree
	 */
	void exitPrint_int(RottenLanguageParser.Print_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(RottenLanguageParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(RottenLanguageParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#global_program}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_program(RottenLanguageParser.Global_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#global_program}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_program(RottenLanguageParser.Global_programContext ctx);
}