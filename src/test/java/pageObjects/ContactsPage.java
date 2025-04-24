package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage extends BasePage
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	public ContactsPage(WebDriver driver)
	{
		super(driver);
	}
	
	private @FindBy(xpath = "//input[@placeholder='Enter Business Name']")
	WebElement contactlistName_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Please Enter CPM payout price ']")
	WebElement cpmpayoutPrice_textfield;
	
	private @FindBy(xpath = "//input[@placeholder='Usage limit per day']")
	WebElement usagelimitperDay_textfield;
	
	private @FindBy(xpath = "//span[@id='basic-addon1']/img")
	WebElement uploadFile_field;
	
	private @FindBy(xpath = "//input[@placeholder='Enter default from name']")
	WebElement defaultfromName_textfield;
	
	private @FindBy(xpath = "//button[text()=' Go Back']")
	WebElement goback_button;
	
	private @FindBy(xpath = "//button[contains(.,' Add')]")
	WebElement addbutton_inform;
	
	private @FindBy(xpath = "//select[@formcontrolname='DropdownControl']")
	List<WebElement> mapping_dropdowns;
	
	
	
//	private @FindBy(xpath = "")WebElement ;
//	private @FindBy(xpath = "")WebElement ;
	
	
	public void setContactListName(String contactName)
	{
		waitElementHelper(contactlistName_textfield);
		contactlistName_textfield.clear();
		contactlistName_textfield.sendKeys(contactName);
	}
	
	public void setCpmPayoutprice(String cpmPrice)
	{
		waitElementHelper(cpmpayoutPrice_textfield);
		cpmpayoutPrice_textfield.clear();
		cpmpayoutPrice_textfield.sendKeys(cpmPrice);
	}
	
	public void setUsageLimitPerday(String usageLimit)
	{
		waitElementHelper(usagelimitperDay_textfield);
		usagelimitperDay_textfield.clear();
		usagelimitperDay_textfield.sendKeys(usageLimit);
	}
	
	public void setDefaultName(String defaultName)
	{
		waitElementHelper(defaultfromName_textfield);
		defaultfromName_textfield.clear();
		defaultfromName_textfield.sendKeys(defaultName);
	}
	
	public void clickOnGoBackButton()
	{
		waitElementHelper(goback_button);
		goback_button.click();
	}
	
	public void clickOnAddbuttonInform() throws AWTException
	{
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.delay(3000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.delay(3000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		
//		js.executeScript("arguments[0].scrollIntoView;",addbutton_inform);
		addbutton_inform.click();
//		waitElementHelper(addbutton_inform);
//		try {
//		addbutton_inform.click();
//		}catch(org.openqa.selenium.ElementClickInterceptedException e) {
//			addbutton_inform.click();
//		}
	}
	//@FindBy(xpath = "//input[@type='file']") WebElement uplaodKey;
	
	
	
	
	
	public void setFileUpload(String filePath) throws AWTException
	{
		
		
		WebElement uploadfile = driver.findElement(By.xpath("//input[@type='file']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display='block';", uploadfile);
        //Thread.sleep(2000);
        uploadfile.sendKeys(filePath);
//		waitElementHelper(uploadFile_field);
//		uploadFile_field.click();
//		
//		Robot rob=new Robot();
//		rob.delay(300);
//		
//		StringSelection copyFilepath = new StringSelection(filePath);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copyFilepath, null);
//		
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_V);
//		
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//		rob.keyRelease(KeyEvent.VK_V);
//		
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[4]") WebElement optInSource;
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[8]") WebElement optInDate;
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[9]") WebElement email;
	@FindBy(xpath = "(//select[@formcontrolname='DropdownControl'])[12]") WebElement optInTime;
	@FindBy(xpath = "//select[@formcontrolname='DropdownControl']") WebElement emailmapp;
	
	public void setMappingDropdowns1()
	{
		Select sel1=new Select(optInSource);
		sel1.selectByVisibleText("optinsource ");
	}
	public void setMappingDropdowns2()
	{
		Select sel2=new Select(optInDate);
		sel2.selectByVisibleText("optindate ");
	}
	public void setMappingDropdowns3()
	{
		Select sel3=new Select(email);
		sel3.selectByVisibleText("email ");
	}
	public void setMappingDropdowns4()
	{
		Select sel4=new Select(optInTime);
		sel4.selectByVisibleText("optintime ");
	}
	
	public void setMappingDropdowns5()
	{
		Select sel1=new Select(emailmapp);
		sel1.selectByVisibleText("email ");
	}

	
}
