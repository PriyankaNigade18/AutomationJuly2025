package com.SwagLabs.UITest.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	public  Properties prop;
	
	public PropertiesUtil()
	{
		//Constructor for loading file
		
		 //Properties class Object
		 prop=new Properties();	
		  
		//file path
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Config.properties");
		  
		  //read file
		  FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			 //load the file
			  prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
		  
		 
	}
	
	
	public String getData(String key)
	{
		return prop.getProperty(key);
		
	}
	
}
