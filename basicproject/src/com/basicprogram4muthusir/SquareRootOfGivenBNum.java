package com.basicprogram4muthusir;

public class SquareRootOfGivenBNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2500;
		int div = 2;                     //--------------->Q)20
		while (div <= a / 2) {
			if (a / div == div) {
				System.out.println(div + "Square root:"+ a);
				break;

			}
			div++;
			
			
		}
	}

}
