package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utils.WebDriverUtils;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps"
)
public class RunCucumberTest {
    @BeforeClass
    public static void setup() {
        // Configuração inicial, se necessário
    }

    @AfterClass
    public static void teardown() {
        WebDriverUtils.quitDriver();
    }
}
