package tp5.prog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvalVisitor extends ExprBaseVisitor<String> {

    Map<String, String> memory = new HashMap<>();

    @Override
    public String visitAssign(ExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        String value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public String visitPrintExpr(ExprParser.PrintExprContext ctx) {
        String value = visit(ctx.expr());
        System.out.println(value);
        return ""; // No need for return
    }

    @Override
    public String visitParens(ExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public String visitMulDiv(ExprParser.MulDivContext ctx) {
        StringBuilder res = new StringBuilder();

        res.append(visit(ctx.expr(0))).append(" ");
        res.append(visit(ctx.expr(1))).append(" ");
        res.append(ctx.op.getText());

        return res.toString();
    }

    @Override
    public String visitAddSub(ExprParser.AddSubContext ctx) {
        StringBuilder res = new StringBuilder();

        res.append(visit(ctx.expr(0))).append(" ");
        res.append(visit(ctx.expr(1))).append(" ");
        res.append(ctx.op.getText());

        return res.toString();
    }

    @Override
    public String visitInt(ExprParser.IntContext ctx) {
        return ctx.INT().getText();
    }

    @Override
    public String visitId(ExprParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) return memory.get(id);
        return id;
    }
}
