import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import scss.src.scss.ScssToCssGenerator;

import java.io.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Test of the ScssCompiler class for:")
public class ScssCompilerTests {

    private static final String inputDirectory = "ressources/scss/input/";
    private static final String assertDirectory = "ressources/scss/tests/";

    @Order(1)
    @DisplayName("The following files:")
    @ParameterizedTest(name = "{0}")
    @CsvSource({
            "fromgit/media.scss, fromgit/media.css",
            "fromgit/mixinAndInclude.scss, fromgit/mixinAndInclude.css",
            "simple/custom_properties.scss, simple/custom_properties.css",
            "simple/darken.scss, simple/darken.css",
            "simple/extend_inheritance.scss, simple/extend_inheritance.css",
            "simple/functions.scss, simple/functions.css",
            "simple/ifelse.scss, simple/ifelse.css",
            "simple/interpolation.scss, simple/interpolation.css",
            "simple/loops_each_map.scss, simple/loops_each_map.css",
            "simple/loops_each.scss, simple/loops_each.css",
            "simple/loops_for.scss, simple/loops_for.css",
            "simple/loops_while.scss, simple/loops_while.css",
            "simple/mixins.scss, simple/mixins.css",
            "simple/mixins_2.scss, simple/mixins_2.css",
            "simple/modules.scss, simple/modules.css",
            "simple/modules_private.scss, simple/modules_private.css",
            "simple/parentContext.scss, simple/parentContext.css",
            "simple/nesting.scss, simple/nesting.css",
            "simple/operations.scss, simple/operations.css",
            "simple/variables.scss, simple/variables.css",
            "simple/fontface.scss, simple/fontface.css",
            "simple/map.scss, simple/map.css",
            "simple/test.scss, simple/test.css",
            "simple/margin_shorthand.scss, simple/margin_shorthand.css",
            "profs/input1.scss, profs/input1.css",
            "profs/input2.scss, profs/input2.css",
            "profs/input3.scss, profs/input3.css",
            "profs/input4.scss, profs/input4.css",
            "profs/input5.scss, profs/input5.css",
            "profs/input6.scss, profs/input6.css",
    })
    void runTests(String inputFile, String assertFile) throws IOException {
        String fullInputPath = inputDirectory + inputFile;
        String fullAssertPath = assertDirectory + assertFile;

        ScssToCssGenerator compiler = new ScssToCssGenerator();
        String compiledString = compiler.compileFileToString(new File(fullInputPath));

        String assertString = new BufferedReader(new FileReader(fullAssertPath)).lines().collect(Collectors.joining("\n"));

        assertThat(compiledString).isEqualTo(assertString);
    }

    @Order(2)
    @DisplayName("The following exception files:")
    @ParameterizedTest(name = "{0}")
    @CsvSource({
            "error/mixins_error.scss" + ",java.lang.IllegalArgumentException",
            "error/mixins_undeclared.scss" + ",java.lang.IllegalArgumentException",
            "error/mixins_undeclared2.scss" + ",java.lang.IllegalArgumentException",
            "error/calc_type.scss" + ",java.lang.ArithmeticException",
            "error/calc_boolTypes.scss" + ",java.lang.ArithmeticException",
            "error/calc_boolOperator.scss" + ",java.lang.ArithmeticException"
    })
    void runExceptionTest(String inputFile, String errorType) throws IOException, ClassNotFoundException {
        String fullInputPath = inputDirectory + inputFile;
        ScssToCssGenerator compiler = new ScssToCssGenerator();
        Assertions.assertThatThrownBy(() -> compiler.compileFileToString(new File(fullInputPath)))
                .isInstanceOf(Class.forName(errorType));
    }
}
