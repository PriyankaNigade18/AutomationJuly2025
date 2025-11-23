package com.WebTesting.TestNG.POMUsingByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRMLoginTest extends BaseClass
{
  @Test(priority=1)
  public void testAppUrl()
  {
	  //CRMLoginPage lp=new CRMLoginPage();
	  String actUrl=lp.getAppUrl();
	  String expUrl="login";
	  Assert.assertTrue(actUrl.contains(expUrl));
	  System.out.println("Url matched..."+actUrl);
	  
  }
  
  
  @Test(priority=2)
  public void testAppLogin() 
  { 
	  //CRMLoginPage lp=new CRMLoginPage();
	  
	  lp.enterEmailId("test@gmail.com");
	  lp.enterPassword("test123");
	  lp.clickOnSubmitButton();
	  Assert.assertTrue(lp.getAppUrl().contains("customers"),"Login Fail!");
	  System.out.println("Login Completed!");
  }
  
  
  
  @Test(priority=3)
  public void testAppTitle() 
  {
	  String actTitle=lp.getAppTitle();
	  System.out.println("Title is: "+actTitle);
  }
  
}
