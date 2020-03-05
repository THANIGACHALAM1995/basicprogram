package Stringbasic;

public class FullSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="If you think yes can do it,you can do it";
		String []str=s.split(" ");
		int len=str.length;
	for(int i=0;i<len;i++) {
		if((str[i]).equals("do"))
{
			str[i]="Write";
			
	}
}
	for(int i=0;i<len;i++) {
		System.out.print(str[i]+" ");
	}

	}

}
