package com.Interviewprogram;

public class AndhraPredesh extends SouthIndia {

	public AndhraPredesh(String primeMinister) {
		super(primeMinister);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SouthIndia si = new AndhraPredesh("modi");
	//	si.cultivate();
	//	si.dress();
		//si.eat();
	//	si.speakLanguage();
	//	si.livingstyle();
		System.out.println("India:" + India.capital);
		System.out.println("AndhraPredesh:" + AndhraPredesh.capital);
	}

	void cultivate() {
		System.out.println("Rice and Sugar cane cultivation");
	}

	void livingStyle() {
		System.out.println(" Average development");
	}

	@Override
	void speakLanguage() {
		// TODO Auto-generated method stub
		System.out.println("TELUGU/TAMIL");
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("mills");
	}

	@Override
	void dress() {
		// TODO Auto-generated method stub
		System.out.println("dhoti");
	}

}
