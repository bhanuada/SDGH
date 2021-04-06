package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Application {
	@Test
	public static void launchapp() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ba21135\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("appication opened");
		
	}
	
}
