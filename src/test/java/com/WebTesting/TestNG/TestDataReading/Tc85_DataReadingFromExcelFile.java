package com.WebTesting.TestNG.TestDataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Tc85_DataReadingFromExcelFile {
  @Test
  public void readDataFromExcel() throws IOException
  {
	  //file path
	  
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	 
	  //file read
	  FileInputStream fs=new FileInputStream(f1);	
	  
	  //wroksheet-->sheet-->row--->cell--->value
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  XSSFSheet sheet1=wb.getSheet("BookData");
	  
	  XSSFRow row3=sheet1.getRow(2);//index number
	  
	  XSSFCell cell1=row3.getCell(0);
	  
	  String bookName=cell1.getStringCellValue();
	  
	  System.out.println(bookName);//selenium
	  
	  
	  //priyanka
	  String authorName=sheet1.getRow(2).getCell(1).getStringCellValue();
	  System.out.println(authorName);

	 // price
	  double price=sheet1.getRow(1).getCell(2).getNumericCellValue();
	  //double to int
	  
	  System.out.println((int)price);
	  
  }
}
