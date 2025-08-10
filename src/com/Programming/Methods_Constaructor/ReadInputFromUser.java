package com.Programming.Methods_Constaructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInputFromUser {

	public static void main(String[] args) throws IOException 
	{
		
		
		//use Scanner class
		System.out.println("Enter your age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		System.out.println(age);
		
		
		
		
		
		//technique2: BefferedReader class
		
//		System.out.println("Enter your age");
//		InputStreamReader ir=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(ir);
//		String data=br.readLine();
//		//string to int
//		int age=Integer.parseInt(data);
//		System.out.println(age);
		
		
		
		
		
		
		
		
		//technique1: System.in Input stream
//		System.out.println("Enter your age: ");
//		int age=System.in.read();
//		System.out.println((char)age);
		
		
		

	}

}
