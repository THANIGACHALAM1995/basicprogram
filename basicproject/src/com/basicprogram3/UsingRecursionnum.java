package com.basicprogram3;

public class UsingRecursionnum {
	int a = 0, b = 1, c = 0;
	static int count = 10;

	public void fibonacciRecursion(int count) {
		if (count > 0) {

			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
			fibonacciRecursion(count - 1);
		}
	}

	public static void main(String args[]) {
		UsingRecursionnum dj = new UsingRecursionnum();
		System.out.println("This is a Demo Program.");
		System.out.println(dj.a);
		// System.out.println();
		dj.fibonacciRecursion((count - 2));
	}

}
