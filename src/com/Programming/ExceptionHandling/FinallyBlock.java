package com.Programming.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		/*
		 * Finally block used to run special code
		 * Finally block always run with or without exception
		 * server/database start
		 * server/database close
		 * try-finally block
		 * finally block will not handle exception
		 * catch is only handle exception
		 */
		System.out.println("Program started...");
		try {
		System.out.println(9/0);
		}catch(Exception s)
		{
			System.out.println("Please enter valid number");
		}
		finally
		{
			System.out.println("Finally block is executing.....");
			
		}
		System.out.println("Program ends....");
	}

}
