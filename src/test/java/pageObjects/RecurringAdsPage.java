package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecurringAdsPage extends BasePage
{

	public RecurringAdsPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(xpath = "//button[text()='Proceed']")
	WebElement proceed_button;
	
	private @FindBy(xpath = "(//input[@placeholder='Max 150 Characters'])[1]")
	WebElement subjectA_textfield;
	
	private @FindBy(xpath = "(//input[@placeholder='Max 150 Characters'])[2]")
	WebElement subjectB_textfield;
	
	private @FindBy(xpath = "(//button[.='Creatives '])[1]")
	WebElement creatives_button1;
	
	private @FindBy(xpath = "(//button[.='Creatives '])[2]")
	WebElement creatives_button2;
	
	private @FindBy(xpath = "//button[.=' Schedule Campaign']")
	WebElement schedulecampaign_button;
	
	private @FindBy(xpath = "//div[@class='moving-box another-class']")
	WebElement loader;
	
	private @FindBy(xpath = "//button/img[@alt and @title]")
	WebElement filter_icon;
	
	public void setSubjectA(String subjectA)
	{
		waitElementHelper(subjectA_textfield);
		subjectA_textfield.clear();
		subjectA_textfield.sendKeys(subjectA);
	}
	
	public void setSubjectB(String subjectB)
	{
		waitElementHelper(subjectB_textfield);
		subjectB_textfield.clear();
		subjectB_textfield.sendKeys(subjectB);
	}
	
	public void clickCreativesButtonOne()
	{
	    waitForLoaderToClose(loader);
		creatives_button1.click();	
	}

	public void clickCreativesButtonTwo()
	{
		waitElementHelper(creatives_button2);
		creatives_button2.click();
	}
	
	public void clickOnProceedButton() throws InterruptedException
	{
		scrollBottomofPage();
		Thread.sleep(1000);
		waitElementHelper(proceed_button);
		proceed_button.click();
	}
	
	public void clickOnScheduleCampaign() throws InterruptedException
	{
		scrollBottomofPage();
		Thread.sleep(1000);
		waitElementHelper(schedulecampaign_button);
		schedulecampaign_button.click();
	}
	
	public void clickOnFilterIcon() throws InterruptedException
	{
		try 
		{
		   waitElementHelper(filter_icon);
		   filter_icon.click();
		} catch (org.openqa.selenium.NoSuchSessionException e) 
		{
		   filter_icon.click();
		}
	}
	
}
