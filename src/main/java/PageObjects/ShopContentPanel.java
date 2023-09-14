package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel extends BasePage{
	
	
public WebDriver driver;
	
	By continueShoppingBtn = By.xpath("//button[contains(text(), 'Continue')]");
	By checkoutBtn = By.linkText("PROCEED TO CHECKOUT");
	
	public ShopContentPanel() throws IOException {
		super();
	
	
	}
	
	public WebElement getContinueShopBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueShoppingBtn);
	}
	
	public WebElement getCheckoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkoutBtn);
	}
	

}
