package com.basicprogram;

public class logichtest {

	public static void main(String[] args) {
		int a=15;
		if(a%3==0  ) {
			System.out.println("Bing");	
		}else if(a%5==0) {
			System.out.println("Bong");
		}else if(a%3==0 || a%5==0) {
			System.out.println("BingBong");
		}else {
			System.out.println("any number not match");
		}
		
		//System.out.println("enter your number");

	}

}
