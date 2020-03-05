package Arraypro;

import java.util.Scanner;

public class basicArrayProo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int [] arr=new int [6]; String [] str=new String[10]; float [] flo=new float
		 * [10]; double [] dou= new double[10]; System.out.println(flo[0]);
		 * System.out.println(dou[1]); System.out.println(str[2]);
		 * System.out.println(arr[3]); byte[]b=new byte[10]; short []s=new short[10];
		 * long [] l= new long[10]; boolean[] bo=new boolean[10]; char []ch=new
		 * char[10]; System.out.println(ch[1]); System.out.println(bo[2]);
		 * System.out.println(b[4]); System.out.println(s[3]); System.out.println(l[1]);
		 */
		int []marks=new int [5];
		marks[0]=90;
		marks[1]=91;
		
		marks[2]=94;
		
		marks[3]=96;
		
		marks[4]=70;
	int []	marks2= {12,23,56,85,45,48};
	Scanner sc= new Scanner(System.in);
	int lenth=sc.nextInt();
	System.out.println(marks2[lenth]);
		System.out.println(marks[1]);
		
		
		
		/*
		 * int i=0; while(i<=3) { System.out.println(marks[i]); i++; } for(
		 * i=0;i<=5;i++) { System.out.println(marks2[i]); }
		 */
		
		
		int []mark2=new int [5];
		for(int i=0;i<=marks2.length;i++) {
			System.out.println("Enter mark");
			mark2[1]=sc.nextInt();
			System.out.println(mark2[1]);
		}
		
	}

}
