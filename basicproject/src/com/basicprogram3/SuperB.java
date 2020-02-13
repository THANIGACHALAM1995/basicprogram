package com.basicprogram3;

public class SuperB extends SuperA {
	int a=20;
	void sub() {
		int a=5;
		System.out.println(this.a);
		System.out.println(a);
		System.out.println(super.a);
	}
	SuperB(int a){
		
		
		System.out.println("B");
		
		
		
	}

}
