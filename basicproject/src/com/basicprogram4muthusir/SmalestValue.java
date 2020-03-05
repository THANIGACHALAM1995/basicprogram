package com.basicprogram4muthusir;

public class SmalestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=148;
		int div=2;
		while(div<=a) {
			if(a%div==0)
			{                   //-------------->26
				System.out.println(div);
				break;
				}
			div=div+1;
			}
	}
	

}
