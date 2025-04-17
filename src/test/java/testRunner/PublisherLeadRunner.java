package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Admin/Publishers/PublisherLeads/AddPublisherLeads.feature",
                 glue = "stepDefinitions",
                 monochrome = true,
                 plugin = "html:Reports/PublisherLeads",
                 tags = "@Smoke",
                 dryRun = false
	            	
		
		)

public class PublisherLeadRunner {

}
