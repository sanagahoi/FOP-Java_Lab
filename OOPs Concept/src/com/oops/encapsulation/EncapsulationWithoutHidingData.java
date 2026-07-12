package com.oops.encapsulation;

public class EncapsulationWithoutHidingData {

	public static void main(String[] args) {

		HardDrive wd = new HardDrive();

		wd.manufacturer = "Western Digital";
		wd.capacityInTB = 500;

		wd.capacityInTB = 250;

		wd.display();
	}

}
