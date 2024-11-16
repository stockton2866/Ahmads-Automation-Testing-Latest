package ui2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ActualLogin {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\AT\\browser driver\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://medelz:Medelz@dev@1976@dev.medelz.com/");
		
	}
	

	
	@Test
	public void loginMedelz()
	{
		driver.findElement(By.xpath("//div[@class='profile-container cta-item nav-menu-desktop']//span[@class='menu-item-text-container'][normalize-space()='Login']")).click();
		
		// Username
		WebElement username = driver.findElement(By.id("fan_vicode_user_email"));
				username.isDisplayed();
				username.isEnabled();
				username.sendKeys("stockton2866@gmail.com");
		
		// Password
				WebElement password = driver.findElement(By.id("password"));
				password.isDisplayed();
				password.isEnabled();
				password.sendKeys("Xyz1234@");
				
		// Click on Login Button
				WebElement loginButton = driver.findElement(By.id("next1"));
				loginButton.isDisplayed();
				loginButton.isEnabled();
				loginButton.click();
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='profile-container cta-item nav-menu-desktop']//a[@class='nav-item nav-link dropdown-toggle user-action no-link-style']")));


				String actualTitle = driver.getTitle();
				String expectedTitle = "MEDELZ – A Talent Discovery Platform";
				
				Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
