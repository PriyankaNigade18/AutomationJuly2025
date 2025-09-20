package com.Programming.OOP.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList is class implements List interface
 * underline data structure is DoublyLinkedList
 * Frequent operation is insertion and deletion
 * LinkedList is order collection
 * LinkedList allowed duplication
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args)
	{
		LinkedList<Integer> ls=new LinkedList<Integer>();
		System.out.println("Is list empty?: "+ls.isEmpty());//true
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(20);
		ls.add(30);
		ls.add(null);
		ls.add(null);
		System.out.println(ls);
		System.out.println("After adding elements list is empty?: "+ls.isEmpty());
		System.out.println("Total elements are: "+ls.size());
		
		System.out.println("look for 50 element?: "+ls.contains(50));//false
		
		//remove element
		ls.remove(7);
		
		System.out.println(ls);
		
		ls.remove(6);
		
		System.out.println(ls);
		//head node
		ls.addFirst(100);
		
		System.out.println(ls);
		
		//last node
		ls.addLast(100);
		System.out.println(ls);
		
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		
		//add element at index 3
		ls.add(3,66);
		System.out.println(ls);
		
		
		System.out.println("********Simple for loop*********");
		
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}

				
		System.out.println("********For each loop*********");

		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		System.out.println("********iterator() ********");
		
		Iterator<Integer> ir=ls.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
