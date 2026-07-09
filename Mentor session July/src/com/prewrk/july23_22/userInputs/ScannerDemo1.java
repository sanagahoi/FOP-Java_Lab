package com.prewrk.july23_22.userInputs;

import java.util.Scanner;

public class ScannerDemo1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter some text - ");
	String text = scanner.next();
	System.out.println("text entered by you is :  " + text);
	
	System.out.println("Enter any value - ");
	int value = scanner.nextInt();
	 System.out.println(" value entered by you  is : " + value);
	 scanner.close();
}
}
