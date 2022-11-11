package com.gl.javaPrework.week_3;

import java.util.Scanner;

/*Create a basic Java program to implement Java I/O operations
 * Create variable of type int, float, double, boolean, char
 *  Take input of all the variables 
 *  display all the values on the console
 */

public class ImplementInputOutputOperations {

	public static void main(String[] args) {

		int num1;
		float num2;
		double num3;
		boolean bool;
		char character;
		String str;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter integer value --> ");
		num1 = scanner.nextInt();

		System.out.println("Enter float value --> ");
		num2 = scanner.nextFloat();

		System.out.println("Enter double value --> ");
		num3 = scanner.nextDouble();

		System.out.println("Enter boolean value --> ");
		bool = scanner.nextBoolean();

		System.out.println("Enter Char value --> ");
		character = scanner.next().charAt(0);

		System.out.println("Enter String value --> ");
		str = scanner.next();
		
		System.out.println("int -> " + num1);
		System.out.println("float -> " + num2);
		System.out.println("double -> " + num3);
		System.out.println("char -> " + character);
		System.out.println("boolean -> " + bool);
		System.out.println("String -> " + str);
		
	}

}
