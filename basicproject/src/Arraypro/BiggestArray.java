package Arraypro;

public class BiggestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 3, 7, 2, 8, 5 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int i = 0;
		while (i < n.length) {
			if (max < n[i]) {
				max = n[i];

			}

			if (min > n[i]) {
				min = n[i];
			}
			i++;
		}
		System.out.println("MAX_VALUE:"+max);
		System.out.println("MIN_VALUE:"+min);

	}

}
