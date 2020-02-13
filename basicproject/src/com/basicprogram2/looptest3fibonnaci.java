package com.basicprogram2;

public class looptest3fibonnaci {

	public static void main(String[] args) {
		int d1=0,d2=1;
	int	s=1;
		System.out.println(d1);
		System.out.println(d2);
		
		while(s<10) {
			System.out.println(d1+d2);
			int d3=d1+d2;
			d1=d2;
			d2=d3;
			s++;
			
			
		}
	}
}
