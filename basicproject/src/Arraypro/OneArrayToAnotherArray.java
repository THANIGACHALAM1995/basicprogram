package Arraypro;

public class OneArrayToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5 };
		int len = a.length;
		int a1[] = new int[len];
		int i = 0, j = a.length - 1;
		while (i < a.length) {
			a1[i] = a[j];
			System.out.println(a1[i]);
			i++;
			j--;
		}

	}

}




/*
 * int a[] = { 1, 2, 3, 4, 5 }; int len=a.length-1; while(len>=0) {
 * System.out.println(a[len]); len--; } }
 */