package com.WebTesting.TestNG.Listerner;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(com.WebTesting.TestNG.Listerner.MyListeners.class)
public class TestListeners 
{
  @Test
  public void testCase1() 
  {
	  Assert.assertEquals(true,true);
	  System.out.println("Test Completed!");
  }
  
  @Test
  public void testCase2() 
  {
	  Assert.assertEquals(true,false);
	  System.out.println("Test Completed!");
  }
}
