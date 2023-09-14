package PageObjects;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class WelcomePage extends BasePage{
	
	
	public WelcomePage() throws IOException {
		super();
	}
	
	private String pageUrl = "http://the-internet.herokuapp.com/";

	private By formAuthenticationLinkLocator = By.linkText("Form Authentication");
	private By checkboxesLinkLocator = By.linkText("Checkboxes");
	private By dropdownLinkLocator = By.linkText("Dropdown");
	private By javaScriptAlertsLinkLocator = By.linkText("JavaScript Alerts");
	private By multipleWindowsLinkLocator = By.linkText("Multiple Windows");
	private By editorLinkLocator = By.linkText("WYSIWYG Editor");

	

	/** Open WelcomePage with it's url 
	 * @throws IOException */
	public void openPage() throws IOException {
	
		openUrl(pageUrl);
		
	}



	/** Open LoginPage by clicking on Form Authentication Link */
	public LoginPage clickFormAuthenticationLink() throws IOException{
	//	log.info("Clicking Form Authentication link on Welcome Page");
		click(formAuthenticationLinkLocator);
		return new LoginPage();
	}

	/** Open CheckboxesPage by clicking on Checkboxes Link */
	public CheckBoxesPage clickCheckboxesLink() throws IOException{
	//	log.info("Clicking Checkboxes link on Welcome Page");
		click(checkboxesLinkLocator);
		return new CheckBoxesPage();
	}

	public DropdownPage clickDropdownLink() throws IOException{
			click(dropdownLinkLocator);
		return new DropdownPage();
	}

	public JavaScriptAlertsPage clickJavaScriptAlertsLink() throws IOException {
		
		click(javaScriptAlertsLinkLocator);
		return new JavaScriptAlertsPage();
	}

	public WindowsPage clickMultipleWindowsLink() throws IOException {
	//	log.info("Clicking Multiple Windows link on Welcome Page");
		click(multipleWindowsLinkLocator);
		return new WindowsPage();
	}

	public EditorPage clickWYSIWYGEditorLink() throws IOException {
	//	log.info("Clicking WYSIWYG Editor link on Welcome Page");
		click(editorLinkLocator);
		return new EditorPage();
	}
	
}