package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPersInfo  {
	
	public WebDriver driver;
	
	//Locator
	By genderMr = By.cssSelector(".col-md-6.form-control-valign > label:nth-of-type(1)");
	By genderMrs = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
	By firstNameField = By.cssSelector("input[name='firstname']");
	By lastNameField = By.cssSelector("input[name='lastname']");
	By emailField = By.cssSelector("form#customer-form > section input[name='email']");
	By passwordField = By.cssSelector("form#customer-form > section input[name='password']");
	By birthDateField = By.cssSelector("input[name='birthday']");
	By receiveOffersCheckbox = By.cssSelector("div:nth-of-type(7)  span > label > span");
	By newsletterCheckbox = By.cssSelector("div:nth-of-type(8)  span > label > span");
	By termsConditionsCheckbox = By.cssSelector("input[name='psgdpr']");
	By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");
	
	public OrderFormPersInfo(WebDriver driver) {
		this.driver = driver;
	
	
	}
	
	
	public WebElement getGenderMr() throws IOException {
		
		return driver.findElement(genderMr);
	}

	public WebElement getGenderMrs() throws IOException {
		
		return driver.findElement(genderMrs);
	}

	public WebElement getFirstNameField() throws IOException {
	
		return driver.findElement(firstNameField);
	}
	
	public WebElement getLastnameField() throws IOException {
		
		return driver.findElement(lastNameField);
	}

	public WebElement getEmailField() throws IOException {
		
		return driver.findElement(emailField);
	}
	
	public WebElement getPasswordField() throws IOException {
		
		return driver.findElement(passwordField);
	}
	
	public WebElement getBirthDateField() throws IOException {
		
		return driver.findElement(birthDateField);
	}
	
	public WebElement getRecOfferCheckbox() throws IOException {
		
		return driver.findElement(receiveOffersCheckbox);
	}
	
	public WebElement getNewsletterCheckbox() throws IOException {
		
		return driver.findElement(newsletterCheckbox);
	}
	
	public WebElement getTermsConditionsCheckbox() throws IOException {

		return driver.findElement(termsConditionsCheckbox);
	}
	
	public WebElement getContinueBtn() throws IOException {
		
		return driver.findElement(continueBtn);
	}
	

}
