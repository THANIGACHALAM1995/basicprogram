package com.basicprogram4muthusir;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1995;
		int sum=0;
		int rem=0;
		while(a>0) {
			rem=a%10;
			sum=sum+rem;        //----------->34 
			a=a/10;
		}
		System.out.println(sum);
	}

}
