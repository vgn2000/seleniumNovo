package uk.co.automationtesting.ChallangeNovo;



import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjects.ContactFormPage;
import PageObjects.Homepage;
import base.Hooks;



@Listeners(resources.Listerners.class)
public class ContactFormTest extends Hooks {

	

	
	public ContactFormTest() throws IOException {
		super();

	}

	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[1][4];
		
		//data set 1
		data[0][0] = "vagner";
		data[0][1] = "nascimento";
		data[0][2] = "email@gmail.com";
		data[0][3] = "teste";
		

		
		return data;
		
	}
	
	

	@Test (groups= {"smoke"})
	public void endToEndTest() throws IOException, InterruptedException {
		// creating an object of the automationtesting.co.uk webpage
		Homepage home = new Homepage();
		home.contactFormLink();
		
		ContactFormPage form = new ContactFormPage();
		form.typeFirstName("Vagner");
		form.typeLastName("nascimento");
		form.typeEmail("ggn@gmail.com");
		form.typeMessage("Testtestetest");
		form.clickSubmitBtn();
		

	}
	
	//@Test(dataProvider = "getData")
	public void fillFromValidationPt01 (String firstName, String lastName, String email, String message) throws InterruptedException, IOException { 
		// creating an object of the automationtesting.co.uk webpage
		Homepage home = new Homepage();
		home.contactFormLink();
		
		ContactFormPage form = new ContactFormPage();
		form.typeFirstName(firstName);
		form.typeLastName(lastName);
		form.typeEmail(email);
		form.typeMessage(message);
		form.clickSubmitBtn();
		

	}
	
	
}
