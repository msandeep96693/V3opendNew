package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.CampaignsPage;
import pageObjects.RecurringAdsPage;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class RecurringAdsTest extends BaseClass
{
      
	@When("Clicks on recurring Ads from the side menu bar")
	public void clicks_on_recurring_ads_from_the_side_menu_bar() 
	{
	    campaignsPage=new CampaignsPage(driver);
	    campaignsPage.clickonSideMainMenuBar("Recurring Ads");
	}

	@Then("Verify that the admin is navigated to the recurring Ads home page")
	public void verify_that_the_admin_is_navigated_to_the_recurring_ads_home_page() throws InterruptedException 
	{
		signin=new SignInPage(driver);
	    Assert.assertEquals(signin.getPageHeading(), "Recurring");
	}

	@When("Clicks on add new recurring Ads button")
	public void clicks_on_add_new_recurring_ads_button() 
	{
	   campaignsPage.clickonAddButton();
	}

	@Then("Verify that the admin should navigate to the new recurring Ads page")
	public void verify_that_the_admin_should_navigate_to_the_new_recurring_ads_page() throws InterruptedException 
	{
	   Assert.assertEquals(signin.getPageHeading(), "Ad Template");
	}

	@When("Click on proceed button")
	public void click_on_proceed_button() throws InterruptedException 
	{
	    recurringAds=new RecurringAdsPage(driver);
	    recurringAds.clickOnProceedButton();
	}

	@When("Enters a subjectA and SubjectB")
	public void enters_a_subject_a_and_subject_b() 
	{
		recurringAds.setSubjectA(setRandomCampaignName());
		recurringAds.setSubjectB(setRandomCampaignName());
	}

	@When("Enters a email body one and email body two")
	public void enters_a_email_body_one_and_email_body_two() 
	{
	    recurringAds.clickCreativesButtonOne();
	    campaignsPage.clickOnselectButtonOnCreativePopup();
	    recurringAds.clickCreativesButtonTwo();
	    campaignsPage.clickOnselectButtonOnCreativePopup();
	}
	
	@When("Click on schedule campaign button from recurring ads")
	public void click_schedule_campaign_button_from_recurring_ads() throws InterruptedException
	{
		recurringAds.clickOnScheduleCampaign();
	}

	@Then("The new recurring Ads should be successfully created with confirmation message")
	public void the_new_recurring_ads_should_be_successfully_created_with_confirmation_message() throws InterruptedException 
	{
	    Assert.assertEquals(signin.getConfirmationMessge(), "Recurring ads Step2 Added Successfully");
	}

	@Then("The admin should be redirected to recurring Ads home page")
	public void the_admin_should_be_redirected_to_recurring_ads_home_page() throws InterruptedException 
	{
	    Assert.assertEquals(signin.getPageHeading(), "Ads");
	}
	
	@When("Clicks on filter icon button")
	public void Clicks_on_filter_icon_button() throws InterruptedException
	{
		if (recurringAds == null) {
			recurringAds = new RecurringAdsPage(driver);
		}
		recurringAds.clickOnFilterIcon();
	}
	
	@Then("The recurring Ads successfully updated with confirmation message")
	public void The_recurring_Ads_successfully_updated_with_confirmation_message() throws InterruptedException
	{
		Assert.assertEquals(signin.getConfirmationMessge(), "Recurring ads Step2 Updated Successfully");
	}
}



