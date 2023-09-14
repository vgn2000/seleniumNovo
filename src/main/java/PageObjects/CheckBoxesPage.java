package PageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxesPage extends BasePage {

	public CheckBoxesPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	private By checkbox = By.xpath("//input[@type='checkbox']");

	
	/** Get list of all checkboxes and check if unchecked 
	 * @throws IOException */
	
	public void selectAllCheckboxes() throws IOException {
		
		List<WebElement> checkboxes = findAll(checkbox);
		for (WebElement checkbox : checkboxes) {
			if (!checkbox.isSelected()) {
				checkbox.click();
			}
		}
	}

	/**
	 * Verify all available checkboxes are checked. If at least one unchecked,
	 * return false
	 * @throws IOException 
	 */
	public boolean areAllCheckboxesChecked() throws IOException {
	
		List<WebElement> checkboxes = findAll(checkbox);
		for (WebElement checkbox : checkboxes) {
			if (!checkbox.isSelected()) {
				return false;
			}
		}
		return true;
	}
}

