package com.WebTesting.TetsNG.DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {

	@DataProvider(name="testArrayData")
	public Object[][] testData()
	{
		Object data[][]= {{"standard_user","secret_sauce"},{"Kiran","test123"},{"problem_user","secret_sauce"},{"Sujit","test123"}};
		return data;
	}
	
	
	public XSSFWorkbook wb;
	
	@DataProvider(name="testExcelData")
	public Object[][] excelData()
	{
		//file path
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  //read in stream
		  FileInputStream fs;
		  Object[][] data=null;
		try {
			fs = new FileInputStream(f1);
			//wb-->sheet-->row-->cell--->data
			  wb=new XSSFWorkbook(fs);
			  
			  //count physical rows
			  int rows=wb.getSheet("UserData").getPhysicalNumberOfRows();
			  System.out.println("Total number of rows: "+rows);//5
			  
			  //count physical cells
			  int cells=wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("total number of columns: "+cells);//2
			  
			  //create array of same size
			  data=new Object[rows-1][cells];//read only 4 rows excluding heading
			  
			  //read data from file and store it into array then we can use it
			  
			  for(int i=1;i<rows;i++)
			  {
				  for(int j=0;j<cells;j++)
				  {
					  //array index starts with 0
					  data[i-1][j]=wb.getSheet("UserData").getRow(i).getCell(j).getStringCellValue();
					 
				  }
				  
			  }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return data;
		  
		  
		  
	}
	
	
	
}



