package oop.day;

public class petternumbers {
	static int a=0;
	public static void main(String[] args) {

		// TODO Auto-generated method stub

//		int a = 1, r = 3, c = 3;
//		int d = 1;
//		for (a = 1; a <= 3; a++) {
//			for (r = 1; r <= c; r++) {
//				System.out.print(a);
//
//			}
//			System.out.println(" ");
//		}
		
		for(;a<=10;a++) {
			for(int j=0;j<3;j++) {
				System.out.print(++a);
			}
			System.out.println();
		}

	}

}
