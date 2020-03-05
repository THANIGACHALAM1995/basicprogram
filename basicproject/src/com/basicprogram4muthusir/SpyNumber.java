package com.basicprogram4muthusir;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1124;
		int sum=1;
		int prod=0;
		int rem=0;
		while(a>0) {
			rem=a%10;
			sum=sum*rem;
			prod=prod+rem;
			
			a=a/10;
		}
		
			if(prod==sum) {
				System.out.println("Spy Number");
			}else {
				System.out.println("not a Spy Number");
			}
		

	}

}
