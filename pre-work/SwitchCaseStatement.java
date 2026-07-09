package com.gl.javaPrework.week_2;

/*Create a basic Switch case statement which will handle the following cases:
 * if number is 1 : it should display "neither prime nor composite"
 * if number is 2 : it should display "no is prime"
 * if number is 4 : it should display "no is composite"
 */

public class SwitchCaseStatement {
	public static void main(String[] args) {
		
		// declare variables and assign values
		int num = 1;
		switch (num) {
		case 1: 
			System.out.println("neither prime nor composite. ");
			break;
			
		case 2:
			System.out.println("no is prime");
			
		case 4:
			System.out.println("no is composite");
			
		}
	}

}
