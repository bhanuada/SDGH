package Ama;

import java.awt.List;
import java.io.File;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spice222 {
	
		
	
	public static <Webelement> void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ba21135\\Desktop\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   driver.get("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html#wb-auto-2");
	   java.util.List<WebElement> tables =driver.findElements(By.tagName("table")); //code for finding the total number of tables in webpage
	   System.out.println(tables.size());
	   
	   for(WebElement table11:tables) {
		   java.util.List<WebElement> rows =table11.findElements(By.tagName("tr")); //code to find the number of rows in each table
		   System.out.println("the number of rows:" +rows.size());
		   java.util.List<WebElement> colmns =table11.findElements(By.tagName("th")); //code to fin dthe number of coloumns in each table
		   System.out.println("the number of coloumns:" +colmns.size());
		   
		   java.util.List<WebElement> browsers =table11.findElements(By.tagName("td"));//code to fin dthe number of coloumns in each table
		   System.out.println("the number of browsers:" +browsers.size());
		   
		   
		 WebElement browser234= driver.findElement(By.xpath("//*[@id=\"wb-auto-2\"]/tbody/tr[8]/td[2]"));
		 System.out.println(browser234);
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		  
		   
		   
		   
		   
			   
		   
		   
		  table11=driver.findElement(By.id("wb-auto-1"));
		  
		  java.util.List<WebElement> rows1 =driver.findElements(By.tagName("tr"));
		  System.out.println("number of rows:" +rows1.size());
		  
		  java.util.List<WebElement> col1 =driver.findElements(By.tagName("th"));
		  System.out.println("number of columns:" +col1.size());
		  
		  
		  
		
		 
			  
			  
			  
			  
			  
		  }
		  
		  
		  
		  
		  //java.util.List<WebElement> col1 =driver.findElements(By.tagName("th"));
		 // System.out.println("number of coloumns:" +col1.size());
		  
		  
		  
		 // WebElement row=table11.findElement(By.xpath("//*[@id=\\\"wb-auto-1\\\"]\tr"));
		 // System.out.println(row.getSize());
		  
		  
		  
		   
		   
		   
		   
		   
		   
	   }
	   
	   

}