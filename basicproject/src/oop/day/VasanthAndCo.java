package oop.day;

public class VasanthAndCo {
	static String Branch = "Chennai";
	static int code = 2652;
	int discount, proprice;

	public VasanthAndCo(int i, int j) {
		// System.out.println("check me when I M called");
		// System.out.println(i+ " "+j);
		discount = j;
		proprice = i;
	}

	public VasanthAndCo(int i) {
		proprice=i;
		// TODO Auto-generated constructor stub
	}

	public VasanthAndCo() {
		
		
		System.out.println("Calendar Free");
		}

	public static void main(String[] args) {
		VasanthAndCo tv = new VasanthAndCo(10000, 10);
		//tv.purchase();
		VasanthAndCo ac = new VasanthAndCo(30000, 10);
		//ac.purchase();
		VasanthAndCo fan = new VasanthAndCo(2000);
		fan.purchase();
		VasanthAndCo calendar = new VasanthAndCo();
		
		
	}

	
	private void purchase() {
		int dicp = proprice - ((proprice * discount) / 100);
		System.out.println("Please pay :" + dicp);

	}

}
