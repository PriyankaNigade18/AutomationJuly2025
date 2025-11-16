package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T69_AssertionsInTestNG {
  @Test
  public void testHardAssertion() 
  {
	  String act="Selenium webdriver is webUi automation library";
	  String exp="Selenium webdriver is webUi automation library";

	 // Assert.assertEquals(act,exp,"Test Fail: Strings are not equal");//java.lang.AssertionError
	  //Assert.assertTrue(act.equals(exp),"Test Fail: Strings are not equal");//AssertionError
	  /*
	   * -ve Scenario: act string should not contains TestNG
	   * Act string should not equal with exp string
	   * assertFalse(false)-->test pass
	   * 
	   */
	  //Assert.assertFalse(act.equals(exp),"Test Fail: Strings are equal");
	  // act string should not contains TestNG
	  Assert.assertFalse(act.contains("Testng"),"Test Fail: Testng is part of current string ");
	  System.out.println("Test Pass:Testng is not a part of current string");
	  
  }
  
  @Test
  public void testSoftAssertion()
  {
	  int a=1000,b=1000;
	  SoftAssert sf=new SoftAssert();
	  //sf.assertEquals(a,b,"Test Fail: Numbers are not equal");
	  //sf.assertTrue(a==b,"Test Fail: Numbers are not equal");
	  sf.assertFalse(a==b,"Test Fail: Numbers are equal");
	  System.out.println("Test Pass: Numbers are not equal");
	  sf.assertAll();
	  
	  
	  
	  
	  
	  
  }
}
