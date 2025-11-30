package com.WebTesting.TetsNG.DataDrivenTest;

import org.testng.annotations.Test;

import com.WebTesting.Generic.ExcelUtil;

public class Tc89_ReadExcelDataUsingUtility {
  @Test
  public void testData()
  {
	  String authorname=ExcelUtil.getStringData("BookData",1,1);
	  System.out.println(authorname);
	  
	  String authName=ExcelUtil.getData("BookData",2,1);
	  System.out.println(authName);
	  
	  String price=ExcelUtil.getData("BookData",2,2);
	  //string ---int/boolean(wrapper class)
	  
	  double pr=Double.parseDouble(price);
	  System.out.println(pr);//double
	  System.out.println((int)pr);//int
	  
	  String status=ExcelUtil.getData("BookData",1,3);
	  //string to boolean
	  boolean newStatus=Boolean.parseBoolean(status);
	  
	  System.out.println(newStatus);
	  
	  
	  
  }
}
