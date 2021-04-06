package Ama;

import java.io.File;
import java.io.IOException;
import java.sql.DriverPropertyInfo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amaz {
	public static void main(String args[]) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\ba21135\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File("C:\\Users\\ba21135\\eclipse-workspace\\vani\\sr11.png"));
	    
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Famazonprime%3F_encoding%3DUTF8%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    
	    driver.findElement(By.id("ap_email")).sendKeys("adapalabhanu666@gmail.com");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.name("password")).sendKeys("123ABCabc@#");
	    
	    driver.findElement(By.id("signInSubmit")).click();
	  
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:\\Users\\ba21135\\eclipse-workspace\\vani\\sr12.png"));
	  
	  
	    Select s =new Select(driver.findElement(By.id("searchDropdownBox")));
	    s.selectByIndex(3);
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
	    //driver.findElement(By.cssSelector("#add-to-cart-button")).sendKeys(Keys.ENTER);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
  // driver.findElement(By.cssSelector("#mbc-buybutton-addtocart-1 > span > input")).click();
 driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.sg-row > div.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div:nth-child(2) > div.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20.sg-col > div > div:nth-child(1) > div > div > div:nth-child(1) > h2 > a > span")).click();
//driver.findElement(By.cssSelector("#add-to-cart-button")).click();
	    File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src1, new File("C:\\Users\\ba21135\\eclipse-workspace\\vani\\sr13.png"));	   
	   driver.findElement(By.linkText("Fresh")).click();
	   driver.manage().window().maximize();
	   File src2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src2, new File("C:\\Users\\ba21135\\eclipse-workspace\\vani\\sr14.png"));
   
   
  
	  driver.findElement(By.linkText("Amazon Pay")).click();
	  driver.manage().window().maximize();
	  File src3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src3, new File("C:\\Users\\ba21135\\eclipse-workspace\\vani\\sr15.png"));
	  
	  driver.findElement(By.linkText("Best Sellers")).click();
	  driver.manage().window().maximize();
	  File src4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src4, new File("C:\\Users\\ba21135\\eclipse-workspace\\vani\\sr16.png"));
	  
	 
	 driver.findElement(By.id("nav-your-amazon-text")).click();
	  
	  File src5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(src5, new File("C:\\Users\\ba21135\\eclipse-workspace\\vani\\sr17.png"));
	

}
}
