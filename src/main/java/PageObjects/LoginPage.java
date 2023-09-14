package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;



public class LoginPage extends BasePage {

	private By usernameLocator = By.id("username");
	private By passwordLocator = By.name("password");
	private By logInButtonLocator = By.tagName("button");
	private By errorMessageLocator = By.id("flash");

	

	public LoginPage() throws IOException {
		super();
	}

	/** Execute log in 
	 * @throws IOException */
	public SecureAreaPage logIn(String username, String password) throws IOException {
		//log.info("Executing LogIn with username [" + username + "] and password [" + password + "]");
		type(username, usernameLocator);
		type(password, passwordLocator);
		click(logInButtonLocator);
		return new SecureAreaPage();
	}

	public void negativeLogIn(String username, String password) throws IOException {
		//log.info("Executing Negative LogIn with username [" + username + "] and password [" + password + "]");
		type(username, usernameLocator);
		type(password, passwordLocator);
		click(logInButtonLocator);
	}

	/** Wait for error message to be visible on the page 
	 * @throws IOException */
	public void waitForErrorMessage() throws IOException {
		waitForVisibilityOf(errorMessageLocator, 5);
	}

	public String getErrorMessageText() throws IOException {
		return find(errorMessageLocator).getText();
	}

}
