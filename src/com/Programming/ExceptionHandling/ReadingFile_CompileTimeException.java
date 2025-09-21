package com.Programming.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFile_CompileTimeException
{

	public static void main(String[] args) throws IOException  
	{
		// File path
		File f1=new File("C:\\Users\\piyun\\OneDrive\\Desktop\\Trainings\\July2025\\CoreJavaTraining\\config.properties");

		//Read file in stream
		FileInputStream fs=new FileInputStream(f1);
		
		//Properties Class object
		Properties prop=new Properties();
				
		//load the file
		prop.load(fs);
		
		//read the file
		System.out.println("Browser name is: "+prop.getProperty("browserName"));
		
		System.out.println("Browser version is: "+prop.getProperty("browserVersion"));
		
		System.out.println("Platform name is: "+prop.getProperty("platformName"));
		
		
		
		
	}

}
