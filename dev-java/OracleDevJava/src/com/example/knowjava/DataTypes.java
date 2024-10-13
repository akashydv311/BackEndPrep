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
		
		
	
	}	
}
