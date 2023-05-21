package ruunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/BOAloginpage.feature",
        glue = "stepDefinitions",
        plugin = {"pretty"},
        tags = "@Regression"
)
public class LoginPageRunner extends AbstractTestNGCucumberTests {
}