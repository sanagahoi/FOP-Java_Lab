package com.gl.javaPrework.week_2;

/*Create basic program to declare variables num1, num2 and result of type float.
 * Perform following operation
 * Addition, Subtraction, Division, Multiplication
 */
public class ArithmaticOperations {
	
	public static void main(String[] args) {
		
	
	//declare variables of type float
	float num1 , num2, result;
	
	//assign values to variables num1, num2
	num1 = 20;
	num2 = 2;

	
	//store the operation result in variable
	result = num1 + num2;
	System.out.println("Sum is : " + result);	//displays the result
	
	result = num1 - num2;
	System.out.println("Difference is : " + result);
	
	result = num1 * num2;
	System.out.println("Product is : " + result);
	 
	result = num1 / num2;
	System.out.println("Division is : "+ result);
	
	
	}
}
