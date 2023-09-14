package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;



public class SecureAreaPage extends BasePage {

	public SecureAreaPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	private String pageUrl = "http://the-internet.herokuapp.com/secure";

	private By logOutButton = By.xpath("//a[@class='button secondary radius']");
	
	private By message = By.id("flash-messages");

	
	/** Get URL variable from PageObject */
	public String getPageUrl() {
		return pageUrl;
	}

	/** Verification if logOutButton is visible on the page 
	 * @throws IOException */
	public boolean isLogOutButtonVisible() throws IOException {
		return find(logOutButton).isDisplayed();
	}

	/** Return text from success message 
	 * @throws IOException */
	public String getSuccessMessageText() throws IOException {
		return find(message).getText();
	}
}
