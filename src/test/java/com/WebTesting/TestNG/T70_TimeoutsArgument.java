package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class T70_TimeoutsArgument 
{
  @Test(timeOut = 5000)
  public void testCase1() throws InterruptedException
  {
	 System.out.println("This is test case1.....");
	 Thread.sleep(4000);
	 System.out.println(" test Completed!");
  }
  
  
  @Test(timeOut = 5000)
  public void testCase2() throws InterruptedException
  {
		 System.out.println("This is test case2.....");
		 Thread.sleep(6000);
		 System.out.println(" test Completed!");
  }
  
  
}
