package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;

import com.pages.HomePage;
import com.pages.LoginPage;

import com.util.TestUtility;

public class LoginPageTest extends TestBase
{
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtility util;
	String Sheetname ="LoginData";
	
	/*
	 * here creating one LoginPageTest() constructor and using "super" keyword
	 * This constructor will initialize the test base class constructor
	 * because we have properties file in the test base constructor
	 */
	
	public LoginPageTest()
	{
		super();

	}
	
	
	
	@BeforeTest
	public void setup()
	{
		initialization();
	
	   loginpage = new LoginPage();
				
	}
	/*
	
	@DataProvider
	public Object[][] dataprovider()
	{
		
		Object data[][]= util.getTestData(Sheetname);
		return data;
	}
	
	@Test(dataProvider="dataprovider")
	public void login()
	{
		
		
	}
	*/
	
	@Test
	public void validateLoginPageTitle()
	{
		String str=loginpage.validateLoginPageTitle();
		Assert.assertEquals(str, "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
	}
	
	
	
	@AfterMethod
	public void teardown() 
	{
		driver.quit();
	}
	
	

}
