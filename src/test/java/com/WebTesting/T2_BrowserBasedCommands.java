package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class T2_BrowserBasedCommands {

	public static void main(String[] args)
	{
		//ctrl+shift+O
		
		// create driver session with chrome:open browser
		WebDriver driver= new ChromeDriver();
		
		//open crm application: get(url)
		driver.get("https://automationplayground.com/crm/");
		
		//get the title: getTitle()
		String actTitle=driver.getTitle();
		System.out.println("Application title is: "+actTitle);

		//get the current url: getCurrentUrl()
		System.out.println("Current url is: "+driver.getCurrentUrl());
		
		//get the page source: getPageSource()
		System.out.println(driver.getPageSource());
		
		//close the browser: close():current browser quit():all open browsers
		//driver.close();
		driver.quit();
		
		
	}

}
