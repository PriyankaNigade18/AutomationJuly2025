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
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
