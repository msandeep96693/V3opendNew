package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class CampaignsPage extends BasePage
{
 JavascriptExecutor js=(JavascriptExecutor)driver;
	public CampaignsPage(WebDriver driver) 
	{
		super(driver);
	}

	//Add campaigns
	//1st step
	

	private @FindBy(xpath = "//div[@class='sidebar-body ps mm-active']/ul/li")
	List<WebElement> sidebar_menu;
	
	private @FindBy(xpath = "//app-input[@labelname='Campaign Name']//input")
	WebElement campaign_textfield;
	
	private @FindBy(xpath = "//button[@class='text-button-green']")
	WebElement add_button; 
	
	private @FindBy(xpath = "//aw-wizard-navigation-bar[@class='horizontal small']/ul/li")
	List<WebElement> steps_indicators;
	
	private @FindBy(xpath = "//select[@formcontrolname='DropdownControl']")
	List<WebElement> dropdowns;  //dropdowns --Advertiser,Campaign Group,Campaign Country,Audience Type,From Name,Email Deliverability,Email Scheduling,Select Creative
	
	private @FindBy(xpath = "//label[@class='form-label']")
	List<WebElement> all_labels;
	
	private @FindBy(xpath = "//input[@formcontrolname='radio']")
	List<WebElement> radio_buttons;
	
	private @FindBy(xpath = "//input[@formcontrolname='radio']/..")
	List<WebElement> radiobutton_labels;
	
	private @FindBy(xpath = "//input[@formcontrolname='radio']/../input")
	List<WebElement> radiobutton;
	
	private @FindBy(xpath = "//span[@class='popupdropdown']/label")
	List<WebElement> popupdropdown_labels;
	
	private @FindBy(xpath = "//div[@class='inputfield']/input")
	List<WebElement> popup_dropdowns;  //Campaign Sector,Select Publisher,Suppression List,Location,Region,Town
	
	private @FindBy(xpath = "//div[@aria-labelledby='filterdropdown']/ul/li")
	List<WebElement> popupdropdown_options;
	
	private @FindBy(xpath = "//button[.='Cancel']")
	WebElement cancelButton_inpopupdropdown;
	
	private @FindBy(xpath = "//button[.='Select']")
	WebElement selectButton_inpopupdropdown;
	
	private @FindBy(xpath = "//label[.='Select All']")
	WebElement selectall_onpopupdropdown;
	
	private @FindBy(xpath = "//input[@placeholder='Select Campaign Sector']")
	WebElement campaignsector_dropdown;
	
	private @FindBy(xpath = "//button[@class='std-button-blue']")
	WebElement form_buttons;
	
	private @FindBy(xpath = "(//button[.=' Cancel'])[1]")
	WebElement cancelButton_onfirstStep;
	
	private @FindBy(xpath = "(//button[.=' Proceed '])[1]")
	WebElement proceedButton_onfirstStep;
	
	//2nd step
	private @FindBy(xpath = "//input[@placeholder='Max 150 Characters']")
	WebElement subject_textfield;
	
	private @FindBy(xpath = "//button[.='Creatives ']")
	WebElement creativeTemplates_onEmailbody;
	
	private @FindBy(xpath = "(//button[.=' Select '])[1]")
	WebElement selecttemplate_button;
	
	private @FindBy(xpath = "//html[@dir='ltr']/body")
	WebElement emailbody_textarea;// inside iframe
	
	private @FindBy(xpath = "//input[@id='save_Creative']")
	WebElement savecreative_checkbox;
	
	private @FindBy(xpath = "//label[@class='input-group-text']/span")
	WebElement template_upload;
	
	private @FindBy(xpath = "//input[@placeholder='Enter your Creative Name']")
	WebElement enter_creativename;
	
	private @FindBy(xpath = "//input[@placeholder='Enter email address']")
	WebElement sendtestemail_textfield;
	
	private @FindBy(xpath = "//button[.='Send ']")
	WebElement send__button;
	
	private @FindBy(xpath = "(//button[.=' Cancel'])[2]")
	WebElement cancelButton_on2ndStep;
	
	private @FindBy(xpath = "(//button[.=' Save'])[1]")
	WebElement saveButton_on2ndStep;
	
	private @FindBy(xpath = "(//button[text()=' Proceed '])[2]")
	WebElement proceedButton_on2ndStep;
	
	private @FindBy(xpath = "(//button[.=' Previous'])[1]")
	WebElement previousButton_on2ndStep;
	
	//3rd and 4th step
	
	private @FindBy(xpath = "//app-dropdown[@labelname='Email Deliverability']//select")
	WebElement emailDeliverability_dropdown;
	
	private @FindBy(xpath = "//div[@formgroupname='domain_percentage']//input")
	List<WebElement> emaildomain_inputfields;
	
	private @FindBy(xpath = "//input[@id='ageMinInput']")
	WebElement minAge_textfield;
	
	private @FindBy(xpath = "//input[@id='ageMaxInput']")
	WebElement maxAge_textfield;
	
	private @FindBy(xpath = "//input[@formcontrolname='audience_selected']")
	WebElement audiencereachOpend_inputfield;
	
	private @FindBy(xpath = "//input[@id='audienceReachInput2']")
	WebElement audiencereachOthers_inputfield;
	
	private @FindBy(xpath = "(//button[.=' Cancel'])[3]")
	WebElement cancelButton_on3rdStep;
	
	private @FindBy(xpath = "(//button[.=' Proceed '])[3]")
	WebElement proceedButton_on3rdStep;
	
	private @FindBy(xpath = "(//button[.=' Save'])[2]")
	WebElement saveButton_on3rdStep;
	
	private @FindBy(xpath = "(//button[.=' Previous'])[2]")
	WebElement previousButton_on3rdStep;
	
	private @FindBy(xpath = "(//button[.=' Cancel'])[4]")
	WebElement cancelButton_on4thStep;
	
	private @FindBy(xpath = "(//button[.=' Previous'])[3]")
	WebElement previousButton_on4thStep;
	
	private @FindBy(xpath = "//button[.=' Start Campaign ']")
	WebElement startcampaign_button;
	
	private @FindBy(xpath = "(//button[@class='input-group-text']/i)[1]")
	WebElement emailStatusdatePicker_Icon;
	
	private @FindBy(xpath = "(//button[@class='input-group-text']/i)[2]")
	WebElement startdatePicker_Icon;
	
	private @FindBy(xpath = "(//button[@class='input-group-text']/i)[3]")
	WebElement enddatePicker_Icon;
	
	private @FindBy(xpath = "//select[@title='Select month']")
	WebElement month_dropdown;
	
	private @FindBy(xpath = "//select[@title='Select year']")
	WebElement year_dropdown;
	
	private @FindBy(xpath = "//div[@class='ngb-dp-month']//div/div/div")
	List<WebElement> days_inCalender;
	
	private @FindBy(xpath = "(//label[@class='form-check-label']/input)[20]")
	WebElement advanceOption_radioButton;
	
	private @FindBy(xpath = "//input[@formcontrolname='hours']")
	WebElement startTime_inHours;
	
	private @FindBy(xpath = "//input[@formcontrolname='minutes']")
	WebElement startTime_inMinutes;
	
	private @FindBy(xpath = "//LABEL[@class='table-value-data-gray-1']")
	List<WebElement> Select_days;
	
	private @FindBy(xpath = "//button[.=' Schedule Campaign ']")
	WebElement scheduleCampaign_button;
	
	private @FindBy(xpath = "//div[@class='moving-box another-class']")
	WebElement loader;
	
	private @FindBy(xpath = "//app-input[@formcontrolname='campaign_budget']//input")
	WebElement budget_textfield;
	
	private @FindBy(xpath = "(//button[.=' Proceed'])[1]")
	WebElement proceedButton_recurringfirst;
	
	private @FindBy(xpath = "(//button[.=' Proceed'])[2]")
	WebElement proceedButton_recurringthird;

	
	//Home page Elements
	
	private @FindBy(xpath = "//table/thead/tr/th")
	List<WebElement> table_headers;

	public @FindBy(xpath = "//table/tbody/tr")
	List<WebElement> table_rows;

	private @FindBy(xpath = "//table/tbody/tr/td")
	List<WebElement> table_datas;
	
	private @FindBy(xpath = "//ngb-pagination/ul/li/a")
	List<WebElement>pagination_intable;
	
	private @FindBy(xpath = "//button/img[contains(@alt,'resetImg')]")
	WebElement reset_button;
	
	private @FindBy(xpath = "(//button/img[@alt])[2]")
	WebElement resetbuttonWithIndex;

	private @FindBy(xpath = "//button/img[contains(@alt,'icon')]")
	WebElement filter_icon;
	
	private @FindBy(xpath = "//select[@class='form-select form-select ms-2 me-2']")
	WebElement perPage_dropdown;
	
	private @FindBy(xpath = "//input[@placeholder='Search by Campaign']")
	WebElement search_textfield;
	
	public @FindBy(xpath = "//div[@class='dropdown-menu show']//li[@class='dropdown-item']//span")
	List<WebElement> editbutton_onkebabdropdown;
	
	private @FindBy(xpath = "//a[.='Next']")
	WebElement nextbutton_onpagination;
	
	private @FindBy(xpath = "//label[.='Select All']/span/input")
	WebElement selectall_checkbox;
	
	private @FindBy(xpath = "//button[text()=' Update ']")
	WebElement recurringupdate_button;
	
	
	
	//Action methods
	
	
	public void clickonSideMainMenuBar(String menuName)
	{
		try
		{
		for(WebElement mainMenu:sidebar_menu)
		{
			waitElementHelper(mainMenu);
			String getsideMenuText=mainMenu.getText();
			if(getsideMenuText.equalsIgnoreCase(menuName))
			{
				waitElementHelper(mainMenu);
				mainMenu.click();
				break;
			}
		}
		}catch(Exception e)
		{
			System.out.println("An error occurred: " +e.getMessage());
		}
	}
	
	public void clickonAddButton()
	{
		waitElementHelper(add_button);
		add_button.click();
	}
	
	public String getstepIndicator(String stepNames)
	{
		String getstepIndicator=null;
		for(WebElement stepIndicator:steps_indicators)
		{
			waitElementHelper(stepIndicator);
			getstepIndicator=stepIndicator.getText();
            if(getstepIndicator.equalsIgnoreCase(stepNames))
            {
            	break;
            }
		}
		return getstepIndicator;
		
	}
	
	public void setCampaignName(String campaignName)
	{
			waitElementHelper(campaign_textfield);
			campaign_textfield.clear();
			campaign_textfield.sendKeys(campaignName);
	}

	
	//all select dropdown in single method
	public void selectOptionInDropdown(String placeHolderName,String option) //all dropdown in single method
	{
				for(WebElement dropdown:dropdowns)
				{
					Select selectoption=new Select(dropdown);
					String getFirstOption=selectoption.getOptions().get(0).getText();
					System.out.println("First Option in dropdown :"+getFirstOption);
					
					 if(getFirstOption.equalsIgnoreCase(placeHolderName))
					 {
						 selectoption.selectByVisibleText(option);
						 break;
					 }
				}
	}
	
	public void campaignsectordropdown(String optionname)
	{
		campaignsector_dropdown.click();
		
		for( WebElement getoptionlist:popupdropdown_options)
		{
			String optionlist = getoptionlist.getText();
			if(optionlist.equalsIgnoreCase(optionname))
			{
				getoptionlist.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[.='Select']")).click();
	}
	
	// all radio button in single method
	public void setRadioButtons(String radiobuttonName)  
	{
		try
		{
			for (WebElement radiobutton : radiobutton_labels) 
			{
				String getlabelName = radiobutton.getText();
				if (getlabelName.equalsIgnoreCase(radiobuttonName)) 
				{
					waitElementHelper(radiobutton);
					radiobutton.click();
				}
			}
		}catch(Exception e)
		{
			System.out.println("Exception is : "+e.getMessage());
		}
	}
	
	
	//all popup dropdowns in single method
	
	public void SelectOptionInPopupDropdown(String popupDropdownPlaceholderName,List<String> optionNames,String placeholderForSelectAll)
	{
		for(WebElement popupDropdown:popup_dropdowns)
		{
			String getPlaceholder=popupDropdown.getAttribute("placeholder");
			System.out.println("get placeholder : "+getPlaceholder);
			
			if(getPlaceholder.equalsIgnoreCase(popupDropdownPlaceholderName))
			{
				waitElementHelper(popupDropdown);
				popupDropdown.click();
				
				waitElementHelper(selectButton_inpopupdropdown);
				int getoptionsize=popupdropdown_options.size();
				System.out.println("Option size : "+getoptionsize);
				
				for(WebElement dropdownOption:popupdropdown_options)
				{
					String getoptionText = dropdownOption.getText();
					System.out.println("Get option text :-"+getoptionText);
					System.out.println("Get place holder name ;-"+ getPlaceholder);
					if (getPlaceholder.equalsIgnoreCase(placeholderForSelectAll))
					{
						if(!selectall_checkbox.isSelected()) {
						waitElementHelper(selectall_onpopupdropdown);
						selectall_onpopupdropdown.click();
						break;
						}
					} 
					else
					{
					  for(String optionName:optionNames)
					  {
						if (getoptionText.equalsIgnoreCase(optionName))
						{
							waitElementHelper(dropdownOption);
							dropdownOption.click();
							break;
						}
					  }
					}
				}
				waitElementHelper(selectButton_inpopupdropdown);
				selectButton_inpopupdropdown.click();
				break;
			}
		}	
	}
	
	
	public void clickOnCancelButtonOnFirststep()
	{
		waitElementHelper(cancelButton_onfirstStep);
		cancelButton_onfirstStep.click();
	}

	public void clickOnCancelButtonOnSecondstep()
	{
		waitElementHelper(cancelButton_on2ndStep);
		cancelButton_on2ndStep.click();
	}
	
	public void clickOnCancelButtonOnThirdstep()
	{
		waitElementHelper(cancelButton_on3rdStep);
		cancelButton_on3rdStep.click();
	}
	
	public void clickOnCancelButtonOnForthstep()
	{
		waitElementHelper(cancelButton_on4thStep);
		cancelButton_on4thStep.click();
	}


	public void clickOnProceedButtonOnFirststep() throws AWTException
	{
		waitElementHelper(proceedButton_onfirstStep);
//		try {
//			proceedButton_onfirstStep.click();
//		} catch (org.openqa.selenium.ElementClickInterceptedException e) {
//			proceedButton_onfirstStep.click();
//		}
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.delay(3000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.delay(3000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		proceedButton_onfirstStep.click();
	}

	public void clickOnProceedButtonSecondStep() throws InterruptedException, AWTException
	{
		//scrollUntilElementVisible(proceedButton_on2ndStep);
//		waitElementHelper(proceedButton_on2ndStep);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.delay(3000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.delay(3000);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		//js.executeScript("arguments[0].scrollIntoView(true);",proceedButton_on2ndStep );
		proceedButton_on2ndStep.click();
//		try
//		{
//		proceedButton_on2ndStep.click();
//		}catch(ElementClickInterceptedException e)
//		{
//			Thread.sleep(2000);
//			proceedButton_on2ndStep.click();
//		}
	}
	
	public void clickOnProceedButtonOnThirdstep()
	{
		scrollUntilElementVisible(proceedButton_on3rdStep);
		scrollBottomofPage();
		waitElementHelper(proceedButton_on3rdStep);
		proceedButton_on3rdStep.click();
	}
	
	public void clickOnPreviousButtonOnSecondstep()
	{
		waitElementHelper(previousButton_on2ndStep);
		previousButton_on2ndStep.click();
	}
	
	public void clickOnPreviousButtonOnThirdstep()
	{
		waitElementHelper(previousButton_on3rdStep);
		previousButton_on3rdStep.click();
	}
	
	public void clickOnPreviousButtonOnForthstep()
	{
		waitElementHelper(previousButton_on4thStep);
		previousButton_on4thStep.click();
	}
	
	public void clickOnSaveButtonOnSecondstep()
	{
		waitElementHelper(saveButton_on2ndStep);
		saveButton_on2ndStep.click();
	}
	
	public void clickOnSaveButtonOnThirdstep()
	{
		waitElementHelper(saveButton_on3rdStep);
		saveButton_on3rdStep.click();
	}
	public void setEmailDeliverabilityDropdownRandomly() throws InterruptedException
	{
		Select selectdeliveribility = new Select(emailDeliverability_dropdown);
		List<WebElement> options = selectdeliveribility.getOptions();

		int countOptions = options.size();
		int randomIndex = (int) (Math.random() * (countOptions - 1)) + 1;
   
		selectdeliveribility.selectByIndex(randomIndex);

	}
	
	public void clickOnStartCampaignButton()
	{
		scrollBottomofPage();
		waitElementHelper(startcampaign_button);
		startcampaign_button.click();
	}
	
	public void setSubject(String subject)
	{
		waitElementHelper(subject_textfield);
		subject_textfield.clear();
		subject_textfield.sendKeys(subject);
	}
	
	public void setEmailBodyWithText(String input)
	{
		driver.switchTo().frame(0);
		waitElementHelper(emailbody_textarea);
		emailbody_textarea.clear();
		emailbody_textarea.sendKeys(input);
		driver.switchTo().defaultContent();
	}
	
	public void setEmailBodyWithCreativeTemplate()
	{
		waitElementHelper(creativeTemplates_onEmailbody);
		creativeTemplates_onEmailbody.click();
		waitElementHelper(selecttemplate_button);
		selecttemplate_button.click();
	}
	
	public void clickOnselectButtonOnCreativePopup()
	{
		waitElementHelper(selecttemplate_button);
		selecttemplate_button.click();
	}
	
	public void checkSaveCreativeCheckbox()
	{
		waitElementHelper(savecreative_checkbox);
		savecreative_checkbox.click();
	}
	
	public void setCreativeName(String creativeName)
	{
		waitElementHelper(enter_creativename);
		enter_creativename.clear();
		enter_creativename.sendKeys(creativeName);
	}
	
	public void sendTestEmail(String email)
	{
		waitElementHelper(sendtestemail_textfield);
		sendtestemail_textfield.clear();
		sendtestemail_textfield.sendKeys(email);
		waitElementHelper(send__button);
		send__button.click();
	}
	
	public void setAgeGroup(String minAge,String maxAge)
	{
		waitElementHelper(minAge_textfield);
		minAge_textfield.clear();
		minAge_textfield.sendKeys(minAge);
		
		waitElementHelper(maxAge_textfield);
		maxAge_textfield.clear();
		maxAge_textfield.sendKeys(maxAge);
	}
	
	public void setAudienceReachopend(String numberofOpend) throws InterruptedException
	{
		waitElementHelper(audiencereachOpend_inputfield);
		audiencereachOpend_inputfield.clear();
		audiencereachOpend_inputfield.sendKeys(numberofOpend);
	}
	
	public void setAudienceReachothers(String numberofOthers)
	{
		waitElementHelper(audiencereachOthers_inputfield);
		audiencereachOthers_inputfield.clear();
		audiencereachOthers_inputfield.sendKeys(numberofOthers);
	}
	
	public void setAdvanceOptionDate(String day, String month, String year)
	{
		waitElementHelper(emailStatusdatePicker_Icon);
		emailStatusdatePicker_Icon.click();
		waitElementHelper(month_dropdown);
		Select selectMonth = new Select(month_dropdown);
		selectMonth.selectByVisibleText(month);
		
		Select selectYear = new Select(year_dropdown);
		waitElementHelper(year_dropdown);
		selectYear.selectByVisibleText(year);

		for (WebElement dayincalender : days_inCalender) 
		{
			if (dayincalender.getText().equalsIgnoreCase(day)) 
			{
				waitElementHelper(dayincalender);
				dayincalender.click();
				break;
			}
		}
	}	
	
	public void setStartDate(String day, String month, String year) throws InterruptedException 
	{
		String advanceRadioButtonColor = advanceOption_radioButton.getCssValue("border");

		if(advanceRadioButtonColor.equalsIgnoreCase("4px solid rgb(128, 195, 65)")) 
		{
			waitForLoaderToClose(loader);
			waitElementHelper(startdatePicker_Icon);
			startdatePicker_Icon.click();
		} else{
			waitForLoaderToClose(loader);
			waitElementHelper(emailStatusdatePicker_Icon);
			emailStatusdatePicker_Icon.click();
		}
		
		waitElementHelper(month_dropdown);
		Select selectMonth = new Select(month_dropdown);
		selectMonth.selectByVisibleText(month);
		
		waitElementHelper(year_dropdown);
		Select selectYear = new Select(year_dropdown);
		selectYear.selectByVisibleText(year);

		for (WebElement dayincalender : days_inCalender) 
		{
			if (dayincalender.getText().equalsIgnoreCase(day)) 
			{
				waitElementHelper(dayincalender);
				dayincalender.click();
				break;
			}
		}
	}
	
	public void setEndDate(String day, String month, String year) throws InterruptedException 
	{
		String advanceRadioButtonColor = advanceOption_radioButton.getCssValue("border");

		if (advanceRadioButtonColor.equalsIgnoreCase("4px solid rgb(128, 195, 65)")) 
		{
			waitForLoaderToClose(loader);
			waitElementHelper(enddatePicker_Icon);
			enddatePicker_Icon.click();
		}else{
			waitForLoaderToClose(loader);
			waitElementHelper(startdatePicker_Icon);
			startdatePicker_Icon.click();
		}

		waitElementHelper(month_dropdown);
		Select selectMonth = new Select(month_dropdown);
		selectMonth.selectByVisibleText(month);

		waitElementHelper(year_dropdown);
		Select selectYear = new Select(year_dropdown);
		selectYear.selectByVisibleText(year);

		for (WebElement dayincalender : days_inCalender) {
			String daysColor = dayincalender.getCssValue("color");
			System.out.println("get day color : " + daysColor);
			System.out.println("dayincalender : "+dayincalender.getText());
			if (!daysColor.equalsIgnoreCase("rgba(206, 206, 206, 1)") && dayincalender.getText().equalsIgnoreCase(day)) {
					waitElementHelper(dayincalender);
					Thread.sleep(2000);
					dayincalender.click();
					System.out.println("inside the calender");
					break;
			}
		}
	}	
	
	public void setStartDateAsCurrentDateAutomaticaly() throws InterruptedException {
		ZoneId londonZone = ZoneId.of("Europe/London");
		LocalDate currentDate = LocalDate.now(londonZone);

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedCurrentDate = currentDate.format(dateFormatter);

		String[] getcurrentdate = formattedCurrentDate.split("-");
		String getCurrentyear = getcurrentdate[0];
		String getCurrentday = getcurrentdate[2];
		String getCurrentMonth = currentDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		System.out.println("Current Month : " + getCurrentMonth);

		String advanceRadioButtonColor = advanceOption_radioButton.getCssValue("border");

		if (advanceRadioButtonColor.equalsIgnoreCase("4px solid rgb(128, 195, 65)")) {
			waitForLoaderToClose(loader);
			waitElementHelper(startdatePicker_Icon);
			startdatePicker_Icon.click();
		} else {
			waitForLoaderToClose(loader);
			waitElementHelper(emailStatusdatePicker_Icon);
			emailStatusdatePicker_Icon.click();
		}

		waitElementHelper(month_dropdown);
		Select selectMonth = new Select(month_dropdown);
		selectMonth.selectByVisibleText(getCurrentMonth);

		waitElementHelper(year_dropdown);
		Select selectYear = new Select(year_dropdown);
		selectYear.selectByVisibleText(getCurrentyear);

		for (WebElement dayincalender : days_inCalender) {
			if (dayincalender.getText().equalsIgnoreCase(getCurrentday)) {
				waitElementHelper(dayincalender);
				dayincalender.click();
				break;
			}
		}
	}
	
	public void setEndDateAsGraterthenStartDateAutomaticaly(int days) throws InterruptedException 
	{
		 ZoneId londonZone = ZoneId.of("Europe/London");
         LocalDate currentDate = LocalDate.now(londonZone);
         LocalDate endDate = currentDate.plusDays(days);
         DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         String formattedCurrentDate = currentDate.format(dateFormatter);
         String formattedEndDate = endDate.format(dateFormatter);

		String[] getEnddate = formattedEndDate.split("-");
		String getEndyear = getEnddate[0];
		String getEndday = getEnddate[2];
		int dayAsNumber = Integer.parseInt(getEndday);//Convert the day to an integer to remove leading zero to till 9
	    String endDay=Integer.toString(dayAsNumber);

		String getendMonth = endDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		System.out.println("End Month : " + getendMonth);

		String advanceRadioButtonColor = advanceOption_radioButton.getCssValue("border");

		if (advanceRadioButtonColor.equalsIgnoreCase("4px solid rgb(128, 195, 65)")) {
			waitForLoaderToClose(loader);
			waitElementHelper(enddatePicker_Icon);
			enddatePicker_Icon.click();
		} else {
			waitForLoaderToClose(loader);
			waitElementHelper(startdatePicker_Icon);
			startdatePicker_Icon.click();
		}

		waitElementHelper(month_dropdown);
		Select selectMonth = new Select(month_dropdown);
		selectMonth.selectByVisibleText(getendMonth);

		waitElementHelper(year_dropdown);
		Select selectYear = new Select(year_dropdown);
		selectYear.selectByVisibleText(getEndyear);
		
		for (WebElement dayincalender : days_inCalender) {
			String daysColor = dayincalender.getCssValue("color");
			System.out.println("get day color : " + daysColor);
			System.out.println("dayincalender : "+dayincalender.getText());
			if (!daysColor.equalsIgnoreCase("rgba(206, 206, 206, 1)") && dayincalender.getText().equalsIgnoreCase(endDay)) {
					waitElementHelper(dayincalender);
//					Thread.sleep(2000);
					dayincalender.click();
					System.out.println("inside the calender");
					break;
			}
		}
	}

	
	public void setStartTimeAsFutureTime()
	{
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        LocalTime newLondonTime = londonTime.toLocalTime().plusMinutes(35);
        
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = newLondonTime.format(timeFormatter);

        String[] timeParts = formattedTime.split(":");
        String hour = timeParts[0];
        String minute = timeParts[1];	
		
		waitElementHelper(startTime_inHours);
		startTime_inHours.clear();
		startTime_inHours.sendKeys(hour);
		
		waitElementHelper(startTime_inMinutes);
		startTime_inMinutes.clear();
		startTime_inMinutes.sendKeys(minute);
	}
	
	public void selectSpecificScheduleDays(List<String> days)
	{
		for(WebElement selectDay:Select_days)
		{
			String getday=selectDay.getText();
			System.out.println("Schedule days : "+getday);
			for(String day:days)
			{
				if(getday.equalsIgnoreCase(day))
				{
					waitElementHelper(selectDay);
					selectDay.click();
				}
			}
		}
	}
	
	public void selectAllScheduleDays() throws AWTException 
	{
		for (WebElement selectDay : Select_days) 
		{
			String getday = selectDay.getText();
			System.out.println("Schedule days : " + getday);

			waitElementHelper(selectDay);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			Robot rb=new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.delay(3000);
			rb.keyRelease(KeyEvent.VK_DOWN);
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.delay(3000);
			rb.keyRelease(KeyEvent.VK_DOWN);
			
			selectDay.click();
		}
	}
	
	public void clickOnScheduleCampaignButton()
	{
		waitElementHelper(scheduleCampaign_button);
		scheduleCampaign_button.click();
	}
	
	public void setBudgetPerday(String budget)
	{
		if(budget_textfield.isDisplayed())
		waitElementHelper(budget_textfield);
		budget_textfield.clear();
		budget_textfield.sendKeys(budget);
	}
	
	public void clickOnProceedButtonOnRecurring()
	{
		waitElementHelper(proceedButton_recurringfirst);
		proceedButton_recurringfirst.click();
	}
	
	public void clickOnProceedButtonOnRecurringThirdStep()
	{
		waitElementHelper(proceedButton_recurringthird);
		proceedButton_recurringthird.click();
	}
	
	public void setEmailDomains(int totalValue) throws InterruptedException
	{
		int numberOfFields = emaildomain_inputfields.size();
		int valuePerField = totalValue / numberOfFields; // Distribute equally
		int remaining = totalValue % numberOfFields; // Handle any remainder
		
		System.out.println("valuePerField : "+valuePerField);
		System.out.println("remainder : "+remaining);

		for (WebElement domainfield : emaildomain_inputfields)
		{
			try {
				domainfield.clear();
				domainfield.sendKeys(String.valueOf(valuePerField));
			}catch(org.openqa.selenium.StaleElementReferenceException e) {
				Thread.sleep(2000);
				domainfield.clear();
				domainfield.sendKeys(String.valueOf(valuePerField));
			}
			
			
		}

	}
	
	public void settime()
	{
	 WebElement currenttimehour = driver.findElement(By.xpath("//input[@formcontrolname='hours']"));
	 currenttimehour.sendKeys("20");
	 
	 WebElement currenttimeminutes = driver.findElement(By.xpath("//input[@formcontrolname='minutes']"));
	 currenttimeminutes.sendKeys("00");
	}
	
	
	
	/*--------------------------------------------home page implementation---------------------------------------------*/
	
	public void verifyDynomicTableWithPagination(String columnName,String tableData) throws InterruptedException
	{
		boolean flag = false;
		int columnIndex=0;
		Thread.sleep(1000);
		for(int h=0;h<table_headers.size();h++)
		{
			WebElement tableHeader=table_headers.get(h);
			String getHeadertext=tableHeader.getText();
			System.out.println("get table header : "+getHeadertext);
			if(getHeadertext.equalsIgnoreCase(columnName))
			{
			   columnIndex=h+1;
			   break;
			}
		}
		
		for(int p=3;p<=pagination_intable.size()-2;p++)
		{
			System.out.println("get pagination size : "+pagination_intable.size());
			WebElement pageNumber = driver.findElement(By.xpath("//ngb-pagination/ul/li["+p+"]/a"));
			String getPaginationText=pageNumber.getText();
			System.out.println("page number : "+getPaginationText);
			System.out.println("page index : "+p);
			
			if(getPaginationText.equalsIgnoreCase("...")) {
				scrollBottomofPage();
				waitElementHelper(nextbutton_onpagination);
				nextbutton_onpagination.click();
			}else if(p>3){
				scrollBottomofPage();
				Thread.sleep(200);
				waitElementHelper(pageNumber);
				pageNumber.click();
			} 
			
			for(int r=1;r<=table_rows.size();r++)
			{
				WebElement tableColumnData=driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td["+columnIndex+"]"));
				System.out.println("get table data : "+tableColumnData.getText());
				if(tableColumnData.getText().equalsIgnoreCase(tableData))
				{
					flag=true;
				}
			}
			Assert.assertTrue(flag);
		}
	}
	
	public void selectPerpage(String perPage)
	{
		waitElementHelper(perPage_dropdown);
		Select selectPerpage=new Select(perPage_dropdown);
		selectPerpage.selectByVisibleText(perPage);
	}
	
	public void clickOnResetButton()
	{
			waitElementHelper(resetbuttonWithIndex);
			resetbuttonWithIndex.click();
	}
	
	public void clickOnFilterIcon()
	{
		waitElementHelper(filter_icon);
		if(filter_icon.isDisplayed())
		{
		  filter_icon.click();
		}
	}
	
	public void setsearchField()
	{
		waitElementHelper(search_textfield);
		if(search_textfield.isDisplayed())
		{
			search_textfield.click();
		}
	}
	
	public void clickOnupdateButtonOnRecurring()
	{
		
		try {
			recurringupdate_button.click();
		}catch(org.openqa.selenium.ElementClickInterceptedException e) {
			scrollBottomofPage();
			waitElementHelper(recurringupdate_button);
			recurringupdate_button.click();	
		}
		
	}

	// Handles kebab menu dropdown actions for user specified table data across different home pages
	public void handleKebabMenuDropdownForUserSpecifiedTableDataDynamically(String tableData, String kebabOption) throws InterruptedException 
	{
	    int rowIndex = 0;
	    boolean found = false;
	    
	    // Iterate through pagination
	    for (int p = 3; p < pagination_intable.size()-1 ; p++)
	    {
	        System.out.println("Pagination size: " + pagination_intable.size());
	        WebElement pageNumber = driver.findElement(By.xpath("//ngb-pagination/ul/li[" + p + "]/a"));
	        System.out.println("Page number: " + pageNumber.getText());

	        if (p > 3) 
	        {
	            scrollBottomofPage();
	            waitElementHelper(pageNumber);
	            try {
	                pageNumber.click();
	            } catch (org.openqa.selenium.ElementClickInterceptedException e) {
//	                scrollBottomofPage();
//	                Thread.sleep(500);
	                pageNumber.click();
	            }
	        }

	        // Iterate through table rows
	        for (int r = 1; r <= table_rows.size(); r++) {
	            List<WebElement> dynamicTableData = driver.findElements(By.xpath("//table/tbody/tr[" + r + "]/td"));
	            for (WebElement tabledata : dynamicTableData) 
	            {
	                String gettableData = tabledata.getText();
	                System.out.println("Table data: " + gettableData);

	                if (gettableData.equalsIgnoreCase(tableData))
	                {
	                    rowIndex = r;
	                    SignInPage signin = new SignInPage(driver);
	                    String pageHeading = signin.getPageHeading();
	                    WebElement kebabMenuIcon = null;

	                    // Determine which column the kebab menu is in based on the page heading
	                    if (pageHeading.equalsIgnoreCase("Campaigns")) {
	                        kebabMenuIcon = driver.findElement(By.xpath("//table/tbody/tr[" + rowIndex + "]/td[14]//following::img[@class='options']"));
	                    } else if (pageHeading.equalsIgnoreCase("Recurring")) {
	                        kebabMenuIcon = driver.findElement(By.xpath("//table/tbody/tr[" + rowIndex + "]/td[13]//following::img[@class='options']"));
	                    } else if (pageHeading.equalsIgnoreCase("Manage Advertisers") || pageHeading.equalsIgnoreCase("Manage Publishers")) {
	                        System.out.println("test4----");
	                    	kebabMenuIcon = driver.findElement(By.xpath("//table/tbody/tr[" + rowIndex + "]/td[7]//following::img[@class='options']"));
	                    } else {
	                        kebabMenuIcon = driver.findElement(By.xpath("//table/tbody/tr[" + rowIndex + "]/td[9]//following::img[@class='options']"));
	                    }

	                    if (kebabMenuIcon != null) 
	                    {
	                        kebabMenuIcon.click();
	                        Thread.sleep(500);
	                        
	                        // Iterate through kebab menu options
	                        for (WebElement kebabMenuOption : editbutton_onkebabdropdown) 
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
	        if (found) break;
	    }
	}

	//nagaraj code
	@FindBy(xpath="//input[@placeholder='Select Campaign Sector']") WebElement campaignSector;
    @FindBy(xpath="//span[text()='Automotive']") WebElement option;
    @FindBy(xpath="//button[text()='Select']") WebElement selectBtn;
    public void clickonCampagnSector() 
    {
        campaignSector.click();
        option.click();
        selectBtn.click();
        
     
    }
    @FindBy(xpath="//input[@placeholder='Select Publisher']") WebElement selectPublisher;
    @FindBy(xpath="//label[text()='Select All']/span") WebElement pOption;
    @FindBy(xpath="(//label[text()=' Free '])[2]") WebElement publisherCostType;
    @FindBy(xpath="(//label[text()=' Free '])[1]") WebElement AdvertiserCostType;
    public void clickonpublisher()
    {   
       
        selectPublisher.click();
        pOption.click();
        selectBtn.click();
       
        
    }
	
	
}
	

