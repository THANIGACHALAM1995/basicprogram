package Stringbasic;

public class StringSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="If you think yes can do it,you can do it";
		String []str=s.split(" ");
		
		int len=str.length;
		int count=0;
		//char[] c=new char[len];
		for(int i=0;i<len;i++) {
			if((str[i]).equals("it")) {
				
				count++;
			}
		}
		System.out.println(count);
		
	}

}
