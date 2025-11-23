package com.WebTesting.TestNG.POMUsingPageFactoryClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Page Class=Constructor+Locators+Actions
public class LoginPage 
{
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)//driver from base class
	{
		this.driver=driver;
		//initialize locators 
		PageFactory.initElements(driver,this);
	}

	//Locators
	@FindBy(id="email-id")
	private WebElement emailEle;
		
	@FindBy(id="password")
	private WebElement passwordEle;
	
	@FindBy(id="submit-id")
	private WebElement submitBtn;
	
	//actions
	
	public void enterEmailId(String emailId)
	{
		emailEle.sendKeys(emailId);
	}
	
	public void enterPassword(String password)
	{
		passwordEle.sendKeys(password);
	}
	
	public void clickOnSubmitButton()
		{
		submitBtn.click();
	}
	
	public void doLogin(String emailId,String password)
	{
		emailEle.sendKeys(emailId);
		passwordEle.sendKeys(password);
		submitBtn.click();
	}
	
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
}
