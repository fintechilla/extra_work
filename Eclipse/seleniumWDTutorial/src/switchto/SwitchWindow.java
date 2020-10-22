package switchto;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindow {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/pages/practice";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test() throws InterruptedException {
		// Get the handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Handle: " + parentHandle);
		String currURL = driver.getCurrentUrl();
		System.out.println("1st curURL: " + currURL);
		
		// Find Open Window button
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		Thread.sleep(2000);

		// Get all handles
		Set<String> handles = driver.getWindowHandles();
		currURL = driver.getCurrentUrl();
		System.out.println("2nd curURL: " + currURL);

		// Switching between handles
		for (String handle: handles) {
			System.out.println("handle: " + handle);
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				currURL = driver.getCurrentUrl();
				System.out.println("3rd curURL: " + currURL);
				WebElement searchBox = driver.findElement(By.id("search-courses"));
				searchBox.sendKeys("python");
				Thread.sleep(2000);
				driver.close();
				break;
			}
		}
		// Switch back to the parent window
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("Test Successful");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
