package com.basicprogram4muthusir;

public class Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=11110011,power=0,dec=0,rem=0;
while(a>0) {
	rem=a%10;
	dec= (dec+(rem*(int)Math.pow(2,power)));
		a=a/10;
		power++;
	}                             //------------->30
System.out.println(dec);//

	}

}
