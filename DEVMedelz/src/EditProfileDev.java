import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditProfileDev {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\AT\\browser driver\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://medelz:Medelz@dev@1976@dev.medelz.com/login/");

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

		driver.findElement(By.cssSelector("#nav-bar > div > div.cta-container > div.profile-container.cta-item.nav-menu-desktop > div > div > a.dropdown-item.internal-link")).click();
		driver.findElement(By.className("dropdown-item internal-link")).click();

		driver.quit();
	}

}
