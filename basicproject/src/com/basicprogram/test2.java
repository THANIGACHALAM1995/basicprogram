package com.basicprogram;

public class test2 {
	public static void main(String args[]) {
		int a = 3;
		System.out.println(a++ < a++);
		System.out.println(a);

		int b = 4;
		System.out.println(++b + 10 < b++ + 10);
		System.out.println(b);

		int x = 2, y = 3;
		System.out.println(x++ + ++y);
		System.out.println(x);
		System.out.println(y);
	}

}
