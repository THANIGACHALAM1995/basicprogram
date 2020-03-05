package com.basicprogram4muthusir;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=153;
int n2=a;
int amstrong=0;
int rem;
while(a>0) {
	rem=a%10;
	amstrong=amstrong+(rem*rem*rem);
	a=a/10;
}
if(n2==amstrong) {               //-------------->32
	System.out.println("amstrong");
}else {
	System.out.println("not a amstrong");
}
	}

}
