package Arraypro;

//import java.lang.reflect.Array;

public class OneArraytoAnotherarraAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 5, 3, 2, 4, 7 };
		int n = 60;
		int len = array1.length;
		int[] array2 = new int[len + 1];
		int len2 = array2.length;
		array2[len2 - 1] = n;
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];

		}
		// System.out.println(array1[i]);
		for (int j = 0; j < array2.length; j++) {
			System.out.println(array2[j]);
		}

	}

}
