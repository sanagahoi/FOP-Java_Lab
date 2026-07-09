package com.gl.javaPrework.week_3;

import java.util.Scanner;

// Write a program in java to implement a basic calculator using switch case statement
//Accept two no as user input and print the result based on operation.
//Display list of options 
// 1 → addition
// 2 → subtraction
// 3 → multiplication
// 4 → division
//Perform division only if the second number is not equal to 0. 
//If the second number is 0 print “Cannot be divided” on console.

public class BasicCalculatorUsingSwitchCase {

	public static void main(String[] args) {

		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first no. ");
		num1 = sc.nextInt();

		System.out.println("Enter the first no. ");
		num2 = sc.nextInt();
		System.out.println(" Select one operation you want to perform -> ");
		System.out.println("1 -> addition");
		System.out.println("2 -> subtraction");
		System.out.println("3 -> multiplication");
		System.out.println("4 -> division");

		int input = sc.nextInt();
		switch (input) {
		case 1:
			int sum = num1 + num2;
			System.out.println("the sum of given nos. is -> " + sum);
			break;
		case 2:
			System.out.println(num1 - num2);
			break;
		case 3:
			System.out.println(num1 * num2);
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("Cannot be divide");
			} else {
				System.out.println(num1 / num2);
			}
			break;
		}
	}
}
