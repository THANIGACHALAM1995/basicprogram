package com.basicprogram4muthusir;

public class Modulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=56789;
		int noOfdigits=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			System.out.println(rem);
			n=n/10;            //------------->34
			noOfdigits++;
		}
		System.out.println("------------");
		
		System.out.println("noOfdigits:"+ noOfdigits);
	}

}
