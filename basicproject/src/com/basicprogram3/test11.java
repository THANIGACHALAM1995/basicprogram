package com.basicprogram3;

public class test11 {

	public static void main(String[] args) {

		int a = 563;
		int n;
		int sum = 0;
		while (a > 0) {
			n = a % 10; // System.out.println(n);
			a = a / 10;
			sum = sum + n;

		}

		System.out.println(sum);

	}
}
