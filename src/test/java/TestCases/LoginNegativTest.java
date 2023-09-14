package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObjects.Homepage;
import PageObjects.ShopHomepage;
import PageObjects.ShopLoginPage;
import PageObjects.ShopYourAccount;
import base.Hooks;

public class LoginNegativTest extends Hooks{
	
	
	public LoginNegativTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void Login() throws IOException, InterruptedException {
		
        
     // creating an object of the automationtesting.co.uk webpage
		Homepage home = new Homepage();
		
		
		//handle cookie visibility using JSE - added 20230217
	    JavascriptExecutor jse = (JavascriptExecutor)getDriver();
	    jse.executeScript("arguments[0].scrollIntoView()", home.getTestStoreLinkPage());
	    home.getTestStoreLinkPage();
		
		
	
        
        ShopHomepage shopHome = new ShopHomepage();
        shopHome.openPage();
        shopHome.clickStorePageLogin();
        
      
     
        
        ShopLoginPage shop = new ShopLoginPage();
     
        
        Thread.sleep(3000);
        shop.clickloginBtn();
        
        ShopYourAccount yourAcc = new ShopYourAccount();
        yourAcc.clickSignOutBtn();
      
        
        
     
        Thread.sleep(3000);
        shop.clickloginBtn();
        
        
	}
	
	}


