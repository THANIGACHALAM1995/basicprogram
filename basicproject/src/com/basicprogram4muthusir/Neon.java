package com.basicprogram4muthusir;

public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =28;
		int sum = 0;
		int rem = 0;
		int b;
		b = a * a;
		while (b > 0) {
			rem = b % 10;              //------------------>36
			sum = sum + rem;
			b = b / 10;
		}
		if (a == sum) {
			System.out.println("neon");
		} else {
			System.out.println("not a neon");
		}
	}
}
