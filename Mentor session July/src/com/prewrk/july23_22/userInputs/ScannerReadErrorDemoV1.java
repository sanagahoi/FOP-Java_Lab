package com.prewrk.july23_22.userInputs;

import java.util.Scanner;

public class ScannerReadErrorDemoV1 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Enter any number:");
			
		int number = scanner.nextInt();
			
		System.out.println("You have entered->" + number);	
		scanner.close();
		
	}
}
