package com.oops.topics;
/** Create a Java Program, declare variables of type
 *   int, float, char, boolean, String, double
 *   Initialize all the variable with values and display them on the console.
 */

public class DeclaringVariable {
	public static void main(String[] args) {
		//declaring variables and assigning values  called initialisation 
		//declaring is 
		 int value;
		 System.out.println(value = 10);
		int iValue = 10;
		float fValue = 12.3f;
		char cValue = 'c';
		boolean bValue = true;
		String sValue = "String value";
		double dValue = 110;
		
		//displaying the output in the console
		System.out.println("Integer value is --> " + iValue);
		System.out.println("float value is --> " + fValue);
		System.out.println("char value is --> " + cValue);
		System.out.println("boolean value is --> " + bValue);
		System.out.println("String value is --> " + sValue);
		System.out.println("double value is --> " + dValue);
	}

}
