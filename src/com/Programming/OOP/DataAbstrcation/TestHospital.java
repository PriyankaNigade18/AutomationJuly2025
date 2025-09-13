package com.Programming.OOP.DataAbstrcation;

public class TestHospital {

	public static void main(String[] args)
	{
		System.out.println("Child class ref and Child class Object");
		System.out.println("-----IMA-----");
		NobleHs n1=new NobleHs();
		n1.medical();//individual
		n1.physio();//inherited abstract method
		n1.cardio();//inherited abstract method
		System.out.println(n1.imaId);
		
		System.out.println("------USMA------");
		n1.dental();
		n1.nero();
		n1.covid19Test();
		
		System.out.println("Prent class ref and Child class Object");
		System.out.println("-------IMA-----");
		IMA i1=new NobleHs();
		i1.cardio();//individual
		i1.physio();//individual
		i1.covid19Test();
		
		System.out.println("-------USMA-----");
		USMA u1=new NobleHs();
		u1.dental();
		u1.nero();
		u1.covid19Test();
		

	}

}
