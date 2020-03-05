package Arraypro;

public class CountandDisplayhoeManyElementinanArrayhavetheDigit5 {

	public static void main(String[] args) {
		int []a= {15,70,30,35};
        int count =0;
        int len=a.length;
        int s=0;
      while(s!=len)
      {
    	 if(a[s]%10==5) 
    	 {
    		 count++;
    	 }
    	 s++;
      }
        
      System.out.println(count);  	
        }

	}


