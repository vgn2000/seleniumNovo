package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactFormPage extends BasePage {

	public ContactFormPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	WebDriver driver;

	// locator
	// locator
	By firstNameField = By.cssSelector("input[name='first_name']");
	By lastNameField = By.cssSelector("form#contact_form > input[name='last_name']");
	By emailField = By.cssSelector("form#contact_form > input[name='email']");
	By messageField = By.cssSelector("form#contact_form > textarea[name='message']");
	By resetBtn = By.cssSelector("[type='reset']");
	By submitBtn = By.cssSelector("[type='submit']");
	By textAreaPage = By.cssSelector("#content");

	// Methods

	/**
	 * Type given text into element with given locator
	 * 
	 * @throws IOException
	 */
	public void typeFirstName(String text) throws IOException {
		waitForVisibilityOf(firstNameField, 5);
		find(firstNameField).sendKeys(text);
	}

	/**
	 * Type given text into element with given locator
	 * 
	 * @throws IOException
	 */
	public void typeLastName(String text) throws IOException {
		waitForVisibilityOf(lastNameField, 5);
		find(lastNameField).sendKeys(text);
	}

	/**
	 * Type given text into element with given locator
	 * 
	 * @throws IOException
	 */
	public void typeEmail(String text) throws IOException {
		waitForVisibilityOf(emailField, 5);
		find(emailField).sendKeys(text);
	}

	/**
	 * Type given text into element with given locator
	 * 
	 * @throws IOException
	 */
	public void typeMessage(String text) throws IOException {
		waitForVisibilityOf(messageField, 5);
		find(messageField).sendKeys(text);
	}

	public void clickResetBtn() throws IOException {
		// log.info("Clicking 'Click Here' link");
		waitForVisibilityOf(resetBtn, 5);
		click(resetBtn);

	}

	public void clickSubmitBtn() throws IOException {
		// log.info("Clicking 'Click Here' link");
		waitForVisibilityOf(submitBtn, 5);
		click(submitBtn);

	}
	
	/** Get text from TinyMCE WYSIWYG Editor */
	//public String getEditorText() {
	//	switchToFrame(frame);
	//	String text = find(editorLocator).getText();
	//	log.info("Text from TinyMCE WYSIWYG Editor: " + text);
	//	return text;
	//}

}

