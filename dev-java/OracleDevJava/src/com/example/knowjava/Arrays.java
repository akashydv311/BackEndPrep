package com.example.knowjava;

public class Arrays {
	public static void main(String[] args) {
		
		// Declares array in java
		int[] arr;
		
		arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(byte i=0; i<arr.length;i++) {
//			System.out.print(arr[i]+",");
		}
		
		// we can create a length of array by directly passing a values in it
		int[] myarr = {
				34,45,56,67
		};
		System.out.println(myarr.length);
		
	}
}
