package ExceptionHandling;

public class Program1 {
	int getMark(int a,int b)throws Exception {
		try {
			return a/b;                     //5/0
		}catch(Exception e) {
			throw e;
		}
		finally {
			System.out.println(a+b);           //5+2
		}
	}

	public static void main(String[] args) {
		int a=2;
		Program1 g=new Program1();
		try {
			a=g.getMark(5, 0);          
		}catch(Exception e) {
			try {
				a=g.getMark(5, a);          //(5,2)
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			System.out.println(a);     //2
		}

	}

}
