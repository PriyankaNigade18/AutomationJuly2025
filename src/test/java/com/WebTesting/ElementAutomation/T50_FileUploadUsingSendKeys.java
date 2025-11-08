package com.WebTesting.ElementAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T50_FileUploadUsingSendKeys {
  @Test
  public void testFileUpload()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  driver.findElement(By.id("file-upload")).sendKeys("C://Users//piyun//OneDrive//Desktop//Appiumsetup.txt");
	  
	  //file upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  //assertion
	  String actText=driver.findElement(By.tagName("h3")).getText();
	  String expText="File Uploaded!";
	  
	  if(actText.equals(expText))
	  {
		  System.out.println("Test pass....File uploaded!");
	  }else
	  {
		  System.out.println("Test Fail......File not Uploaded");
	  }
	  
	  
	  
	  
  }
}
