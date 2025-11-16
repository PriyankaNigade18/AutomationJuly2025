package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T71_DependsOnMethodArgument {
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("This is user Registration....");
  }
  
  @Test(priority=2,dependsOnMethods ="registerTest")
  public void loginTest()
  {
	  System.out.println("This is user login....");
	  AssertJUnit.assertTrue(false);
  }
  
  @Test(priority=3,dependsOnMethods ="loginTest")
  public void logoutTest()
  {
	  System.out.println("This is user logout....");
  }
}

