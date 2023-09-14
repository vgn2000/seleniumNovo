package resources;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import PageObjects.BasePage;

public class Listerners  extends BasePage implements ITestListener{

	public Listerners() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	  public void onTestFailure(ITestResult result) {
		   
		  try {
			  takeSnapShot(result.getName());
			  
		  }
		  catch (Exception e){
			  e.printStackTrace();
			  
			  
		  }
		  
		  }

	

}
