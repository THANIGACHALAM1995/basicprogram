package oop.day;

public class Empolyee {

	int salary = 40000;
}

class Programmer extends Empolyee {

	int bonus = 10000;

	public static void main(String[] args) {

		Programmer pro = new Programmer();
		System.out.println("total salary:" + (pro.salary + pro.bonus));

	}

}
