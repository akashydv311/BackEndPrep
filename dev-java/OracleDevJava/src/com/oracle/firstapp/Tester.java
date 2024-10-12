package com.oracle.firstapp;

public class Tester {
	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		
		String currJavaRuntime = System.getProperty("java.runtime.version");
		
		System.out.println("Current Java Runtime Version is: "+currJavaRuntime);
		
	}
}
