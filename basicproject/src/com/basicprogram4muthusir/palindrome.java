package com.basicprogram4muthusir;

public class palindrome {

	public static void main(String[] args) {

		int n = 1235544321;
		int a = n;
		int rem = 0;
		int rev = 0;
		while (n > 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n / 10;
                                                //------------>25
		}
		System.out.println(rev);
		if (a == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");

		}

	}

}
