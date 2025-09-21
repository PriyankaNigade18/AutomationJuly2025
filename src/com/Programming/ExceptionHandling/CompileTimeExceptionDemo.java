package com.Programming.ExceptionHandling;

public class CompileTimeExceptionDemo {

	
	public static void show()
	{
		System.out.println("Show() started...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Show() ends...");
	}
	
	
	
	//Jvm to handle compile time exception
	public static void main(String[] args) throws InterruptedException
	{

		System.out.println("Program started......");
		
		//pause current execution for 4sec
		Thread.sleep(4000);
		
		show();
		System.out.println("Program ends.....");
	}

}
