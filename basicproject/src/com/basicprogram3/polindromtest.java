package com.basicprogram3;

public class polindromtest {

	public static void main(String[] args) {
		int a, b = 0, c;
		int n = 12421;
				;// It is the number variable to be checked for palindrome

		c = n;
		while (n > 0) {
			a = n % 10; // getting remainder
			b = (b * 10) + a;
			n = n / 10;
		}
		System.out.println(b);
		if (c == b) {
			System.out.println("palindrome number ");
		}
		else {
			System.out.println("not palindrome");
	}
}
}