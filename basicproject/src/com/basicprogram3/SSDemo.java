package com.basicprogram3;

public class SSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SSuperA a=new SSuperA(10);
		a.add();
		SSuperB b=new SSuperB(20);
		b.sub();
		b.add();
		SSuperC c=new SSuperC(30);
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(b.a);
		
		

	}

}
