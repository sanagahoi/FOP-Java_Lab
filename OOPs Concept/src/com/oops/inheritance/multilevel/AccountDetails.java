package com.oops.inheritance.multilevel;

public class AccountDetails extends CurrentAccount{
	
	int depositeAmt, withdrawlAmt;
	
	public AccountDetails(String a, int b, int c, int d, int e) {
		
		super(a,b,c);
		depositeAmt = d;
		withdrawlAmt = e;
	}
	
	void display() {
		super.display();
		System.out.println("Deposite Amount: " + depositeAmt);
		System.out.println("Withdrawl Amount : "+ withdrawlAmt);
	}

}
