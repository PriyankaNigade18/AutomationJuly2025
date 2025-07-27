package com.Programming.coreJava;

public class StudentData 
{
	//data 
	int id;
	String name;
	
	//method
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) 
	{
		/*
		 * To access any member of a class we need Object to create
		 * Object in Java created with new keyword
		 * Object will initialize with Constructor
		 * 
		 * Object syntax
		 * =================
		 * 
		 * className refvariable=new className();
		 * 
		 */
		
		StudentData s1=new StudentData();
		s1.id=101;
		s1.name="Jay";
		s1.show();
		
		StudentData s2=new StudentData();
		s2.id=102;
		s2.name="Kirty";
		s2.show();
		
		
		StudentData s3=new StudentData();
		s3.id=103;
		s3.name="Karim";
		s3.show();
		
	}

}
