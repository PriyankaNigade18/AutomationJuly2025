package com.Programming.Methods_Constaructor;

import java.util.Scanner;

public class RunTimeParameterPassing
{
	public void userDetails(String name,String address,int pincode)
	{
		System.out.println("****User details are:****");
		System.out.println("Name is: "+name);
		System.out.println("Address is: "+address);
		System.out.println("Pincode is: "+pincode);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println("Addition is: "+(a+b+c));
	}
	
	public int sub(int a,int b,int c)
	{
		return a-b-c;
	}

	public static void main(String[] args) 
	{
		RunTimeParameterPassing r1=new RunTimeParameterPassing();
		
		//to read data from user: scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name ,Address and pincode");
		String name=sc.nextLine();
		String address=sc.nextLine();
		int pincode=sc.nextInt();
		
		//run time parameter passing
		r1.userDetails(name, address, pincode);

		System.out.println("-------------------------");
		System.out.println("Enter three numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		
		r1.add(n1,n2,n3);

		int res=r1.sub(n1,n2,n3);
		System.out.println("Subtarction is: "+res);


}
}