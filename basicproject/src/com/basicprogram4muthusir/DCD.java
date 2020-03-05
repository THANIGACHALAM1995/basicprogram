package com.basicprogram4muthusir;

public class DCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=130,n2=140;
//boolean common=false;
		int small=n<n2?n:n2;
		while(small>=2) {
			if((n%small==0)&&(n2%small==0)) {
			                                             	//-------->27
				//common=true;
				System.out.println("GCD"+small);//------->GCD
				break;
			}
			small--;
		}
		
		  //if(common==false) {
		  
		  }
		 
	}

//}
