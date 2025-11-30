package com.WebTesting.TetsNG.DataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tc86_DataDrivenTestUsingArray 
{
//	@DataProvider(name="testArrayData")
//	public Object[][] testData()
//	{
//		Object data[][]= {{"Admin","admin123"},{"Kiran","test123"},{"Admin","admin123"},{"Sujit","test123"}};
//		return data;
//	}
	
	
	
	
	@Test(dataProvider ="testArrayData",dataProviderClass = CustomData.class)
  public void testLogin(String un,String psw) 
  {
		System.out.println("User name is: "+un);
		System.out.println("Password is: "+psw);
		
  }
}
