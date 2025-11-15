package com.WebTesting.TestNG;

import org.testng.annotations.Test;

public class T67_PriorityArgument 
{
  @Test(priority=-1,description = "This is register test")
  public void userRegister() 
  {
	  System.out.println("This is test case 1");
  }
  
  
  @Test(priority=0,description = "This is login test")
  public void userLogin() 
  {
	  System.out.println("This is test case 2");
  }
  
  
  @Test(priority=1,description = "This is logout test")
  public void userLogout() 
  {
	  System.out.println("This is test case 3");
  }
}
