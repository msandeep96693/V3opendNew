package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class SigninTest extends BaseClass 
{

	@Given("The admin launches the browser")
	public void the_admin_launches_the_browser() 
	{
	    browserSetup("chrome");
	    signin=new SignInPage(driver);
	}

	@When("Enters the url as {string}")
	public void enter_the_url(String url) 
	{
		driver.get(url);
	}

	@Then("Verify that the admin is navigated to the opend website")
	public void verify_that_the_admin_should_be_navigate_to_the_opend_website() 
	{
	   Assert.assertEquals(signin.getTitle(), "Opend");
	}

	@When("Enters the email address as {string} and the password as {string}")
	public void enter_the_email_address_as_and_password_as(String email, String pwd)
	{
	   signin.setEmailAddress(email);
	   signin.setPassword(pwd);
	}

	@When("Clicks on the sign in button")
	public void click_on_the_sign_in_button() 
	{
	   signin.clickSigninButton();
	}

	@Then("Verify that the admin is navigated to the dashboard page with the confirmation message")
	public void verify_that_the_admin_should_navigate_to_the_dashboard_page_with_the_confirmation_message() throws InterruptedException 
	{
	   Assert.assertEquals(signin.getConfirmationMessge(), "Login successful");
	   Assert.assertEquals(signin.getCurrenturl(), "https://v3opend.tech-active.com/admin/dashboard/admindashboard");
	}

	@When("Clicks on the profile icon")
	public void click_on_the_profile_icon() throws InterruptedException
	{
	   signin.profileIcon();
	}

	@When("Clicks on logout button")
	public void click_on_logout_button() 
	{
      signin.profileDropdownLinks("Log Out");
	}

	@Then("Ensure that the admin successfully logout from admin portal with the confirmation message")
	public void ensure_that_the_admin_successfully_logout_from_admin_portal_with_the_confirmation_message() 
	{
	   Assert.assertEquals(signin.getSigninpageHeadingText(), "Sign in to Admin Portal");
	}
	
	@Then("Close the browser")
	public void Close_the_browser()
	{
	     quitBrowser();
	}
	
}
