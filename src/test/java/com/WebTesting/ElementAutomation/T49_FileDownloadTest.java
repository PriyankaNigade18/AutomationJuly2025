package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class T49_FileDownloadTest {
  @Test
  public void testDownload() 
  {
	  
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> prefs = new HashMap<String, Object>();
	  prefs.put("download.default_directory","C:\\Users\\piyun\\OneDrive\\Desktop\\Trainings\\July2025\\MavenSeleniumProject");
	  options.setExperimentalOption("prefs",prefs);
	  
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/download");
	  
	  //click of file
	  driver.findElement(By.xpath("//a[text()='selenide-intro.txt']")).click();
	  
	  driver.findElement(By.xpath("//a[text()='spectrum-logo.png']")).click();
	  
	  
	  
  }
}
