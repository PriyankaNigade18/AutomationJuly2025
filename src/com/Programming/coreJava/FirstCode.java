package com.Programming.coreJava;

public class FirstCode
{

	
	public static void main(String args[])
	{
		System.out.println("Hello everyone!");
		
		//static method call in different class
		MethodTypes.show();
		
		MethodTypes m1=new MethodTypes();
		m1.accept();
		
	}
	
	
	
}
