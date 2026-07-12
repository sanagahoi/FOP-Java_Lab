package com.oops.topics;
/** Create basic program to declare variables num1, num2 and result of type float.
 * Perform following operation
 * Addition, Subtraction, Division, Multiplication
 */
public class ArithmeticOperations {
	public static void main(String[] args) {
		//declaring variable
		float num1, num2;
		
		//assigning values 
		num1 = 12;
		num2 = 2;
		
		//performing operations separate memory for each operation
		float addition = num1 + num2;
		float subtraction = num1 - num2;
		float division = num1/num2;
		float multiplication = num1*num2;
		
		//printing outputs
		System.out.println("Sum = " + addition);
		System.out.println("Subtraction = " + subtraction);
		System.out.println("Division = "+ division);
		System.out.println("Multiplication = " + multiplication);
	}
}
