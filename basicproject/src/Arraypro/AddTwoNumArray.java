package Arraypro;

public class AddTwoNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] arr1 = { 5, 8, 3, 10 }; int[] arr2 = { 2, 3 }; int len1 = arr1.length;
		 * int len2 = arr2.length; int len = len1 > len2 ? len1 : len2; int[] result =
		 * new int[len]; int addcount = len1 < len2 ? len1 : len2; int i = 0; while (i <
		 * addcount) { result[i] = arr1[i] + arr2[i]; System.out.println(result[i]);
		 * i++; }
		 * 
		 * 
		 * while (i < len) { result[i] = arr1[i]; System.out.println(result[i]); i++; }
		 */
		int[] arr1 = { 1,2,3,4};
		int[] arr2 = { 2, 3,4, 10 };
		int len1 = arr1.length;
		int len2 = arr2.length;
		int len = len1 > len2 ? len1 : len2;
		int[] result = new int[len];
		int addcount = len1 < len2 ? len1 : len2;
		int i = 0;
		while (i < addcount) {
			result[i] = arr1[i] + arr2[i];
			System.out.println(result[i]);
			i++;
		}

		while (i < len) {
			result[i] = arr1[i];
			System.out.println(result[i]);
			i++;
		}

	}

}
