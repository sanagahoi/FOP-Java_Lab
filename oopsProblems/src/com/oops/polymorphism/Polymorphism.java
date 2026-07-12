package com.oops.polymorphism;

/**
 * Write an algorithm to create a class Polymorphism with two methods of same name findArea and with number of parameters as 2 and 3 respectively 
 *  and find the area of the rectangle and rectangular cuboid respectively.
 */
public class Polymorphism {
	
	int length, breadth, height, area;
	
	public void findArea(int l, int b) {
		length = l;
		breadth= b;
		area = length*breadth;
		System.out.println("The Area of the rectangle is: " + area + "  cm square") ;
	}
	
	public void findArea(int l, int b, int h) {
		
		length = l;
		breadth = b;
		height = h;
		area = length* breadth * height;
		System.out.println("the area of the cuboid is : " + area + " cm cube");
	}
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.findArea(4,5);
		p.findArea(10, 2, 5);
	}

}
