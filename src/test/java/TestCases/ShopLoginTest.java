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

public class ShopLoginTest extends Hooks{
	
	
	public ShopLoginTest() throws IOException {
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
        
        FileInputStream workbookLocation = new FileInputStream(System.getProperty("user.dir") +
        		"/src/main/java/resources/credentials.xlsx");
        
        
        //Criando o Objeto para ler o arquivo em Excell e tenho que passar o Path
        //Library responsavel - import org.apache.poi.xssf.usermodel.XSSFWorkbook;
        XSSFWorkbook workbook = new XSSFWorkbook(workbookLocation);
        
        //Agora vamos criar um novo objeto para trabalhar com as Tabs ou Sheets do Excell
        //Devo importar uma outra libra para ler as tabs - import org.apache.poi.xssf.usermodel.XSSFSheet;
        XSSFSheet sheet = workbook.getSheetAt(0);   // Sheet 1 quer dizer 0 ... e assim por diante
        		
        
      //Importar outra library - org.apache.poi.xssf.usermodel.XSSFSheet; (acessar as linhas e colunas)
        Row row1 = sheet.getRow(1);  //Isso vai acesar a linha 1 (primeira linha)
        
        //Importa aoutra Librar para poder ler as colunas - org.apache.poi.ss.usermodel.Cell;
        Cell cellR1C0 = row1.getCell(0);
        Cell cellR1C1 = row1.getCell(1);
        
        
        //Agora eu tenho que fazer uma conversao, pois na cel e na coluna tem String (vira como String)
        String emailRow1 = cellR1C0.toString();
        String passwordRow1 = cellR1C1.toString();
        
        System.out.println(emailRow1);
        System.out.println(passwordRow1);
        
        ShopLoginPage shop = new ShopLoginPage();
        shop.typeEmail(emailRow1);
        shop.typePassord(passwordRow1);
        
        Thread.sleep(3000);
        shop.clickloginBtn();
        
        ShopYourAccount yourAcc = new ShopYourAccount();
        yourAcc.clickSignOutBtn();
        
        //Repetir o processo 
        Row row2 = sheet.getRow(2);  //Isso vai acesar a linha 1 (primeira linha)
        Cell cellR2C0 = row2.getCell(0);
        Cell cellR2C1 = row2.getCell(1);
        
        String emailRow2 = cellR2C0.toString();
        String passwordRow2 = cellR2C1.toString();
        
        
        shop.typeEmail(emailRow2);
        shop.typePassord(passwordRow2);
        Thread.sleep(3000);
        shop.clickloginBtn();
        
        
	}
	
	}


