package com.Interviewprogram;

public class Samsung extends FactoryDemo {
	static int price = 5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s = new Samsung();
		s.browse();
		s.browser();
		System.out.println(s.price);
	}

	@Override
	void verifyFingerPrint() {
		// TODO Auto-generated method stub

	}

	@Override
	void providePattern() {
		// TODO Auto-generated method stub

	}

	@Override
	void call(int seconds) {
		// TODO Auto-generated method stub

	}

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub

	}

	@Override
	void receiveCall() {
		// TODO Auto-generated method stub

	}

}
