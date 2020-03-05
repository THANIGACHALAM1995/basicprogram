package com.basicprogram4muthusir;

public class Perfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=28,sum=0,i=1;
for( i=1;i<n;i++) {
if(n%i==0) {
	sum=sum+i;
	//i=i+1;

}
}
	if(sum==n) {
		System.out.println( "perfact");
	}else {
		System.out.println("not a perfact");
	}
}
	}


