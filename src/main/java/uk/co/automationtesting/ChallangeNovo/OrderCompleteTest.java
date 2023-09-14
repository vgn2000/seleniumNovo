package uk.co.automationtesting.ChallangeNovo;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.ShopContentPanel;
import PageObjects.ShopProductPage;
import PageObjects.ShoppingCart;
import base.Hooks;


@Listeners(resources.Listerners.class)

public class OrderCompleteTest extends Hooks {



	public OrderCompleteTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void endToEndTest() throws IOException, InterruptedException {
		// creating an object of the automationtesting.co.uk webpage
		Homepage home = new Homepage();
		home.openPage();
		home.clickStoreLinkAble();
	    home.clickStoreLinkTshirt();

		// creating an object of the shop products page (when a product has been
		// selected)
	    ShopProductPage shopProd = new ShopProductPage();
	    Select option = new Select(shopProd.getSizeOption());
	    option.selectByVisibleText("M");
	    shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();

		// creating an object of the cart content panel (once an item was added)
        ShopContentPanel cPanel = new ShopContentPanel();
        cPanel.getCheckoutBtn().click();

		// creating an object of the shopping cart page (all items selected)
        ShoppingCart cart = new ShoppingCart();
        cart.getHavePromo().click();
        cart.getPromoTextbox().sendKeys("20OFF");
        cart.getPromoAddBtn().click();
         cart.getProceedCheckoutBtn().click();

		
	}

	@Test
	public void endToEndTest2() throws IOException, InterruptedException {
		// creating an object of the automationtesting.co.uk webpage
		Homepage home = new Homepage();
		home.openPage();
		home.clickStoreLinkAble();
	    home.clickStoreLinkTshirt();

		// creating an object of the shop products page (when a product has been
		// selected)
	    ShopProductPage shopProd = new ShopProductPage();
	    Select option = new Select(shopProd.getSizeOption());
	    option.selectByVisibleText("S");
	    shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();

		// creating an object of the cart content panel (once an item was added)
        ShopContentPanel cPanel = new ShopContentPanel();
        cPanel.getCheckoutBtn().click();

		// creating an object of the shopping cart page (all items selected)
        ShoppingCart cart = new ShoppingCart();
        cart.getHavePromo().click();
        cart.getPromoTextbox().sendKeys("30OFF");
        cart.getPromoAddBtn().click();
         cart.getProceedCheckoutBtn().click();

		
	}
	
	@Test
	public void endToEndTeste() throws IOException, InterruptedException {
		// creating an object of the automationtesting.co.uk webpage
		Homepage home = new Homepage();
		home.openPage();
		home.clickStoreLinkAble();
	    home.clickStoreLinkTshirt();

		// creating an object of the shop products page (when a product has been
		// selected)
	    ShopProductPage shopProd = new ShopProductPage();
	    Select option = new Select(shopProd.getSizeOption());
	    option.selectByVisibleText("M");
	    shopProd.getQuantIncrease().click();
        shopProd.getAddToCartBtn().click();

		// creating an object of the cart content panel (once an item was added)
        ShopContentPanel cPanel = new ShopContentPanel();
        cPanel.getCheckoutBtn().click();

		// creating an object of the shopping cart page (all items selected)
        ShoppingCart cart = new ShoppingCart();
        cart.getHavePromo().click();
        cart.getPromoTextbox().sendKeys("50OFF");
        cart.getPromoAddBtn().click();
         cart.getProceedCheckoutBtn().click();

		
	}


	
	
}
