package com.WebTesting.TestNG.POMUsingPageFactoryClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
  @Test(priority=1)
  public void verifyUrl()
  {
	  String actUrl=lp.getAppUrl();
	  String expUrl="login";
	  Assert.assertTrue(actUrl.contains(expUrl));
	  System.out.println("Url matched: "+actUrl);
  }
  
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String expTitle="Customer Service - Login";
	  String actTitle=lp.getAppTitle();
	  Assert.assertEquals(actTitle,expTitle);
	  System.out.println("Title Matched: "+actTitle);
  }
  
  
  @Test(priority=3)
  public void verifyLogin()
  {
	  lp.doLogin("test@gmail.com","test123");
	  
	  Assert.assertTrue(lp.getAppUrl().contains("customers"));
	  System.out.println("Login Successful!");
  }
}
