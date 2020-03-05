package Stringbasic;

public class StringABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n[] = { "abacus", "java","tree","thanigachalam","cricket","abc","india","andhra pradesh","brid", "apple", "cat", "tiger", "top", "airoplan", "fish", "python", "php", "perl" };
		int len = n.length;
		for (int i = 0; i < len; i++) {
			char c[] = n[i].toCharArray();
			
			for (int j = i + 1; j < len; j++) {
				if(n[i].compareTo(n[j])>0) {
					String temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					}
				}
			}
		for(int i=0;i<len;i++) {
			System.out.println(n[i]);

		}

	}

}
