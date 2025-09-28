package com.WebTesting.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T9_LocatorDemo3_ClassName {

	public static void main(String[] args)
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		//email
		driver.findElement(By.id("input-email")).sendKeys("test24@gmail.com");
		
		//password
		driver.findElement(By.name("password")).sendKeys("test123");
		
		//login-className: matched multiple elements 
		//driver.findElement(By.className("btn btn-primary")).click();//InvalidSelectorException
		
		//driver.findElement(By.className("btn-primary")).click();
		
		//cssSelector using className
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		
		

	}

}
