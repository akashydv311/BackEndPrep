package oop.basic.abstractconcept;

abstract class Animalx{
	// abstract method
	public abstract void test();
	
	// regular method/concrete method
	public void test01() {
		System.out.println("Concrete methods example");
	}
	
// default method
//	default void test02() {
//		System.out.println();
//	}
// This is only allowed in interface not in abstract class
	
	// static method
	public static void test02() {
		System.out.println("Static method example");
	}
	//final method
	public final void test03() {
		System.out.println("Final method example");
	}
// special method
//	public Animal() {
//		
//	}
// This is special method allow in class only
	
}

class Dogs extends Animalx {

	@Override
	public void test() {
				
	}
	
		
}

public class AbstractMethods {
	
	public AbstractMethods() {
		System.out.println("demo for special method");
	}
	
	public static void main(String[] args) {
		
		Dogs robbin = new Dogs();
		robbin.test();
		robbin.test01();
		robbin.test02();
		robbin.test03();
		
	}
}
