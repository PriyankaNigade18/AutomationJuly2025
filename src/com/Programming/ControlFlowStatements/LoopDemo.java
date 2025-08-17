package com.Programming.ControlFlowStatements;

import java.util.Scanner;

/*
 * 1.For loop: Number of iterations are known 
 * Examples: List/Menu/Calendar(days 30/31/28)
 * 
 * 2.While loop:Entry control loop
 * Number of iterations are not known
 * (pagination,List of unknown data)
 *  
 * 3.Do-while loop:Exit control loop
 * One time iteration without matter what condition it is
 */
public class LoopDemo {

	public static void main(String[] args) 
	{
		// Print hello statement 5 time
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}

		
		System.out.println("*********************");
		
		//print 1 to 10 number
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("*********************");
		//print 10 to 1
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println("*********************");
		//factorial of number
		//5!=5*4*3*2*1
		
		int fact=1;
		
		for(int i=5;i>=1;i--)
		{
			fact=fact*i;
		}
		
		System.out.println("factorial of 5 is: "+fact);
		
		System.out.println("*********************");
//
//		for(;;)//for loop condition is always true: so this runs infinite
//		{
//			System.out.println("Hi");
//		}
		
		//print all even numbers upto 10(for loop with if)
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number: "+i);
			}
		}
		
		System.out.println("****************************");
		
		//while
		int i=1;
		while(i<=5)
		{
			System.out.println("Welcome");
			i++;
			
		}
		/*
		//sum of digits num=123 sum=6
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt(),sum=0,rem=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
			
		}
		
		System.out.println("Sum of digits of is: "+sum);
		
		*/
		
		//reverse number
		
		int num=123,rem=0,sum=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum*10+rem;
		}
		
		System.out.println("Reverse number of 123 is: "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
