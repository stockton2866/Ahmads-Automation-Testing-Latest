package Package1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
//import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationDev {
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
	}
	
	@Parameters("sleepTime")
	@AfterTest
	public void TearDown(Long sleepTime) throws Exception {
		System.out.println(sleepTime);
		Thread.sleep(sleepTime);
		driver.quit();
	}
	
	
	@Test
	public void LaunchApp() {
		driver.get("https://medelz:Medelz@dev@1976@dev.medelz.com/signup/");
	}
	
	@Test
	public void RegistrationOfDev() {
		 
		
	//Entering First Name
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ahmad");
	
	//Entering Last Name
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Khan");
	
	//Enter Random Email Address
	String randomEmail = "Ahmad_Khan" + RandomStringUtils.randomNumeric(2) + "@yopmail.com";
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(randomEmail);
	
	//Select Country Code
	driver.findElement(By.xpath("//div[@title='United States: +1']")).click();
	driver.findElement(By.xpath("//li[@id='iti-0__item-pk-preferred']//div[@class='iti__flag iti__pk']")).click();
	
	//Sending Random Keys to Phone Number Field
	driver.findElement(By.xpath("//input[@id='fan_vicode_user_phone']")).click();
	String randomPhone = "0331" + RandomStringUtils.randomNumeric(7);
	driver.findElement(By.xpath("//input[@id='fan_vicode_user_phone']")).sendKeys(randomPhone);
	driver.findElement(By.xpath("//input[@id='fan_vicode_user_phone']")).sendKeys(Keys.ENTER);
	
	//Select cc = new Select(driver.findElement(By.xpath("//div[@title='United States: +1']")));
	//cc.selectByIndex(2);
	//driver.findElement(By.xpath("//div[@title='United States: +1']")).sendKeys(Keys.ARROW_DOWN);
	//driver.findElement(By.xpath("//div[@title='United States: +1']")).sendKeys(Keys.ARROW_DOWN);
	//long phoneNumber =89123456789L;		
	//driver.findElement(By.xpath("//div[@title='United States: +1']")).sendKeys(Keys.ENTER + String.valueOf(phoneNumber));
	
	
	//Enter Passwords
	driver.findElement(By.id("password")).sendKeys("Xyz1234@");
	driver.findElement(By.id("repeatpassword")).sendKeys("Xyz1234@");
	
	//Select Date of Birth
	Select day = new Select(driver.findElement(By.id("select-day")));
	day.selectByIndex(1);
	
	Select month = new Select(driver.findElement(By.id("select-month")));
	month.selectByIndex(1);
	
	Select year = new Select(driver.findElement(By.id("select-year")));
	year.selectByIndex(32);
	
	//Select Gender
	driver.findElement(By.id("u_0_5_TO")).click();
	
	//Check Box Terms of Service
	driver.findElement(By.id("privacy")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Click Register
	WebElement register = driver.findElement(By.id("next1"));
	register.isDisplayed();
	register.isEnabled();
	register.click();
	
//	try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(180));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vicode_user_mail_otp")));
	
	//Enter Email OTP
	WebElement enterOtpemail = driver.findElement(By.id("vicode_user_mail_otp"));
	enterOtpemail.click();
	enterOtpemail.sendKeys("123456");
	
	//Enter Phone Number OTP
	WebElement enterOtpPhone = driver.findElement(By.id("vicode_user_phone_otp"));
	enterOtpPhone.click();
	enterOtpPhone.sendKeys("123456");
	
//				//Click Verify OTP
//				driver.findElement(By.xpath("//button[@id='next2']")).click();
	
	
	}
	
	@Test
	public void VerifyRegistrationTestcase() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Signup – MEDELZ";
		
		assertEquals(actualTitle, expectedTitle,"Testcase is");
	}

}
