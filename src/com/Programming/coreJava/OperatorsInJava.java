package com.Programming.coreJava;

public class OperatorsInJava {

	public static void main(String[] args) 
	{
		/*
		 * Rule:
		 * To perform operations on primitive data use operator
		 * To perform operations on String use Method
		 * 
		 *  Arithmetic operators
		 *  +,-*,/,%
		 *  
		 */
		
		int a=100,b=20;
		System.out.println(a+b);//120
		//System.out.println("Addition is: "+a+b);//Addition is: 10020
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));
		
		System.out.println("-----Unary operators-------");
		/*
		 * Increment(++)
		 * -----------------
		 * a++=   a=a+1
		 * 
		 * postIncrement
		 * ----------------
		 * a++
		 * Not immediate action and next when you reuse variable you will see updated value
		 * 
		 * preIncrement
		 * -----------------
		 * ++a
		 * Immediate action
		 *
		 */
		//post
		int c=90;
		System.out.println(c);//90
		System.out.println(c++);//90
		System.out.println(c);//91
		
		//pre
		int d=78;
		System.out.println(d);//78
		System.out.println(++d);//79
		
		/*
		 * Decrement(--)
		 * -----------------
		 * a--=   a=a-1
		 * 
		 * postDecrement
		 * ----------------
		 * a--
		 * Not immediate action and next when you reuse variable you will see updated value
		 * 
		 * preDecrement
		 * -----------------
		 * --a
		 * Immediate action
		 *
		 */
		
		int e=45;
		System.out.println(e);//45
		System.out.println(e--);//45
		System.out.println(e);//44
		
		int f=67;
		System.out.println(f);//67
		System.out.println(--f);//66
		
		//interview
		
		int i=687;
		int j=i++;
		System.out.println(i);//688
		System.out.println(j);//687
		
		int k=89;
		int t=k++;
		System.out.println(k);//90
		System.out.println(t);//89
		
		int p=56;
		int q=++p;
		System.out.println(p);//57
		System.out.println(q);//57
		
		int s=486;
		int o=++s;
		System.out.println(s);//487
		System.out.println(o);//487
		
		int a1=80;
		int b1=a1--;
		System.out.println(a1);//79
		System.out.println(b1);//80
		
		int c1=598;
		int d1=--c1;
		System.out.println(c1);//597
		System.out.println(d1);//597
		
		System.out.println("------------Relational Operators------------");
		/* 
		 * Test Data
		 * a1=79 b1=80 p=q=57 k=90  s=487
		 */
		
		
		System.out.println("Less than <: "+(a1<b1));//true
		System.out.println("Less than equal to <=: "+(p<=q));//true
		System.out.println("Greater than >: "+(s>k));//true
		System.out.println("Greater than equal to >=: "+(b1>=k));//false
		System.out.println("Comparison operator ==: "+(a1==b1));//false
		System.out.println(p==q);//true
		System.out.println("Not equal to !=: "+(s!=a1));//true
		System.out.println(k!=p);//true
		System.out.println(p!=q);//false
		
		System.out.println("------Logical operators-------------");
		
		/*
		 * c1		c2 			 &&	(*)		||(+)		!c1
		 * true		true		true		true		false
		 * true		false		false		true		false
		 * false	true		false		true		true
		 * false	false		false		false		true
		 */
		System.out.println("----&&------");
		System.out.println((a1<b1) && (p==q));//true
		System.out.println((a1<b1) && (b1>=k));//false
		System.out.println((p!=q) && (s>p));//false
		System.out.println((s<a1) && (p>k));//false
		
		System.out.println("----||------");
		System.out.println((a1<b1) || (p==q));//true
		System.out.println((a1<b1) || (b1>=k));//true
		System.out.println((p!=q) || (s>p));//true
		System.out.println((s<a1) || (p>k));//false
		
		System.out.println("----!(NOT)------");
		
		System.out.println(p==q);//true
		System.out.println(!(p==q));//false
		
		System.out.println(s<p);//false
		System.out.println(!(s<p));//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
