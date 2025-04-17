package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PublisherPage extends BasePage 
{

	public PublisherPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(xpath = "//input[@placeholder='Enter DMA Reg No']")
	WebElement dmaregnumber_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter HOID']")
	WebElement hoid_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Enter ICO No']")
	WebElement iconumber_textfield;
	
//	private @FindBy(xpath = "")
//	WebElement ;
//	private @FindBy(xpath = "")
//	WebElement ;
//	private @FindBy(xpath = "")
//	WebElement ;
//	private @FindBy(xpath = "")
//	WebElement ;
//	private @FindBy(xpath = "")
//	WebElement ;
//	private @FindBy(xpath = "")
//	WebElement ;
//	private @FindBy(xpath = "")
//	WebElement ;
	
	public void setDmaRegNumber(String dmaRegNumber)
	{
		waitElementHelper(dmaregnumber_textfield);
		dmaregnumber_textfield.clear();
		dmaregnumber_textfield.sendKeys(dmaRegNumber);
	}
	
	public void setHoidNumber(String hoidNumber)
	{
		waitElementHelper(hoid_textfield);
		hoid_textfield.clear();
		hoid_textfield.sendKeys(hoidNumber);
	}
	
	public void setIcoNumber(String icoNumber)
	{
		waitElementHelper(dmaregnumber_textfield);
		iconumber_textfield.clear();
		iconumber_textfield.sendKeys(icoNumber);
	}



	
	
}
