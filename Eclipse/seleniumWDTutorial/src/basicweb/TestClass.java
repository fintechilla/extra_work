package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

	public static void main(String[] args) {
//		System.setProperty("webdriver.gecko.driver", "C:\\Devs\\extra_work\\libs\\selenium\\webdrivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Devs\\extra_work\\libs\\selenium\\webdrivers\\chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://learn.letskodeit.com";
		driver.get(baseURL);
		WebElement element = driver.findElement(By.id(""));
		
		

	}

}
