package com.Programming.ControlFlowStatements;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) 
	{
		/*
		 * marks greater than equal to 90=A
		 * marks greater than equal to 95=A++
		 * otherwise =B
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		if(marks>=90)
		{
			if(marks>=95)
			{
				System.out.println("A++ Grade");
			}else
			{
				System.out.println("A grade");
			}
		}else
		{
			System.out.println("B grade");
		}

	}

}
