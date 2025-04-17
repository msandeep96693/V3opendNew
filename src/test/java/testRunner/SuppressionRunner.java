package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = 
					"src/test/resources/Features/Admin/Suppressions/AddSuppressions.feature",
//		         "src/test/resources/Features/Admin/Suppressions/SuppressionHomepage.feature",
//                 "src/test/resources/Features/Admin/Suppressions/SuppressionUpdate.feature"},
                 glue = "stepDefinitions",
                 monochrome = true,
                 plugin = { "html:Reports/AddSuppression",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
//                 tags = "@Smoke",
                 dryRun = false
	
		)
public class SuppressionRunner {
	
}
