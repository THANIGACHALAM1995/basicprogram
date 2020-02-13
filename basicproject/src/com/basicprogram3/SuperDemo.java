package com.basicprogram3;

public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperA  a=new SuperA ();
		a.add();
		System.out.println("--------------------");
		SuperB b=new SuperB(50);
		b.add();
		b.sub();
		System.out.println("--------------------");
		SuperC c=new SuperC();
		c.mul();
		c.add();
		c.sub();
	}

}
