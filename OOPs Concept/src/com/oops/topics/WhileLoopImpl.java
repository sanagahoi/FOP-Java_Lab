package com.oops.topics;
/**
 * Write a program to print no from 10 to 1 ( 10, 9, 8, 7 ….. 1 ) using a while loop.
 * @author zebronics
 *
 */

public class WhileLoopImpl {
	public static void main(String[] args) {
		int i=10;
		while (i>0) {
			System.out.print(i);
			if(i!= 1) {
				
				System.out.print(",");
			}
			System.out.print(" ");
			i--;
			
		}
		
	}

}
