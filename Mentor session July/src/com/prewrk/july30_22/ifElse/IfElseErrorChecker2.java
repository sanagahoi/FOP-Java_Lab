package com.prewrk.july30_22.ifElse;

public class IfElseErrorChecker2 {
	
	public static void main(String[] args) {

		int runsScored = 90;

		boolean someCondition = (runsScored == 100);

		//if (runsScored == 100) this is the error i noticed
		if (someCondition){
			System.out.println("Player scored a century");
		} else {
			System.out.println("Player has not scored a century");
		}

	}
}
