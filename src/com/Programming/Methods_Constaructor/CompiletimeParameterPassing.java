package com.Programming.Methods_Constaructor;

public class CompiletimeParameterPassing
{
	public void add()//0 parameter method
	{
		int a=100,b=20;//local
		System.out.println("Addition is: "+(a+b));
	}

	
	public void sub(int a,int b)//2 parameter method here a & b are local 
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	
	public void info(String msg)//1 parameter
	{
		System.out.println("Information is: "+msg);
	}
	
	public static void main(String[] args)
	{
		//Object
		CompiletimeParameterPassing c1=new CompiletimeParameterPassing();
		c1.add();
		/*
		 * Compile time parameter passing
		 * --------------------------------
		 * When we pass real data (arguments)to the method while calling that method
		 * is called compile time parameter passing
		 * 
		 */
		c1.sub(400,50);
		c1.sub(67,50);
		
		c1.info("this is all about compile time parameter passing......");
		
		
		
		
		
		
		
	}

}
