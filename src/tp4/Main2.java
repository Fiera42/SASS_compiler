package tp4;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import tp4.prog.EvalVisitor;
import tp4.prog.ExprLexer;
import tp4.prog.ExprParser;

public class Main2 {
    public static void main(String[] args) throws Exception {
        // Create a lexer that feeds off from file expr.txt
        ExprLexer lexer = new
                ExprLexer(CharStreams.fromFileName("ressources/expr.txt"));

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        ExprParser parser = new ExprParser(tokens);

        // Begin parsing at rule 'prog'
        ParseTree tree = parser.prog();

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
