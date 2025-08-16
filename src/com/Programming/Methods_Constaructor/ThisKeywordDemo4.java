package com.Programming.Methods_Constaructor;

/*
 *  this keyword is used to refer current class Object
	use case:this can be passed as an argument in the method call.

 */
public class ThisKeywordDemo4 
{
	//int amount=900;

	public void test(int amount)
	{
		System.out.println("test1....is calling");
		System.out.println("This is test for amount: ");
		if(amount<1000)
		{
			System.out.println("Valid Amount!");
		}
		else
		{
			System.out.println("Invalid Amount!");
		}
	}
	
	public void test3()
	{
		System.out.println("test3....is calling");
		test2(this);//this keyword as argument to method
	}
	
	//design method with current class object
	public void test2(ThisKeywordDemo4 t)
	{
		System.out.println("test2....is calling");
		//calling method
		t.test(1500);
	}
	public static void main(String[] args)
	{
		ThisKeywordDemo4  t1=new ThisKeywordDemo4 ();
		t1.test(999);

		t1.test3();


	}

}
