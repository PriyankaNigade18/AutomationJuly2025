package com.Programming.Methods_Constaructor;

/*
 * this can be used to return the current class instance from the method
 */
public class MethodChaining
{
	//method into object
	public MethodChaining openBrowser()
	{
		System.out.println("Open Browser first.....");
		return this;
	}

	public MethodChaining runApplication()
	{
		System.out.println("Application is running on Browser.....");
		return this;
	}
	
	public void closeBrowser()
	{
		System.out.println("Browser closed....");
	}
	
	public static void main(String[] args) 
	{
		MethodChaining m1=new MethodChaining();
		m1.openBrowser().runApplication().closeBrowser();
		
		
//		m1.runApplication();
//		m1.closeBrowser();
//		

	}

}
