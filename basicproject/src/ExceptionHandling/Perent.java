package ExceptionHandling;

public class Perent {

	public static void main(String[] args) {

		/*
		 * int a[]= {1,2,5,9,7,6,}; int n=5,m=10; try { //System.out.println(n/0);
		 * //System.out.println(a[n]); System.out.println(n/a[m]);
		 * }catch(ArithmeticException e) { System.out.println("A");
		 * }catch(ArrayIndexOutOfBoundsException e){ System.out.println("B"); }
		 * System.out.println("hiii");
		 */

		/*
		 * int k[] = { 5, 6, 7 }; int a = 15, b = 2, c = -1; try { c = a / b;
		 * System.out.println("A=" + k[c]); } catch (ArithmeticException t) {
		 * System.out.println("B=" + k[a]); } catch (ArrayIndexOutOfBoundsException e) {
		 * try { System.out.println("c=" + k[a]); } catch (Exception n) {
		 * System.out.println(k); }
		 */

		int x[] = {5,6,77};
		int a = 5, b = 6;
		try {
			System.out.println(x[a / b]);
		} catch (ArithmeticException e) {         //child exception
			System.out.println(a);

		} catch (Exception k) {                  //parent exception
			System.out.println(b);
		}
	}

}
