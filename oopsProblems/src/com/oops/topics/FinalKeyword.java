package com.oops.topics;

public class FinalKeyword {
	final float pi = 22/7; //final value can't be changed 
	public float radius, area;	
	
	float area(float radius) {
		area = pi*radius*radius;
		return area;
		
	}
	
	public static void main(String[] args) {
		
		FinalKeyword obj = new FinalKeyword();
	
		System.out.println( "Area of the circle " + obj.area(7) + " square cm");
	}

	

}
