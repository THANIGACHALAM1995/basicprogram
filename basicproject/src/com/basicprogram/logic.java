package com.basicprogram;

public class logic {

	public static void main(String[] args) {
		/*
		 * int a=5,b=6; System.out.println((a<5)&&(b>7));
		 */
		
		
		//NOT
		
		/*
		 * int x=10; System.out.println(x<10 && x++ >10); System.out.println(x);
		 * 
		 * 
		 * int x1=10; System.out.println(x1<10 && x1++ >10); System.out.println(x1);
		 * 
		 * 
		 * //OR
		 * 
		 * int y=2; System.out.println(y>=2 || y++>2); System.out.println(y);
		 * 
		 * 
		 * int y1=2; System.out.println(y1>2 || y1++>2); System.out.println(y1);
		 */
/*int a=5;
if(a<5)
{
	System.out.println("A");
}
System.out.println("B");

	}

}*/
		
		
		
		
		/*
		 * int x=6; if(x>5) { x++;
		 * 
		 * }
		 * 
		 * System.out.println(x);
		 */
		
		/*
		
		int a=7;
		if(a<7 && a++ >=a);
		{
			a++;
		}
		System.out.println(a);
		
		
		
	}*/
		
	
		/*
		 * int a=7; if(a<7 || a++ >=a) { a++; } System.out.println(a);
		 */
	
	
	
	
	
	
	
	
		/*
		 * int x=4;
		 * 
		 * if(x<5 && x++<x++) { x++; }else { x--; } System.out.println(x);
		 */
	
	
		/*
		 * int x=12;
		 * 
		 * int s=x%2;
		 * 
		 * 
		 * if(s==0) { System.out.println("even"); }else { System.out.println("odd"); }
		 */
	
	
		
		/*
		 * int a=44,b=6; if(a<b) { System.out.println("a is alessthen"); }else if(a>10)
		 * { System.out.println("a is maximum"); }else {
		 * System.out.println("a is other"); }
		 */
		
	
		
		
		int x = 10;
		if (x < 10 && x++ < x++) {
			x++;

		} else if (x++ > 10 || x++ < x++) {
			x--;
		} else {
			x++;

		}
		System.out.println(x);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}	
}