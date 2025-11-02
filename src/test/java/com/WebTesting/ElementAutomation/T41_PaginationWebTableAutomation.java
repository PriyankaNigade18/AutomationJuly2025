package com.WebTesting.ElementAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.Generic.Utility;

public class T41_PaginationWebTableAutomation {
  @Test
  public void testWebTable() 
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement table=driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
	  Utility.scrollUptoEelement(driver,table);
	  
	  //total number of pages in table
	  List<WebElement> allPages=driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println("Total Number of Pages are: "+allPages.size());//4
	  
	  //calculate as per page total rows and columns
	  
	  int pageNo=0;
	  int totalRows=0;
	  for(WebElement i:allPages)
	  {
		  //open page
		  i.click();
		  pageNo++;
		  
		  System.out.println("Current page number is: "+pageNo);
		  int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
		  int cells=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr[1]//td")).size();
		  
		  System.out.println("Total Rows: "+rows);
		  System.out.println("Total Cells: "+cells);
		  totalRows=totalRows+rows;
	  }
	  
	  System.out.println("Total rows including all pages: "+totalRows);//20
	  System.out.println("-----------------------------------");
	  //get all products from any page number
	  
	  String pagen="2";
	  
	  for(WebElement i:allPages)
	  {
		  //page number 2
		  if(i.getText().contains(pagen))
		  {
			  //open page
			  i.click();
			  System.out.println("------Product name for Page number 3------");
			  List<WebElement> allProducts=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));
			  for(WebElement j:allProducts)
			  {
				  System.out.println(j.getText());
			  }
			  break;
			  
		  }
	  }
	  
	  
	  System.out.println("-----------------------------------");
	  //from page 4 check the checkbox for product Soundbar
	  
	  String pn="4";
	  String pname="VR Headset";
	  for(WebElement i:allPages)
	  {
		  //page number 4
		  if(i.getText().contains(pn))
		  {
			  //open page
			  i.click();
			  System.out.println("------Product name for Page number 4------");
			  List<WebElement> allProducts=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));
			  for(WebElement j:allProducts)
			  {
				  if(j.getText().contains(pname))
				  {
					  //check box
					  driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr//td[text()='"+pname+"']//following-sibling::td//input")).click();
				  }
			  }
			  break;
			  
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
