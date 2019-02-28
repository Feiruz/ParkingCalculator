package com.parkcal.library;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseLibrary {
	
	public static WebDriver driver;
	public static GlobalSel myLibrary;
	
	@BeforeClass
	
	public void BeforeAllTests() {
//		myLibrary = new GlobalSel(driver);
	}
	
	@BeforeMethod
	
	public void start() {
		driver = myLibrary.startChromeBrowser();
		
		
	}
	@AfterMethod
	
	public void afterAllTests() {
		driver.close();
		driver.quit();
		
		
	}

}
