package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class T4_OrangehrmLaunchTest {

	public static void main(String[] args) 
	{
		//ctrl+shift+O
		//create browser session
		WebDriver driver=new EdgeDriver();
		
		//open application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//to get title
		String actTitle=driver.getTitle();
		
		String expTitle="OrangeHRM";
		
		//validation-if-else
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title matched....Test pass!");
		}
		else
		{
			System.out.println("Title not matched....Test Fail!");
		}
		
		//to current url
		String actUrl=driver.getCurrentUrl();
		
		String expUrl="https";
		
		if(actUrl.contains(expUrl))
		{
			System.out.println("Url contains protocol!");
		}else
		{
			System.out.println("Protocol is missing");
		}
		
		//close the browser
		driver.close();
		
				

	}

}
