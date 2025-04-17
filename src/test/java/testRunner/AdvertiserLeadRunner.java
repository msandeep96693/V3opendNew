package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Admin/Advertisers/AdvertiserLead/AddAdvertiserLeads.feature",
                  glue = "stepDefinitions",
                  dryRun = false,
                  monochrome = true,
                  plugin = "html:Reports/AddAdvertiserLeads",
                  tags = "@Smoke")
                 
public class AdvertiserLeadRunner 
{

}
