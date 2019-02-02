package com.rotten.compiler.gen;// Generated from C:/Users/a4tec/Desktop/RottenCompiler\RottenLanguage.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RottenLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RottenLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RottenLanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(RottenLanguageParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RottenLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RottenLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#digit_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit_expression(RottenLanguageParser.Digit_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#assign_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_int(RottenLanguageParser.Assign_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#print_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_int(RottenLanguageParser.Print_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(RottenLanguageParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#global_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_program(RottenLanguageParser.Global_programContext ctx);
}