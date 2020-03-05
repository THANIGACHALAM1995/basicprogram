package com.basicprogram4muthusir;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 11, div = 3;
		boolean check = true;
		if (n % 2 == 0) {
			while (div < n) {
				if (n % div == 0) {
					System.out.println("not prime");
					check = false;
					break;
				}
				div = div + 2;

			}
		}

		if (check == true)

		{
			System.out.println("prime");
		}

	}
}
