package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src/test/java/features"},
		dryRun = true
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
