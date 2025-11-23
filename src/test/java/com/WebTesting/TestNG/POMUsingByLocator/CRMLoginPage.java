package com.WebTesting.TestNG.POMUsingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * Page Object follows Encapsulation=private data + public method
 * page class= constructor + Locators(private) +Methods(public)
 */
public class CRMLoginPage 
{
	private WebDriver driver;
	
	//constructor to initialize current class driver
	public CRMLoginPage(WebDriver driver)//this driver from base class
	{
		this.driver=driver;
	}
	//Locators
	private By emailEle=By.id("email-id");
	private By passwordEle=By.id("password");
	private By submitBtn=By.id("submit-id");
	
	//Actions(methods)
	
	public void enterEmailId(String emailId)
	{
		driver.findElement(emailEle).sendKeys(emailId);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(passwordEle).sendKeys(password);
	}
	
	public void clickOnSubmitButton()
	{
		driver.findElement(submitBtn).click();
	}
	
	public void doLogin(String emailId,String password)
	{
		driver.findElement(emailEle).sendKeys(emailId);
		driver.findElement(passwordEle).sendKeys(password);
		driver.findElement(submitBtn).click();
		//navigating to next page you need to return object of next page
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
