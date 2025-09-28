package com.WebTesting.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class T10_LocatorDemo4_ClassName {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new EdgeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		
		//email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.id("password")).sendKeys("test123");
		
		//submit buton
		//driver.findElement(By.className("btn btn-default btn-primary")).click();//InvalidSelectorException: Compound class names not permitted
		
		driver.findElement(By.className("btn")).click();
		
		
				

	}

}
