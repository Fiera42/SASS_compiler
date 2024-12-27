package scss.src;

import scss.src.scss.ScssToCssGenerator;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        // Example usage (take an existing file and compile it to a new file) :

        ScssToCssGenerator compiler = new ScssToCssGenerator();
        compiler.compileFileToFile(new File("input.scss"), "output.css");
    }
}
