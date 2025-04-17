package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.AdvertiserPage;
import pageObjects.CampaignsPage;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class AdvertiserLeadTest extends BaseClass
{

	@When("Click on lead tab")
	public void click_on_lead_tab() 
	{
	   advertiserPage=new AdvertiserPage(driver);
	   advertiserPage.clickOnLeadTab();
	}

	@When("Clicks on add new lead button")
	public void clicks_on_add_new_lead_button() 
	{
	   campaignsPage=new CampaignsPage(driver);
	   campaignsPage.clickonAddButton();
	}

	@Then("Verify that the admin should navigate to the add advertiser lead page")
	public void verify_that_the_admin_should_navigate_to_the_add_advertiser_lead_page() throws InterruptedException 
	{
	    Assert.assertEquals(advertiserPage.getPageHeadingOnForm(),"Add Lead");
	}

	@Then("Verify that the new advertiser lead successfully created with the confirmation message")
	public void verify_that_the_new_advertiser_lead_successfully_created_with_the_confirmation_message() throws InterruptedException 
	{
		signin=new SignInPage(driver);
	    Assert.assertEquals(signin.getConfirmationMessge(), "Lead added successfully");
	}

	@Then("Verify that the admin is redirected to advertiser lead home page")
	public void verify_that_the_admin_is_redirected_to_advertiser_lead_home_page() throws InterruptedException 
	{
	    Assert.assertEquals(signin.getPageHeading(), "Manage Leads");
	}

	@Then("Ensure that the newly created advertiser lead is displayed on the advertiser lead home page")
	public void ensure_that_the_newly_created_advertiser_lead_is_displayed_on_the_advertiser_lead_home_page() 
	{
	    
	}
}
