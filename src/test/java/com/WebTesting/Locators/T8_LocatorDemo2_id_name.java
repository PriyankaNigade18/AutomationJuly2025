package com.WebTesting.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T8_LocatorDemo2_id_name {

	public static void main(String[] args)
	{
		// create driver session'
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		//sign in
		driver.findElement(By.linkText("Sign In")).click();
		
		//login page
		
		//email-id locator
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password- name locator
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox- id locator
		driver.findElement(By.id("remember")).click();
		
		//submit -id locator
		driver.findElement(By.id("submit-id")).click();
		
		//assertion: check current status of application
		//based on title assert the navigation
		
		 String actTitle=driver.getTitle();
		 String expTitle="Customers";
		 
		 if(actTitle.equals(expTitle))
		 {
			 System.out.println("Login Completed...User navigated to Cusrtomers page!");
		 }else
		 {
			 System.out.println("Login Fail!");
		 }
		
		
		
		
		
		
		
		
		
		
		

	}

}
