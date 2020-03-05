
package com.basicprogram4muthusir;

public class SumOfDigitsSingalValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12345,sum;
do {
 sum=0;
while(a>0) {
	int rem=a%10;
	sum=sum+rem;
	a=a/10;
	
	
}
a=sum;

	}while(sum>9);
System.out.println(sum);

}
}