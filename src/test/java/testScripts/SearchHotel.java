package testScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;
import java.util.spi.AbstractResourceBundleProvider;            //

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import helperspackage.BasePage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import org.testng.reporters.*;
import org.openqa.selenium.By;

public class SearchHotel extends BasePage {
	
	
	
	Loginpage obj = new Loginpage();
	Homepage obj1 = new Homepage();
	@Test
	public void sum()
	
	{
	launchapp();
	}
	
	
	
	
	@Test
	public void loginFunctionality() {
		
		driver.findElement(obj.usernameTextBox).sendKeys("rameshadepu");
		driver.findElement(obj.pwdTextBox).sendKeys("ramesh");
		driver.findElement(obj.loginbutton).click();
	}

	
	public void SearchHotal() throws InterruptedException {
		new Select(driver.findElement(obj1.LocationListBox)).selectByVisibleText("London");
		Thread.sleep(3000);
		new Select(driver.findElement(obj1.numofroomsListbox)).selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(obj1.CheckInDateTextBox).clear();
		driver.findElement(obj1.CheckInDateTextBox).sendKeys("13/07/2021");
		driver.findElement(obj1.CheckOutDateTextBox).clear();
	    driver.findElement(obj1.CheckOutDateTextBox).sendKeys("15/07/2021");
		new Select(driver.findElement(obj1.AdultsperroomListBox)).selectByIndex(1);
		driver.findElement(obj1.searchbutton).click();
		
		driver.quit();
		
		

	}
}

