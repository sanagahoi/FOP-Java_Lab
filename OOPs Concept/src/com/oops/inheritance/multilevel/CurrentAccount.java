package com.oops.inheritance.multilevel;

public class CurrentAccount extends Account {
	
	int currentBalance;
	
	public CurrentAccount(String a, int b, int c) {
		
		super(a,b);
		currentBalance = c;
		
	}
	
	void display() {
		
		super.display();
		System.out.println("Current Balance : " + currentBalance);
	}

}
