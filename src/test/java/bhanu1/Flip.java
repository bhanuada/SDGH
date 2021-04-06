package bhanu1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flip {
	public static WebDriver driver;
	@Test
		public static void openApplication() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\adapala bhanu\\Desktop\\pranavipapa\\nana\\test-output\\chromedriver_win32 (2)\\chromedriver.exe");
		        driver=new ChromeDriver();
			    driver.get("https://www.flipkart.com/");
			    Reporter.log("url opened");
		}
		@Test
			public void login() throws InterruptedException {
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7780129885");
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("123pranavi");
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
				driver.manage().window().maximize();
				System.out.println("application opened");
				Reporter.log("application opened");
				Thread.sleep(3000);
			}
			@Test
			
			public void searchproduct() throws AWTException {   //searching a product
				driver.findElement(By.name("q")).sendKeys("lenovo KB MICE_BO Wireless combo 100 Eng Wireless Lapto...");
				
				driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
				
				driver.findElement(By.className("s1Q9rs")).click();
				Reporter.log("search product completed");
				
				
				
	WebElement element = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
			Actions ac =new Actions(driver);
			ac.doubleClick(element);
				
			}
			@Test
			public void logout() {
				
				
				
			}
			
		
		
		


	}


}
