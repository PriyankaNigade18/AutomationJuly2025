package com.Programming.ControlFlowStatements;

public class Branchingstatement {

	public static void main(String[] args)
	{

		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				break;//exit from switch and loop
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("-------------------------");
		
		
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;//exit from switch and loop
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("-------------------------");

		String city="Pune";
		
		for(int i=1;i<=4;i++)
		{
			if(city.equals("Pune"))
			{
				System.out.println("City matched!");
				break;
			}
			else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("-----------continue--------------");
		
		//continue:skip certain part of code from execution and it will continue with next iteration
		
		for(int i=1;i<=10;i++)
		{
			if(i==8)
			{
				continue;//1 2 3 4 5 6 7 9 10
			}else
			{
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
