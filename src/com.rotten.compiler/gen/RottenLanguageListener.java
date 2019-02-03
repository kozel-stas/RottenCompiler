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
	 * Enter a parse tree produced by {@link RottenLanguageParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(RottenLanguageParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(RottenLanguageParser.Assign_varContext ctx);
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
	 * Enter a parse tree produced by {@link RottenLanguageParser#print_string}.
	 * @param ctx the parse tree
	 */
	void enterPrint_string(RottenLanguageParser.Print_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#print_string}.
	 * @param ctx the parse tree
	 */
	void exitPrint_string(RottenLanguageParser.Print_stringContext ctx);
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
	 * Enter a parse tree produced by {@link RottenLanguageParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void enterSimple_compare(RottenLanguageParser.Simple_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#simple_compare}.
	 * @param ctx the parse tree
	 */
	void exitSimple_compare(RottenLanguageParser.Simple_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#hard_compare}.
	 * @param ctx the parse tree
	 */
	void enterHard_compare(RottenLanguageParser.Hard_compareContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#hard_compare}.
	 * @param ctx the parse tree
	 */
	void exitHard_compare(RottenLanguageParser.Hard_compareContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cicle(RottenLanguageParser.While_cicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#while_cicle}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cicle(RottenLanguageParser.While_cicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#if_then}.
	 * @param ctx the parse tree
	 */
	void enterIf_then(RottenLanguageParser.If_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#if_then}.
	 * @param ctx the parse tree
	 */
	void exitIf_then(RottenLanguageParser.If_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RottenLanguageParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RottenLanguageParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(RottenLanguageParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(RottenLanguageParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_return(RottenLanguageParser.Subprogram_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#subprogram_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_return(RottenLanguageParser.Subprogram_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_non_return(RottenLanguageParser.Subprogram_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#subprogram_non_return}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_non_return(RottenLanguageParser.Subprogram_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#block_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_return(RottenLanguageParser.Block_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#block_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_return(RottenLanguageParser.Block_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void enterBlock_non_return(RottenLanguageParser.Block_non_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#block_non_return}.
	 * @param ctx the parse tree
	 */
	void exitBlock_non_return(RottenLanguageParser.Block_non_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 */
	void enterSignature_method_invokation(RottenLanguageParser.Signature_method_invokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#signature_method_invokation}.
	 * @param ctx the parse tree
	 */
	void exitSignature_method_invokation(RottenLanguageParser.Signature_method_invokationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RottenLanguageParser#method_invokation}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invokation(RottenLanguageParser.Method_invokationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RottenLanguageParser#method_invokation}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invokation(RottenLanguageParser.Method_invokationContext ctx);
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