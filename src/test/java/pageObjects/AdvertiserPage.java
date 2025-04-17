package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;

public class AdvertiserPage extends BasePage
{

	public AdvertiserPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(xpath = "//input[@placeholder='Enter a Business Name']")
	WebElement businessname_textfiels;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Business VAT']")
	WebElement businessvat_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Company Reg No']")
	WebElement companyregno_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Postal Code']")
	WebElement postalcode_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Address']")
	WebElement address_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Website']")
	WebElement website_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter SubID']")
	WebElement subid_textfield;
	
	private @FindBy(xpath = "//h4[.='User Information']/../..//div//div//input[@placeholder='Enter Your First Name']")
	WebElement firstname_textfield;
	
	private @FindBy(xpath = "//h4[.='User Information']/../..//div//div//input[@placeholder='Enter Your Last Name']")
	WebElement lastname_textfield;
	
	private @FindBy(xpath = "//h4[.='User Information']/../..//div//div//input[@placeholder='Enter Job Title']")
	WebElement jobtitle_textfield;
	
	private @FindBy(xpath = "//h4[.='User Information']/../..//div//div//input[@placeholder='Enter Email Address']")
	WebElement email_textfield;
	
	private @FindBy(xpath = "//h4[.='User Information']/../..//div//div//input[@placeholder='Enter Telephone Number']")
	WebElement mobile_textfield;
	
	private @FindBy(xpath = "//button[contains(.,' Cancel ')]")
	WebElement cancel_button;
	
	private @FindBy(xpath = "//button[contains(.,' Add ')]")
	WebElement add_button;
	
	private @FindBy(xpath = "//div[@class='page-content']//h2")
	WebElement headingOn_updatePage;
	
	private @FindBy(xpath = "//button[.='OK']")
	WebElement okbutton_onConfirmationpopup;
	
	private @FindBy(xpath = "//button[.='Cancel']")
	WebElement cancelbutton_onConfirmationpopup;
	
	private @FindBy(xpath = "//a[.='Leads']")
	WebElement lead_tab;
	
	private @FindBy(xpath = "//a[text()='Overview']")
	WebElement overview_tab;
	
	private @FindBy(xpath = "//span[@class='row flex-wrap']//a")
	List<WebElement> individualadveertiser_tabs;
	
	private @FindBy(xpath = "(//button[@class='btn edit-btn'])[1]")
	WebElement editbutton_oncompanyinfo;

	private @FindBy(xpath = "(//button[@class='btn edit-btn'])[2]")
	WebElement editbutton_onbillingcontact;
	
	private @FindBy(xpath = "//button[@class='btn-wide-secondary']")
	WebElement update_button;
	
	private @FindBy(xpath = "//button[@class='accordion-button collapsed']")
	List<WebElement> collapsedaccordion_buttons;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Telephone Number']")
	WebElement telephone_textfield;
	
	/*----------------------------------Advertiser User fields--------------------------*/
	
	private @FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement userfirstName_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement userlastName_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Email Address']")
	WebElement userEmail_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Telephone']")
	WebElement usertelePhone_textfield;
	
	private @FindBy(xpath = "//button[contains(.,'Add')]")
	WebElement userAdd_button;
	
	private @FindBy(xpath = "//div[@class='card-header']/h4")
	WebElement card_header;
	
	private @FindBy(xpath = "//button[@class='accordion-button']")
	WebElement accordion_button;
	
	private @FindBy(xpath = "//button[.='Update']")
	WebElement userupdate_button;
	
	public void setBusinessName(String businessName)
	{
		waitElementHelper(businessname_textfiels);
		businessname_textfiels.clear();
		businessname_textfiels.sendKeys(businessName);
	}
	
	public void setBusinessVat(String businessVat)
	{
		waitElementHelper(businessvat_textfield);
		businessvat_textfield.clear();
		businessvat_textfield.sendKeys(businessVat);
	}
	
	public void setCompanyRegNumber(String CompRegNumber)
	{
		waitElementHelper(companyregno_textfield);
		companyregno_textfield.clear();
		companyregno_textfield.sendKeys(CompRegNumber);
	}
	
	public void setPostalCode(String postalCode)
	{
		waitElementHelper(postalcode_textfield);
		postalcode_textfield.clear();
		postalcode_textfield.sendKeys(postalCode);
	}
	
	public void setAddress(String address)
	{
		waitElementHelper(address_textfield);
		address_textfield.clear();
		address_textfield.sendKeys(address);
	}
	
	public void setWebsite(String website)
	{
		waitElementHelper(website_textfield);
		website_textfield.clear();
		website_textfield.sendKeys(website);
	}
	
	public void setSubid(String subId)
	{
		waitElementHelper(subid_textfield);
		subid_textfield.clear();
		subid_textfield.sendKeys(subId);
	}
	
	public void setFirstName(String firstName)
	{
		waitElementHelper(firstname_textfield);
		firstname_textfield.clear();
		firstname_textfield.sendKeys(firstName);
	}
	
	public void setLastName(String lastName)
	{
		waitElementHelper(lastname_textfield);
		lastname_textfield.clear();
		lastname_textfield.sendKeys(lastName);
	}
	
	public void setJobTitle(String jobTitle)
	{
		waitElementHelper(jobtitle_textfield);
		jobtitle_textfield.clear();
		jobtitle_textfield.sendKeys(jobTitle);
	}
	
	public void setEmailAddress(String emailAddress)
	{
		waitElementHelper(email_textfield);
		email_textfield.clear();
		email_textfield.sendKeys(emailAddress);
	}
	
	public void setTelephone(String telePhone)
	{
		waitElementHelper(mobile_textfield);
		mobile_textfield.clear();
		mobile_textfield.sendKeys(telePhone);
	}
	
	public void clickOnCancelButton()
	{
		waitElementHelper(cancel_button);
		cancel_button.click();
	}
	
	public void clickOnAddButton()
	{
		scrollBottomofPage();
		waitElementHelper(add_button);
		try {
		add_button.click();
		}
		catch(org.openqa.selenium.ElementClickInterceptedException e)
		{
			add_button.click();
		}
	}
	
	public String getPageHeadingOnForm() throws InterruptedException
	{
		Thread.sleep(2000);
		waitElementHelper(headingOn_updatePage);
		return headingOn_updatePage.getText();
	}
	
	public void clicksOKbuttonOnConfirmationPopup() throws InterruptedException
	{
		waitElementHelper(okbutton_onConfirmationpopup);
		okbutton_onConfirmationpopup.click();
	}
	
	public void clicksCancelbuttonOnConfirmationPopup()
	{
		waitElementHelper(cancelbutton_onConfirmationpopup);
		cancelbutton_onConfirmationpopup.click();
	}
	
	public String getOverviewtabText()
	{
		waitElementHelper(overview_tab);
		return overview_tab.getText();
	}
	
	public void clickOnIndividualAdvertiserTabs(String tabName) throws InterruptedException
	{
		for(WebElement tab:individualadveertiser_tabs)
		{
			String gettabtext=tab.getText();
			System.out.println("get tab name : "+gettabtext);
			if(gettabtext.equalsIgnoreCase(tabName)) {
				waitElementHelper(tab);
				try {
					tab.click();
				}catch(org.openqa.selenium.ElementClickInterceptedException e) {
					Thread.sleep(1000);
					tab.click();
				}
				
				break;
			}
		} 
	}
	
	public void clickOnEditButtonInProfileInfo()
	{
	   if(editbutton_oncompanyinfo.isDisplayed())	
	   {
		  waitElementHelper(editbutton_oncompanyinfo);
		  editbutton_oncompanyinfo.click();
	   }else {
		   waitElementHelper(editbutton_onbillingcontact);
		   editbutton_onbillingcontact.click();
	   }
	}
	
	public void updateButton()
	{
		waitElementHelper(update_button);
		update_button.click();
	}
	
	public void clickOncollapsedaccordionButton(String accordionName)
	{
		for(WebElement collapsedaccordionButton:collapsedaccordion_buttons)
		{
			String getAccordionText=collapsedaccordionButton.getText();
			if(getAccordionText.equalsIgnoreCase(accordionName))
			{
				waitElementHelper(collapsedaccordionButton);
				collapsedaccordionButton.click();
				break;
			}
		}
	}
	
	public void setTelephoneNumber(String telephoneNumber)
	{
		waitElementHelper(telephone_textfield);
		telephone_textfield.clear();
		telephone_textfield.sendKeys(telephoneNumber);
	}
	
	public void userAddButton()
	{
		waitElementHelper(userAdd_button);
		userAdd_button.click();
	}
	
	public String getCardHeader()
	{
		waitElementHelper(card_header);
		return card_header.getText();
	}
	
	public void setUserFirstName(String userFirstName)
	{
		waitElementHelper(userfirstName_textfield);
		userfirstName_textfield.clear();
		userfirstName_textfield.sendKeys(userFirstName);
	}
	
	public void setUserLastName(String userLastName)
	{
		waitElementHelper(userlastName_textfield);
		userlastName_textfield.clear();
		userlastName_textfield.sendKeys(userLastName);
	}
	
	public void setUserEmail(String userEmail)
	{
		waitElementHelper(userEmail_textfield);
		userEmail_textfield.clear();
		userEmail_textfield.sendKeys(userEmail);
	}
	
	public void setUserTelePhoneNumber(String userPhoneNumber)
	{
		waitElementHelper(usertelePhone_textfield);
		usertelePhone_textfield.clear();
		usertelePhone_textfield.sendKeys(userPhoneNumber);
	}

	// Individual advertiser and publisher sub modules
	public void handleKebabMenuDropdownByUserSpecifiedTableDataDynamically(String tableData, String kebabOption) throws InterruptedException 
	{
	    int rowIndex = 0;
	    boolean found = false;
	    
	    // Iterate through pagination
	    CampaignsPage campaignPage=new CampaignsPage(driver);
	        // Iterate through table rows
	        for (int r = 1; r <= campaignPage.table_rows.size(); r++) {
	            List<WebElement> dynamicTableData = driver.findElements(By.xpath("//table/tbody/tr[" + r + "]/td"));
	            for (WebElement tabledata : dynamicTableData) 
	            {
	                String gettableData = tabledata.getText();
	                System.out.println("Table data: " + gettableData);

	                if (gettableData.equalsIgnoreCase(tableData))
	                {
	                    rowIndex = r;
	                   
	                    WebElement kebabMenuIcon = null;
	                    String getaccordionText=accordion_button.getText();

	                    // Determine which column the kebab menu is in based on the page heading
	                    if (getaccordionText.equalsIgnoreCase("Users")) {
	                        kebabMenuIcon = driver.findElement(By.xpath("//table/tbody/tr[" + rowIndex + "]/td[7]//following::img[@class='options']"));
	                    } else {
	                        kebabMenuIcon = driver.findElement(By.xpath("//table/tbody/tr[" + rowIndex + "]/td[3]//following::img[@class='options']"));
	                    }

	                    if (kebabMenuIcon != null)
	                    {
	                        kebabMenuIcon.click();
	                        Thread.sleep(500);
	                        
	                        // Iterate through kebab menu options
	                        for (WebElement kebabMenuOption :campaignPage.editbutton_onkebabdropdown ) 
	                        {
	                            System.out.println("Kebab menu option: " + kebabMenuOption.getText());
	                            if (kebabMenuOption.getText().equalsIgnoreCase(kebabOption)) 
	                            {
	                                waitElementHelper(kebabMenuOption);
	                                kebabMenuOption.click();
	                                found = true;
	                                break;
	                            }
	                        }
	                    }
	                    if (found) break; 
	                }
	            }
	            if (found) break;
	        }
	    }
	
	public void clickOnUserUpdateButton()
	{
		waitElementHelper(userupdate_button);
		userupdate_button.click();
	}
	
	
	//advertiser lead methods
	
	public void clickOnLeadTab()
	{
		waitElementHelper(lead_tab);
		lead_tab.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
