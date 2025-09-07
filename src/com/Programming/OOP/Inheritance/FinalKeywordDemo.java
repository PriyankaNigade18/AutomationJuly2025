package com.Programming.OOP.Inheritance;


//final class Demo
class Demo
{
	final int amount=1000;
	
	public final void color()
	{
		System.out.println("Blue....");
	}
}


public class FinalKeywordDemo extends Demo
{
//	@Override
//	public void color()
//	{
//		System.out.println("Blue....+ Yellow....");
//	}

	public static void main(String[] args)
	{
		FinalKeywordDemo f1=new FinalKeywordDemo();
		//f1.amount=30000;
		System.out.println(f1.amount);
		
		f1.color();



	}

}
