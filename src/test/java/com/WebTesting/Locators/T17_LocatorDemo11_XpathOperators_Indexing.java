package com.WebTesting.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T17_LocatorDemo11_XpathOperators_Indexing {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//open 
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//firstname: xpath using and operator
		driver.findElement(By.xpath("//input[@name='firstname'  and  @class='form-control']")).sendKeys("Deepak");
		
		//lastname: xpath using or operator
		driver.findElement(By.xpath("//input[@id='input-lastname' or @class='form-contro']")).sendKeys("Sharma");
		
		
		//email using xpath index
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("deepaksharma123@gmail.com");
		
		//telephone using xpath index
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("877666");
		
		//password using position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//confirm password using postion()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		
		//yes radio button
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//continue button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		//message
		String expMessage="Your Account Has Been Created!";
		String actMessage=driver.findElement(By.xpath("(//h1)[2]")).getText();
		
		if(actMessage.equals(expMessage))
		{
			System.out.println("User Register successfully....Test Pass!");
		}
		else
		{
			System.out.println("Registartion Fail...Test Fail!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
