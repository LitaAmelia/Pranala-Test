package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/java/features",
        glue = "stepDefinitions",
        tags = "@Register",
        plugin = {"pretty", "html:target/Regression.report.html"}
)
public class testRunner {
}
