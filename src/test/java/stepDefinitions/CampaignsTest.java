package stepDefinitions;

import java.awt.AWTException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.CampaignsPage;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class CampaignsTest extends BaseClass
{

	/*----------------------------------------------Add Camapigns---------------------------------------------*/ 
	
	@When("Clicks on campaigns from the side menu bar")
	public void clicks_on_campaigns_from_the_side_menu_bar() 
	{
		campaignsPage = new CampaignsPage(driver);
	    campaignsPage.clickonSideMainMenuBar("Campaigns");
	}

	@Then("Verify that the admin is navigated to the campaigns home page")
	public void verify_that_the_admin_is_navigated_to_the_campaigns_home_page() throws InterruptedException 
	{
		signin = new SignInPage(driver);
	    Assert.assertEquals(signin.getPageHeading(), "Campaigns");
	}

	@When("Clicks on add campaign new button")
	public void clicks_on_add_campaign_new_button()
	{
	   campaignsPage.clickonAddButton();
	}

	@Then("Verify that the admin should navigate to the new campaigns page")
	public void verify_that_the_admin_should_navigate_to_the_new_campaigns_page() throws InterruptedException 
	{
	   Assert.assertEquals(signin.getPageHeading(), "New Campaigns");
	}

	@Then("Verify the whether it is first step of campaign")
	public void verify_the_whether_it_is_first_step_of_campaign() 
	{
		if (campaignsPage == null) {
			campaignsPage=new CampaignsPage(driver);
			Assert.assertEquals(campaignsPage.getstepIndicator("Define Campaign"), "Define Campaign");
		}
	}

	@When("Select an advertiser from advertiser dropdown")
	public void select_an_advertiser_from_advertiser_dropdown() 
	{
	    campaignsPage.selectOptionInDropdown("Please Select Advertiser", "Tech Active (sudeep@active.agency)");
	}

	@When("Select a business type")
	public void select_a_business_type() 
	{
	    campaignsPage.setRadioButtons("B2C");
	}

	@When("Enter a campaign name")
	public void enter_a_campaign_name()
	{
	    campaignsPage.setCampaignName(setRandomCampaignName());
	}

	@When("Select a advertiser and publisher cast type")
	public void select_a_advertiser_and_publisher_cast_type() 
	{
		campaignsPage.setRadioButtons("Free");
	}

	@When("Select a campaign mode")
	public void select_a_campaign_mode() 
	{
		campaignsPage.setRadioButtons("CPM");
	}

	@When("Select a country from campaign country dropdown")
	public void select_a_country_from_campaign_country_dropdown() 
	{
		campaignsPage.selectOptionInDropdown("Select Country", "United Kingdom");
	}

	@When("Select a audience type from audience type dropdown")
	public void select_a_audience_type_from_audience_type_dropdown() 
	{
		campaignsPage.selectOptionInDropdown("Select Audience Type","UK Gambling Data ");
	}

	@When("Select a capaign sector from campaign sector popup dropdown")
	public void select_a_capaign_sector_from_campaign_sector_popup_dropdown() 
	{
		options=Arrays.asList("Car Insurance");
	    campaignsPage.clickonCampagnSector();//SelectOptionInPopupDropdown("Select Campaign Sector", options, "test");
	}

	@When("Select a publishers from publisher popup dropdown")
	public void select_a_publishers_from_publisher_popup_dropdown()
	{
		options=Arrays.asList("test");
	   campaignsPage.clickonpublisher();//SelectOptionInPopupDropdown("Select Publisher", options, "Select Publisher");
	}

	@When("Clicks on proceed button in first step")
	public void clicks_on_proceed_button()
	{
	    campaignsPage.clickOnProceedButtonOnFirststep();
	}

	@Then("verify that the admin should be redirected to second step of campaign")
	public void verify_that_the_admin_should_be_redirected_to_second_step_of_campaign() 
	{
		Assert.assertEquals(campaignsPage.getstepIndicator("Campaign Template"),"Campaign Template");
	}

	@When("Select a campaign type")
	public void select_a_campaign_type()
	{
		campaignsPage.setRadioButtons("Regular");
	}

	@When("Enters subject name into subject textfield")
	public void enters_subject_name_into_subject_textfield() 
	{
		campaignsPage.setSubject(setRandomCampaignName());
	}

	@When("Enters template into email body area")
	public void enters_template_into_email_body_area()
	{
		campaignsPage.setEmailBodyWithText(setRandomBusinessName());
	}
	
	@When("Clicks on proceed button in second step")
	public void Clicks_on_proceed_button_in_second_step() throws InterruptedException, AWTException
	{
	    campaignsPage.clickOnProceedButtonSecondStep();
	}

	@Then("Verify that the admin should be redirected to third step of campaign")
	public void verify_that_the_admin_should_be_redirected_to_third_step_of_campaign()
	{
		Assert.assertEquals(campaignsPage.getstepIndicator("Choose Audience"),"Choose Audience");
	}

	@When("Select a gender")
	public void select_a_gender() 
	{
	   campaignsPage.setRadioButtons("Both");
	}

	@When("Select a location")
	public void select_a_location()
	{
	   options=Arrays.asList("England");
	   campaignsPage.SelectOptionInPopupDropdown("Select Location", options,"test");
	}

	@When("Select a region")
	public void select_a_region() 
	{
		options=Arrays.asList("London");
		campaignsPage.SelectOptionInPopupDropdown("Select Region", options,"test");
	}

	@When("Select a town")
	public void select_a_town()
	{
		options=Arrays.asList("Romford");
		campaignsPage.SelectOptionInPopupDropdown("Select Town", options,"test");
	}

	@When("Select a default email domain")
	public void select_a_default_email_domain() 
	{
	    campaignsPage.setRadioButtons("Default");
	}

	@When("Disable audience option")
	public void disable_audience_option()
	{
	   campaignsPage.setRadioButtons("Disable");
	}

	@When("Clicks on proceed button in third step")
	public void Clicks_on_proceed_button_in_third_step()
	{
	    campaignsPage.clickOnProceedButtonOnThirdstep();
	}
	
	@Then("Verify that the admin should be redirected to fourth step of campaign")
	public void verify_that_the_admin_should_be_redirected_to_fourth_step_of_campaign()
	{
	   Assert.assertEquals(campaignsPage.getstepIndicator("Targeting & Send"), "Targeting & Send");
	}

	@When("Enter audience reach")
	public void enter_audience_reach() throws InterruptedException 
	{
	    campaignsPage.setAudienceReachopend("7000");
	}

	@When("Select a email deliverability")
	public void select_a_email_deliverability() 
	{
	   campaignsPage.selectOptionInDropdown("Please Select Email Deliverability", "e.osending2.com");
	}

	@When("Select a email scheduling")
	public void select_a_email_scheduling() throws InterruptedException
	{
	   List<String> days=Arrays.asList("Tue");
		
	   campaignsPage.selectOptionInDropdown("Please Select Email Scheduling", "Create a Campaign Schedule");
	   campaignsPage.setStartTimeAsFutureTime();
//	   campaignsPage.setStartDate("03", "Sep", "2024");
//	   campaignsPage.setEndDate("8", "Oct", "2024");
//	   campaignsPage.selectSpecificScheduleDays(days);
//	   campaignsPage.setStartDateAsCurrentDateAutomaticaly();
	   campaignsPage.setEndDateAsGraterthenStartDateAutomaticaly(3);
	   campaignsPage.selectAllScheduleDays();
	   
	   
	}

	@When("Click on schedule campaign button")
	public void click_on_schedule_campaign_button()
	{
		campaignsPage.clickOnScheduleCampaignButton();
	}

	@Then("The new campaign should be successfully created with confirmation message")
	public void the_new_campaign_should_be_successfully_created_with_confirmation_message() throws InterruptedException
	{
		Assert.assertEquals(signin.getConfirmationMessge(), "Campaign Created Successfully");
	}

	@Then("The admin should be redirected to campaign home page")
	public void the_admin_should_be_redirected_to_campaign_home_page() throws InterruptedException 
	{
	    Assert.assertEquals(signin.getPageHeading(), "Campaigns");
	}
	
	
	@When("Select a immediate email scheduling")
	public void Select_immediate_email_scheduling() throws InterruptedException
	{
		campaignsPage.selectOptionInDropdown("Please Select Email Scheduling", "Start Campaign Immediately");
		campaignsPage.setAudienceReachopend("7000");
	}
	
	@When("Click on start campaign button")
	public void Click_on_start_campaign_button()
	{
		campaignsPage.clickOnStartCampaignButton();
	}
	
	@When("Select a custom email domain")
	public void Select_a_custom_email_domain() throws InterruptedException
	{
		campaignsPage.setRadioButtons("Custom");
		campaignsPage.SelectOptionInPopupDropdown("Select Include Email Domain", null, "Select Include Email Domain");
		campaignsPage.setEmailDomains(100);
	}
	
	@When("Select a standard email domain")
	public void Select_a_standard_email_domain()
	{
		campaignsPage.setRadioButtons("Standard");
		campaignsPage.SelectOptionInPopupDropdown("Select Include Email Domain", null, "Select Include Email Domain");
	}

	
	/*--------------------------------------------campaign home page------------------------------------------*/
	
	@When("The admin selects {string} from the {string} filter dropdown")
	public void the_admin_selects_from_the_filter_dropdown(String campaignStatus, String placeholder) 
	{
	    campaignsPage.selectOptionInDropdown(placeholder, campaignStatus);
	}

	@Then("Verify the table should display only campaigns with the status {string} from {string} column")
	public void verify_the_table_should_display_only_campaigns_with_the_status_from_column(String campaignStatus, String columnName) throws InterruptedException 
	{
	   campaignsPage.verifyDynomicTableWithPagination(columnName, campaignStatus);
	}
	
	@Then("Verify the table should display only campaigns with the type {string} from {string} column")
	public void verify_the_table_should_display_only_campaigns_with_the_type_from_column(String campaignType, String columnName) throws InterruptedException 
	{
	   campaignsPage.verifyDynomicTableWithPagination(columnName, campaignType);
	}
	
	@When("Reset the page by reset button")
	public void Refresh_the_page_by_refresh_button()
	{
	   campaignsPage.clickOnResetButton();	
	}
	
	@When("Clicks on filter icon")
	public void Clicks_on_filter_icon()
	{
		campaignsPage.clickOnFilterIcon();
	}

	
	/*---------------------------------update campaigns---------------------------------------------*/
	
	@When("Clicks on edit button from kebab menu dropdown")
	public void clicks_on_edit_button_from_kebab_menu_dropdown() throws InterruptedException 
	{
	    campaignsPage.handleKebabMenuDropdownForUserSpecifiedTableDataDynamically("Saved", "  Edit");
	}

	@Then("Clicks on proceed button on first step")
	public void clicks_on_proceed_button_on_first_step() 
	{
	   campaignsPage.clickOnProceedButtonOnRecurring();
	}

	@When("Clicks on proceed button on second step")
	public void clicks_on_proceed_button_on_second_step() 
	{
	   campaignsPage.clickOnProceedButtonOnFirststep();
	}

	@Then("The campaign updated successfully with confirmation message")
	public void the_campaign_updated_successfully_with_confirmation_message() throws InterruptedException 
	{
	   Assert.assertEquals(signin.getConfirmationMessge(), "Campaign Updated Successfully");
	}
	
	
	
}
