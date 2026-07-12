package com.oops.polimorphism.runtime;
/**
 * Create two classes A, B with default as access modifier outside the class in which the main method exists.
Create a method Car in class A and B, and print I am method A and I am method B respectively in both classes.
The class in which the main method exists, execute class A method using obj.
Create another object obj1 and execute method in class B by overriding the same method in class A.
(Optional): use public as access modifier for class A and B and execute the same code and discuss your observations with co-learners.
 */
public class Run_Time_Polimorphism {
	public static void main(String[] args) {
		
		A obj = new A();
		A obj1 = new B();
		obj.car();
		obj1.car();
	}

}
