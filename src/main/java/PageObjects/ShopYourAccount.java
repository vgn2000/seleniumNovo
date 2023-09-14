package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopYourAccount extends BasePage {

	public ShopYourAccount() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebDriver driver;
	
	//Locator

	By heading = By.cssSelector("h1");
	By signOut = By.linkText("Sign out");

	public WebElement getHeading() throws IOException {
		this.driver = getDriver();
		return driver.findElement(heading);
	}

	public WebElement getSignOutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(signOut);
	}
	
	


public void clickSignOutBtn() throws IOException {
	// log.info("Clicking 'Click Here' link");
	waitForVisibilityOf(signOut, 5);
	click(signOut);

}

}
