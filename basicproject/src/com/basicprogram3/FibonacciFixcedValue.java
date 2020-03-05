package com.basicprogram3;

public class FibonacciFixcedValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int count=0;
while(true) {
	int c=a+b;
	count++;
	if (count==10) {
		System.out.println(c);
		a=b;
		b=c;
		break;
		
	
	}
}
	}

}
