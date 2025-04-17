package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/Admin/SignIn/signIn.feature",
		                     "src/test/resources/Features/Admin/Campaigns/AddCampaigns.feature",
		                     "src/test/resources/Features/Admin/Advertisers/AddAdvertiser.feature",
		                     "src/test/resources/Features/Admin/Advertisers/AdvertiserLead/AddAdvertiserLeads.feature",
                             "src/test/resources/Features/Admin/Publishers/AddPublishers.feature",
                             "src/test/resources/Features/Admin/Publishers/PublisherLeads/AddPublisherLeads.feature",
                             "src/test/resources/Features/Admin/Recurring/AddRecurring.feature",
                             "src/test/resources/Features/Admin/Contacts/AddContacts.feature",
                             "src/test/resources/Features/Admin/Suppressions/AddSuppressions.feature",
                             "src/test/resources/Features/Admin/RecurringAds/AddRecurringAds.feature"
                             },
                 glue = "stepDefinitions",
                 monochrome = true,
                 plugin = "html:Reports/AllInOneReport",
                 tags = "@Smoke",
                 dryRun = false
		         )

public class SigninRunner 
{

	
}
