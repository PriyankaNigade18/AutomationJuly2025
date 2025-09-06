package com.Programming.OOP.Polymorphism;
/*
 * Polymorphism: One thing in many form we can use
 * 
 * what is purpose?
 * Polymorphism used for reusability
 * 
 * Types of Polymorphism
 * ---------------------
 * 1.Compile time poly(Method Overloding)
 * 2.Run time Poly(Method Overriding): IS-A relation in classes
 * 
 * Compile time polymorphism
 * ------------------------------
 * When same name method is reused in same class with different signature
 * then it is called compile time or Method overloading
 * 
 * What is different signature
 * --------------------------------
 * Method should have same name
 * 	1.number of parameters allowed
 * 	2.Different type of data allowed
 * 	3.Order of parameters can be different
 * 
 * Is Main() overloading is possible?
 * ---------------------------------------
 * Yes, main() overloading is possible but practically we dont need it
 * Main() overriding is not possible
 * 
 * Constructor overloading is Possible?
 * ----------------------------------------
 * Yes, constructor overloading is possible and it refer as constructor chaining
 * 
 * Constructor overriding is not possible
 * 
 * What is Real time examples:
 * ---------------------------
 * payment gateway
 * Ola/zomato/uber
 * 
 * 
 */
//Method Overloading
public class CompileTimePoly 
{
	
	public void add()//0 parameter pass
	{
		int a=100,b=200;
		System.out.println("Addition is: "+(a+b));
		
	}
	
	//1.number of parameters
	public void add(int a,int b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(int a,int b,int c)//3 parameters
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	
	//2.different types of parameter
	public void add(double a,double b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public void add(double a,int b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//3.change order of parameter
	public void add(int a,double b)//2 parameters
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	
	public static void main(String[] args)
	{

		CompileTimePoly  c1=new CompileTimePoly ();
		c1.add();
		c1.add(100.234,2345.234);
		c1.add(123.22,100);
		c1.add(123,100.22);
		c1.add(200,9000);
		c1.add(23,30,9000);
		
		

	}

}
