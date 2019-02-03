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
	 * Visit a parse tree produced by {@link RottenLanguageParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(RottenLanguageParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#assign_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_int(RottenLanguageParser.Assign_intContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#assign_el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_el(RottenLanguageParser.Assign_elContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#assing_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssing_set(RottenLanguageParser.Assing_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#print_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_id(RottenLanguageParser.Print_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#print_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_string(RottenLanguageParser.Print_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(RottenLanguageParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#operarions_with_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperarions_with_set(RottenLanguageParser.Operarions_with_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#simple_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_compare(RottenLanguageParser.Simple_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#hard_compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHard_compare(RottenLanguageParser.Hard_compareContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#while_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cicle(RottenLanguageParser.While_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#if_then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then(RottenLanguageParser.If_thenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(RottenLanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(RottenLanguageParser.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#subprogram_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_return(RottenLanguageParser.Subprogram_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_non_return(RottenLanguageParser.Subprogram_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#block_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_return(RottenLanguageParser.Block_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#block_non_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_non_return(RottenLanguageParser.Block_non_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature_method_invokation(RottenLanguageParser.Signature_method_invokationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#method_invokation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_invokation(RottenLanguageParser.Method_invokationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#global_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_program(RottenLanguageParser.Global_programContext ctx);
}