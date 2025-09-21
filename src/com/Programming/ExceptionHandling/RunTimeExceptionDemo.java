package com.Programming.ExceptionHandling;

import java.util.Scanner;

public class RunTimeExceptionDemo
{
	int id=101;//instance data
	
	
	public static void main(String[] args) 
	{
		RunTimeExceptionDemo r1=new RunTimeExceptionDemo();
		r1=null;
		try {
		System.out.println(r1.id);//NullPointerException
		}catch(Exception e)
		{
			System.out.println("Check Object/data is null...."+e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("done....!");
		
		System.out.println("-------------------------");
		String s1="100ABc";
		System.out.println(s1+200);//100200
		//string to number(int)
		try
		{
		int num=Integer.parseInt(s1);//NumberFormatException 
		System.out.println(num+200);//300
		}catch(NumberFormatException n)
		{
			System.out.println("String data is incorrect, It should be only number as string");
		}
		
		System.out.println("-------------------------");	
		
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter index bwteen 0 to 4");
		int index=sc1.nextInt();
		
		int arr[]= {100,200,300,400,500};
		try {
		System.out.println(arr[index]);//ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Please enter valid index only!");
		}
		System.out.println("-------------------------");	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("Addition is: "+(num1+num2));
		System.out.println("Subtraction is: "+(num1-num2));
		try {
		System.out.println("Division is: "+(num1/num2));//ArithmeticException
		}catch(ArithmeticException r)
		{
			System.out.println("Please enter any valid number other than 0");
		}
		System.out.println("Multiplication is: "+(num1*num2));
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
