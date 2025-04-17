package stepDefinitions;

import java.awt.AWTException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.AdvertiserPage;
import pageObjects.CampaignsPage;
import pageObjects.ContactsPage;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class ContactsTest extends BaseClass
{
	@When("Clicks on contacts from the side menu bar")
	public void clicks_on_contacts_from_the_side_menu_bar() 
	{
	  campaignsPage=new CampaignsPage(driver);
	  campaignsPage.clickonSideMainMenuBar("Contacts");
	}

	@Then("Verify that the admin is navigated to the contacts home page")
	public void verify_that_the_admin_is_navigated_to_the_contacts_home_page() throws InterruptedException 
	{
		signin=new SignInPage(driver);
		Assert.assertEquals(signin.getPageHeading(), "Contacts");
	}

	@When("Clicks on add contact button")
	public void clicks_on_add_contact_button()
	{
	    campaignsPage.clickonAddButton();
	}

	@Then("Verify that the admin should navigate to the upload contact page")
	public void verify_that_the_admin_should_navigate_to_the_upload_contact_page() throws InterruptedException 
	{
		Assert.assertEquals(signin.getCurrenturl(), "https://v3opend.tech-active.com/admin/contacts/newcontact");
	}

	@When("Select an publisher from publisher dropdown")
	public void select_an_publisher_from_publisher_dropdown()
	{
	    campaignsPage.selectOptionInDropdown("Select Publisher", "Tech Active List (sudeep@active.agency)");
	}

	@When("Enters a contact list name")
	public void enters_a_contact_list_name() 
	{
	   contactPage=new ContactsPage(driver);
	   contactPage.setContactListName(setRandomBusinessName());
	}

	@When("Select a data type")
	public void select_a_data_type() 
	{
	    campaignsPage.setRadioButtons("B2C");
	}

	@When("Select a audience type from audience type popup dropdown")
	public void select_a_audience_type_from_audience_type_popup_dropdown() 
	{
		options=Arrays.asList("USA Consumer Data","Boat rent");
	    campaignsPage.SelectOptionInPopupDropdown("Please Select Audience Type", options, null);
	}

	@When("Enters a cpm payout price")
	public void enters_a_cpm_payout_price()
	{
		if(contactPage == null) {
			contactPage=new ContactsPage(driver);
		}
	    contactPage.setCpmPayoutprice("2");
	}

	@When("Enters a usage limit per day")
	public void enters_a_usage_limit_per_day()
	{
	    contactPage.setUsageLimitPerday("1");
	}
	
	@When("Select an country from country dropdown")
	public void Select_an_country_from_country_dropdown()
	{
		campaignsPage.selectOptionInDropdown("Select Country", "United Kingdom");
	}

	@When("Select a permitted sectors from permitted sectors popup dropdown")
	public void select_a_permitted_sectors_from_permitted_sectors_popup_dropdown() 
	{
		options=Arrays.asList("Car Insurance","Boat rent");
	    campaignsPage.SelectOptionInPopupDropdown("Please Select Campaign Sub-Category", options, null);
	}

	@When("upload a csv file into fileupload field")
	public void upload_a_csv_file_into_fileupload_field() throws AWTException 
	{
	    contactPage.setFileUpload("/home/rokkun09/Downloads/CTest01_B2C_10.csv");
	}

	@When("Enters a default from name")
	public void enters_a_default_from_name()
	{
	   contactPage.setDefaultName(setRandomFirstName());
	}

	@When("Clicks on add button")
	public void clicks_on_add_button() throws AWTException
	{
	   if(contactPage==null)
	   contactPage=new ContactsPage(driver); 
	   contactPage.clickOnAddbuttonInform();
	}
	
	@Then("Make sure that the admin is redirected to data mapping page")
	public void make_sure_that_the_admin_is_redirected_to_data_mapping_page() throws InterruptedException 
	{
	    advertiserPage=new AdvertiserPage(driver);
	    Assert.assertEquals(advertiserPage.getPageHeadingOnForm(),"Data Mapping");
	}

	@When("Mapping all the data")
	public void mapping_all_the_data() throws InterruptedException 
	{
		 contactPage.setMappingDropdowns1();
		 contactPage.setMappingDropdowns2();
		 contactPage.setMappingDropdowns3();
		 contactPage.setMappingDropdowns4();
	}

	@When("Click on add button")
	public void click_on_add_button() throws AWTException 
	{
	    contactPage.clickOnAddbuttonInform();
	}

	@Then("Verify that the new contact successfully created with the confirmation message")
	public void verify_that_the_new_contact_successfully_created_with_the_confirmation_message() throws InterruptedException
    {	
		Assert.assertEquals(signin.getConfirmationMessge(), "Contact Created successfully");
	}

	@Then("Verify that the admin is redirected to contacts home page")
	public void verify_that_the_admin_is_redirected_to_contacts_home_page() throws InterruptedException 
	{
		Assert.assertEquals(signin.getPageHeading(), "Contacts");
	}

	@Then("Ensure that the newly created contact is displayed on the contacts home page")
	public void ensure_that_the_newly_created_contact_is_displayed_on_the_contacts_home_page()
	{
	   
	}
	
	/*---------------------------contacts home page-------------------------------*/
	
	@Then("Verify the table should display only contacts with the status {string} from {string} column")
	public void verify_the_table_should_display_only_contacts_with_the_status_from_column(String expectedData, String columnName) throws InterruptedException 
	{
	    campaignsPage.verifyDynomicTableWithPagination(columnName, expectedData);
	}

	@Then("Verify the table should display only contacts with the type {string} from {string} column")
	public void verify_the_table_should_display_only_contacts_with_the_type_from_column(String expectedData, String columnName) throws InterruptedException 
	{
		campaignsPage.verifyDynomicTableWithPagination(columnName, expectedData);
	}
	
	/*------------------------------------contacts update----------------------------------------*/
	
	@When("Clicks on edit button from kebab menu dropdown on contacts")
	public void Clicks_on_edit_button_from_kebab_menu_dropdown_on_contacts() throws InterruptedException
	{
		campaignsPage.handleKebabMenuDropdownForUserSpecifiedTableDataDynamically("Active","  Edit");
	}
	
	
	@When("Click on update button")
	public void Click_on_update_button() throws InterruptedException
	{
		campaignsPage.clickOnupdateButtonOnRecurring();
	}
	
	@Then("Verify that the contact successfully updated with the confirmation message")
	public void Verify_that_the_contact_successfully_updated_with_the_confirmation_message() throws InterruptedException
	{
		Assert.assertEquals(signin.getConfirmationMessge(), "Contact updated successfully");
	}
	
}
