package Stringbasic;

public class basicpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String name="thanigachalam";
		 int l=name.length() ;
		 System.out.println(l);

		String s = "java";
		char[] c = s.toCharArray();
		System.out.println(c);

		System.out.println(c[1]);
		int i = s.indexOf("av");
		System.out.println(i);
		int d = name.indexOf("bb");
		System.out.println(d);
		char f = name.charAt(5);
		System.out.println(f);
		char f1 = name.charAt(9);
		System.out.println(f1);
		
		String x = name.substring(2, 9);
		System.out.println(x);
		String sr = name.substring(2);
		System.out.println(sr);
		String se = "thaniga";
		System.out.println(se.equals(l));

		String s1 = new String("java");
		String s2 = new String("Java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = ("python");
		String s4 = ("python");
		System.out.println(s3 == s4);

		String s5 = s1.toUpperCase();
		System.out.println(s5);
		String s6 = s1.toLowerCase();
		System.out.println(s6);
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s3 == s4);
		System.out.println();

	}

}
