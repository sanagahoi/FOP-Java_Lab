package com.oops.inheritance.multilevel;
/**
 *  i) Account Class is the super Class
    Declare two variables customerName (of type String), accountNo(of type int)
    Account class will contain a parameterized constructor Account(String a, int b)
    Inside Constructor Assign parameter values to the variables declared 
    Create a method display of type void to display customerName and accountNo
 */
public class Account {
	
	String customerName;
	int accountNo;
	
	public Account(String a, int b) {
		this.customerName = a;
		this.accountNo = b;
	}

	void display() {
		System.out.println("Customer Name : "+ customerName);
		System.out.println("Account No. " + accountNo);
	}
}
