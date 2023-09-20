package PageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import com.sun.tools.javac.util.List;

public class SearchTripHome extends BasePage {

	private String pageUrl = "https://www.ryanair.com/gb/en";

	
	private By returnTripButton = By.cssSelector(".is-on-blue > .ng-star-inserted:nth-of-type(1) .trip-type__label");
	
	private By oneWayButton = By.cssSelector(".is-on-blue > fsw-trip-type-button:nth-child(1) > button:nth-child(1)");
	
	private By passegerFilterDate = By.cssSelector("[data-ref='input-button__passengers']");
	
	private By passengerPicker = By.cssSelector("fsw-passengers-picker-container > fsw-passengers-picker");
	
	private By searchButton = By.cssSelector(".flight-search-widget__start-search");
	
	private By addAdultsCounter = By.cssSelector("ry-counter.passengers-picker__passenger-type:nth-child(3) > div:nth-child(2) > div:nth-child(3)");

	private By addChildrenCounter = By.cssSelector("ry-counter.passengers-picker__passenger-type:nth-child(5) > div:nth-child(2) > div:nth-child(3)");

	private By calendar = By.cssSelector(".datepicker__calendars");
	
	private By calendar_motn = By.cssSelector(".datepicker__calendar.datepicker__calendar--left > .calendar__month-name");
	
	private By dateByWidget = By.cssSelector(".calendar-body__cell-wrap--start-end-highlight [tabindex]");
	
	private By dateMonthCalen = By.cssSelector("div:nth-of-type(4) > .m-toggle__month");
	
	private By dateOnCalen  = By.cssSelector(".calendar-body__cell-wrap--start-end-highlight [tabindex]");
	
	private By dateByDepartByID = By.cssSelector("[data-id='2023-12-24']");
	
	private By returnDateField = By.cssSelector("fsw-input-button:nth-of-type(2)  .input-button__input.ng-star-inserted");
	
	private By calendar_right = By.cssSelector(".datepicker__calendar.ng-star-inserted");
	
	private By returnDateByWidget = By.cssSelector("[data-id='2024-01-02']");
	
	private By confirmPassButton = By.cssSelector(".passengers__confirm-button");
	
    private By departureAirport = By.id("input-button__departure");

    private By destinationAirport = By.id("input-button__destination");

    private By airport = By.tagName("fsw-airport-item");
	
    private By monthWidget = By.className("m-toggle__month");
    
    private By monthToggleScroll = By.cssSelector(".m-toggle__scrollable-items");
    
    private By cookie = By.cssSelector(".cookie-popup-with-overlay__button");
	
    private By exactDate = By.cssSelector(".datepicker-tabs__buttons-container .datepicker-tabs__button:nth-of-type(1)");
	
	
	
	
	


	public SearchTripHome() throws IOException {
		super();
	}
	
	public void openPage() throws IOException, InterruptedException {
	
		openUrl(pageUrl);
		click(cookie);
	
	}
	

	public void clickReturnClickChBox() throws IOException {
		// log.info("Clicking 'Click Here' link");
		waitToBeClickAble(returnTripButton, 5);
		click(returnTripButton);
	}

	
	
	public void searchFlightFromAndDestination(String origem, String Destination) throws IOException {
		
		waitToBeClickAble(departureAirport, 5);
		click(departureAirport);
		clearField(departureAirport);
		
		//Select Initial Flight source
		type(origem,departureAirport );
		click(airport);
		
		//Select to Airport Destination
		waitToBeClickAble(destinationAirport, 5);
		clearField(destinationAirport);
		type(Destination,destinationAirport  );
		click(airport);
		
		
	}
	
	public void selectiomDateFromYourTrip() throws IOException {
		// Selecting Date - Step 1
		waitToBeClickAble(exactDate, 5);
		click(exactDate);

		waitToBeClickAble(monthToggleScroll, 5);

		java.util.List<WebElement> monthDateWight = findAll(monthWidget);

		for (WebElement element : monthDateWight) {
			if (element.getText().equalsIgnoreCase("Dec")) {
				element.click();
			}
		}

		// Step - acessing the calendar (Month)
		waitForVisibilityOf(dateMonthCalen, 5);
		click(dateMonthCalen);

		// Step 4
		try {
			waitToBeClickAble(dateByDepartByID, 5);

		} catch (StaleElementReferenceException e) {
			WebElement startDepartDate = waitForWebElement(dateByDepartByID);
			startDepartDate.click();
		}
	}
		
		 
		 public void selectionReturnDateTrip() throws IOException {
		 
		
			 //Select Step - Clicking on the Return Date Field
			 
			  
			  waitForVisibilityOf(calendar_right, 5);
			  click(calendar_right);
		
			
			 //carry the element
			 try {
					waitToBeClickAble(returnDateByWidget, 5);
				 
		      }catch(StaleElementReferenceException e) {
		        	WebElement startDepartDate = waitForWebElement(returnDateByWidget);
		    		startDepartDate.click();
		        }
		
		
	}
	
	public void selectingNoPassger() throws IOException{
		
		//Starting processing selecting Chilrdreen or Adults
		

		waitToBeClickAble(passegerFilterDate);
		click(passegerFilterDate);
		waitToBeClickAble(passengerPicker);
		
		waitToBeClickAble(addAdultsCounter, 5);
		click(addAdultsCounter);
		
		waitToBeClickAble(addChildrenCounter, 5);
		click(addChildrenCounter);
		
		
	}

	public void clickDoneButton() throws IOException {
		// log.info("Clicking 'Click Here' link");
		waitToBeClickAble(confirmPassButton, 5);
		click(confirmPassButton);
	}

	
	public void clickSearchingButton() throws IOException {
		// log.info("Clicking 'Click Here' link");
		waitToBeClickAble(searchButton, 5);
		click(searchButton);
	}

	

}