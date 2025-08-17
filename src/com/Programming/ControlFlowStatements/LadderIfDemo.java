package com.Programming.ControlFlowStatements;

import java.util.Scanner;

public class LadderIfDemo {

	public static void main(String[] args)
	{
		//ctrl+shift+O
		
		//vowel test
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
//		String data=sc.nextLine();
//		char ch=data.charAt(0);
		char ch=sc.nextLine().charAt(0);
		//System.out.println(ch);
		/*
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is vowel");
			
		}else
		{
			System.out.println(ch+" is not vowel");
		}
		*/
		
		if(ch=='a')
		{
			System.out.println(ch+" is vowel");
		}
		else if(ch=='e')
		{
			System.out.println(ch+" is vowel");
		}
		else if(ch=='i')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='u')
		{
			System.out.println(ch+" is vowel");
		}else if(ch=='o')
		{
			System.out.println(ch+" is vowel");
		}else
		{
			System.out.println(ch+" is not vowel");
		}
			
		
		
		
		
		
		/* greater from 3 numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int n1=sc.nextInt();	
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+" is greater than "+n2+" & "+n3);
		}else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+" is greater than "+n1+" & "+n3);

		}else
		{
			System.out.println(n3+" is greater than "+n1+" & "+n2);

		}
*/
	}

}
