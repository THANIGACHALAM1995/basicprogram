package com.Interviewprogram;

public class ActorSivaKumar implements Actor {
	static String adderss="Coimbatore";
	ActorSivaKumar(int o,String s){
		
	}
	void speaking() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorSivaKumar as=new ActorSivaKumar(65, "Audi Car");
as.speaking();
Actor ac = new ActorSivaKumar(0,"adderss");
ac.act();
ac.dance();
ac.sing();
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		System.out.println("movies");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("music");
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("chennai gana");
	}

	

}
