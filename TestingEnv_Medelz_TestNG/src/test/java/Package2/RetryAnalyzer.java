package Package2;

import org.testng.ITestResult;
import org.testng.IRetryAnalyzer;


public class RetryAnalyzer implements IRetryAnalyzer {
	
	//public static WebDriver driver;
	
	private int retryCount = 0;
	private static final int maxRetryCount = 4;
	
	
	public boolean retry (ITestResult result) {
		
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
	return false;
	}

}
