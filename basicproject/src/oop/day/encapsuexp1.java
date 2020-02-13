package oop.day;

public class encapsuexp1 {
	private String name;

	public String getName() {
		System.out.println("some one accessing your name");
		return name;
	}
	public void setName(String name) {
		System.out.println("some one changing your name");
	this.name=name;
	}

}
