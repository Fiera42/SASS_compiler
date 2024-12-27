package tp6.prog;

public class CodeGeneration extends CLikeBaseVisitor<String> {

    private int indent = 0;

    @Override
    public String visitProgram(CLikeParser.ProgramContext ctx) {
        StringBuilder block = new StringBuilder();
        int statementCount = ctx.stmt().size();

        for(int i = 0; i < statementCount; i++) {
            CLikeParser.StmtContext stmt = ctx.stmt(i);
            block.append(visit(stmt)).append('\n');
        }

        return block.toString();
    }

    @Override
    public String visitVarDecl(CLikeParser.VarDeclContext ctx) {
        String value = visit(ctx.expr());
        return ctx.ID().getText() + " = " + value;
    }

    @Override
    public String visitAssignmentStmt(CLikeParser.AssignmentStmtContext ctx) {
        String value = visit(ctx.expr());
        return ctx.ID().getText() + " = " + value;
    }

    @Override
    public String visitIfStmt(CLikeParser.IfStmtContext ctx) {
        String condition = visit(ctx.expr());

        indent++;
        String ifstatement = visit(ctx.stmtBlock(0));
        indent--;

        int statementCount = ctx.stmtBlock().size();
        if(statementCount == 1) {
            return "if " + condition + ":\n" + ifstatement;
        }
        else {
            indent++;
            String elsestatement = visit(ctx.stmtBlock(1));
            indent--;

            return "if " + condition + ":\n" + ifstatement + // if (indent is made by the block)
                    "\t".repeat(indent) + "else:\n" + elsestatement; // else (indent in directly built in the string)
        }
    }

    @Override
    public String visitWhileStmt(CLikeParser.WhileStmtContext ctx) {
        String condition = visit(ctx.expr());

        indent++;
        String statement = visit(ctx.stmtBlock());
        indent--;

        return "while " + condition + ":\n" + statement;
    }

    @Override
    public String visitExprStmt(CLikeParser.ExprStmtContext ctx) {
        return visit(ctx.expr());
    }


    @Override
    public String visitStmtBlock(CLikeParser.StmtBlockContext ctx) {
        StringBuilder block = new StringBuilder();
        int statementCount = ctx.stmt().size();

        for(int i = 0; i < statementCount; i++) {
            CLikeParser.StmtContext stmt = ctx.stmt(i);

            block.append("\t".repeat(indent));

            block.append(visit(stmt))
                    .append("\n");
        }

        return block.toString();
    }

    @Override
    public String visitIdExpr(CLikeParser.IdExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitNumberExpr(CLikeParser.NumberExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitParenExpr(CLikeParser.ParenExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitRelationalExpr(CLikeParser.RelationalExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitAddSubExpr(CLikeParser.AddSubExprContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitMulDivExpr(CLikeParser.MulDivExprContext ctx) {
        return ctx.getText();
    }
}