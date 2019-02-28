package com.parkcal.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalSel {
	
	private WebDriver driver;
	
	public GlobalSel(WebDriver _driver) {
		driver = _driver;
		
		
	}
	
	public WebDriver startChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browser_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		driver.manage().window().maximize();
		return driver;
	}

}
