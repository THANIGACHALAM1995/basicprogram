package com.Interviewprogram;

public class Trainer {
	String dept="Java";
	String institude="Payilagam";
	private int salary=10000;
	
	public int getSalary() {
		return salary;
	}
	public Trainer(String a,String b) {
		this.dept=a;
		this.institude=b;
		
	}
	 void training() {
		 System.out.println(dept);
		 System.out.println(institude);
		 System.out.println(salary);
	}
	 
	 
	 
	public static void main(String args[]) {
		Trainer Trainerkumar=new Trainer("B.sc", "ComputerScience");
		Trainerkumar.training();
	}
	
	 
	
}
