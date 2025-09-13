package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleTitleValidation {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com");
		
		//get the title from app
		String actTitle=driver.getTitle();
		
		//validate actual title should be equal to Google
		String expTitle="Google";
		
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title matched!...Test Pass");
			System.out.println("Title is: "+actTitle);
		}else
		{
			System.out.println("Title not matched!...Test Fail");
		}
			
		
		
		
		

	}

}
