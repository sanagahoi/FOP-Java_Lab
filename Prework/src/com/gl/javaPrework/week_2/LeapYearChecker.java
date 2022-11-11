package com.gl.javaPrework.week_2;

public class LeapYearChecker {

	public static void main(String[] args) {

		int year = 1200;

		// if leap year is perfectly divisible by 400 print leap year
		if (year % 400 == 0) {

			System.out.println(" this is leap Year...");

		} else

		// print not a leap year if divisible by 100 and not divisible by 400
		if (year % 100 == 0) {

			System.out.println(" Not a leap Year. ");

		} else
		// print leap year if divisible by 4 and not divisible by 100

		if (year % 4 == 0) {
			System.out.println("Leap Year.");

		} else {

			// rest all years are non leap years
			System.out.println("not a leap year" + "\nExplanation : not divisible by 4.");

		}
	}
}
