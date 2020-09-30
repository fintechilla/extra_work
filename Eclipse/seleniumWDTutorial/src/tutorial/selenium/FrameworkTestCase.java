package tutorial.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import page.classes.SearchPageFactory;

public class FrameworkTestCase {
	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;

	@Before
	public void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Devs\\extra_work\\libs\\selenium\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\Devs\\extra_work\\libs\\selenium\\webdrivers\\geckodriver.exe");
//		driver = new FirefoxDriver();
		
		baseUrl = "https://www.travelocity.com/";
		
		searchPage = new SearchPageFactory(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws Exception {
		searchPage.clickFlightsTab();
		System.out.println("searchPage.clickFlightsTab()");
		searchPage.clickRoundtripTab();
		System.out.println("searchPage.clickRoundtripTab()");
		searchPage.setDestinationCity("Fll");
		System.out.println("searchPage.setDestinationCity(\"SFO\")");
		searchPage.setOriginCity("LGA");
		System.out.println("searchPage.setOriginCity(\"LGA\")");
//		Thread.sleep(2000);
		searchPage.setReturnDate("10/31/2020");
		System.out.println("searchPage.setReturnDate(\"10/31/2020\")");
		searchPage.setDepartureDate("10/28/2020");
		System.out.println("searchPage.setDepartureDate(\"10/28/2020\")");
		searchPage.clickSearchBtn();
		System.out.println("searchPage.clickSearchBtn()");
		List<WebElement> listOfFilghts = searchPage.getFlightList();
		System.out.println("ist<WebElement> listOfFilghts = searchPage.getFlightList()");
		for(WebElement flight : listOfFilghts) {
			System.out.println(flight.getAttribute("href"));
		}
	}

	@After
	public void afterClass() {
	}
}