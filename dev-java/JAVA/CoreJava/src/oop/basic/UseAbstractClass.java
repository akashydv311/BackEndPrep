package oop.basic;

// This is abstraction in java
abstract class Animal{
	// abstract class can have the regular data & methods as well as abstract methods
	private String name;
//	abstract int age;
	
	abstract void speak();
	
	public String getName() {
		return this.name;
	}
	public void eat() {
		System.out.println(this.getName()+" Animal eat food");
	}
	
	
}

public class UseAbstractClass {
	public static void main(String[] args) {
		
		Animal dog = new Animal() {
			
			@Override
			void speak() {
				// TODO Auto-generated method stub
				System.out.println("dog speaking");
			}
		};
		
		Animal cow = new Animal() {
			
			@Override
			void speak() {
				// TODO Auto-generated method stub
				System.out.println("cow speaking");
			}
		};
		
		dog.speak();
		cow.speak();
		
	}
}
