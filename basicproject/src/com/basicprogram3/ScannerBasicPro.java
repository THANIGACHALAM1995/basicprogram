package com.basicprogram3;

import java.util.Scanner;

public class ScannerBasicPro {

	public static void main(String[] args) {
		String s1;
		String s2;
		String s3;
		int s4,s5;

		float f1;
		float f2;
		float f3;
		double d1;
		double d2;
		double d3;
		char c1;
		char c2;
		//char c3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your firstname");
		s1=sc.nextLine();

		System.out.println("Enter your secondname");
		s2=sc.nextLine();
		System.out.println("Enter your thredname");
		s3=sc.nextLine();
		System.out.println("enter your firstnumber");
		s4=sc.nextInt()
;
		System.out.println("Enter your secondnumber");
s5=sc.nextInt();

System.out.println("enter  your floatnum");
f1=sc.nextFloat();

System.out.println("enter  your floatnum");
f2=sc.nextFloat();
System.out.println("enter  your floatnum");
f3=sc.nextFloat();


System.out.println("enter  your doublenum");
d1=sc.nextDouble();

System.out.println("enter  your doublenum");
d2=sc.nextDouble();

System.out.println("enter  your doublenum");
d3=sc.nextDouble();

System.out.println("enter  your char");
c1=sc.next().charAt(0);
System.out.println("enter  your char");
c2=sc.next().charAt(2);
System.out.println("enter  your char");
//c3=sc.next().charAt(5);

System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

System.out.println(s4);
System.out.println(s5);

System.out.println();
System.out.println(d1);
System.out.println(d2);
System.out.println(d3);

System.out.println(f1);
System.out.println(f2);
System.out.println(f3);

System.out.println(c2);
//System.out.println(c3);
System.out.println(c1);
	}
	

}
