

package com.basicprogram3;

public class testfibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;

		for (int i = 1; i <= 10; i++) {
			a = a + b;
			b = a - b;
			System.out.println(b);
		}
	}
}
