package com.oops.topics;
/**
 * Write a basic for loop program to print odd numbers lying in range 1 to 10.
 *  hint: use i = i+2 in syntax, initialize i =1; run till range 10;
 * @author zebronics
 *
 */
public class ForLoopImplementation {
	public static void main(String[] args) {
		System.out.println("The odd nos. between 1 to 10 are -->");
		for(int i = 1; i<=10; i=i+2) {
			System.out.print(i + " ");
		}
	}

}
