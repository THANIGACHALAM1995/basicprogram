package com.basicprogram4muthusir;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
		/*            Q21,22
		 * System.out.println(a);//a=first System.out.println(b);//b=second and c=third
		 * for(int i=2;i<10;i++) { int c=a+b; a=b; b=c; System.out.println(c); }
	f	 */
for(int i=2;i<=10;i++) {
	

b=a+b;
a=b-a;
System.out.println(b);

System.out.println(a);
	}
	}
}
