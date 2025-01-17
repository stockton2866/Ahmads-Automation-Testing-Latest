package ui2;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//Added Comment
public class Login {

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
	public void verifyTitle()
	{
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
