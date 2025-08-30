package com.Programming.Array_String;

public class StringMethods {

	public static void main(String[] args) 
	{
		//lenght():total characters 
		String s1="Hello All";
		System.out.println("Length of current string is: "+s1.length());//9
		
		//string conversion: toLowerCase()  toUpperCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//String equality : equals():case sensitive  equalsIgnoreCase():not case sensitive
		String act="Welcome";
		String exp1="Welcome";
		String exp2="welcome";
		System.out.println(act.equals(exp1));//true
		System.out.println(act.equals(exp2));//false
		
		System.out.println(act.equalsIgnoreCase(exp1));//true
		System.out.println(act.equalsIgnoreCase(exp2));//true
		
		//trim(): To remove white space before and after string
		String s2="       Welcome    All         ";
		System.out.println(s2);
		System.out.println(s2.trim());
		
		//charAt(index)
		String s3="Automation Testing";
		System.out.println("character at index 5: "+s3.charAt(5));//a
		
		//to get the index of a character:indexOf(char):first occurrence
		System.out.println("Index of character i is: "+s3.indexOf('i'));//7
		
		//to get the next occurrence index value of char i:indexOf(char,fromindex)
		System.out.println("to get the next occurrence index value of char i: "+s3.indexOf('i',8));
	
		//contains():partial match
		String info="Selenium WebDriver is WebUI autiomation library";
		System.out.println("String contains tool?: "+info.contains("tool"));//false
		System.out.println("String contains WebUI?: "+info.contains("WebUI"));//true
				
		//startsWith(prefix) 
		System.out.println("look for string starts with S char?:"+info.startsWith("S"));//true
		System.out.println("look for string starts with Sel chars?:"+info.startsWith("Sel"));//true
		System.out.println("look for string starts with Selenium?:"+info.startsWith("Selenium"));//true
		System.out.println("look for string starts with enium char?:"+info.startsWith("enium"));//false

		//endsWith(suffix)
		System.out.println("look for string ends with y char?:"+info.endsWith("y"));//true
		System.out.println("look for string ends with library ?:"+info.endsWith("library"));//true
		System.out.println("look for string ends with brary?:"+info.endsWith("brary"));//true
		System.out.println("look for string ends with automation?:"+info.endsWith("automation"));//false

		//replace()
		String data="Playwright is WebUi automation testing and API testing tool";
		System.out.println(data);
		System.out.println(data.replace('i','*'));
		System.out.println(data.replaceAll("testing","*******"));
		
		//substring()
		System.out.println(data.substring(43));//begin index
		System.out.println(data.substring(14,38));//last index-1
		
		//toCharArray()
		String s4="Hello All";
		char arr[]=s4.toCharArray();
		for(char i:arr)
		{
			System.out.println(i);
		}
		
		//scenario: convert even position character into uppercase and odd position character to lowercase
		String name="Priyanka";
		String res="";
		
		for(int i=0;i<name.length();i++)
		{
			if(i%2==0)
			{
				res=res+name.toUpperCase().charAt(i);
			}else
			{
				res=res+name.toLowerCase().charAt(i);
			}
		}
		
		System.out.println(res);
		
		//concat(): + 
		
		String ss1="Hello All";
		String ss2="Welcome to learn OOP principles";
		System.out.println(ss1+" "+ss2);
		System.out.println(ss1.concat(" "+ss2));
		
		//isEmpty():length of string should be 0
		String s5="";
		String s6=" ";
		System.out.println(s5.isEmpty());//true
		System.out.println(s6.isEmpty());//false
		//isBlank():string should be empty or white space allowed
		System.out.println(s5.isBlank());//true
		System.out.println(s6.isBlank());//true
		
		//split(regular expression): pattern
		String tools="Selenium,Postman,Appium,Cypress,Playwright";
		
		System.out.println(tools);

		String arr1[]=tools.split(",");
		
		//single entry
		System.out.println(arr1[2]);//Appium
		String t1=tools.split(",")[4];
		System.out.println(t1);//Playwright
		
		System.out.println("--------------");
		
		for(String i:arr1)
		{
			System.out.println(i);
		}
		
		//scenario: count total words from string
		String ss3="Playwright is WebUi and Api testing tools";
		System.out.println("Total Words are:"+ss3.split(" ").length);
		
//		String arr2[]=ss3.split(" ");
//		System.out.println(arr2.length);
		
		/*
		 * automation scenario:
		 * -------------------------
		 * testing amount: amount should be less than 10000
		 * bill="total amount is 5000"
		 */
		
		String bill="Total amount is 5000";
		//get the amount
		String billamt=bill.split(" ")[3];//"5000"
		
		//string--->int
		int amount=Integer.parseInt(billamt);//5000
		
		if(amount<10000)
		{
			System.out.println("Valid");
		}else
		{
			System.out.println("Invalid");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
