package oop.day;

public class testfact {

	public static void main(String[] args) {
		

		testfact re = new testfact();
		int c = re.fact(4);
		int d=re.fact(5);
		int k=re.fact(6);
		System.out.println(c);
		System.out.println(d);
		System.out.println(k);
	}

	public int fact(int j) {
		
		int i = 1;
		int f = 1;
		while (i <=j) {
			f = f * i;
			i++;

		}
		return f;

	}
}

