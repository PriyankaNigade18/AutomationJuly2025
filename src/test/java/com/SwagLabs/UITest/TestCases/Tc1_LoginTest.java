package com.SwagLabs.UITest.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.UITest.Base.BaseClass;

public class Tc1_LoginTest extends BaseClass{
  @Test(priority=1)
  public void verifyUrl() 
  {
	 String actUrl=lp.getAppUrl();
	 String expUrl="https://www.saucedemo.com/";
	 Assert.assertEquals(actUrl,expUrl);
	 System.out.println("Application url matched...: "+actUrl);
  }
  
  @Test(priority=2)
  public void verifyTitle()
  {
	  String actTitle=lp.getAppTitle();
	  String expTitle="Labs";
	  Assert.assertTrue(actTitle.contains(expTitle));
	  System.out.println("Application title matched...:"+actTitle);
  }
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  lp.enterUserName("standard_user");
	  lp.enterPassword("secret_sauce");
	  lp.clickOnLoginButton();
	  Assert.assertTrue(lp.getAppUrl().contains("inventory"));
	  System.out.println("Login completed....");
  }
}
