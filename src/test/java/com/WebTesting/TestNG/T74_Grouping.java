package com.WebTesting.TestNG;

import org.testng.annotations.Test;

public class T74_Grouping 
{
	@Test(groups = "SmokeTest")
	  public void testCase11()
	  {
		  System.out.println("This is test11");
	  }
	  
	  @Test(groups = "SmokeTest")
	  public void testCase22()
	  {
		  System.out.println("This is test22");
	  }
	  
}
