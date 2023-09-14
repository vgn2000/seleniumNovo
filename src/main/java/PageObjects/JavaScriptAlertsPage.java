package PageObjects;

import java.io.IOException;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class JavaScriptAlertsPage extends BasePage{
	
	


	public JavaScriptAlertsPage() throws IOException {
		super();
	}

	private By clickForJSAlertButtonLocator = By.xpath("//button[text()='Click for JS Alert']");
	private By clickForJSConfirmButtonLocator = By.xpath("//button[text()='Click for JS Confirm']");
	private By clickForJSPromptButtonLocator = By.xpath("//button[text()='Click for JS Prompt']");
	private By resultTextLocator = By.id("result");

	
	

	/** Clicking on 'Click for JS Alert' button to open alert 
	 * @throws IOException */
	public void openJSAlert() throws IOException {
	//	log.info("Clicking on 'Click for JS Alert' button to open alert");
		click(clickForJSAlertButtonLocator);

	}

	/** Clicking on 'Click for JS Confirm' button to open alert 
	 * @throws IOException */
	public void openJSConfirm() throws IOException {
		//log.info("Clicking on 'Click for JS Confirm' button to open alert");
		click(clickForJSConfirmButtonLocator);
	}

	/** Clicking on 'Click for JS Prompt' button to open alert 
	 * @throws IOException */
	public void openJSPrompt() throws IOException {
	//	log.info("Clicking on 'Click for JS Prompt' button to open alert");
		click(clickForJSPromptButtonLocator);
	}

	/** Switch to alert and get it's message 
	 * @throws IOException */
	public String getAlertText() throws IOException {
		Alert alert = switchToAlert();
		String alertText = alert.getText();
		
		return alertText;
	}

	/** Switch to alert and press OK 
	 * @throws IOException */
	public void acceptAlert() throws IOException {
		
		Alert alert = switchToAlert();
		alert.accept();
	}

	/** Switch to alert and press Cancel 
	 * @throws IOException */
	public void dismissAlert() throws IOException {
		
		Alert alert = switchToAlert();
		alert.dismiss();
	}

	/** Type text into alert and press OK 
	 * @throws IOException */
	public void typeTextIntoAlert(String text) throws IOException {
		Alert alert = switchToAlert();
		alert.sendKeys(text);
		alert.accept();
	}

	/** Get result text 
	 * @throws IOException */
	public String getResultText() throws IOException {
		String result = find(resultTextLocator).getText();
	
		return result;
	}

}
