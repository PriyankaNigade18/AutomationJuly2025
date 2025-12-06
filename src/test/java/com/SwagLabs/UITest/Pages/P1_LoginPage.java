package com.SwagLabs.UITest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1_LoginPage 
{
	private WebDriver driver;
	
	public P1_LoginPage(WebDriver driver)//base class 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(id="user-name")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	
	//actions

	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public P1_LoginPage enterUserName(String un)
	{
		userName.sendKeys(un);
		return this;
	}
	
	public P1_LoginPage enterPassword(String psw)
	{
		password.sendKeys(psw);
		return this;
	}
	
	public P2_InventoryPage clickOnLoginButton()
	{
		loginButton.click();
		//navigate to Inventory page
		return new P2_InventoryPage(driver);
	}
	
	public P2_InventoryPage doLogin(String un,String psw)
	{
		userName.sendKeys(un);
		password.sendKeys(psw);
		loginButton.click();
		//Navigate to Inventory page
		return new P2_InventoryPage(driver);
	}
	
	

}
