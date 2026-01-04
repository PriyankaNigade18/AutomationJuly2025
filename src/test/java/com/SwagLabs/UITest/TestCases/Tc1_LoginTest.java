package com.SwagLabs.UITest.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.UITest.Base.BaseClass;
import com.SwagLabs.UITest.Utility.ExcelUtil;
import com.aventstack.chaintest.plugins.ChainTestListener;

public class Tc1_LoginTest extends BaseClass{
  @Test(priority=1)
  public void verifyUrl() 
  {
	 String actUrl=lp.getAppUrl();
	 String expUrl=prop.getData("url");
	 Assert.assertEquals(actUrl,expUrl);
	 System.out.println("Application url matched...: "+actUrl);
	 ChainTestListener.log("Url verified....");
  }
  
  @Test(priority=2)
  public void verifyTitle()
  {
	  String actTitle=lp.getAppTitle();
	  String expTitle="Labs";
	  Assert.assertTrue(actTitle.contains(expTitle));
	  System.out.println("Application title matched...:"+actTitle);
	  ChainTestListener.log("Title verified....");
  }
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  //lp.enterUserName(prop.getData("un"));
	  lp.enterUserName(ExcelUtil.getData("Appdata",1,1));
	  //lp.enterPassword(prop.getData("psw"));
	  lp.enterPassword(ExcelUtil.getData("Appdata",2,1));
	  lp.clickOnLoginButton();
	  Assert.assertTrue(lp.getAppUrl().contains("inventory"));
	  System.out.println("Login completed....");
	  ChainTestListener.log("Login completed....");
  }
}
