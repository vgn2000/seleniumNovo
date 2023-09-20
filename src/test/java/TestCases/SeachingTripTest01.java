package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.SearchTripHome;
import base.Hooks;

public class SeachingTripTest01 extends Hooks{
	
	
	
	public SeachingTripTest01() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[1][2];
		
		//data set 1
		data[0][0] = "Dublin";
		data[0][1] = "Paris Beauvais";
		

		
		return data;
		
	}
	
	

	@Test(dataProvider = "getData")
	public void startingFirstJourning (String origem, String destino) throws IOException, InterruptedException {
		
		// open main page
	  
		SearchTripHome searchTrip = new SearchTripHome();
		searchTrip.openPage();
		searchTrip.clickReturnClickChBox();
		
	    searchTrip.searchFlightFromAndDestination(origem,destino);
    	searchTrip.selectiomDateFromYourTrip();
    	searchTrip.selectionReturnDateTrip();
		
        searchTrip.selectingNoPassger();
        searchTrip.clickDoneButton();
        searchTrip.clickSearchingButton();
        
		
	}
	
	
	}


