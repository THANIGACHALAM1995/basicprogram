package com.basicprogram4muthusir;

public class BinaryCodepro {

	public static void main(String[] args) {
		int n=10;
		String rem="";
		while(n>0) {
			//rem=rem+n%2;
			rem=n%2+rem;   
			                               //---------->30
			
			n=n/2;
		}
		System.out.println(rem);

	}

}
