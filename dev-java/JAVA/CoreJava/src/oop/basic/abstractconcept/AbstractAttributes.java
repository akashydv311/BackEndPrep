package oop.basic.abstractconcept;

abstract class Animalxy{
	
	// variables allow in abstract class
//	abstract String codeName="abstract code"; // not allowed
	int xp = 10; // local
	protected String name = "java"; // instance
	static int data = 90; // static
	final int MAX_VAL = 10000; // final
	
	public String pass1 = "xyz";
	private String pass2 = "pqr";
	protected String pass3 = "abc";
	
	private String getPass1() {
		return this.pass1;
	}
	private String getPass2() {
		return this.pass2;
	}
	private String getPass3() {
		return this.pass3;
	}
	public String getPassword() {
		return getPass1()+getPass2()+getPass3();
	}
	
}

class UseAnimalxy extends Animalxy{
	
}

public class AbstractAttributes extends Animalxy{
	public static void main(String[] args) {
		
		UseAnimalxy u = new UseAnimalxy();
		
		System.out.println(u.getPassword()+" "+u.data+" "+u.MAX_VAL);
		
		
	}
}
