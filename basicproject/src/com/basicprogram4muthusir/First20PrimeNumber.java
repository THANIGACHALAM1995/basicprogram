package com.basicprogram4muthusir;

public class First20PrimeNumber {

	public static void main(String[] args) {

		//int primecount = 1;
		int n = 12;
		//while (primecount <= 20) {
			int div = 3;
			boolean check = true;
			if (n % 2 != 0) {
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
				System.out.println(n + "prime");
				//primecount++;
			}

			else {
				System.out.println(n);
				//primecount++;
			}
		}
	}
//}
