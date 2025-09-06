package com.Programming.OOP.Polymorphism;

public class MainFunctionOverloading
{

	//entry point
	public static void main(String[] args) 
	{

		System.out.println("Main() calling with String args");
		
		int arr[]= {10,20,30,40};
		main(arr);

	}
	
	public static void main(int[] args) 
	{

		System.out.println("Main() calling with int args");
		
		for(int i:args)
		{
			System.out.println(i);
		}
		
		
		


	}

}
