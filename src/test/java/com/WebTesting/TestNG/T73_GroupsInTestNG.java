package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class T73_GroupsInTestNG 
{
  @Test(groups = "SmokeTest")
  public void testCase1()
  {
	  System.out.println("This is test1");
  }
  
  @Test(groups = "SmokeTest")
  public void testCase2()
  {
	  System.out.println("This is test2");
  }
  
  @Test(groups = "FunctionalTest")
  public void testCase3()
  {
	  System.out.println("This is test3");
  }
  
  
  @Test(groups = "FunctionalTest")
  public void testCase4()
  {
	  System.out.println("This is test4");
  }
  
  @Test(groups = "FunctionalTest")
  public void testCase5()
  {
	  System.out.println("This is test5");
  }
  
  @Test(groups = "RegressionTest")
  public void testCase6()
  {
	  System.out.println("This is test6");
  }
  
  @Test(groups = "RegressionTest")
  public void testCase7()
  {
	  System.out.println("This is test7");
  }
  
  @Test(groups = "RegressionTest")
  public void testCase8()
  {
	  System.out.println("This is test8");
  }
  
  @Test(groups = "RegressionTest")
  public void testCase9()
  {
	  System.out.println("This is test9");
  }
}
