package Stringbasic;

public class revwe {

	public static void main(String[] args) {
		/*
		 * String s1 = "thanigachalam";
		 * 
		 * char[] c = s1.toCharArray(); int len = s1.length(); String s = "";
		 * 
		 * for (int i = 0; i < len; i++) { for (int j = i + 1; j < len; j++) {
		 * 
		 * if (c[i] > c[j]) { char temp = c[j]; c[j] = c[i]; c[i] = temp; } }
		 * 
		 * } for (int i = 0; i < len; i++) { s = s + c[i]; } System.out.println(s);
		 */

		String name = "payilagam";
		// int c=name.length();
		String s = " ";
		char[] sr = name.toCharArray();
		int len = name.length();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (sr[i] > sr[j]) {
					char temp = sr[j];
					sr[j] = sr[i];
					sr[i] = temp;

				}

			}
		}
		for (int i = 0; i < len; i++) {

			s = s + sr[i];

		}
		System.out.println(s);

	}
}