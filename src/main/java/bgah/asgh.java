package bgah;

import java.security.PublicKey;
import java.sql.Driver;
import java.util.Set;
import java.util.spi.AbstractResourceBundleProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class asgh {
	
	
		
	public static void main(String[] args) throws Exception {
		
	

		
	
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ba21135\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    Reporter.log("url opened"); 
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7780129885");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("123pranavi");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();


	

Thread.sleep(1000);
driver.findElement(By.linkText("Mobiles")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("POCO X3 (Cobalt Blue, 64 GB)")).click();


String parent =driver.getWindowHandle();
Set<String> address =driver.getWindowHandles();

System.out.println(address);
for(String url:address) {
	if(!parent.equalsIgnoreCase(url)) {
		driver.switchTo().window(url);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#container > div > div._1Er18h > div > div._1YokD2._2GoDe3.col-12-12 > div:nth-child(1) > div > div._1AtVbE.col-12-12._78xt5Y > div > form > button")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#container > div > div._1eztQ7 > div > div._3efVlV > div:nth-child(2) > div > div > div > div:nth-child(2) > div._1P2-0f")).click();
	driver.findElement(By.name("name")).sendKeys("bhanureddy");
	driver.findElement(By.name("phone")).sendKeys("7406366057");
	driver.findElement(By.name("pincode")).sendKeys("500070");
	driver.findElement(By.name("addressLine2")).sendKeys("telangana");
	driver.findElement(By.name("addressLine1")).sendKeys("hyderabad");
	driver.findElement(By.name("city")).sendKeys("hyderabad");
	
	
	}


	}
	}
}
