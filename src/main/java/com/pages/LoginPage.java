package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
	

	
	@FindBy(xpath="//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a")
	WebElement Navigate_SignIn_btn;
	
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement UserName_inputBox;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement Next_button;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password_inputBox;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement PasswordPage_next_btn;
	

	// how will you initialize your page factory?
	/*
	 * we have one method "pagefactory.initElements(driver,this)" with driver which
	 * is coming from base class and this mens current class objects
	 */
	// initializing the objects

	public LoginPage() {
		PageFactory.initElements(driver, this); 

	}

	// Actions

	public String validateLoginPageTitle() {
		System.out.println("in login page title method1");
		
		String pageTitle= driver.getTitle();
		return pageTitle;
	
	}
	
	
	
}
