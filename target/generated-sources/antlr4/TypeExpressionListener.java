// Generated from TypeExpression.g4 by ANTLR 4.4

	import java.util.ArrayList;
	import java.util.List;
	import symbols.DataType;
	import java.util.Stack;
	import symbols.Identifier;
	import symbols.SymbolTable;
	import expressions.*;
	import ast.*;
	

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeExpressionParser}.
 */
public interface TypeExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(@NotNull TypeExpressionParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(@NotNull TypeExpressionParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull TypeExpressionParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull TypeExpressionParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#cmdAttr}.
	 * @param ctx the parse tree
	 */
	void enterCmdAttr(@NotNull TypeExpressionParser.CmdAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#cmdAttr}.
	 * @param ctx the parse tree
	 */
	void exitCmdAttr(@NotNull TypeExpressionParser.CmdAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull TypeExpressionParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull TypeExpressionParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull TypeExpressionParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull TypeExpressionParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(@NotNull TypeExpressionParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(@NotNull TypeExpressionParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#exprl}.
	 * @param ctx the parse tree
	 */
	void enterExprl(@NotNull TypeExpressionParser.ExprlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#exprl}.
	 * @param ctx the parse tree
	 */
	void exitExprl(@NotNull TypeExpressionParser.ExprlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(@NotNull TypeExpressionParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(@NotNull TypeExpressionParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull TypeExpressionParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull TypeExpressionParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void enterLista_var(@NotNull TypeExpressionParser.Lista_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#lista_var}.
	 * @param ctx the parse tree
	 */
	void exitLista_var(@NotNull TypeExpressionParser.Lista_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(@NotNull TypeExpressionParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(@NotNull TypeExpressionParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull TypeExpressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull TypeExpressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull TypeExpressionParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull TypeExpressionParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeExpressionParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(@NotNull TypeExpressionParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeExpressionParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(@NotNull TypeExpressionParser.DecimalContext ctx);
}