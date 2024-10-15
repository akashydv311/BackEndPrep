package lecture9;

// local variable and instance variable
class Alien{
	// instance variable
	int age;
	double salary;
	
	// local variable
	void show() {
		String name;
//		System.out.println(name); // local varibale must have init
		name = "TestName";
		System.out.println(name+" "+age+" "+salary);
	}
}

public class FirstClass {
	public static void main(String[] args) {
		
		// Crating object of Alien
		Alien a = new Alien();
		a.show();
		
	}
}
