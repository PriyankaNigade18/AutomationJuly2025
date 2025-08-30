package com.Programming.Array_String;

import java.util.Scanner;

public class StringBuilderBuffer {

	public static void main(String[] args)
	{
		/*
		 * String
		 * ---------------------
		 * String immutable class
		 * Its not threadSafe(at a time multiple process allowed)
		 * Declaration
		 * ------------
		 * 1.using literal 2.using new keyword
		 * 
		 * StringBuffer(older):
		 * --------------------
		 * Mutable class
		 * Its threadSafe(one process at a time)
		 * 
		 * SringBuilder(latest)
		 * --------------------
		 * Mutable class
		 * Its not threadSafe(at a time multiple process allowed)
		 * 
		 * Declaration
		 * ------------
		 * 1.using new keyword
		 */

		//Immutable
		String s1="Hi";
		s1=s1+"All";
		
		System.out.println(s1);
		
		//mutable
		StringBuilder br=new StringBuilder("Hello");
		br.append("All");
		
		System.out.println(br);
		System.out.println(br.reverse());
		
		//how to reverse any string without method(String class)
		//String ss1="Java Selenium";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String ss1=sc.nextLine();
		
		String res="";
		for(int i=ss1.length()-1;i>=0;i--)
		{
			res=res+ss1.charAt(i);
			
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
