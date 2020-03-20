package com.Interviewprogram;

public abstract class SmartPhone {
	abstract  void call(int seconds);
	abstract  void sendMessage();
	abstract  void receiveCall();
	void browser() {
		System.out.println("hi Friends");
	}
	public SmartPhone()
	{
	System.out.println("Smartphone under development");
	}
	
}
