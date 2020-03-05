package oop.day;

public class PetternusingrRcursion {
	public static void main(String[] args) {
		PetternusingrRcursion pr = new PetternusingrRcursion();
		pr.display(1);

	}

	public int display(int i) {

		if (i > 9) {
			return 1;

		}
		//if (i%2==1) {
			//System.out.println();
		//}
		if (i % 3 == 1) {
			System.out.println();
		}
		System.out.print(i);
		int a = display(i + 1);
		return i + a;
		// TODO Auto-generated method stub

	}

}
