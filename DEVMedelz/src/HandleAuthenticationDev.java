
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationDev {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\AT\\browser driver\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://medelz:Medelz@dev@1976@dev.medelz.com/");

		// driver.quit();
	}

}
