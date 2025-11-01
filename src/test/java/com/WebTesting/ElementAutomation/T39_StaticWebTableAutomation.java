package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T39_StaticWebTableAutomation {
  @Test
  public void testStaticTable() 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
	  Utility.scrollUptoEelement(driver,ele);
	  
	    
	  //total number of rows
	  int totalRows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	  System.out.println("Total number of rows are: "+totalRows);//7
	  
	  
	  //total number of columns
	  int totalCells=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[3]//td")).size();
	  System.out.println("Total Columns are: "+totalCells);//4
	  
	  //total heading / print heading
	  List<WebElement> allHeading=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//th"));
	  System.out.println("Total Headings are: "+allHeading.size());//4
	  
	  for(WebElement i:allHeading)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("------------Specific Row-----------");
	  //print specific row
	  List<WebElement> specRow= driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[5]//td"));
	  
	  for(WebElement i:specRow)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("------------Specific Column-----------");

	  List<WebElement> specColumn=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[2]"));
	  
	  for(WebElement i:specColumn)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("------------All Data-----------");

	  List<WebElement> allData=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td"));
	  
	  for(WebElement i:allData)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
