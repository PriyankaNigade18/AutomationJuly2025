package com.WebTesting.ElementAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class T48_DisableNotifications {
  @Test
  public void testAppWithoutNotification()
  {
	  
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  
	  WebDriver driver=new ChromeDriver(option);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.goibibo.com/");
  }
}
