package com.Programming.ControlFlowStatements;

import java.util.Scanner;

public class IFElseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is Even number");
		}else
		{
			System.out.println(num+" is Odd number");

		}
		
		
		
		
		
		
		/*
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are Adult");
		}else
		{
			System.out.println("You are teanager ");
		}
*/
	}

}
