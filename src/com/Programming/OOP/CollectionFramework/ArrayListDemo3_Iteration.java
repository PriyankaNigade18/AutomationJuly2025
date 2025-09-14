package com.Programming.OOP.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * ArrayList is Class implements List interface
 * Underline data structure is Dynamic Array
 * Frequent operation Data Retrieval
 * It is order collection
 * Duplication allowed
 * By default ArrayList create 10 virtual segment
 * Initial capacity is 10
 * 
 * Iteration
 * ---------------
 * 1.simple for loop
 * 2.For each loop
 * 3.Using iterator()
 * 4.Using listIterator()
 */
public class ArrayListDemo3_Iteration {

	public static void main(String[] args)
	{

		ArrayList<String> location=new ArrayList<String>();
		location.add("Pune");
		location.add("Mumbai");
		location.add("Delhi");
		location.add("Nashik");
		
		System.out.println(location);
		
		System.out.println("-------Simple for loop----------");
		
		for(int i=0;i<location.size();i++)
		{
			System.out.println(location.get(i));
		}
		System.out.println("-------for each loop(array + collection)----------");
		
		for(String i:location)
		{
			System.out.println(i);
		}
		
		System.out.println("-------Using iterator()---------");
		/*
		 * Iterator is interface in java
		 * This interface have two methods
		 * 1.hasNext():Returns true if the iteration has more elements.
		 * 2.next():Returns the next element in the iteration.
		 * 
		 * Iterator<> obj=list.iterator();
		 * 
		 */

		Iterator<String> ir=location.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("-------Using listIterator()---------");
		
		ListIterator<String> lr=location.listIterator();
		while(lr.hasNext())
		{
			System.out.println(lr.next());
		}
		
		System.out.println("--------------------");
		
		while(lr.hasPrevious())
		{
			System.out.println(lr.previous());
		}
		
		
		
		System.out.println("----------------------------");
		
		
		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add("Sarang");
		empdata.add(30);
		empdata.add("Pune");
		empdata.add('M');
		empdata.add(98766544L);
		
		System.out.println(empdata);
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

		
		
		
		
		
		
		
		
		
		

	}

}
