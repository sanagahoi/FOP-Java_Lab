package com.gl.javaPrework.week_2;

public class EvenNoByTernaryOperator {
	public static void main(String[] args) {

		// declare a variable and assign a number
		int num = 5;

		// use modulus operator (%) & ternary operator and store the result in a variable
		String result = (num % 2 == 0) ? "Even" : "Odd";

		// display the variables

		System.out.println(" The given no. is : " + result);

	}
}
