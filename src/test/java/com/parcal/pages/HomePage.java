package com.parcal.pages;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.parkcal.library.BaseLibrary;

import oracle.net.aso.d;

public class HomePage extends BaseLibrary{
	
	public HomePage goToWebsite() {
		driver.get("http://adam.goucher.ca/parkcalc/");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		return this;
	}
	
	public HomePage verification(String expected) {
		
		WebElement amount = driver.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2) span.SubHead font:nth-child(1) > b:nth-child(1)"));
		String result = amount.toString();
		if (result==expected) {
			System.out.println("print");
			
		}else {
			System.out.println("not true");
		}
		
		return null;
		
	}
	
	public HomePage shortTermPark() {
		
		
		
		WebElement entrytime = driver.findElement(By.id("EntryTime"));
		entrytime.click();
		entrytime.clear();
		entrytime.sendKeys("11:30");
		
		WebElement entryDate = driver.findElement(By.id("EntryDate"));
		entryDate.click();
		entryDate.clear();
		entryDate.sendKeys("03/30/2019");
		
		WebElement leavingTime = driver.findElement(By.id("ExitTime"));
		leavingTime.click();
		leavingTime.clear();
		leavingTime.sendKeys("12:00");
		
		WebElement leavingDate = driver.findElement(By.id("ExitDate"));
		leavingDate.click();
		leavingDate.clear();
		leavingDate.sendKeys("04/30/2019");
		
		WebElement clickBtn = driver.findElement(By.xpath("//input[@value='Calculate']"));
		clickBtn.click();
		return this;
	}
	
	public HomePage parLot() {
		
		WebElement lot = driver.findElement(By.id("Lot"));
		lot.click();
		Select lotDropDown = new Select(lot);
		lotDropDown.selectByVisibleText("Long-Term Surface Parking");
		
		WebElement entrytime = driver.findElement(By.id("EntryTime"));
		entrytime.click();
		entrytime.clear();
		entrytime.sendKeys("01:00");
		
		WebElement entryDate = driver.findElement(By.id("EntryDate"));
		entryDate.click();
		entryDate.clear();
		entryDate.sendKeys("05/01/2019");
		
		WebElement leavingTime = driver.findElement(By.id("ExitTime"));
		leavingTime.click();
		leavingTime.clear();
		leavingTime.sendKeys("03:00");
		
		WebElement leavingDate = driver.findElement(By.id("ExitDate"));
		leavingDate.click();
		leavingDate.clear();
		leavingDate.sendKeys("06/01/2019");
		
		WebElement clickBtn = driver.findElement(By.xpath("//input[@value='Calculate']"));
		clickBtn.click();
		return this;
	}

}
