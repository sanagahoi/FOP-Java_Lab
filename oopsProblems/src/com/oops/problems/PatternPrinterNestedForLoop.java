package com.gl.javaPrework.week_3;

// Write a program in java to print the following pattern (Hint : Use nested for loop)
//*
//**
//***
//****
//*****


public class PatternPrinterNestedForLoop {
	public static void main(String[] args) {
		//int num = 5;
		
		//loop to keep count of  no. of rows
		for (int i = 0; i < 5; i++) {
			
			//String j = "*";
			
			for (int j = 0; j<= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
