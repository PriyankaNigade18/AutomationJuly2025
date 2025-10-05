package com.WebTesting.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class T23_RelativeLocators {

	public static void main(String[] args) 
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		//enter email which is above password 
		driver.findElement(RelativeLocator.with(By.id("email-id")).above(By.id("password"))).sendKeys("test@gmail.com");

		//enter password which is below email id
		driver.findElement(RelativeLocator.with(By.id("password")).below(By.id("email-id"))).sendKeys("test123");
		
		//near: check the checkbox which is near that Remember me text
		driver.findElement(RelativeLocator.with(By.id("remember")).near(By.xpath("//label[text()='Remember me']"))).click();

		//toLeftOf():enter keyword into searchbox which is left of signin
		driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Search']")).toLeftOf(By.xpath("//a[text()='Sign In']"))).sendKeys("abcde");
		
		//toRightOf(): enter keyword into searchbox which id right of Customer service
		driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Search']")).toRightOf(By.xpath("//a[text()='Customer Service']"))).sendKeys("xyz..");
	}

}
