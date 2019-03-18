package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber",
		"json:target/cucumber.json" }, tags = "", features = "src/test/resources/features/LoginSalesForce.feature", glue = {
				"" }, monochrome = false, dryRun = false)
 
public class RunnerTest {
	
 
}   