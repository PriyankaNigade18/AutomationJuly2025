package com.Programming.coreJava;

public class MethodTypes 
{
	/*
	 * When we declare any method without static keyword
	 * that is Instance method
	 * To call instance method Object is required.
	 * 
	 * When we declare any method with static keyword
	 * that is Static method
	 * To call static method Object is not required.
	 * 1.static method we can call in same class without object 
	 * and with or without class name
	 * 2.static method we can call in different class with call name
	 * 
	 * In Automation static methods are required to create reusable method
	 * 
	 */
	
	
	//Instance method
	public void accept()
	{
		System.out.println("This is Instance Method calling......");
	}
	
	//static method
	public static void show()
	{
		System.out.println("This is static method calling.....");
	}
	

	public static void main(String[] args)
	{
		
		show();
		MethodTypes.show();
		
		//Object
		MethodTypes m1=new MethodTypes();
		m1.accept();
		//The static method show() from the type MethodTypes should be accessed in a static way
		//m1.show();
		
		
		
		
		

	}

}
