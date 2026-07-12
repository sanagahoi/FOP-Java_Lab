package com.oops.encapsulation;

public class HardDrive {
	String manufacturer;
	int capacityInTB;
	
	public void display() {
		
		System.out.println("\nManufacturer's name is " + manufacturer);
		System.out.println("Storage capacity of the hard drive " + capacityInTB + " TB");
	}

}
