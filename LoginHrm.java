package Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src/test/java/Login.feature"},
		dryRun=true,
		glue = "Def",
		monochrome = true
		
)

public class LoginHrm extends AbstractTestNGCucumberTests{


}
