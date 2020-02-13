package com.basicprogram2;

public class Recusiiontest {

	int x = 3;
int v=3;
	void print() {

		//System.out.println(x);
		
		int s=v*x;
		System.out.println(s);
		x++;
		if (x <= 10)
         print();
	}

	public static void main(String[] args) {
		Recusiiontest re = new Recusiiontest();
		re.print();
		//System.out.println(re);

	}

	// int a=3, i=1,b;

}
