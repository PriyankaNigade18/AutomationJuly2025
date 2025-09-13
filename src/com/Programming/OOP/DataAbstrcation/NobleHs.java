package com.Programming.OOP.DataAbstrcation;
/*
 * When One child is acquiring properties from two different parent 
 * then it is multiple inheritance in java.
 */
public class NobleHs implements IMA,USMA//Multiple inheritance
{
	
	
	public void medical()
	{
		System.out.println("NobleHs.....Medical service()");
	}

	@Override
	public void physio() {

		System.out.println("NobleHs....Physioservice()");

	}

	@Override
	public void cardio() {
		System.out.println("NobleHs....Cardioservice()");
		
	}

	@Override
	public void nero() {
		System.out.println("NobleHs....Neroservice()");
	}

	@Override
	public void dental() {
		System.out.println("NobleHs....Dentalservice()");
		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobleHs...Covid19TestService()");
		
		
	}

}
