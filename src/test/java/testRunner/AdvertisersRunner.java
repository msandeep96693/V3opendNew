package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/Admin/Advertisers/AddAdvertiser.feature",
		         "src/test/resources/Features/Admin/Advertisers/AdvertiserHomePage.feature"},
                 glue = "stepDefinitions",
                 monochrome = true,
                 plugin = "html:Reports/AddAdvertiser",
                 tags = "@Smoke",
                 dryRun = false
		)
public class AdvertisersRunner
{

}
