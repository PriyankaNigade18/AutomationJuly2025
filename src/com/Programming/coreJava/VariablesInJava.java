package com.Programming.coreJava;



/*
 * Variable is name of storage location
 * Types
 * ----------
 * 1.Local variable:
 * ----------------------
 * If any variable declare inside the method /block then that is local
 * 
 * Scope: Local variable we can access within method
 * 
 * Memory allocation:At the time of method execution
 * 
 * Memory deallocation:After method execution
 * 
 * 2.Instance variable:
 * ------------------------
 * If any variable declare inside class and outside the method/block without
 * static keyword then that is instance variable
 * 
 * Scope:Within object
 * Memory allocation:At the time creation of object
 * Memory deallocation:Once the object destroy
 * 
 * Note: For number of objects new instance memory will be allocated
 * 
 * 3.Static Variable
 * ------------------------
 * If any variable declare inside class and outside the method/block with
 * static keyword then that is static variable
 * 
 * Scope:Within class
 * Memory allocation:At the time of Class loaded
 * Memory deallocation:Once the class unload
 * 
 * Note: Static variable memory creates only one time and same memory shared 
 * with all the objects
 * 
 * If you wanted to add common property for all object use static keyword
 * 
 */

public class VariablesInJava 
{
	//instance variable
	int id=101;
	String name="Sarang";
	//static variable
	static String cname="AISSPMS";
	
	public void show()
	{
		int marks=90;//local
		System.out.println("Collage name is: "+cname);
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
		System.out.println("Marks from show(): "+marks);
		
	}
	
	
	
	public static void main(String[] args) 
	{

		System.out.println("Collage name is: "+cname);
		int marks=100;//local variable
		System.out.println("Marks from main(): "+marks);
		
		//object
		 VariablesInJava v1=new VariablesInJava();
		 v1.show();
		 
		 
		 System.out.println("Student id is: "+v1.id);
		System.out.println("Student name is: "+v1.name);
		 
		 
		 

	}

}
