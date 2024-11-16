package Package2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	public static WebDriver driver;
//	JavascriptExecutor jse = (JavascriptExecutor) driver;//Scroll Down
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));
	
	
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
	}
	
	@Test
	public void LaunchApp() {
		
		driver.get("https://medelz:Medelz@dev@1976@dev2.medelz.com/login");
		
	}
	
	@Test
	public void LoginDev() {
		 
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;//Scroll Down
		jse.executeScript("window.scrollBy(0,200)");
		
		// User name
		WebElement username = driver.findElement(By.id("fan_vicode_user_email"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("stockton2866@gmail.com");

		// Password
		WebElement password = driver.findElement(By.id("password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("Test@123");
		
		jse.executeScript("window.scrollBy(0,200)");

		// Click on Login Button
		WebElement loginButton = driver.findElement(By.id("next1"));
		loginButton.isDisplayed();
		loginButton.isEnabled();
		loginButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='profile-container cta-item nav-menu-desktop']//a[@class='nav-item nav-link dropdown-toggle user-action no-link-style']")));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	@Parameters("sleepTime")
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Teardown Successful");
	}

}
