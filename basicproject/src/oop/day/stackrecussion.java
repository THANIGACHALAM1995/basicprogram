package oop.day;

public class stackrecussion {
	void print (int x) {
		System.out.println(x);
		x++;
		if(x<3) {
			print (x);
			
		}
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackrecussion sk= new stackrecussion();
		sk.print(1);
		System.out.println("end");
	}

}
