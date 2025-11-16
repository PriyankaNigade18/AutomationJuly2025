package com.WebTesting.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class T72_DisableTest {
  @Test(priority=1)
  public void testForRegister() 
  {
	  System.out.println("This is register test");
  }
  
  @Test(priority=2)
  public void testForLogin() 
  {
	  System.out.println("This is login test");
  }
  
  //disable from xml 
  @Test(priority=3)
  public void testForSearch() 
  {
	  System.out.println("This is search test");
  }
  
  @Test(priority=4)
  public void testForAddToCart() 
  {
	  System.out.println("This is add to cart test");
  }
  
  //enabled attribute
  @Test(priority=5,enabled = false)
  public void testForPurches() 
  {
	  System.out.println("This is Purches test");
  }
}
