package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Admin/Contacts/AddContacts.feature" ,
//		        "src/test/resources/Features/Admin/Contacts/ContactHomepage.feature",
//		        "src/test/resources/Features/Admin/Contacts/UpdateContacts.feature"},
                 glue = "stepDefinitions",
                 monochrome = true,
//                 tags = "@Smoke or Regression",
                 plugin = { "html:Reports/Contacts",
                		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 
                 dryRun = false
		         )

public class ContactsRunner 
{

}
