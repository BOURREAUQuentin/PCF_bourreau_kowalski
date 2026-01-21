// Generated from /Users/quentinbourreau/Desktop/PCF_bourreau_kowalski/src/parser/PCF.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PCFParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PCFVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PCFParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PCFParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(PCFParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(PCFParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleTerm}
	 * labeled alternative in {@link PCFParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTerm(PCFParser.SimpleTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExpr}
	 * labeled alternative in {@link PCFParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(PCFParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link PCFParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpExpr(PCFParser.BinOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleFactor}
	 * labeled alternative in {@link PCFParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFactor(PCFParser.SimpleFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOpFactor}
	 * labeled alternative in {@link PCFParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpFactor(PCFParser.BinOpFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(PCFParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(PCFParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link PCFParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(PCFParser.ParensContext ctx);
}