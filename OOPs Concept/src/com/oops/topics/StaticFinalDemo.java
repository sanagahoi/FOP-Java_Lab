package com.oops.topics;
/**
Create integer non-static variable var1 and a static variable var2 and assign value 10 to var1 & var2.
create two methods method1 and method2.
In method1, use increment operator to increment var1 and use print statement to print var1.
Similarly perform for method2 with var2.
Create three objects obj1, obj2, obj3.
Execute method1 with all the objects.
Similarly perform for method2.
(Optional) Replace static with final for var2 and run the program. Note your observations.
 * @author zebronics
 */

public class StaticFinalDemo {
	int var1 = 10;
	static int var2 = 10;
	
	public void method1() {
		var1++;
		System.out.println(var1);
		}
	
	public void method2() {
		var2++;
		System.out.println(var2);
		}
	
	public static void main(String[] args) {
		
		StaticFinalDemo obj = new StaticFinalDemo ();
		StaticFinalDemo obj2 = new StaticFinalDemo ();
		StaticFinalDemo obj3 = new StaticFinalDemo ();
		
		System.out.println("Using non-static keyword");
		obj.method1();
		obj2.method1();
		obj3.method1();
		
		System.out.println("\nUsing static keyword");
		obj.method2();
		obj2.method2();
    	obj3.method2();
	}

}
