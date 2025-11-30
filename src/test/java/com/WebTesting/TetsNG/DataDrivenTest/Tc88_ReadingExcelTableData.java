package com.WebTesting.TetsNG.DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Tc88_ReadingExcelTableData {
  @Test
  public void readFile() throws IOException 
  {
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  //read in stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet-->row-->cell--->data
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //count physical rows
	  int rows=wb.getSheet("UserData").getPhysicalNumberOfRows();
	  System.out.println("Total number of rows: "+rows);//5
	  
	  //count physical cells
	  int cells=wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("total number of columns: "+cells);//2
	  
	  //create array of same size
	  Object[][] data=new Object[rows-1][cells];//read only 4 rows excluding heading
	  
	  //read data from file and store it into array then we can use it
	  
	  for(int i=1;i<rows;i++)
	  {
		  for(int j=0;j<cells;j++)
		  {
			  //array index starts with 0
			  data[i-1][j]=wb.getSheet("UserData").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(data[i-1][j]+"\t");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
