package com.gl.prework.assignment;

import java.util.Scanner;

public class PalindromeChecker {
	Scanner sc = new Scanner(System.in);

	public void checkPalindrome() {
		int remainder, sum = 0, temp;
		System.out.println("Enter a number to check if itis a palindrome \n");
		int value = sc.nextInt();
		temp = value;
		while (value > 0) {
			remainder = value % 10; // getting remainder
			sum = (sum * 10) + remainder;
			value = value / 10;
		}
		if (temp == sum)
			System.out.println(temp + " is a palindrome\n");
		else
			System.out.println(temp + " is not palindrome\n");
	}

	public void printPattern() {
		String pattern = "";
		System.out.println("Enter a number to print thepattern.\n");
		int value = sc.nextInt();
		if (value > 0) {
			for (int i = value; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					pattern += "*";
				}
				System.out.println(pattern);
				pattern = "";
			}
			System.out.println();
		} else
			System.out.println("enter valid no \n");
	}

	public void checkPrimeNumber() {
		System.out.println("Enter a number to check whetherit a prime no \n");
		int value = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i <= value / 2; ++i) {
			// condition for non-prime number
			if (value % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(value + " is a prime number.");
		else
			System.out.println(value + " is not a prime number.");
		System.out.println();
	}

	public void printFibonacciSeries() {
		System.out.println("Enter a number to print theFibonacci series of thenumber.\n");
		int value = sc.nextInt();
		int first = 0, second = 1, sum = 0;
		if (value == 0) {
			System.out.println("The fibonacci series is: " + first);
		} else if (value == 1) {
			System.out.println("The fibonacci series is: " + first + ", " + second);
		} else {
			System.out.print("The fibonacci series is: " + first + ", " + second);
			while (value > 1) {
				sum = first + second;
				System.out.print(", " + sum);
				first = second;
				second = sum;
				value -= 1;
			}
		}

		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		PalindromeChecker obj = new PalindromeChecker();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice from below List.\n" + "1. Findpalindrome of number.\n"
					+ "2. Print Pattern for a given no.\n" + "3.Check whetherthe no is a  prime number.\n"
					+ "4. Print Fibonacci series.\n" + "--> Enter0 to Exit.\n");
			System.out.println();
			choice = sc.nextInt();
			switch (choice) {
			case 0:{
				choice = 0;
			}
				break;
			
			case 1:{
				obj.checkPalindrome();
			}
				break;
			case 2:{
				obj.printPattern();
			}
				break;
			case 3:{
				obj.checkPrimeNumber();
			}
				break;
			case 4:{
				obj.printFibonacciSeries();
			}
				break;
			default:
				System.out.println("Invalid choice. Enter a validno.\n");
			}
		} while (choice != 0);
		System.out.println("Exited Successfully!!!");
		sc.close();
	}

}
