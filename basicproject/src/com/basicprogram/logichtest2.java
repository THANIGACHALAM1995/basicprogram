package com.basicprogram;

public class logichtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age =0;
		if(age >=1 && age<17) {
			System.out.println("mainer");
		}else if(age>=18 && age <40) {
			System.out.println("yongster");
		}else if(age>=41 && age <59) {
			System.out.println("mid level age");
		}else if(age >=60) {
			System.out.println("senior citizen");
		}else {
			System.out.println("enter your age");
		}

	}

}
