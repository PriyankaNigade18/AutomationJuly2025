package com.Programming.Methods_Constaructor;

public class CompileTimeParameterPassingWithReturn {

	public void add(int a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	/*
	 * return keyword
	 * ------------
	 * To return any result/data/output from method we use return keyword
	 * 
	 * rule1:As per data/result change return type of method
	 * rule2: Every return data return to the calling function
	 * rule3: declare that return data into variable 
	 * rule4: return statement is always last line of method
	 */
	
	public int sub(int a,int b)//2 parameter
	{
		return a-b;
	}
	
	public boolean intialStatus(boolean status)
	{
		return status;
	}
	
	public String info(String msg)
	{
		return msg;
		
				
	}
	
	public static void main(String[] args)
	{

		CompileTimeParameterPassingWithReturn c1=new CompileTimeParameterPassingWithReturn();
		c1.add(100,200);
		
		int res=c1.sub(100,20);
		System.out.println("Subtraction is: "+res);
		
		System.out.println(c1.sub(90,20));
		
		boolean status=c1.intialStatus(true);
		System.out.println("Status: "+status);
		
		String msg=c1.info("Selenium is webui automation tool");
		System.out.println("Msg: "+msg);

	}

}
