package APIRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Features",
        glue = {"StepDefinition"},
        plugin = { "pretty", "html:target/Reports/report.html" })

public class APIRunnerClass {
}