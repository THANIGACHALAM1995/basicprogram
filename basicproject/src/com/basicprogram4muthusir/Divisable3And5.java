package com.basicprogram4muthusir;

public class Divisable3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		while (x <= 30) {
			if (x % 3 == 0) {
				System.out.println(x);
			}
			if (x % 5 == 0) {                   //----------->11
				System.out.println(x);
			}

			x++;

		}

	}

}
