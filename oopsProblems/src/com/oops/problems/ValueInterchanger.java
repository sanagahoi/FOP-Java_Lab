package com.gl.javaPrework.week_2;

public class ValueInterchanger {
	public static void main(String[] args) {
		
		//declare variables and assign the values
		int n1 = 10;
		int n2 = 20;
		
		// print values initially
		System.out.println("Initial values of numbers " );
		System.out.println("n1 --> " + n1);
		System.out.println("n2 --> " + n2);
		
		//interchanging method
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println();
		
		// display values after interchanging
		System.out.println("Values after interchanging : ");
		System.out.println("n1 --> " + n1);
		System.out.println("n2 --> " + n2);
	}

}
