package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CheckBoxesPage;
import PageObjects.WelcomePage;
import base.Hooks;

public class CheckBoxTests2 extends Hooks{
	
	
	public CheckBoxTests2() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void selectingTwoCheckboxesTest() throws IOException {
		
		// open main page
	  
	    // creating an object of the automationtesting.co
			
			WelcomePage welcome = new WelcomePage();
			welcome.openPage();
			
			// Click on Checkboxes link
			CheckBoxesPage checkboxesPage =  welcome.clickCheckboxesLink();
			
			checkboxesPage.selectAllCheckboxes();

			// Verify all checkboxes are checked
			Assert.assertTrue(checkboxesPage.areAllCheckboxesChecked(), "Not all checkboxes are checked");


	}
	
	}


