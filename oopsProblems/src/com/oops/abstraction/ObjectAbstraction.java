package com.oops.abstraction;

import java.util.Scanner;

public class ObjectAbstraction {
	public static void main(String[] args) {

		System.out.println("Enter a number ->");

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		System.out.println("Number is " + number);
		scanner.close();
	}

}
