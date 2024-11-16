package Package1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest extends BaseTest {
//	WebDriver driver;
//	
//	@Parameters("browserName")
//	@BeforeTest
//	public void InitializeBrowser (@Optional("chrome") String browserName) {
//		switch (browserName.toLowerCase()) {
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//		
//		case "edge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			break;
//			
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//
//		default:
//			System.err.println("Browser name is invalid");
//			break;
//		}
//		
//		driver.manage().window().maximize();
//	}
//	
//	@Parameters("sleepTime")
//	@AfterTest
//	public void TearDown(Long sleepTime) throws Exception {
//		System.out.println(sleepTime);
//		Thread.sleep(sleepTime);
//		driver.quit();
//	}
//	
//	@Parameters("url")
//	@Test
//	public void LaunchApp(String url) {
//		driver.get(url);
//	}
	
	@Test
	public void LoginDev() {
		 
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;//Scroll Down
		jse.executeScript("window.scrollBy(0,200)");
		
		// User name
		WebElement username = driver.findElement(By.id("fan_vicode_user_email"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("ahmadkhanjadoon@yopmail.com");

		// Password
		WebElement password = driver.findElement(By.id("password"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("Xyz1234@");
		
		jse.executeScript("window.scrollBy(0,200)");

		// Click on Login Button
		WebElement loginButton = driver.findElement(By.id("next1"));
		loginButton.isDisplayed();
		loginButton.isEnabled();
		loginButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='profile-container cta-item nav-menu-desktop']//a[@class='nav-item nav-link dropdown-toggle user-action no-link-style']")));
	}
	
	@Test
	public void VerifyLoginTestcase() {
		boolean actualValue = driver.findElement(By.xpath("//div[@class='profile-container cta-item nav-menu-desktop']//a[@class='nav-item nav-link dropdown-toggle user-action no-link-style']")).isDisplayed();
		assertTrue(actualValue, "Logged In Successfully");
	}

}
