package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/Admin/RecurringAds/AddRecurringAds.feature",
		                      "src/test/resources/Features/Admin/Recurring/RecurringHomePge.feature",
		                      "src/test/resources/Features/Admin/RecurringAds/RecurringAdsUpdate.feature"},
                 glue = "stepDefinitions",
//                 tags = "@Smoke",
                 monochrome = true,
                 plugin = "html:Reports/AddRecurringAds",
                 dryRun = false
		
		)

public class RecurringAdsRunner {

}
