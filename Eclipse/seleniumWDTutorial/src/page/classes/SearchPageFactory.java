package page.classes;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.ResolveResult;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;
	
//	@FindBy(id="header-history")
	@FindBy(xpath="//*[@id=\'tab-flight-tab-hp\']")
	WebElement headerHistory;
	
//	@FindBy(id="tab-flight-tab")
	@FindBy(xpath = "//*[@id=\'tab-flight-tab-hp\']")
	WebElement fligthsTab;
	
	@FindBy(xpath = "//*[@id=\'flight-type-roundtrip-label-hp-flight\']")
	WebElement roundripTab;
	
//	@FindBy(id="flight-origin")
	//*[@id="location-field-leg1-origin-input"]
//	@FindBy(xpath = "//button[@aria-label='Leaving from']")
//	@FindBy(id="location-field-leg1-origin-input")
	@FindBy(xpath = "//*[@id=\'flight-origin-hp-flight\']")
	WebElement originCity;
	
//	@FindBy(id="flight-destination")
//	@FindBy(xpath = "//button[@aria-label='Going to']")
	@FindBy(xpath = "//*[@id=\'flight-destination-hp-flight\']")
//	@FindBy(id="location-field-leg1-destination-input")
	WebElement destinationCity;
	
	
	@FindBy(xpath = "//*[@id=\'flight-departing-hp-flight\']") //""(id="flight-departing")
	WebElement departureDate;
	
	@FindBy(xpath = "//*[@id=\'flight-returning-hp-flight\']") //@FindBy(id="flight-returning")
	WebElement returnDate;
	
	@FindBy(xpath = "//ul[@id=\"flightModuleList\"]")
	WebElement flightList;

	
	@FindBy(xpath = "//form[@id=\'gcw-flights-form-hp-flight\']/div[8]/label/button")
	WebElement searchBtn;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab() {
//		headerHistory.click();
		fligthsTab.click();
	}
	
	public void clickRoundtripTab() {
		roundripTab.click();
		
	}
	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
//		originCityAct.click();
		originCity.click();
	}
	
	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
//		destinationCityAct.click();
		destinationCity.click();
	}

	public void setDepartureDate(String date) {
		departureDate.sendKeys(date);
		departureDate.sendKeys(Keys.ESCAPE);
//		departureDate.click();
		
	}

	public void setReturnDate(String date) {
		returnDate.sendKeys(date);
//		returnDate.click();
		
	}
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	public List<WebElement>getFlightList(){
		
		List<WebElement> listOfFlights = flightList.findElement(By.id("flightModuleList")).findElements(By.tagName("li"));
		
		System.out.println("Size of flightList " + listOfFlights.size());
		 
		for (WebElement flight : listOfFlights) {
			System.out.println(flight.getTagName());
		}
		return listOfFlights;
	
//	@FindBy(id="location-field-leg1-origin")
//	WebElement originCityAct;
//	
//	@FindBy(id="location-field-leg1-destination")
//	WebElement destinationCityAct;
	
	}
}
