package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/Admin/Recurring/AddRecurring.feature",
		                     "src/test/resources/Features/Admin/Recurring/RecurringHomePge.feature",
		                     "src/test/resources/Features/Admin/Recurring/UpdateRecurring.feature"},
                  glue = "stepDefinitions",
//                  tags = "@Smoke",
                  monochrome = true,
                  plugin = "html:Reports/AddRecurring",
                  dryRun = false
		
		            )

public class RecurringRunner {

}
