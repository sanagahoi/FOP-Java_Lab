package com.oops.inheritance;

public class InheritanceC extends InheritanceB{
	
	float base , height, area;
	
	public void triangleArea(float b, float h) {
		
		base = b;
		height = h;
	    area =  (base * height)/2;
		System.out.println("The area of the Triangle : " + area + " square cm");
	}

	public static void main(String[] args) {
		InheritanceC obj = new InheritanceC();
		
		obj.circleArea(7);
		obj.rectangleArea(4,4 );
		obj.triangleArea(4, 5);
	}
}
