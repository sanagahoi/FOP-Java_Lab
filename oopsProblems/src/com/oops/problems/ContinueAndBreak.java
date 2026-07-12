package com.gl.javaPrework.week_3;
/*Program to implement the continue and break functionality
 * Create a program to print the table of 2.
 * Create an infinite for loop,use continue if no doesn't come in table of 2
 * and break if the loop variable exceeds 20.
 */
   

public class ContinueAndBreak {

	public static void main(String[] args) {
		int i = 1;
		for (; ; i++) {
			if(i % 2 != 0) 
				continue;
				else if (i>20)
					break;
				else
					System.out.println(i);
			
		}
		

	}

}
