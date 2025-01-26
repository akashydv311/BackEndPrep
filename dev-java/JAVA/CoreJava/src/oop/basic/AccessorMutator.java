package oop.basic;

// this is encapsulation

class Person{
	//accessor
	private String name;
	private int age;
	private char gender;
	
	//constructor
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//mutator
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender;
	}
	
}

public class AccessorMutator {
	public static void main(String[] args) {
		
		Person p1 = new Person("Akash Yadav", 23, 'M');
		String personName = p1.getName();
		int personAge = p1.getAge();
		char personGender = p1.getGender();
		
		System.out.println("Name: "+personName+" Age: "+personAge+" Gender: "+personGender);

	}
}
