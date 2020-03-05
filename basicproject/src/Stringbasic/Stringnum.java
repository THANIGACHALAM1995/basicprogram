package Stringbasic;

public class Stringnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "chennai430";
		int len = str.length();
		String c = "";
		char[] s = new char[len];
		StringBuffer sb = new StringBuffer("chennai43");
		for (int i = 1; i < len; i++) {
			s[i] = str.charAt(i);

		}
		for(int i=1;i<len;i++) {
			if((s[i]>=0)&&(s[i]>9)){
				
			}
		}

		System.out.println(s[1]);
	}

}
