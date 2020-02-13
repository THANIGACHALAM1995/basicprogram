
package com.basicprogram3;

public class hotel {
	static String name = "saravanabhavan";
	static int doorno = 7;
	int mealsrate = 100;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hotel coustemer1 = new hotel();
		coustemer1.eat();
		float box =coustemer1.paybill(200,23);
		System.out.println(box);
		
		

		Perparfood();

	}

	private static void perparfood() {
		// TODO Auto-generated method stub

	}

	private static void Perparfood() {
		// TODO Auto-generated method stub
		System.out.println("ready to food");
	}

	private void eat() {

		System.out.println("eat well");
		//paybill();

	}

	private float paybill(int paidamount,int j) {
		System.out.println(paidamount);
		System.out.println(j);

		System.out.println("paid");
		float balance = 35.0f;
		return (int) balance;
		// System.out.println("balance");
		
		

}
}