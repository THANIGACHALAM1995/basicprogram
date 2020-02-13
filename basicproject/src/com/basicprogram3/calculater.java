package com.basicprogram3;

public class calculater {
	static String brand = "ABC";
	static int price = 650;
	private static boolean ture;
	static boolean icScientic = ture;
	String owner = "kumar";

	static void scitificCalculater() {
		calculater calc2 = new calculater();
		System.out.println(calc2.owner);
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println(icScientic);

	}

	public static void main(String[] args) {
		calculater calc = new calculater();
		calc.add();
		scitificCalculater();

		int a = calc.subtrack(50, 20.5f);
		int result = calc.subtrack(50, 20.5f);
		System.out.println("result :"+result);
	}

	private int subtrack(int i, float f) {
		// TODO Auto-generated method stub
		int o = 50;
		float g = 20.5f;
		float d = o - g;
		System.out.println("subtrack :"+d);
		// System.out.println(float f);
		return 0;
	}

	private static void add() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int total = a + b;
		System.out.println("total :"+total);
		System.out.println();

	}

}
