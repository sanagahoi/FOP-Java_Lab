package com.oops.topics;

public class OperationUsingTypeCasting {
	public static void main(String[] args) {
		//declaring variable
				float num1, num2, result;
				
				//assigning values 
				num1 = 12;
				num2 = 2;
				
				//performing operations by type Casting reducing data redundancy	
				result = num1 + num2;
				//printing outputs
				System.out.println("Sum = " + result);
				
				result = num1 - num2;
				System.out.println("Subtraction = " + result);
				
			    result = num1/num2;
				System.out.println("Division = "+ result);
				
				result = num1*num2;
				System.out.println("Multiplication = " + result);
	}

}
