package com.WebTesting.ElementAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class T47_IncognitoModeExecution {
  @Test
  public void testAppInIncognitoBrowser()
  {
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--incognito");
	  
	  WebDriver driver=new ChromeDriver(option);
	  driver.get("https://www.facebook.com");
  }
}
