

package com.basicprogram4muthusir;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 48, n2 =15 , big2 ;
		int big = n > n2 ? n : n2;
	 big2 = big;
		int small = n < n2 ? n : n2;
		while (true) {
			if (big % small == 0) {
				System.out.println(big);//---->LCM using ternary
				break;
			}
			big += big2;       ///------------>28
			
					
		}
	}

}
