package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class T68_InvocationCount
{
  @Test(priority=1)
  public void userRegister()
  {
	  System.out.println("Register Test");
	  
  }
  
  @Test(priority=2)
  public void userLogin()
  {
	  System.out.println("Login Test");
	  
  }
  
  @Test(priority=3,invocationCount = 3)
  public void userSearch()
  {
	  System.out.println("Search Test");
	  
  }
  
  @Test(priority=4)
  public void userLogout()
  {
	  System.out.println("Logout Test");
	  
  }
}
