package com.oops.classCreation;
/**
 * Write an algorithm to create a class Customer that contains 
      fullName(String) and age(int) as variables in class. 
 Create a main method, assign values to the variables in the main method and
 print the values of variables using the object of Customer class in the main method. 
 * @author zebronics
 *
 */
public class Customer {

		String fullName;
		int age;
		public static void main(String[] args) {
			Customer customer = new Customer();
			customer.fullName = "Sapna";
			customer.age = 30;
			System.out.println(customer.fullName);
			System.out.println(customer.age);
		}
}
