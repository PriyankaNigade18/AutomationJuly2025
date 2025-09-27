package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T6_WebElementIdentification {

	public static void main(String[] args) 
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com");
		
		
		//Technique3: IndetifyElement + actions
		driver.findElement(By.id("APjFqb")).sendKeys("testng");
		
		
		
		
		
		/*
		//Technique2: IdentifyElement + validate +action
		
		WebElement searchbox=driver.findElement(By.id("APjFqb"));
		
		//validate
		if(searchbox.isDisplayed() && searchbox.isEnabled())
		{
			//action
			searchbox.sendKeys("selenium");
		}
		
		
		
		
		
		/*
		//Technique1: By Locator Identify +validate + perform action 
		
		//get the address of element using By class
		By searchBoxAddress=By.id("APjFqb");
		
		//find the element using selenium -findElement()
		WebElement searchEle=driver.findElement(searchBoxAddress);
		
		//validation
		System.out.println("Is search box displayed or not on webpage?: "+searchEle.isDisplayed());
		System.out.println("Is search box enabled or not?: "+searchEle.isEnabled());
		
		//actions
		searchEle.sendKeys("Java");
		*/
		
		
		
		
		
		
		
		

	}

}
