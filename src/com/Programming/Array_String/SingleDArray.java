package com.Programming.Array_String;

/*
 * Array is Static data structure 
 * In java it is implemented as Object
 * Array is collection of similar type of data or object
 * Array size is always fixed
 * 
 * Types:
 * -----------
 * 1.single Dimension array
 * 2.Multi Dimension array
 * 
 * Ways to declare
 * -------------------
 * 1.Using new Keyword
 * 2.Using literal way (constant declaration)
 * 
 * Property: lenght
 * 
 * Iteration
 * -------------------
 * for loop
 * for each loop
 * nested loop
 */
public class SingleDArray {

	public static void main(String[] args)
	{

		//declaration
		int id[]=new int[5];
		//initialize
		id[0]=10;
		id[1]=20;
		id[2]=30;
		id[3]=40;
		id[4]=50;
		
		System.out.println("Total ids are : "+id.length);//5
		//single values 
		System.out.println(id[3]);//40
		//System.out.println(id[5]);//ArrayIndexOutOfBoundsException
		System.out.println(id[2]);//30
		
		//print complete array elements
		System.out.println("------------simple for loop----------------");
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(id[i]);
		}
		
		System.out.println("----------------------");
		
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		
		System.out.println("------------foreach loop----------------");

		for(int i:id)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
		double marks[]=new double[3];
		marks[0]=56.66;
		marks[1]=66.45;
		marks[2]=88.45;
		System.out.println("Total entries for marks: "+marks.length);
		
		System.out.println(marks[2]);//88.45
		//System.out.println(marks[-1]);//ArrayIndexOutOfBoundsException
		
		System.out.println("---simple for loop----");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("---for each loop----");

		for(double i:marks)
		{
			System.out.println(i);
		}
		
	System.out.println("---------Way2: literal way--------------");	
		
	String location[]= {"Pune","Mumbai","Satara","Delhi"};
	System.out.println("Total locations are: "+location.length);//4
	System.out.println(location[2]);//satara
	
	System.out.println("---simple for loop----");
	
	for(int i=0;i<location.length;i++)
	{
		System.out.println(location[i]);
	}
	
	System.out.println("---for each loop----");
	
	for(String i:location)
	{
		System.out.println(i);
	}
	
	System.out.println("--------------------------");
	
	Object empData[]= {"Sarang","Pune",30,'M',987986876L};
	System.out.println("Total deatils for employee: "+empData.length);
	System.out.println(empData[2]);//30
	
	for(int i=0;i<empData.length;i++)
	{
		System.out.println(empData[i]);
	}
	
	System.out.println("------------");
	
	for(Object i:empData)
	{
		System.out.println(i);
	}
	
	System.out.println("-----Popular questions----------");
	
	//identify max number from this array
	int number[]= {20,10,5,78,29,4,190,67};
	
	int max=number[0];
	
	for(int i=1;i<number.length;i++)
	{
		
		if(number[i]>max)
		{
			max=number[i];
		}
	}
	
	System.out.println(max);
	
	System.out.println("---------------------");

	//sum of numbers
	
	int sum=0;
		
	for(int i:number)
	{
		sum=sum+i;
	}
	
	System.out.println("Sum of all numbers if array: "+sum);
	
	System.out.println("---------------------");

	//identify number if present in array
	int arr[]= {10,200,50,67,88,100,80,44};
	
	int target=110;
	boolean status=false;
	
	for(int i:arr)
	{
		if(i==target)
		{
			status=true;
			break;
		}
	}
	
	if(status)
	{
		System.out.println("Number found!: "+target);
	}else
	{
		System.out.println("Number not found!: "+target);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
