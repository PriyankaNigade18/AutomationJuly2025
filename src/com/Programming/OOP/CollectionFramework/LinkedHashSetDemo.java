package com.Programming.OOP.CollectionFramework;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet is class extends HashSet which implement Set interface
 * underline data structure is DoublyLinkedList
 * LinkedHashSet has LinkedList and Hashtable features
 * LinkedHashSet maintain order and duplication not allowed
 * 
 */
public class LinkedHashSetDemo {

	public static void main(String[] args)
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(20);
		ls.add(40);
		ls.add(50);

		System.out.println(ls);
		System.out.println("Total elements are: "+ls.size());

		ls.remove(20);
		System.out.println(ls);
		
		ls.removeFirst();
		ls.removeLast();
		
		System.out.println(ls);
		
	}

}
