package Arraypro;

public class MerjingTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {10,20,30};

	int []b= {5,15};
	int[] result=new int[a.length+b.length];
	int i=0;
	while(i<a.length) {
		result[i]=a[i];
		i++;
	}
	//int j=i;
	int k=0;
	while(i<result.length) {
		result[i]=b[k];
		System.out.println(result[i]);
		k++;
		i++;
	}
	
	}
}
