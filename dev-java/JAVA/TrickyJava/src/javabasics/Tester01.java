package javabasics;

public class Tester01 {
	public static void main(String[] args) {
		
		Integer a = 127;
		Integer b = 127;
		
		System.out.println( a == b );
		
		//Integer caching is applied for values between -128 and 127.
		
		Integer x = 128;
		Integer y = 128;
		
		System.out.println( x == y );
		
	}
	
}
