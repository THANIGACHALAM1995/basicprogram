package ExceptionHandling;

public class Program {
	void work() throws ArithmeticException {
		try {
			System.out.println(5 / 0);
		} catch (ArithmeticException f) {
			throw f;
		} catch (Exception e) {
			throw e;
		}

		finally {

			System.out.println("end of method");
		}
	}

	public static void main(String[] args) {

		Program p = new Program();
		
			p.work();
		

	}

}
