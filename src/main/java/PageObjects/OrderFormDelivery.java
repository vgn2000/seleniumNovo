package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormDelivery {
	
	public WebDriver driver;
	
	//locator
	By firstNameField = By.cssSelector("input[name='firstname']");
	By lastNameField = By.cssSelector("input[name='lastname']");
	By companyNameField = By.cssSelector("input[name='company']");
	By addressField = By.cssSelector("input[name='address1']");
	By addressComplementField = By.cssSelector("input[name='address2']");
	By cityField = By.cssSelector("input[name='city']");
	By stateDropdown = By.cssSelector("select[name='id_state']");
	By postcodeField = By.cssSelector("input[name='postcode']");
	By countryDropdown = By.cssSelector("select[name='id_country']");
	By phoneField = By.cssSelector("input[name='phone']");
	By invoiceSameAddCheckboc = By.cssSelector("input#use_same_address");
	By continueBtn = By.cssSelector("button[name='confirm-addresses']");
	
	
	public OrderFormDelivery(WebDriver driver) {
		this.driver = driver;
	
	
	}
	
	
	public WebElement getFirstNameField() throws IOException {
	
		return driver.findElement(firstNameField);
	}
	
	public WebElement getLastnameField() throws IOException {
		
		return driver.findElement(lastNameField);
	}

	public WebElement getCompanyField() throws IOException {
		
		return driver.findElement(companyNameField);
	}
	
	public WebElement getAddressField() throws IOException {
		
		return driver.findElement(addressField);
	}
	
	public WebElement getAddressCompField() throws IOException {
		
		return driver.findElement(addressComplementField);
	}
	
	public WebElement getCityField() throws IOException {
		
		return driver.findElement(cityField);
	}
	
	public WebElement getStateDropdown() throws IOException {
		
		return driver.findElement(stateDropdown);
	}
	
	public WebElement getPostcodeField() throws IOException {
		
		return driver.findElement(postcodeField);
	}
	
	public WebElement getCountryDropdown() throws IOException {
		
		return driver.findElement(countryDropdown);
	}

	public WebElement getPhoneField() throws IOException {
		
		return driver.findElement(phoneField);
	}
	
	public WebElement getInvoiceSameAddCheckbox() throws IOException {
		
		return driver.findElement(invoiceSameAddCheckboc);
	}
	
	public WebElement getContinueBtn() throws IOException {
	
		return driver.findElement(continueBtn);
	}
	

}
