package helperspackage;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class BasePage {

	

	public static WebDriver driver;
	
	
	
	@Test
	public static void launchapp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ba21135\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://www.adactin.com/HotelAppBuild2");
		Reporter.log("open application");
		
		
	}
	@Test

	public static void close() {
		
		
		Reporter.log("close application");
		
	}
	
	

	

}


