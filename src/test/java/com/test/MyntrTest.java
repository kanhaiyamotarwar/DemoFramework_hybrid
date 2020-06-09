package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.MyntratLogin;

public class MyntrTest extends TestBase {
	
	MyntratLogin Myntraloginpage;
	public MyntrTest()
	{
		super();

	}
	

	@BeforeTest
	public void setup()
	{
		initialization();
	
		Myntraloginpage = new MyntratLogin();
				
	}
	
	
	@Test
	public void verifyProfileIcon()
	{
		String title=Myntraloginpage.Men();
		AssertJUnit.assertEquals("Men Shopping Online - Shop for Mens Clothing & Accessories in India | Myntra",title );
		
		
	}
	
	
	
	@AfterMethod
	public void teardown() 
	{
		driver.quit();
	}
	
	


}
