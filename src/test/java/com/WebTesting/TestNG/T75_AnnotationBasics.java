package com.WebTesting.TestNG;

import org.testng.annotations.*;


public class T75_AnnotationBasics {
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("User Register Test");
  }
  
  @Test(priority=2)
  public void loginTest() 
  {
	  System.out.println("User Login Test");
  }
  
  @Test(priority=3)
  public void logoutTest() 
  {
	  System.out.println("User Logout Test");
  }
  
  //Annotation meaning (rule)
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("BeforeMethod will execute before every test case");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("AfterMethod will execute after every test case");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("BeforeClass will execute only before first test case in Class");
  }
  
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("AfterClass will execute only after last test case in Class");
  }
  
  
  @BeforeTest
  public void btest()
  {
	  System.out.println("BeforeTest will execute beforeclass");
  }
  
  
  @AfterTest
  public void atest()
  {
	  System.out.println("AfterTest will execute afterclass");
  }
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("BeforeSuite Executes before Test");
  }
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("AfterSuite Executes after Test");
  }
}
