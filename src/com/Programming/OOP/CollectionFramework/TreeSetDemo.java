package com.Programming.OOP.CollectionFramework;

import java.util.TreeSet;

/*
 * TreeSet is class implements SortedSet interface which extends Set interface
 * Underline data structure is SearchTree
 * TreeSet returns objects in  sorted order
 * duplication and null objects not allowed
 *  
 * 
 */
public class TreeSetDemo {

	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(3);
		ts.add(1);
		ts.add(9);
		ts.add(15);
		ts.add(12);
		ts.add(8);
		ts.add(4);
		ts.add(2);
		
		System.out.println(ts);
		System.out.println("Total Elements : "+ts.size());
		
		System.out.println("headSet():less than element "+ts.headSet(9));
		System.out.println("tailSet(): greter than equal to element: "+ts.tailSet(9));
		System.out.println("subset(): between elements: "+ts.subSet(4,12));
		
		
		
		
		
		
		


	}

}
