package com.oops.inheritance;

public class InheritanceA {
	final  float pi = 22/7;
	float radius, area;
	
	public void circleArea(float r) {
		radius = r;
		area = pi * radius*radius;
		System.out.println("The area of the circle : " + area + " square cm");
	}

}
