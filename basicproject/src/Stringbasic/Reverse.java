package Stringbasic;

public class Reverse {

	public static void main(String[] args) {

		String s1 = "thanigachalam";
		String rev = "";
		//String sum = "";
		//String r = "";

		char c[] = s1.toCharArray();
		/*
		 * String s=s1.concat("j"); String f1=s1.concat("a"); String d=s1.concat("v");
		 */
		for (int i = s1.length() - 1; i >= 0; i--) {
			//System.out.println(s1);
			rev = rev + c[i];
		}

		
		System.out.println("rev:"+rev);
	}

}
