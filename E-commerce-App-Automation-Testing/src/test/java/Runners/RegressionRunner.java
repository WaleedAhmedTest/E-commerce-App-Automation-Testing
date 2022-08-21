package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "StepDefinitions",
        tags = "@regression",
        plugin =
                {
                "pretty",
                "html:target/cucumber.html"
                }
)

public class RegressionRunner extends AbstractTestNGCucumberTests {
}
