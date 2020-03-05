package com.basicprogram;

public class RecurssionReversanumpro {

	public static void main(String[] args) {
		RecurssionReversanumpro re = new RecurssionReversanumpro();
		re.display(5);
	}

	private int display(int i) {
		if (i < 1) {
			return -1;
		}
		System.out.println(i);
		int a = display(i - 1);
		// i--;
		return i - a;
	}
}
