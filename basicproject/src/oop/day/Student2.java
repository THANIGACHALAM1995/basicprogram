package oop.day;

public class Student2 {
	int mark1;
	int mark2;

	public static void main(String args[]) {
		Student2 siva = new Student2(90,80);
		Student2 kumar= new Student2(97, 80);
		
		siva.display();
		kumar.diplay();

	}
	private void diplay() {
		// TODO Auto-generated method stub
		System.out.println("siva :"+mark1);
		System.out.println("siva :"+mark2);
		
	}
	void display() {
		// TODO Auto-generated method stub
		System.out.println("kumar :"+mark1);
		System.out.println("kumar :"+mark2);
	}
	Student2(int i,int j){
		mark1=i;
		mark2=j;
	
	}
	
	
	
	
	
	
	

}
