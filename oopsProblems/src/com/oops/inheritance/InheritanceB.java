package com.oops.inheritance;

public class InheritanceB extends InheritanceA{
	
	float length, breadth, area;
	
	public void rectangleArea(float l, float b) {
		
		length = l;
		breadth = b;
		area = length*breadth;
		
		System.out.println("The area of the rectangle : " + area + " square cm");
	}

}
