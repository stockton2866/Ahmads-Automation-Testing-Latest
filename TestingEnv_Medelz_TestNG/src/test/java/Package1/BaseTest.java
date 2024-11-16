package Package1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import static org.testng.Assert.assertTrue;

//import java.time.Duration;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void InitializeBrowser (@Optional("chrome") String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.err.println("Browser name is invalid");
			break;
		}
		
		driver.manage().window().maximize();
		System.out.println("Before Test");
	}
	
	@Parameters("sleepTime")
	@AfterTest
	public void TearDown(Long sleepTime) throws Exception {
		System.out.println(sleepTime);
		Thread.sleep(sleepTime);
		driver.quit();
		System.out.println("After Test");
	}
	
	@Parameters("url")
	@Test
	public void LaunchApp(String url) {
		driver.get(url);
		System.out.println("Launching App");
	}


}
