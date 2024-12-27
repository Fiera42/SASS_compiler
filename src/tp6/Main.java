package tp6;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import tp6.prog.CLikeLexer;
import tp6.prog.CLikeParser;
import tp6.prog.CodeGeneration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        compileAndExportFile("ressources/clike/input/prog1.txt", "ressources/clike/output/prog1.txt");
        compileAndExportFile("ressources/clike/input/prog2.txt", "ressources/clike/output/prog2.txt");
        compileAndExportFile("ressources/clike/input/prog3.txt", "ressources/clike/output/prog3.txt");
    }

    public static void compileAndExportFile(String inputFile, String outputFile) throws IOException {
        // Create a lexer that feeds off from file expr.txt
        CLikeLexer lexer = new
                CLikeLexer(CharStreams.fromFileName(inputFile));

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        CLikeParser parser = new CLikeParser(tokens);

        // Begin parsing at rule 'program'
        ParseTree tree = parser.program();

        // Generate the py-like code
        CodeGeneration gen = new CodeGeneration();

        // Export the result to a file
        Path newFilePath = Paths.get(outputFile);
        File file = new File(newFilePath.toUri());
        try {
            Files.createFile(newFilePath);
        } catch (FileAlreadyExistsException e) {}

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(gen.visit(tree));
        fileWriter.close();
    }
}
