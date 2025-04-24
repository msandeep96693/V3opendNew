package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
							"src/test/resources/Features/Admin/Campaigns/AddCampaigns.feature",
//		                     "src/test/resources/Features/Admin/Campaigns/CampaignHomepage.feature",
//		                     "src/test/resources/Features/Admin/Campaigns/UpdateCampaigns.feature"
		                     },
                 glue = "stepDefinitions",
                 monochrome = true,
//                 tags = "@Sanity or @Regression",
                 dryRun = false,
                 plugin = { "html:Reports/AddCampaigns" ,
                 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
                 )

public class CampaignsRunner
{

}
