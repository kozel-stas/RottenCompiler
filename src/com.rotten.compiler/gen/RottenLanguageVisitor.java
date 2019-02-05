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
	 * Visit a parse tree produced by {@link RottenLanguageParser#digit_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit_expression(RottenLanguageParser.Digit_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#intialize_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntialize_set(RottenLanguageParser.Intialize_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#intialize_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntialize_element(RottenLanguageParser.Intialize_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#assign_var_method_invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var_method_invocation(RottenLanguageParser.Assign_var_method_invocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#assign_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_set(RottenLanguageParser.Assign_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(RottenLanguageParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(RottenLanguageParser.PrintContext ctx);
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
	 * Visit a parse tree produced by {@link RottenLanguageParser#for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each(RottenLanguageParser.For_eachContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#global_assign_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_set(RottenLanguageParser.Global_assign_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#global_assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_assign_var(RottenLanguageParser.Global_assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(RottenLanguageParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RottenLanguageParser#type_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_1(RottenLanguageParser.Type_1Context ctx);
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