package PageObjects;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WindowsPage extends BasePage {
	
	


	public WindowsPage() throws IOException {
		super();
	}
	private By clickHereLinkLocator = By.linkText("Click Here");

	

	/** Click 'Click Here' link to open new window 
	 * @throws IOException */
	public void openNewWindow() throws IOException {
	//	log.info("Clicking 'Click Here' link");
		click(clickHereLinkLocator);
	}

	/** Find page with title "New Window" and switch to it 
	 * @throws IOException */
	public NewWindowPage switchToNewWindowPage() throws IOException {
	//	log.info("Looking for 'New Window' page");
		switchToWindowWithTitle("New Window");
		return new NewWindowPage();
	}
 
	
	
	
	

}
