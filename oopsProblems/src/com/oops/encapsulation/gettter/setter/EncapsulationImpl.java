package com.oops.encapsulation.gettter.setter;
/**Create two private variables with int and boolean and name the variables as age and decision respectively.
 * Create getter and setter methods as public and make necessary changes for setter methods to update the variable value.
 * Input or set age to age variable.
 * Using “If..else..” conditional statement, find if age is less than 60.
 * If the condition is satisfied, print “The age of the candidate is 70. Driving license can be issued to the candidate. false”.
 * 
 */
public class EncapsulationImpl {
	private int age;
	private boolean decision;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getDecision() {
		return decision;
	}

	public void setDecision(boolean decision) {
		this.decision = decision;
	}

	public static void main(String[] args) {

		EncapsulationImpl ei = new EncapsulationImpl();

		ei.setAge(70);

		System.out.println(" age: " + ei.getAge());

		if ( ei.getAge() <= 60) {
			ei.setDecision(true);
		} else {
			ei.setDecision(false);
		}
		System.out.println("The age of the candidateis " + ei.getAge());
		System.out.println("Driving license can be issued to the candidate.--> " + ei.getDecision());

	}
}
