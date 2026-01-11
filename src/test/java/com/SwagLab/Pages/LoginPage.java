package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//locator
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	//public methods
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public void enterUserName(String un)
	{
		username.sendKeys(un);
	}
	
	public void enterPassword(String psw)
	{
		password.sendKeys(psw);
	}
	
	
	public InventoryPage clickLoginButton()
	{
		loginButton.click();
		//navigation to next page then return next page object
		return new InventoryPage(driver);
	}
	
	public InventoryPage doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginButton.click();
		return new InventoryPage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
