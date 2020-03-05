package Arraypro;

import java.util.Scanner;

public class Arraypro1 {

	public static void main(String[] args) {
		// int total = 0;

		Scanner sc = new Scanner(System.in);

		/*
		 * int len = sc.nextInt(); int[] mark1 = new int[len]; for (int i = 0; i < len;
		 * i++) { System.out.println("Please Enter marks"); mark1[i] = sc.nextInt();
		 * total = total + mark1[i];
		 * 
		 * } System.out.println(total); sc.close();
		 */
		/*
		 * int len=0; int[] array = { 5, 10, 15, 6, 7 }; for (int i = 0; i < len; i++) {
		 * System.out.println(array[i]); } for (int i = array.length - 1; i >= 0; i--) {
		 * if (i == 2) { System.out.println(array[i]); } }
		 */
		/*
		 * abts = new String[5]; System.out.println(abts.length);
		 * System.out.println(abts); System.out.println(abts[0]);
		 * System.out.println(abts.length);
		 */

		/*
		 * int []array= {5,10,15,6,7}; for(int i=0;i<array.length;i++) {
		 * if(array[1]==15) { System.out.println("15 is present at"+i); break; }
		 */

		/*
		 * int[] marks = { 91, 76, 92, 89, 98 }; boolean noPresent = false; for (int i =
		 * 0; i < marks.length; i++) { //-------------->LINEAR SEARCH if (marks[i] ==
		 * 91) { noPresent = true; System.out.println("I got It"); break; } }
		 * 
		 * if (noPresent == false) { System.out.println("mark not present");
		 * 
		 * }
		 */

		/*
		 * int [] m= {91,76,92,89,98};
		 * 
		 * int i=0; int temp=m[i]; System.out.println(m[4]); while(i<m.length-1) {
		 * m[i]=m[i+1]; i++; } m[i]=temp; System.out.println(m[4]);
		 */

		/*
		 * int [] arr = new int [] {1, 2, 3, 4, 5};
		 * System.out.println("printing array: "); //---------->printing array for (int
		 * i = 0; i < arr.length; i++) { System.out.print(arr[i] + " ");
		 */

		/*
		 * int[] arr = new int[] { 1, 2, 3, 4, 5 }; // int [] arr = new int [] {1, 2, 3,
		 * 4, 5}; System.out.println("reverse array: "); for (int i = arr.length - 1; i
		 * >= 0; i--) {//-------------->reverse array System.out.print(arr[i] + " "); }
		 */
		
		 int [] array={5,3,2,4,7};
		 int n=53;
		 int i=0;
		 while(i<array.length) {
		  if(array[i]==3) {//--------------->remove elements break;
		 break;
		 }
		  i++;
		 
		  } 
		 System.out.println("3 is present at "+ i);
		 System.out.println();
		 if(i==array.length) {
		 for(int j=i;j<array.length-1;j++) {
			 array[j]=array[j+1];
		 }
		 }
		 
		


		
		
		
		
		
		
		
		
		
		
	}
}
