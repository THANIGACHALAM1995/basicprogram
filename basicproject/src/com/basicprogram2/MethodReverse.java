package com.basicprogram2;

public class MethodReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReverse mr = new MethodReverse();
		int a = mr.display(5);
		System.out.println(a);
		int b = mr.display(10);
		System.out.println(b);
		int c = mr.display(20);
		System.out.println(c);

	}

	public int display(int i) {
		// TODO Auto-generated method stub

		int j = i;
		while (j >= 1) {

			System.out.println(j);

			j--;

		}
		return j;
	}
}
