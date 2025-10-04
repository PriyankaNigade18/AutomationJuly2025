package com.WebTesting.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T15_LocatorDemo9_CssSelectorSymbols {

	public static void main(String[] args)
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//searchbox: * Contains()
		//driver.findElement(By.cssSelector("input[id*='textbox']")).sendKeys("watch",Keys.ENTER);

		//searchbox: ^ prefix value: stratsWith()
		//driver.findElement(By.cssSelector("input[id^='twotab']")).sendKeys("laptop",Keys.ENTER);
		
		//searchbox: $ suffix value: endsWith()
		driver.findElement(By.cssSelector("input[id$='textbox']")).sendKeys("mobile",Keys.ENTER);
		
		
		
		
	}

}
