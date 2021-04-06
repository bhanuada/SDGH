package Ama;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Element;
import javax.xml.xpath.XPath;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spice {
	public static void main(String[] args) throws InterruptedException, Exception {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\ba21135\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.spicejet.com/");
    driver.manage().window().maximize();
  String x=  driver.getTitle();
  System.out.println(x);
  Thread.sleep(0);
  //new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"))).click();
 // driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//table[@id='citydropdown']//li/a[@value='GAU']")).click();
  
 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Gaya");
 
Thread.sleep(3000);
 
 driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Delhi");
 
 
 WebElement elelemnt =driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[6]/a"));
 Actions ac =new Actions(driver);
 ac.moveToElement(elelemnt).perform();
 elelemnt.click();
 driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
 Select st1 =new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
 st1.selectByIndex(1);
 
 
 
 //Select selectAdult = new Select(new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#divpaxOptions div.passengers-wrap2 p>select[name$='_Adult']"))));
// selectAdult.selectByVisibleText("5");
// Select selectadult = new Select(( new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOfElementLocated(By.name("ctl00$mainContent$ddl_Adultctl00$mainContent$ddl_Adult"))));
// selectadult.selectByIndex(3);
 
 
 
 Select st =new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));
 st.selectByVisibleText("INR");
 driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
 String s =driver.getTitle();
 System.out.println(s);
 
 
 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(screenshot, new File("C:\\Users\\ba21135\\eclipse-workspace\\vani\\jet.png"));
 
 
 String expectedtitle ="Cheap Air Tickets Online, International Flights to India, Cheap International Flight Deals | SpiceJet Airlines";
 if(expectedtitle.equalsIgnoreCase(driver.getTitle())) {
	 System.out.println("pass");
 }
 else {
	 System.out.println("Fail");
	 
	 
	 
	 
	 
	 
	 
 }
 
 
 
 
 
// new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='ui-datepicker-calendar']//tr//a[contains(@class,'ui-state-default') and contains(.,'31')]"))).click();
    
  
}
  
    

}


