package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class MyntratLogin extends TestBase{
	

	// page factory :OR (object repository)

	@FindBy(xpath="//span[text()='Profile']")
	WebElement Profile_icon;
	
	@FindBy(xpath="//a[text()='login / Signup']")
	WebElement login_button;
	
	

	


	// how will you initialize your page factory?
	/*
	 * we have one method "pagefactory.initElements(driver,this)" with driver which
	 * is coming from base class and this mens current class objects
	 */
	// initializing the objects

	public MyntratLogin() {
		PageFactory.initElements(driver, this); 

	}

	public String Men() {
	driver.get("https://www.myntra.com/shop/men");
	String title=driver.getTitle();
		return title;
		
	}
	
	
	

}
