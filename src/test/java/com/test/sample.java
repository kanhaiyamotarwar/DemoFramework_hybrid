package com.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sample {
WebDriver driver;
	@Test(retryAnalyzer=com.util.retryAnalyser.class)
	public void first() {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","/Users/kanhaiyamotarwr/eclipse-workspace/HybridFramework/Resources/chromedriver 4");
		 //System.setProperty("webdriver.chrome.driver","/Users/kanhaiyamotarwr/Desktop/chromedriver5");
		System.setProperty("webdriver.gecko.driver","/Users/kanhaiyamotarwr/Desktop/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*
		driver.get("https://ui.freecrm.com/");
		
		
		String title=driver.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		System.out.println(title);
		
		boolean flag= driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).isDisplayed();
		System.out.println(flag);
		
		*/
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//driver.findElement(By.xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("dhajbasbjasbcajbcja");;
	}
	
	
}
