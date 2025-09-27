package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class T5_NavigationCommands {

	public static void main(String[] args) throws InterruptedException 
	{
		// create driver session
		
		WebDriver driver=new ChromeDriver();
		
		//open application
		driver.get("https://www.google.com");

		System.out.println("Title is: "+driver.getTitle());
		
		Thread.sleep(2000);
		//Google--->facebook
		
		driver.navigate().to("https://www.facebook.com");
		
		System.out.println("Title is: "+driver.getTitle());
		
		Thread.sleep(2000);
		//back
		driver.navigate().back();//google
		
		Thread.sleep(2000);
		//forward()
		driver.navigate().forward();//facebook
		Thread.sleep(2000);
		
		//refresh()
		driver.navigate().refresh();
		
		

	}

}
