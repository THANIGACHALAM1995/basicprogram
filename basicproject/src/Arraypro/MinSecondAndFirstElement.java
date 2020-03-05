package Arraypro;

public class MinSecondAndFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]n= {3,5,2,8,7};
	int max=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	int i=0;
	while(i<n.length) {
		if(n[i]>max) {
			max2=max;
			max=n[i];
		}
		else if(n[i]>max2) {
			max2=n[i];
		}
		i++;
	}
		System.out.println(max2);
	System.out.println(max);
	}


	

}
