package com.oops.constructor.overloading;
/**
 * Write a program in java to exploit constructor overloading. (cube and cuboid volume calculation)

i) Create a class ThreeDimensionShape with three variables  width, height, depth of type double;
ii) Create three constructors 
Doesn’t accepts any parameter
Accepts 1 parameter of type double(length)
Accepts 3 parameters of type double(width, height, depth)
iii) Create a method volume of return type double that returns a product of width, height, and depth.

iv) in case of No argument constructor make length=width=depth = 0;
v) in case of 1 argument constructor make length=width=depth = value passed;

 * @author zebronics
 *
 */
public class ThreeDimensionShape {
	double width, height, depth;

	public ThreeDimensionShape() {
		width = height = depth = 0;
	}

	ThreeDimensionShape(double l) {
		width = height = depth = l;
	}

	ThreeDimensionShape(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	double volume() {
		double vol = width * height * depth;
		return vol;
	}

	public static void main(String[] args) {

		ThreeDimensionShape noShape = new ThreeDimensionShape();
		ThreeDimensionShape cube = new ThreeDimensionShape(2);
		ThreeDimensionShape cuboid = new ThreeDimensionShape(1, 2, 3);

		System.out.println("Volume of no Shape : " + noShape.volume());
		System.out.println("Volume of cube : " + cube.volume());
		System.out.println("Volume of cuboid : " + cuboid.volume());

	}

}
