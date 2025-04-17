package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage
{

	public SignInPage(WebDriver driver)
	{
		super(driver);
	}

	private @FindBy(xpath = "//input[@placeholder='Enter Email']")
	WebElement emailtext_field;
	
	private @FindBy(xpath = "//input[@placeholder='Enter Password']")
    WebElement passwordtext_field;
	
	private @FindBy(xpath = "//button[.='Sign In']")
	WebElement signin_button;
	
	private @FindBy(xpath = "//a[.='Forgot your password?']")
	WebElement forgot_link;
	
	private @FindBy(xpath = "//h2[.='Sign in to Admin Portal']")
	WebElement signinpage_header;
	
	private @FindBy(xpath = "//div[@class='swal2-html-container']")
	WebElement confirmation_msg;
	
	private @FindBy(xpath = "(//div[@class='page-content']//h1)[1]")
	WebElement page_header;
	
	private @FindBy(xpath = "//a[@id='profileDropdown' and @class='dropdown-toggle nav-link']")
	WebElement profile_icon;
	
	private @FindBy(xpath = "//div[@aria-labelledby='profileDropdown']/ul/li")
	List<WebElement> profile_options;
	
	
	public void setEmailAddress(String email)
	{
		waitElementHelper(emailtext_field);
		emailtext_field.clear();
		emailtext_field.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
	    waitElementHelper(passwordtext_field);
		passwordtext_field.clear();
		passwordtext_field.sendKeys(password);
	}
	
	public void clickSigninButton()
	{
		waitElementHelper(signin_button);
		signin_button.click();
	}
	
	public void clickForgotLink()
	{
		waitElementHelper(forgot_link);
		forgot_link.click();
	}
	
	public String getSigninpageHeadingText()
	{
	    waitElementHelper(signinpage_header);
		return signinpage_header.getText();
	}
	
	public void profileIcon() throws InterruptedException
	{
		Thread.sleep(1000);
		waitElementHelper(profile_icon);
		try {
			profile_icon.click();
		}catch(org.openqa.selenium.ElementClickInterceptedException e) {
			Thread.sleep(2000);
			profile_icon.click();
		}
		
	}
	
	public void profileDropdownLinks(String option)
	{
		waitElementHelper(profile_options);
		
		for(WebElement profileOption:profile_options)
		{
			String getOptionText=profileOption.getText();
			if(getOptionText.equals(option))
			{
				profileOption.click();
				break;
			}
		}
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String getCurrenturl() throws InterruptedException
	{
		Thread.sleep(3000);
		return driver.getCurrentUrl();
	}
	
	public String getConfirmationMessge() throws InterruptedException
	{
		try {
			Thread.sleep(500);
		waitElementHelper(confirmation_msg);
		return 	confirmation_msg.getText();
		}catch(Exception e)
		{
			Thread.sleep(2000);
			waitElementHelper(confirmation_msg);
			return 	confirmation_msg.getText();
		}
	}
	
	public String getPageHeading() throws InterruptedException
	{
		Thread.sleep(3000);
		waitElementHelper(page_header);
		return page_header.getText();
	}
	
}
