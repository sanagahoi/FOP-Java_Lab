package com.oops.method.overloading;
/**Create two methods with the same name, one with argument and the other without argument.
 * Create two methods of the same name with string as return type, where one method with string as argument and the other without argument.
 * In a method with no input as argument and return type, the method should print “I am from method without return type”.
 * In a method without return type and input as an argument, the method should print “I am from method without return type and an input argument”.
 * Similarly, print for both methods with return type.
 * Execute all the objects one after another, note what type of method is used in the program and print the type of method used at the end of the output.
 * 
 */

public class MethodImpl {
	
	String s = null;
	
	public void creatingMethods(){
		System.out.println("I am Method Without argument and return type!!!! ");
		
	}
	
	
	public void creatingMethods( String str ) {
		 this.s = str;
		System.out.println(s);
	}
	
	
	 public String creatingMethods1() {
		s = "method without argument with return type......";
		 return s;
	 }
	 
	 
	 public String creatingMethods1(String str) {
			this.s = str;
		 return s;
	 }
	 
	 public static void main(String[] args) {
		MethodImpl method = new MethodImpl();
		
		method.creatingMethods();

		method.creatingMethods("I am from method without return type and an input argument****");
		
		System.out.println(method.creatingMethods1());
		
		System.out.println(method.creatingMethods1("Method with argument and a return type------>" ));
	}

}
