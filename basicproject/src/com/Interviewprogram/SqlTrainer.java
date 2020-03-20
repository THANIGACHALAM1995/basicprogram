package com.Interviewprogram;

public class SqlTrainer extends Trainer{

	public SqlTrainer(String Stringa, String Stringb) {
		super(Stringa, Stringb);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqlTrainer st=new SqlTrainer("Sociology", "SVUCoA-TPTY");
		String s=st.dept;
		String s1=st.institude;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(st.getSalary());
		
	}

}
