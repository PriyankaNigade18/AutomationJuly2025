package com.Cucumber.Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Cucumber.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CRMHooks
{
	public WebDriver driver;
	
	@Before
	public void setup()
	{
		System.out.println("Driver session started.....");
		//driver=new EdgeDriver();
		driver=BrowserProvider.setDriver("edge");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@After
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(1500);
		driver.quit();
		System.out.println("Driver session closed!");
	}

}
