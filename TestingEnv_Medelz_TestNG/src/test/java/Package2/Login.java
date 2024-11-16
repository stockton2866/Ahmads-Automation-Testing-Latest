package Package2;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login extends baseClass {
	
	@Test
	public void LaunchApp() {
		driver.get("https://medelz:Medelz@dev@1976@dev2.medelz.com/login/");
	}
	
	
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
