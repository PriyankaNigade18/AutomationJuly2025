package com.Programming.OOP.Encapsulation;

import com.Programming.OOP.Inheritance.AccessModifierSamePackageClass;

public class DifferentPackage extends AccessModifierSamePackageClass  {

	public static void main(String[] args)
	{

		AccessModifierSamePackageClass a1=new AccessModifierSamePackageClass();
		System.out.println(a1.name);
		//Protected data you can called in different package only by subclass object
		
		DifferentPackage d1=new DifferentPackage();
		System.out.println(d1.acno);
		System.out.println(d1.name);
		

	}

}
