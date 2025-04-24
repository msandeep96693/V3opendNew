package stepDefinitions;

import java.awt.AWTException;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pageObjects.CampaignsPage;
import pageObjects.ContactsPage;
import pageObjects.SignInPage;
import pageObjects.SuppressionPage;
import testBase.BaseClass;

public class SuppressionTest extends BaseClass
{

	@When("Clicks on suppression from the side menu bar")
	public void clicks_on_suppression_from_the_side_menu_bar()
	{
	    campaignsPage=new CampaignsPage(driver);
	    suppressionPage = new SuppressionPage(driver);
	    campaignsPage.clickonSideMainMenuBar("Suppression");
	}

	@Then("Verify that the admin is navigated to the suppression home page")
	public void verify_that_the_admin_is_navigated_to_the_suppression_home_page() throws InterruptedException 
	{
	    signin=new SignInPage(driver);
	    Assert.assertEquals(signin.getPageHeading(),"Suppression");
	}

	@When("Clicks on add suppression button")
	public void clicks_on_add_suppression_button()
	{
	   campaignsPage.clickonAddButton();
	}

	@Then("Make sure that the suppression type popup is displayed")
	public void make_sure_that_the_suppression_type_popup_is_displayed() throws InterruptedException 
	{
//	    suppressionPage=new SuppressionPage(driver);
//	    Assert.assertEquals(suppressionPage.getPopupHeading1(), "Suppression Type");
		System.out.println("Suppression Type");
	}

	@When("Select a advertiser suppression type")
	public void select_a_advertiser_suppression_type() 
	{
	    campaignsPage.setRadioButtons("Advertiser");
	}

	@When("Select a advertiser from advertiser dropdown")
	public void select_a_advertiser_from_advertiser_dropdown() 
	{
		campaignsPage.selectOptionInDropdown("Please Select Advertiser", "Known Ltd lukefairbrass36@hotmail.com");
	}

	@Then("Verify that the admin is redirected to upload suppression page")
	public void verify_that_the_admin_is_redirected_to_upload_suppression_page() throws InterruptedException
	{
//	    Assert.assertEquals(suppressionPage.getUploadsuppressionpageHeading(),"Upload Suppression");
		
		System.out.println("Upload suppression");
	}

	@When("Enters a supprssion list name")
	public void enters_a_supprssion_list_name() 
	{
	   suppressionPage.setSuppressionlistName("advertiser Suppression Test");
	}

	@When("Upload a suppression file")
	public void upload_a_suppression_file() throws AWTException 
	{
	   contactPage=new ContactsPage(driver);
	   contactPage.setFileUpload("/home/rokkun09/Documents/suppression csv.csv");
	}

	@When("select a upload type")
	public void select_a_upload_type() throws InterruptedException
	{
		Thread.sleep(2000);
	    campaignsPage.setRadioButtons("Normal");
	}

	@Then("Ensure that the mapping popup should be displayed")
	public void ensure_that_the_mapping_popup_should_be_displayed() throws InterruptedException 
	{
//	   Assert.assertEquals(suppressionPage.getPopupHeading(), "Map the Field");
		System.out.println("Map the field");
	}

	@When("Mapping all the mandatory fields")
	public void mapping_all_the_mandatory_fields()
	{
	    contactPage.setMappingDropdowns5();
	}

	@When("Click on upload button")
	public void click_on_upload_button() 
	{
	   suppressionPage.clickOnUploadButtonOnMappingpopup();
	}

	@Then("Verify that the new suppression successfully created with the confirmation message")
	public void verify_that_the_new_suppression_successfully_created_with_the_confirmation_message() throws InterruptedException 
	{
	   Assert.assertEquals(signin.getConfirmationMessge(), "Suppression inserted successfully");
	}

	@Then("Verify that the admin is redirected to suppression home page")
	public void verify_that_the_admin_is_redirected_to_suppression_home_page() throws InterruptedException
	{
		Assert.assertEquals(signin.getPageHeading(),"Suppression");
	}

	@Then("Ensure that the newly created suppression is displayed on the suppression home page")
	public void ensure_that_the_newly_created_suppression_is_displayed_on_the_suppression_home_page() 
	{
	    
	}

	@Then("Verify the table should display only suppression with the status {string} from {string} column")
	public void verify_the_table_should_display_only_suppresson_with_the_status_from_column(String suppressionStatus, String columnName) throws InterruptedException 
	{
	   campaignsPage.verifyDynomicTableWithPagination(columnName, suppressionStatus);
	}

	@When("The admin selects {string} by {string} and {string} by {string} from dropdowns")
	public void the_admin_selects_by_dropdown_and_by_dropdowns(String clientType, String clienttypefilterPlaceholder, String clientName, String clientnamefilterPlaceholder ) 
	{
	   campaignsPage.selectOptionInDropdown(clienttypefilterPlaceholder, clientType);
	   campaignsPage.selectOptionInDropdown(clientnamefilterPlaceholder, clientName);
	}
	
	@Then("Verify the table should display only suppression with the client {string} from {string} column")
	public void verify_the_table_should_display_only_suppression_with_the_client_from_column(String expectedResult, String columnName) throws InterruptedException 
	{
	    campaignsPage.verifyDynomicTableWithPagination(columnName, expectedResult);
	}
	
	/*-------------------------------suppression update--------------------------------*/
	
	@When("Clicks on edit button from kebab menu dropdown on suppression")
	public void clicks_on_edit_button_from_kebab_menu_dropdown_on_suppression() throws InterruptedException 
	{
	   campaignsPage.handleKebabMenuDropdownForUserSpecifiedTableDataDynamically("Active", "  Edit");
	}

	@When("Clicks on update button")
	public void clicks_on_update_button() throws InterruptedException 
	{
		if(suppressionPage==null) {
			suppressionPage=new SuppressionPage(driver);
		}
	    suppressionPage.clickOnupdateButton();
	}

	@Then("Verify that the suppression successfully updated with the confirmation message")
	public void verify_that_the_suppression_successfully_updated_with_the_confirmation_message() throws InterruptedException 
	{
	    Assert.assertEquals(signin.getConfirmationMessge(), "Publisher suppression updated successfully");
	}
	
}
