package PageObjects;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class DropdownPage extends BasePage{
	
	
	public DropdownPage() throws IOException {
		super();
	}
	private By dropdown = By.id("dropdown");

	

	/** This method selects given option from dropdown 
	 * @throws IOException */
	public void selectOption(int i) throws IOException {
	//	log.info("Selecting option " + i + " from dropdown");
		WebElement dropdownElement = find(dropdown);
		Select dropdown = new Select(dropdownElement);

		// There are three ways to use Select class
		// #1
		// dropdown.selectByIndex(i);

		// #2
		dropdown.selectByValue("" + i);

		// #3
		// dropdown.selectByVisibleText("Option " + i);
	}

	/** This method returns selected option in dropdown as a string 
	 * @throws IOException */
	public String getSelectedOption() throws IOException {
		WebElement dropdownElement = find(dropdown);
		Select dropdown = new Select(dropdownElement);
		String selectedOption = dropdown.getFirstSelectedOption().getText();
	//	log.info(selectedOption + " is selected in dropdown");
		return selectedOption;
	}
 
}
