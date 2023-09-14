package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends BasePage{
	
public Homepage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

     WebDriver driver;
 
    
    public String pageUrl ="https://automationtesting.co.uk/";

	
	By toggle = By.cssSelector(".toggle");
	By homeLink = By.linkText("HOMEPAGE");
	By accordionLink = By.linkText("ACCORDION");
	By browserTabLink = By.linkText("BROWSER TABS");
	By buttonsLink = By.linkText("BUTTONS");
	By calcLink = By.linkText("CALCULATOR (JS)");
	By contactUsLink = By.cssSelector("[href='contactForm\\.html']");
	By datePickerLink = By.linkText("DATE PICKER");
	By dropdownLink = By.cssSelector("[href='dropdown\\.html']");
	By fileUpload = By.linkText("FILE UPLOAD");
	By hiddenElementsLink = By.linkText("HIDDEN ELEMENTS");
	By iFrameLink = By.linkText("IFRAME");
	By loaderLink = By.linkText("LOADER");
	By loginPortalLink = By.linkText("LOGIN PORTAL TEST");
	By mouseLink = By.linkText("MOUSE MOVEMENT");
	By popupLink = By.linkText("POP UPS & ALERTS");
	By predictiveLink = By.linkText("PREDICTIVE SEARCH");
	By tablesLink = By.linkText("TABLES");
	By testStoreLinkShirt = By.cssSelector("[alt='Hummingbird printed t-shirt']");
	By testStoreLinkPage = By.cssSelector("li:nth-of-type(20) > a");
	By aboutMeLink = By.linkText("ABOUT ME");
	By cookie = By.cssSelector(".close-cookie-warning > span");
	
	

	
	public WebElement getToggle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(toggle);
	}
	
	public WebElement getHomepageLink() throws IOException {
		
		this.driver = getDriver();
		return driver.findElement(homeLink);
	}
	
	public WebElement getAccordionLink() throws IOException {
		this.driver = getDriver();
		
		return driver.findElement(accordionLink);
		
	}

	public WebElement getBrowserTabLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(browserTabLink);
	}

	public WebElement getButtonLink() throws IOException {
		
		this.driver = getDriver();
		return driver.findElement(buttonsLink);
	}
	
	public WebElement getCalcLink() throws IOException {
		this.driver = getDriver();
		
		return driver.findElement(calcLink);
	}
	
	public WebElement getContactUsLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(contactUsLink);
	}
	
	public WebElement getDatePickerLink() throws IOException {
		this.driver = getDriver();
		
		return driver.findElement(datePickerLink);
		
	}
	
	public WebElement getDropdownLink() throws IOException {
		this.driver = getDriver();
		
		
		return driver.findElement(dropdownLink);
	}
	
	
	public WebElement getFileUpload() throws IOException {
		this.driver = getDriver();
		
		return driver.findElement(fileUpload);
	}
	
	
	public WebElement getHiddenElementsLink() throws IOException {
		this.driver = getDriver();
		
		return driver.findElement(accordionLink);
		
	}
	

	public WebElement getIframeLink() throws IOException {
		this.driver = getDriver();
		
		return driver.findElement(iFrameLink);
	}
	
	
	public WebElement getLoaderLink() throws IOException {
		this.driver = getDriver();
		
		return driver.findElement(loaderLink);
	}
	
	
	public WebElement getLoginPortalLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loginPortalLink);
	}
	
	public WebElement getMouseLink() throws IOException {
		this.driver = getDriver();
		
		
		return driver.findElement(mouseLink);	
	}
	
	public WebElement getPopupLink() throws IOException {
		this.driver = getDriver();
		
		return driver.findElement(popupLink);
	}
	
	public WebElement getPredictiveLink() throws IOException {
		this.driver = getDriver();
	   return driver.findElement(predictiveLink);	
	}
	
	
	public WebElement getTablesLink() throws IOException {
		this.driver = getDriver();
	
		return driver.findElement(tablesLink);
		
	}
	
	public WebElement getTestStoreLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(testStoreLinkShirt);
	}
		
	public WebElement getAboutMeLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(aboutMeLink);
	}

  public WebElement getCookie() throws IOException {
	  this.driver = getDriver();
		return driver.findElement(cookie);
		
	}
  
  

	/** Open WelcomePage with it's url 
	 * @throws IOException */
	public void openPage() throws IOException {
		openPageUrl(pageUrl);
		
	}
  
  
  /** Click 'Click Here' link to open new window 
 * @throws IOException */
	public void openTogle() throws IOException {
	//log.info("Clicking 'Click Here' link");
	//	waitForVisibilityOf(toggle, 5);
	//	find(toggle).click();	
		click(toggle);
	}
	
	
	public void openDropDownLink() throws IOException {
		waitForVisibilityOf(dropdownLink, 5);
		find(dropdownLink).click();	
		click(dropdownLink);
	}
	
	/** Click 'Click Here' link to open new window 
	 * @throws IOException */
	public void clickStoreLinkTshirt() throws IOException {
	//log.info("Clicking 'Click Here' link");
		waitForVisibilityOf(testStoreLinkShirt, 5);
		click(testStoreLinkShirt);
	}
	
	public void contactFormLink() throws IOException {
		waitForVisibilityOf(contactUsLink, 5);
		find(contactUsLink).click();	
		click(contactUsLink);
	}
	
	
	public void clickStoreLinkStorePageLogin() throws IOException {
		//log.info("Clicking 'Click Here' link");
			waitForVisibilityOf(testStoreLinkPage, 5);
			click(testStoreLinkPage);
		}
	
	public WebElement getTestStoreLinkPage() throws IOException {
		this.driver = getDriver();
		return driver.findElement(testStoreLinkPage);
	}
	
	
	
	/** Click on element with given locator when its Enable 
	 * @throws IOException */
	
	  
	
	public void clickStoreLinkAble() throws IOException {
		waitForVisibilityOf(testStoreLinkPage, 5);
		
		clickAble(testStoreLinkPage);
		}
	
	

	
}



