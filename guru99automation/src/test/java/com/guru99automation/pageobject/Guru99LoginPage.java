package com.guru99automation.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPage {
	
	public WebDriver ldriver;
	
	
	public Guru99LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;
		PageFactory.initElements(rDriver, this);
		
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="pass")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement btnLogin;
	
	
	public void setUserName(String username)
	{
		txtUserName.sendKeys(username);
	}
	
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}

	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
}
