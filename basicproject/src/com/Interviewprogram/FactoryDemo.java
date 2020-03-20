package com.Interviewprogram;

public abstract class FactoryDemo extends SmartPhone {
	boolean originalprice=false;
	static int price =0;
	abstract void verifyFingerPrint() ;

	abstract void providePattern();
	 void browse() {
		 System.out.println("factory demo browsing");
	 }
}
