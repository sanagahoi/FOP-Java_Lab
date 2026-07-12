package com.oops.topics;

import java.util.Scanner;

/**
 * Create a basic Java program to implement Java I/O operations

1) Create variable of type int, float, double, boolean, char, string

2) Take input of all the variables 

3) display all the values on the console
 * @author zebronics
 */

public class TakingInputViaScanner {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of int datatype: ");
		int value = in.nextInt();
		System.out.println(value);
		
		System.out.println("Enter the value of float datatype: ");
		float fvalue = in.nextFloat();
		System.out.println(fvalue);
		
		System.out.println("Enter the value of double datatype: ");
		double dValue = in.nextDouble();
		System.out.println(dValue);
		
		System.out.println("Enter the value of boolean datatype: ");
		boolean bValue = in.nextBoolean();
		System.out.println(bValue);
		
		System.out.println("Enter the value of char datatype: ");
		char cValue = in.next().charAt(0);
		System.out.println(cValue);
		
		System.out.println("Enter the value of String datatype: ");
		String sValue = in.next();
		System.out.println(sValue);
		
	}

}
