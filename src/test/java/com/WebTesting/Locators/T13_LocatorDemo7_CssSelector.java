package com.WebTesting.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T13_LocatorDemo7_CssSelector {

	public static void main(String[] args)
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
		
		//username: tagname with id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//password: tagname with attribute
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		
		//login button: tagname with classname
		//driver.findElement(By.cssSelector("input.btn_action")).click();
		
		//tagname with id,classname and attribute
		driver.findElement(By.cssSelector("input.btn_action#login-button[value='LOGIN']")).click();

	}

}
