package com.WebTesting.TestNG.TestDataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.PropertiesUtil;

public class Tc84_DataReadingFromPropertiesfileDemo2 
{
  @Test
  public void testGooglewithPropertiesFile() throws IOException 
  {

	  PropertiesUtil prop=new PropertiesUtil();
	  	  
	  WebDriver driver=new ChromeDriver();
	  driver.get(prop.getData("url"));
	  
	  driver.findElement(By.id(prop.getData("searchId"))).sendKeys("Java");
	  
  }

}