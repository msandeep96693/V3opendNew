package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuppressionPage extends BasePage
{

	public SuppressionPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(xpath = "//button[contains(.,' Edit')]")
	WebElement editbutton_onSuppressionTypePopup;
	
	private @FindBy(xpath = "//button[contains(.,' Upload ')]")
	WebElement uploadbutton_onMappingpopup;
	
	private @FindBy(xpath = "//div[@class='d-flex justify-content-center']")
	WebElement popupHeading;
	
	private @FindBy(xpath = "//div[@class='card']/div[text()=' Upload Suppression ']")
	WebElement headingon_uploadsuppressionpage;
	
	private @FindBy(xpath = "(//div[@class='inputfield'])/input")
	WebElement suppressionlistname_textfield;
	
	private @FindBy(xpath = "//h3[.='Map the Field']")
	WebElement popup_card;
	
	private @FindBy(xpath = "//h2[.='Suppression Type']")
	WebElement popupcard;
	
	private @FindBy(xpath = "//button[@type='button' and contains(@class, 'std-button-blue')]")
	WebElement update_button;
	
	public void clickOnEditbuttonOnSuppressionTypePopup()
	{
	   waitElementHelper(editbutton_onSuppressionTypePopup);
       editbutton_onSuppressionTypePopup.click();
	}
	
	public void clickOnUploadButtonOnMappingpopup()
	{
		waitElementHelper(uploadbutton_onMappingpopup);
		uploadbutton_onMappingpopup.click();
	}
	
	public String getPopupHeading() throws InterruptedException
	{
		 String getheadingText = null;
		if(popup_card.isDisplayed())
		{
			Thread.sleep(1000);
			waitElementHelper(popupHeading);
		    getheadingText=popupHeading.getText();
		}
		return getheadingText;
		
	}
	
	

	
	public String getPopupHeading1() throws InterruptedException
	{
		 String getheadingText = null;
		if(popupcard.isDisplayed())
		{
			Thread.sleep(1000);
			waitElementHelper(popupHeading);
		    getheadingText=popupHeading.getText();
		}
		return getheadingText;
		
	}
	
	public String getUploadsuppressionpageHeading()
	{
		waitElementHelper(headingon_uploadsuppressionpage);
		return headingon_uploadsuppressionpage.getText();
	}
	
	public void setSuppressionlistName(String suppressionName)
	{
		waitElementHelper(suppressionlistname_textfield);
		suppressionlistname_textfield.clear();
		suppressionlistname_textfield.sendKeys(suppressionName);
	}
	
	public void clickOnupdateButton() throws InterruptedException
	{
	    waitElementHelper(update_button);
	    Thread.sleep(1000);
	    update_button.click();
	}
	
	
}