
public class Recussinusingnumbers {
	public static void main(String[] args) {
		Recussinusingnumbers re = new Recussinusingnumbers();
		re.display(1);

	}

	private int display(int i) {

		if (i > 5) {
			return 1;
		}
		System.out.println(i);
		int a = display(i + 1);
		return i + a;

		// TODO Auto-generated method stub

	}

}
