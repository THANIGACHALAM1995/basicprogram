package com.basicprogram3;

public class RecuessionFactorial {
	int fact(int n) {
		if(n==1)
return 1;
		int x=n*fact(n-1);
		return x;
		
	}

	public static void main(String[] args) {
		RecuessionFactorial rf=new RecuessionFactorial();
		int result =rf.fact(5);
		System.out.println("RecuessionFactorial is :" +  result);
		
	}

}
