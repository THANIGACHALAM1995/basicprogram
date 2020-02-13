package com.basicprogram3;

public class statictest {
	static String pm="modi";
	static String capital="new delhi";
	static int state=29;
	
	String name;
	int age;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		statictest c=new statictest();
		c.age=22;
		c.name="dinesh";
		statictest c1=new statictest();
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.capital);
		System.out.println(c.pm);
		System.out.println(c.state);
		System.out.println(c1.age);
		System.out.println(c1.name);
		System.out.println(c1.capital);
		System.out.println(c1.state);
		System.out.println(c1.pm);
		
	}

}
