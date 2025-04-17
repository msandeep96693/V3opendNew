package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.AdvertiserPage;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class PublisherLeadsTest extends BaseClass
{

	@Then("Verify that the admin should navigate to the add publisher lead page")
	public void verify_that_the_admin_should_navigate_to_the_add_publisher_lead_page() throws InterruptedException 
	{
	   advertiserPage=new AdvertiserPage(driver);
	   Assert.assertEquals(advertiserPage.getPageHeadingOnForm(), "Add Lead");
	}

	@Then("Verify that the new publisher lead successfully created with the confirmation message")
	public void verify_that_the_new_publisher_lead_successfully_created_with_the_confirmation_message() throws InterruptedException 
	{
	   signin=new SignInPage(driver);
	   Assert.assertEquals(signin.getConfirmationMessge(), "Lead added successfully");
	}

	@Then("Verify that the admin is redirected to publisher lead home page")
	public void verify_that_the_admin_is_redirected_to_publisher_lead_home_page() throws InterruptedException 
	{
		Assert.assertEquals(signin.getPageHeading(), "Manage Leads");
	}

	@Then("Ensure that the newly created publisher lead is displayed on the publisher lead home page")
	public void ensure_that_the_newly_created_publisher_lead_is_displayed_on_the_publisher_lead_home_page()
	{
	   
	}
}
