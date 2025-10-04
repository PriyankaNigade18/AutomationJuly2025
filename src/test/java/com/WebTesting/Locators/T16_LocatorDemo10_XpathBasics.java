package com.WebTesting.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T16_LocatorDemo10_XpathBasics {

	public static void main(String[] args) 
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://automationplayground.com/crm/");
		
		//SignIn link
		driver.findElement(By.xpath("//a[@id='SignIn']")).click();
		
		//email
		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
				
		//checkbox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
