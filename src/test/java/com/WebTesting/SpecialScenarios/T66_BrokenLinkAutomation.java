package com.WebTesting.SpecialScenarios;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T66_BrokenLinkAutomation {
  @Test
  public void testBrokenLink()
  {
	 //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //get all links
	  
	  List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	  System.out.println("Total links are: "+allLinks.size());
	  
	  int brokenLink=0;
	  int validLink=0;
	  for(WebElement link:allLinks)
	  {
		  //get the href attribute:getDOMAttribute
		  String hrefValue=link.getDomAttribute("href");
		  
		  //validate href value
		  try {
		  if(hrefValue==null||hrefValue.isEmpty())
		  {
			  System.out.println("Empty link or null link we can not automate");
			  System.out.println(hrefValue);
			  //skip 
			  continue;
		  }}catch(NullPointerException e)
		  {
			  
		  }
		  
		  //all valid links send to the sever
		  //to send request to the server we use URL class
		  try {
			URL url=new URI(hrefValue).toURL();
			
			HttpURLConnection httpurl=(HttpURLConnection)url.openConnection();
			//connect to the server
			httpurl.connect();
			
			//get the status code
			int statusCode=httpurl.getResponseCode();
			
			if(statusCode>=400)
			{
				System.out.println("------Link is Broken-----");
				brokenLink++;
			}else
			{
				System.out.println("---------valid link---------");
				validLink++;
			}
			
			
		} catch(Exception e)
		  {
			
		  }
		 
		  
	  }
	  
	  System.out.println("Valid Links are: "+validLink);
	  System.out.println("Broken links are: "+brokenLink);
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
