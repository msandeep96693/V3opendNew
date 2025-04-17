package testBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import pageObjects.AdvertiserPage;
import pageObjects.CampaignsPage;
import pageObjects.ContactsPage;
import pageObjects.PublisherPage;
import pageObjects.RecurringAdsPage;
import pageObjects.SignInPage;
import pageObjects.SuppressionPage;

public class BaseClass 
{
	
	public static WebDriver driver;
	public SuppressionPage suppressionPage;
	public static RecurringAdsPage recurringAds;
	public AdvertiserPage advertiserPage;
	public PublisherPage publisherPage;
	public static CampaignsPage campaignsPage;
	public static ContactsPage contactPage;
	public List<String> options;
	public SignInPage signin;
	
	
   @Before
   public void browserSetup(String browser)
   {
	   if(browser.equals("chrome"))
	   {
		   driver=new ChromeDriver();
	   }
	   else if(browser.equals("firefox"))
	   {
		   driver=new FirefoxDriver();
	   }
	   else
	   {
		   driver=new InternetExplorerDriver();
	   }
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   
   }
   
   @After
   public void quitBrowser()
   {
	   driver.quit();
   }
   
   
   public String setRandomCampaignName()
   {
	 String randomstring=RandomStringUtils.random(4,"abcdefghijklmnopqrstuvwxyz");
	 return "Test campaign"+randomstring;
   }
   
   public String setRandomBusinessName()
   {
	 String randomstring=RandomStringUtils.random(4,"abcdefghijklmnopqrstuvwxyz");
	 return "Goalcraft"+randomstring;
   }
   
   public String setRandomFirstName()
   {
	 String randomstring=RandomStringUtils.random(3,"abcdefghijklmnopqrstuvwxyz");
	 return "Anil"+randomstring;
   }
   
   public String setRandomLastName()
   {
	 String randomstring=RandomStringUtils.random(3,"abcdefghijklmnopqrstuvwxyz");
	 return "Rathod"+randomstring;
   }
   
   public String setRandomEmail()
   {
	 String randomstring=RandomStringUtils.random(3,"abcdefghijklmnopqrstuvwxyz");
	 return "aniltest"+randomstring+"@gmail.com";
   }
   public String setRandomMobileNumber()
   {
	  String randomnumeric=RandomStringUtils.randomNumeric(6);
	  return "9620"+randomnumeric;
   }
   
   public String setRandomalphanumber()
   {
	  String randomalphanumeric=RandomStringUtils.randomAlphanumeric(5);
	  return randomalphanumeric;
   }
  
   public void robotClickAction() throws AWTException
   {
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
   }
   
   
   
   
   
   
   
   
   
}
