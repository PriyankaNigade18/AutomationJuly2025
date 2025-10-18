package com.WebTesting.Generic;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility
{
	
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		  
		  List<WebElement> allOptions=dd.getOptions();
		  System.out.println("Total options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
	}
	
	

	
	//Window handling utilities
	
	
	//design reusable code(utility) to close all windows
	
	public static void closeAllChildWindows(WebDriver driver,List<String> allHandles,String parentId)
	{
		for(String childWindowId:allHandles)//[101,102,103,104,105]
		  {
			if(!parentId.equals(childWindowId))
			{
				driver.switchTo().window(childWindowId).close();
			}
			  
		  }
	}
	
	//parent Window Acces
	public static WebDriver switchToParentWindow(WebDriver driver,String parentId)
	{
		driver.switchTo().window(parentId);
		return driver;
		
	}
	
	//switch to appropriate window
	public static boolean switchToExpectedWindow(WebDriver driver,List<String> allHandles,String windowTitle)
	{
		for(String windowId:allHandles)
		  {
			  //get the title of every window
			  String title=driver.switchTo().window(windowId).getTitle();
			  if(title.contains(windowTitle))
			  {
				  System.out.println("Found right window");
				  return true;
			  }
			 
		  }
		return false;
	}
	
	//Utilities for JavascriptExecutor
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	public static void scrollUptoEelement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
