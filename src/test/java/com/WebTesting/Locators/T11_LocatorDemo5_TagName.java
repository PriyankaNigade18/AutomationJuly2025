package com.WebTesting.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T11_LocatorDemo5_TagName {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Number of input box
		List<WebElement> allTextBoxes=driver.findElements(By.tagName("input"));
		System.out.println("Number of text boxes are: "+allTextBoxes.size());//3
		
		//Number of Images
		int images=driver.findElements(By.tagName("img")).size();
		System.out.println("Total images are: "+images);//3
		
		//Number of Links
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println("Total links are: "+links);//5
		
		//NoSuchElementException: no such element: selenium wait for 10sec and look for element
		//driver.findElement(By.id("abcd")).sendKeys("test");
		
		
		
		
		
		
		
		
		
		
		

	}

}
