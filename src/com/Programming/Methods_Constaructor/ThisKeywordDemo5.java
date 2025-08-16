package com.Programming.Methods_Constaructor;

/*
 * use case: this can be passed as argument in the constructor call.

 */

class A
{
	public A(ThisKeywordDemo5 t)//object of ThisKeywordDemo5 class
	{
		System.out.println("Price is: "+t.price);
		
	}
}


public class ThisKeywordDemo5 
{

	int price=90;
	
	ThisKeywordDemo5()
	{
		A a1=new A(this);
	}
	public static void main(String[] args)
	{

		ThisKeywordDemo5  t1=new ThisKeywordDemo5 ();

	}

}
