package com.oops.encapsulation;

public class InfoHidingByEncapsulation {
	public static void main(String[] args) {

		Software eclipse = new Software();

		eclipse.setName("Eclipse for Java Edition");
		eclipse.setVersion("2022-23");
		eclipse.display();

		Software virusSoftware = new Software();

		virusSoftware.setName("McAfee");
		virusSoftware.setVersion("2023-03");
		virusSoftware.display();

		Software chrome = new Software();
		chrome.setName("Google Chrome");
		chrome.setVersion("100.01");
		chrome.display();
	}

}
