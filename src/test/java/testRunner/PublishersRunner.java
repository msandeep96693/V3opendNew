package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { 
								"src/test/resources/Features/Admin/Publishers/AddPublishers.feature",		
						},
                 glue = "stepDefinitions",
                 plugin = { "html:Reports/AddPublishers", 
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                 },
                 tags = "@Smoke",
                 monochrome = true,
                 dryRun = false
		        )

public class PublishersRunner {

}
