package com.WebTesting.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T22_LocatorDemo12_XpathAxies {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=sdasdsd%40gmail.com&password-name=asADS&submit-name=");
		
		//ancestor:get the ancestor tagname  of John
		String tag1=driver.findElement(By.xpath("//td[text()='John']/ancestor::tbody")).getTagName();
		System.out.println("Ancestor tagname of John is: "+tag1);//tbody
		
		//parent: get the parent tagname of John
		String tag2=driver.findElement(By.xpath("//td[text()='John']/parent::*")).getTagName();
		System.out.println("Parent tagname of John is: "+tag2);//tr
		
		//child: get the count of childs for tbody
		int count=driver.findElements(By.xpath("//tbody/child::*")).size();
		System.out.println("Total rows/child for tbody: "+count);//6
		
		//child: get the count of child for row3
		int count2=driver.findElements(By.xpath("//tr[3]/child::*")).size();
		System.out.println("All child for row number 3: "+count2);//5
		
		//following: get all the rows after john row
		int count3=driver.findElements(By.xpath("//td[text()='John']/following::tr")).size();
		System.out.println("After john total rows: "+count3);//2
		
		//following: get all the <td> after john
		int count4=driver.findElements(By.xpath("//td[text()='John']/following::td")).size();
		System.out.println("After john all td are: "+count4);//13
		
		//following-sibling: get the all following sibling count for john
		int count5=driver.findElements(By.xpath("//td[text()='John']/following-sibling::*")).size();
		System.out.println("Total following sibling for John: "+count5);//3
		
		//preceding: get all the preceding rows
		int count6=driver.findElements(By.xpath("//td[text()='John']/preceding::tr")).size();
		System.out.println("Before john total rows: "+count6);//4
		
		//preceding-sibling: get the all preceding sibling of John
		int count7=driver.findElements(By.xpath("//td[text()='John']/preceding-sibling::*")).size();
		System.out.println("Total preceding sibling is: "+count7);//1
		
	}

}
