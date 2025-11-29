package com.WebTesting.TestNG.TestDataReading;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Tc77_DataReadingFromXmlDemo1 
{
	@Parameters({"username","password"})
  @Test
  public void readData(String un,String psw) 
  {
	  
	  System.out.println("User Name is: "+un);
	  System.out.println("Password is: "+psw);
  }
}
