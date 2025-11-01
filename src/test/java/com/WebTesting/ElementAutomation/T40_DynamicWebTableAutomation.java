package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T40_DynamicWebTableAutomation {
  @Test
  public void testDynamicTable()
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //scroll the page
	  WebElement ele=driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
	  Utility.scrollUptoEelement(driver,ele);
	  
	  
	  //total rows 
	  int totalRows=driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
	  System.out.println("Total rows are : "+totalRows);//5
	  
	  //total columns and print all headings
	  List<WebElement> allHeadings=driver.findElements(By.xpath("//table[@id='taskTable']//tr[1]//th"));
	  System.out.println("Total Number of columns are: "+allHeadings.size());//5
	  
	  for(WebElement i:allHeadings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("------------Specific Row---------------------");
	  
	  List<WebElement> allNames=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td[1]"));
	  
	  String bname="System";
	  
	  int rowCount=0;
	  for(WebElement i:allNames)
	  {
		  rowCount++;
		  if(i.getText().contains(bname))
		  {
			  //get the rows count
			  System.out.println("Expected Browser "+bname+" data at row number: "+rowCount);
			  List<WebElement> specRow=driver.findElements(By.xpath("//table[@id='taskTable']//tr["+rowCount+"]//td"));
			  for(WebElement j:specRow)
			  {
				  System.out.println(j.getText());
			  }
		  }
	  }
	  
	  System.out.println("--------------Specific column--------------");

	  //comparing headings
	  String cellName="Network (Mbps)";
	  int cellCount=0;
	  for(WebElement i:allHeadings)
	  {
		  cellCount++;
		  if(i.getText().contains(cellName))
		  {
			  //get the count of column
			  System.out.println("Exepected Columns is at index: "+cellCount);
			 List<WebElement> specCell=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+cellCount+"]"));
			  
			 for(WebElement j:specCell)
			 {
				 System.out.println(j.getText());
			 }
		  }
		  
	  }
	  
	  System.out.println("----------task automation------------------");
	  
	  //CPU load of Chrome process: 5.7%
	  
	  //heading--->row-->data

	  String expCellName="Name",expBrowserName="Chrome";
	  int getCell=0;
	  for(WebElement i:allHeadings)
	  {
		  getCell++;
		  if(i.getText().contains(expCellName))
		 {
			  System.out.println("Heading "+expCellName+" at position :"+getCell);
			  
			  List<WebElement> allNameData=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+getCell+"]"));
			  int getRow=0;
			  for(WebElement name:allNameData)
			  {
				  getRow++;
				  if(name.getText().contains(expBrowserName))
				  {
					  System.out.println("Found Browser: "+expBrowserName+" at position: "+getRow);
					  
					  //get the current cpu load
					  String actLoad=driver.findElement(By.xpath("//table[@id='taskTable']//tr//td[text()='Chrome']//following-sibling::td[contains(text(),'%')]")).getText();
					  String expLoad=driver.findElement(By.xpath("//strong[@class='chrome-cpu']")).getText();
					  
					  if(actLoad.contains(expLoad))
					  {
						  System.out.println("Test Pass...CPU load matched!"+actLoad);
						  
					  }
					  
					  
					  //get the network speed
					  String actNetworkSpeed=driver.findElement(By.xpath("//td[text()='Chrome']//following-sibling::td[contains(text(),'Mbps')]")).getText();
					  
					  String ExpNetworkSpeed=driver.findElement(By.xpath("//strong[@class='chrome-network']")).getText();
					  
					  if(actNetworkSpeed.contains(ExpNetworkSpeed))
					  {
						  System.out.println("Test Pass....Newtwork Speed match: "+actNetworkSpeed);
					  }
				  }
			  }
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
