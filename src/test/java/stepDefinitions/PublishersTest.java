package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.AdvertiserPage;
import pageObjects.CampaignsPage;
import pageObjects.PublisherPage;
import pageObjects.SignInPage;
import testBase.BaseClass;

public class PublishersTest extends BaseClass
{

	@When("Clicks on Publishers from the side menu bar")
	public void clicks_on_publishers_from_the_side_menu_bar() 
	{
		if(campaignsPage==null || signin==null || advertiserPage==null || publisherPage==null)
		{
			campaignsPage=new CampaignsPage(driver);
			signin=new SignInPage(driver);
			advertiserPage=new AdvertiserPage(driver);
			publisherPage=new PublisherPage(driver);
		}   
	   campaignsPage.clickonSideMainMenuBar("Publishers");
	}

	@Then("Verify that the admin is navigated to the Publishers home page")
	public void verify_that_the_admin_is_navigated_to_the_publishers_home_page() throws InterruptedException
	{
	   Assert.assertEquals(signin.getPageHeading(), "Manage Publishers");
	}

	@When("Clicks on add new Publisher button")
	public void clicks_on_add_new_publisher_button() 
	{
	    campaignsPage.clickonAddButton();
	}

	@Then("Verify that the admin should navigate to the add Publisher page")
	public void verify_that_the_admin_should_navigate_to_the_add_publisher_page() throws InterruptedException
	{
	   Assert.assertEquals(advertiserPage.getPageHeadingOnForm(), "Add Publisher");
	}

	@When("Enters the hoid number into hoid textfield")
	public void enters_the_hoid_number_into_hoid_textfield()
    {	  
		publisherPage.setHoidNumber(setRandomalphanumber());
	}

	@Then("Verify that the new Publisher successfully created with the confirmation message")
	public void verify_that_the_new_publisher_successfully_created_with_the_confirmation_message() throws InterruptedException 
	{
	    Assert.assertEquals(signin.getConfirmationMessge(), "Publisher added successfully");
	}

	@Then("Verify that the admin is redirected to Publisher home page")
	public void verify_that_the_admin_is_redirected_to_publisher_home_page() throws InterruptedException 
	{
		 Assert.assertEquals(signin.getPageHeading(), "Manage Publishers");
	}

	@Then("Ensure that the newly created Publisher is displayed on the Publisher home page")
	public void ensure_that_the_newly_created_publisher_is_displayed_on_the_publisher_home_page() 
	{
	    
	}
	
	@Then("Verify the table should display only publishers with the status {string} from {string} column")
	public void verify_the_table_should_display_only_publishers_with_the_status_from_column(String expectedData, String columnName) throws InterruptedException {
		campaignsPage.verifyDynomicTableWithPagination(columnName, expectedData);
	}
	
	/*------------------------------------------Individual publisher supmodules------------------------*/
	
	@When("Select a publisher and clicks on {string} button from kebab menu dropdown")
	public void Select_a_publisher_and_clicks_on_view_button_from_kebab_menu_dropdown(String expectedAction) throws InterruptedException
	{
		campaignsPage.handleKebabMenuDropdownForUserSpecifiedTableDataDynamically("DataMixx BlueVolt", expectedAction);
	}
	
	@Then("Verify that the admin should navigate to the overview publisher page")
	public void verify_that_the_admin_should_navigate_to_the_overview_publisher_page() throws InterruptedException 
	{
	    Assert.assertEquals(advertiserPage.getOverviewtabText(), "Overview");
	}
	
	@When("Select the user from publisher user list and click on {string} button from kebab menu")
	public void select_the_user_from_publisher_user_list_and_click_on_button_from_kebab_menu(String ExpectedButton) throws InterruptedException 
	{
	    advertiserPage.handleKebabMenuDropdownByUserSpecifiedTableDataDynamically("User test", ExpectedButton);
	}
	
	@Then("Verify that the publisher user account successfully created with the confirmation message as {string}")
	public void verify_that_the_publisher_user_account_successfully_created_with_the_confirmation_message(String confirmationMessage) throws InterruptedException 
	{
	    Assert.assertEquals(signin.getConfirmationMessge(), confirmationMessage);
	}
	
	@Then("Veify that the admin should navigate to the {string} page from individual publisher")
	public void veify_that_the_admin_should_navigate_to_the_page_from_individual_publisher(String PageHeader) 
	{
	   Assert.assertEquals(advertiserPage.getCardHeader(), PageHeader);
	}
	
	@Then("Make sure that the publisher user details successfully updated with the confirmation message as {string}")
	public void make_sure_that_the_publisher_user_details_successfully_updated_with_the_confirmation_message_as(String confirmationMsg) throws InterruptedException 
	{
		Assert.assertEquals(signin.getConfirmationMessge(), confirmationMsg);
	}
	
	@Then("Verify that the publisher user account suspended successfully with the confirmation message as {string}")
	public void verify_that_the_publisher_user_account_suspended_successfully_with_the_confirmation_message_as(String confirmationMsg) throws InterruptedException 
	{
		Assert.assertEquals(signin.getConfirmationMessge(), confirmationMsg);
	}

	@Then("Verify that the publisher user account activated successfully with the confirmation message as {string}")
	public void verify_that_the_publisher_user_account_activated_successfully_with_the_confirmation_message_as(String confirmationMsg) throws InterruptedException 
	{
		Assert.assertEquals(signin.getConfirmationMessge(), confirmationMsg);
	}
	
	
	
}
