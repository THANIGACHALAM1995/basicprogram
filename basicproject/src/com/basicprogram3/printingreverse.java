package com.basicprogram3;

public class printingreverse {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub int n=123456; int b=0; int r=0;
		 * 
		 * while(n<=6) { b=n%10; r=r*10+b; b=n/10;
		 * 
		 * }
		 */
		// System.out.println(r);
		int a = 123, b = 0;
		while (a != 0) {
			
			
			int c = a % 10;
			b = b * 10 + c;
			a = a / 10;
		}
		System.out.println(b);
	}

}
