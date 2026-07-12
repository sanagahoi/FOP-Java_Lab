package com.oops.abstraction;

public class FunctionAbstraction {
	public static void main(String[] args) {

		double number = 625D;
		final double pi = 22/7;

		double result = Math.sqrt(number);
		int radian = (int) (90*pi/180);
		double sqr = Math.floor(Math.asin( radian));

		System.out.println("Square root of " + number 
				+ " is " + result );
		System.out.println(" sine " + sqr);
	}

}
