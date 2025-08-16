package com.Programming.Methods_Constaructor;

/*
 * 
 * this keyword is used to refer current class Object
	use case:this can be used to invoke current class method (implicitly)
 */
public class ThisKeywordDemo2
{
	public void m1()
	{
		System.out.println("Method1 is calling.....");
		this.m2();
		//or
		//m2();
	}

	public void m2()
	{
		System.out.println("Method2 is calling.....");
		this.m3();
	}
	public void m3()
	{
		System.out.println("Method3 is calling.....");
		this.m4();
	}
	public void m4()
	{
		System.out.println("Method4 is calling.....");
		//this.m1();////StackOverflowError
	}
	public static void main(String[] args) 
	{

		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.m1();
		

	}

}
