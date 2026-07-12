package com.oops.constructor;
/**
 * Write a program to implement Constructor

Create a class ConstructorDemo.
Create a default constructor for the class and print “I am default constructor.”
Execute the constructor created.
Create a parameterized constructor with arguments of type  integer, float, string and character.
Print “I am Parameterized constructor. I take various arguments as input.”.
Create squares from integer and float values and print them in new lines.
Print string and character in new lines.
Execute the class constructors 
 * @author zebronics
 *
 */
public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println("I am default constructor....");
	}
	public ConstructorDemo(int n, float f, String s, char c) {
		System.out.println("I am Parameterized constructor. I take various arguments as input..");
		
		System.out.println("the square of int value : " + n*n);
		System.out.println("the square of float value : " + f*f);
		System.out.println("the String value : " + s);
		System.out.println("the character value : " + c);
	}
	
	//method inside the class ConstructorDemo
	public void observations() {
		System.out.println("inside a method called  Observations..");
	}
	
	public static void main(String[] args) {
		System.out.println("From Object creation method1");
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(5, 0.5f,"hello learner", 'a');
		
		System.out.println("\nFrom Object creation method2");
		
		ConstructorDemo obj2, obj3;
		obj2 = new ConstructorDemo();
		obj3 = new ConstructorDemo(15, 2.5f, "hi learner",'w');
		//this is object of a class which is calling a method
		obj.observations();
	}

}
