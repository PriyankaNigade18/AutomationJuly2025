package com.WebTesting.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T21_LocatorDemo12_XpathMethods {

	public static void main(String[] args) throws InterruptedException
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//click on Sell:xpath with text()
		driver.findElement(By.xpath("//a[text()='Sell']")).click();
		
		//click on Cart:xpath with normalize-space()
		driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
		
		//get the text of element:xpath with normalize-space()
		String text=driver.findElement(By.xpath("//h3[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println("Text is: "+text);
		
		//search box:xpath with contains()
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("Bags",Keys.ENTER);
		
		//search box clear the text and search for watch:xpath with startsWith()
		WebElement searchEle=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		
		searchEle.clear();
		
		Thread.sleep(1500);
		searchEle.sendKeys("watch",Keys.ENTER);
		
		
		
		
		

	}

}
