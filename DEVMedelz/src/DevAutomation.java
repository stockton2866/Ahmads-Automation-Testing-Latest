
import org.openqa.selenium.chrome.ChromeDriver;

public class DevAutomation {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\AT\\browser driver\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev.medelz.com");

		// driver.get("https://google.com");
		// driver.quit();

	}

}
