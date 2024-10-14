package com.example.knowjava;

public class DataTypes {
	public static void main(String[] args) {
		
		// Primitive data types in java
		
		byte b = 127; // 8 bit signed two's complement integer
		short s = 32767; // 16 bit
		int i = 974359;  // 32 bit
		long l = 18765L;	// 64 bit
		
		float f = 89423.98f;  // 32 bit
		double d = 138745.908d;  // 64 bit
		
		boolean bool = false; // two possible value true/false
		
		char ch = '\u0000';  // 16 bit
		
		
		String dname = ((Object) i).getClass().getName();
//		String iname = i.getClass().getName();
		System.out.println(dname);
		
		
		// Floating point literal
		double val = 123.4;
		
		System.out.println( ((Object) val).getClass().getName());
		
		float x = 123.4F;
		
		System.out.println( ((Object) x).getClass().getName());
		
		// Using underscore in the values
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi =  3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;

		/*
		You can place underscores only between digits; you cannot place underscores in the following places:

		At the beginning or end of a number
		Adjacent to a decimal point in a floating point literal
		Prior to an F or L suffix
		In positions where a string of digits is expected

		long newCreditCardNumber = 1234_5678_9012_3456_L;
		Exception in thread "main" java.lang.Error: Unresolved compilation problem: Underscores have to be located within digits
		
		System.out.println(newCreditCardNumber);
		*/
		
		
		
	
	}	
}
