package com.parcal.tests;

import org.testng.annotations.Test;

import com.parcal.pages.HomePage;
import com.parkcal.library.BaseLibrary;

public class parkCalTests extends BaseLibrary{
	
	HomePage page = new HomePage();
	
	@Test
	public void allTests() {
		
		try {
			page.goToWebsite();
			page.shortTermPark();
			page.verification("806");
			page.parLot();
			
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	}


