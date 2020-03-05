package Arraypro;

public class ArrayOfOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] result = new int[arr.length / 2];
		int i = 0, j = 1;
		result[0] = arr[1];
		result[1] = arr[3];
		while (i < result.length) {
			result[i] = arr[j];
			System.out.println(result[i]);
			i++;
			j = j + 2;

		}

	}

}
