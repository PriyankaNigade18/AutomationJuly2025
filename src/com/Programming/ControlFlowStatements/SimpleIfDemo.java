package com.Programming.ControlFlowStatements;

import java.util.Scanner;

public class SimpleIfDemo {

	//simple if is for single true condition
	
	public static void main(String[] args) 
	{
		System.out.println("Starts....");
			System.out.println("Enter current year for testing!");
			
			Scanner sc=new Scanner(System.in);
			int cyear=sc.nextInt();
			
			if(cyear==2025)
			{
				System.out.println("Year matched......");
			}
			
			System.out.println("Stop.....");
			

	}

}
