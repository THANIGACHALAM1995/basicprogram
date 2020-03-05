package Petternpro;

public class LeftPetternReverse {
	public static void main(String args[]) {

		for (int r = 1; r <= 5; r++) {
			int s = 1, b = 9;
			for (int c = r; c <= 5; c++) {
				if (r % 2 == 1) {
					System.out.print(" " + s);
					s = s + 2;
				} else {
					System.out.print(" " + b);
					b = b - 2;
				}

			}

			System.out.println(" ");
		}
	}

}
