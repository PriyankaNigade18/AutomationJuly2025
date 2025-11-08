package com.WebTesting.ElementAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T51_MultipleFileUpload {
  @Test
  public void testMultipleFiles()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Upload Files']"));
	  //scroll down the page
	  Utility.scrollUptoEelement(driver,ele);
	  
	  //for multiple files use \n as seperator
	  driver.findElement(By.id("multipleFilesInput")).sendKeys("C://Users//piyun//OneDrive//Desktop//Appiumsetup.txt\nC://Users//piyun//OneDrive//Desktop//TestNG Listners.txt");
	  
  }
}
