package com.WebTesting.ElementAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T32_OpenNewTab_Window {
  @Test
  public void testWindowTab()
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  
	  //new tab open facebook
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  
	  
	  //new window
	  WebDriver newWin=driver.switchTo().newWindow(WindowType.WINDOW);
	  newWin.get("https://www.amazon.in");
	  
	  
	  
	  
	  
  }
}
