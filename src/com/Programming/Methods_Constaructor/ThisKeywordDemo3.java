package com.Programming.Methods_Constaructor;

/*
 * 
 * this keyword is used to refer current class Object
	use case: this() can be used to invoke current class constructor.
	this(): this constructor
	Constructor call is always first line of code

 */
public class ThisKeywordDemo3 
{
	public ThisKeywordDemo3() 
	{
		this(1010);
		System.out.println("Default constaructor is calling....");
	}

	public ThisKeywordDemo3(String msg)
	{
		this();
		System.out.println("Parameterized constaructor is calling with message...."+msg);

		//this();//Constructor call must be the first statement in a constructor
	}
	
	public ThisKeywordDemo3(int id)
	{
		System.out.println("Parameterized constaructor is calling with id...."+id);

	}
	public static void main(String[] args)
	{

		ThisKeywordDemo3 t1=new ThisKeywordDemo3("Hello All!");
		



	}

}
