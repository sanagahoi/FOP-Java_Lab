package com.oops.access.modifiers;

public class CustomerDriver {

	public static void main(String[] args) {
		
		Customer customer  = new Customer();
		
		System.out.println(customer.fullName);
//		System.out.println(customer.age);   //gives an error bcz private keyword works only for class access

	}

}
