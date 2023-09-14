package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopLoginPage extends BasePage{
	
	WebDriver driver;
	
	
	
	public ShopLoginPage () throws IOException {
		super();
		
	}
	
	By email = By.cssSelector("section input[name='email']");
	By password = By.cssSelector("input[name='password']");
	By loginBtn = By.cssSelector("button#submit-login");
	
	
   public WebElement getEmail() {
	   return driver.findElement(email);
   }
	
   public WebElement getPassword() {
	   return driver.findElement(password);
   }
   
   public WebElement getLoginBtn() {
	   return driver.findElement(loginBtn);
   }
   
   
   /**
	 * Type given text into element with given locator
	 * 
	 * @throws IOException
	 */
	public void typeEmail(String text) throws IOException {
		waitForVisibilityOf(email, 5);
		find(email).sendKeys(text);
	}

	
	 /**
		 * Type given text into element with given locator
		 * 
		 * @throws IOException
		 */
		public void typePassord(String text) throws IOException {
			waitForVisibilityOf(password, 5);
			find(password).sendKeys(text);
		}



	public void clickloginBtn() throws IOException {
		// log.info("Clicking 'Click Here' link");
		waitForVisibilityOf(loginBtn, 5);
		click(loginBtn);

	}
   
}
