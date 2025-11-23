package com.WebTesting.TestNG.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.*;

public class BaseTest {

	@BeforeTest
	public void btest()
	{
		System.out.println("Before test executing.....");
	}
	
	@AfterTest
	public void atest()
	{
		System.out.println("After test executing.....");
	}
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before suite executing....");
	}
	
	
	@AfterSuite
	public void asuite()
	{
		System.out.println("After suite executing....");
	}
//	@BeforeClass
//	public void bclass()
//	{
//		System.out.println("Before class executing...");
//		
//	}
}
