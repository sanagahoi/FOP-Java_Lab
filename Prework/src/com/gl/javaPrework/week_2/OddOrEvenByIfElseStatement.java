package com.gl.javaPrework.week_2;

import java.util.Scanner;

public class OddOrEvenByIfElseStatement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number ");
		int input = sc.nextInt();

		if (input % 2 == 0) {

			System.out.println("Number is Even " );

		} else

			System.out.println("Number is Odd " );
		sc.close();
	}

}
