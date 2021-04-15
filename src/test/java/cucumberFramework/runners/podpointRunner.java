package cucumberFramework.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = {"src/test/java/cucumberFramework/featureFiles"},
		glue = {"stepDefinitions"},
		monochrome = true,
		tags = {"@PodPoint"},
		plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)

public class podpointRunner extends AbstractTestNGCucumberTests {
}
