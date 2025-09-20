package com.Programming.OOP.CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * HashSet is class implements Set interface
 * Underline data structure is HashTable
 * 	HashTable maintain data in the table base on hashing function
 * 	data will store based on hashcode
 * 	
 * HashSet is not order collection
 * HashSet not allowed duplication
 * HashSet maintains unique elements
 * Set interface not based on indexing
 * 
 * HashSet initial capacity is 16 virtual segment
 * Data will maintain with node structure
 * 
 * |key|hashcode|data/object|next element address|
 * 
 * what is hashcode for null object?
 * -------------------------------
 * HashCode for null is 0
 * indexing also 0

 * How HashMap/HashSet works internally?
 * -----------------------------------------
 * algorithm
 * 
 * what is collision in HashSet or HashMap?
 * ------------------------------------
 * Two objects may get same index number and that is called collision
 * 
 *Ways to Iterate any Set
 *------------------------------
 *1.using For each loop
 *2.using iterator()
 *
 * 
 */
public class HashSetDemo {

	public static void main(String[] args) 
	{

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(20);
		hs.add(50);
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println("Total elements are: "+hs.size());
		System.out.println("Is set emepty?: "+hs.isEmpty());
		
		System.out.println("Search for 50?: "+hs.contains(50));
		
		//remove as per object name
		hs.remove(null);
		
		System.out.println(hs);
		
		System.out.println("*******For each loop************");
		
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
		System.out.println("*******iterator()************");

		Iterator<Integer> ir=hs.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("************Interview question*******");
		
		//remove duplicate elements from list
		
		ArrayList<Integer> ls=new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(20);
		ls.add(10);
		
		System.out.println(ls);
		
		//convert list into set(addAll() or constructor
		//remove duplication but order will change
		HashSet<Integer> set=new HashSet<Integer>(ls);
		System.out.println(set);
		
		System.out.println("--------------");
		//same order then use LinkedHashSet=LinkedList+HashSet
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>(ls);
		System.out.println(lset);
		
		System.out.println("--------------");
		//sort hashset
		
		System.out.println(hs);
		
		TreeSet<Integer> ts=new TreeSet<Integer>(hs);
		System.out.println(ts);
		
		
		
		
		
		
		
		
		
		

	}

}
