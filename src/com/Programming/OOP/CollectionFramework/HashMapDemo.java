package com.Programming.OOP.CollectionFramework;


import java.util.HashMap;
import java.util.Map.Entry;

/*
 * HashMap is class implement Map interface
 * Underline data structure is HashTable
 * <key : value>
 * duplication in key not allowed
 * duplication in value allowed
 * It will not maintain
 * 
 * What is Entry?
 * -----------------------
 * Entry is interface in Map
 * 
 * <Key,value> pair we can called as Entry
 */
public class HashMapDemo {

	public static void main(String[] args) 
	{

		HashMap<String,Integer> zipcode=new HashMap<String,Integer>();
		zipcode.put("Lohegaon",411047);
		zipcode.put("VimanNagar",411014);
		zipcode.put("Wadgaosheri",411014);
		zipcode.put("Kharadi",411044);
		
		
		System.out.println(zipcode);
		zipcode.put("Kharadi",411088);
		System.out.println(zipcode);
		
		//get the single entry?get(key) returns value
		System.out.println(zipcode.get("Lohegaon"));
		
		
		System.out.println("Total entries from map: "+zipcode.size());
			
		//search
		
		System.out.println("Search forkey Kharadi?: "+zipcode.containsKey("Kharadi"));
		System.out.println("Search for 411078: "+zipcode.containsValue(411078));
		
		
		System.out.println(zipcode.get("Kharadi"));
		
		zipcode.remove("Kharadi");
		
		System.out.println(zipcode);
		
		System.out.println("***********for each loop**************");
		//how to iterate map: Entry interface forEach loop
		
		//entrySet(): Set<Entry<String,Integer>>
		//iterate on keys
		for(Entry<String,Integer> i:zipcode.entrySet())
		{
			System.out.println(i.getKey());
		}
		
		System.out.println("-----------------");
		
		//iterate on values
				for(Entry<String,Integer> i:zipcode.entrySet())
				{
					System.out.println(i.getValue());
				}
		System.out.println("-----------------");

		for(Entry<String,Integer> i:zipcode.entrySet())
		{
			System.out.println(i.getKey()+" : "+i.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
