package com.Programming.ExceptionHandling;

public class ThrowsKeywordDemo
{
	public void m1() throws InterruptedException
	{
		System.out.println("M1 calling....");
		m2();
	}

	public void m2() throws InterruptedException
	{
		System.out.println("M2 calling....");
		m3();
	}
	public void m3() throws InterruptedException 
	{
		System.out.println("M3 calling....");
		System.out.println("Hello");
	
			Thread.sleep(2000);
		
		System.out.println("Bye");
	}
	
	public static void main(String[] args) throws InterruptedException
	{

		ThrowsKeywordDemo t1=new ThrowsKeywordDemo();
		t1.m1();

	}

}
