package Arraypro;

public class countOfGivenElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {10,20,10,30,40,10,25};
		int search=10,count=0,i=0;
		while(i<array.length) {
			if(array[i]==search) {
				count++;
			}        // --------------------->Q13
			i++;
		}
System.out.println("count:"+count);

	}

}
