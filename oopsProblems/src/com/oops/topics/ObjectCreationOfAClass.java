package com.oops.topics;
/** Write a program in Java to implement classes and objects.
 *  Create a class and a method copyMe inside it.
 *  Create a main method in the class.
 *  Create an object “obj” for the class in the main method.
 *  Execute the copyMe() method using the object created.
 * @author zebronics
 */

public class ObjectCreationOfAClass {
	
	public void copyMe() {
		System.out.println("Inside copy me method");
	}
	public static void main(String[] args) {
		ObjectCreationOfAClass obj = new ObjectCreationOfAClass();
		obj.copyMe();
	}
}
