package uk.co.automationtesting.ChallangeNovo;



import PageObjects.BasePage;
import PageObjects.DropDownCheckBoxRadioButtonPage;
import PageObjects.Homepage;
import PageObjects.ShopContentPanel;
import PageObjects.ShopHomepage;
import PageObjects.ShopProductPage;
import PageObjects.ShoppingCart;
import base.Hooks;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;



@Listeners(resources.Listerners.class)
public class OrderCompleteTest2 extends Hooks {

	

	
	public OrderCompleteTest2() throws IOException {
		super();

	}


	@Test(groups= {"smoke"})
	public void endToEndTest() throws IOException, InterruptedException {
		// creating an object of the automationtesting.co.uk webpage
		Homepage home = new Homepage();
		home.openPage();

		// handles cookie prompt
		// home.getCookie().click();

		home.openTogle();

		home.openDropDownLink();

		Thread.sleep(5000);
		// Click on Dropdown link
		DropDownCheckBoxRadioButtonPage dropdown = new DropDownCheckBoxRadioButtonPage();
		// Select Option 2
		dropdown.getSelectedOption();

		dropdown.selectOption(3);
		Thread.sleep(5000);

	}

}
