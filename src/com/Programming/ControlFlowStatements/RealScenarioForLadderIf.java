package com.Programming.ControlFlowStatements;

import java.util.Scanner;

public class RealScenarioForLadderIf {

	public static void main(String[] args) 
	{
		
		/*
		 * String equality methods
		 * ------------------------
		 * 1.equals(): exact matching and it is case sensitive
		 * 2.equalsIgnoreCase():exact match bit it is case insensitive
		 * We follow operators on primitive data
		 * We follow methods for String
		 
		
		String s1="Hello All";
		String s2="Hello All";
		String s3="hello all";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//true
		*/		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test is executing on Chrome");
		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test is executing on Edge");
		}
		else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test is executing on Firefox");
		}else
		{
			System.out.println("Provide right browser name!");
		}
		

	}

}
