// Generated from C:/Users/anaig/OneDrive/Documents/Prog/IUT/S5/compilation/antlr/src/tp6/CLike.g4 by ANTLR 4.13.1
package tp6.prog;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLikeParser}.
 */
public interface CLikeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLikeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CLikeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLikeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CLikeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLikeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CLikeParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLikeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CLikeParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLikeParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CLikeParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLikeParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CLikeParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLikeParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(CLikeParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLikeParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(CLikeParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLikeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CLikeParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLikeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CLikeParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLikeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CLikeParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLikeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CLikeParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLikeParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(CLikeParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLikeParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(CLikeParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLikeParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void enterStmtBlock(CLikeParser.StmtBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLikeParser#stmtBlock}.
	 * @param ctx the parse tree
	 */
	void exitStmtBlock(CLikeParser.StmtBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(CLikeParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(CLikeParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(CLikeParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(CLikeParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(CLikeParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(CLikeParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(CLikeParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(CLikeParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(CLikeParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(CLikeParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(CLikeParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link CLikeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(CLikeParser.AddSubExprContext ctx);
}