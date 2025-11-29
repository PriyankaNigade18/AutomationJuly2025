package com.WebTesting.TestNG.TestDataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Tc83_DataReadingFromPropertiesfileDemo1 {
  @Test
  public void readDataFromFile() throws IOException 
  {
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Config.properties");
	  
	  //read file
	  FileInputStream fs=new FileInputStream(f1);
	  
	 //Properties class Object
	  Properties prop=new Properties();	
	  
	  //load the file
	  prop.load(fs);
	  
	  //read the file contents
	  System.out.println("Browser name: "+prop.getProperty("bname"));
	  System.out.println("Platform name: "+prop.getProperty("platform"));
	  System.out.println("Url is: "+prop.getProperty("url"));
	  
	  
	  
	  
  }
}
