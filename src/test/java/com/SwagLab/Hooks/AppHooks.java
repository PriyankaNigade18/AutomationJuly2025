package com.SwagLab.Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.SwagLab.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks
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
