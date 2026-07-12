package com.oops.topics;
/**
 * Write an algorithm to create a class ConstructorDemo with default and parameterized constructors. 
 * Introduce yourself in both default and parameterized constructors and execute them.
 * @author zebronics
 *
 */

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("Hello !!! This is Sapna Gupta. I am from Uttar Pradesh.");
		
	}
	
	public ConstructorDemo(String firstName, String lastName, String place) {
		System.out.println("Hey !!! I am " + firstName + " " + lastName  + ". I am from " + place + ".");
	}

	public static void main(String[] args) {
		ConstructorDemo defaultCunstructor = new ConstructorDemo();
		ConstructorDemo parameterizedCunstructor = new ConstructorDemo("Sapna", "Gupta", "Prayagraj");
	}

}
