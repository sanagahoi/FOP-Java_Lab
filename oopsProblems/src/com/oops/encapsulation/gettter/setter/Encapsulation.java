package com.oops.encapsulation.gettter.setter;

public class Encapsulation {
	private String  country;
	private String nationalAnthem;
	private String touristSpot;
	
	
	
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getNationalAnthem() {
		return nationalAnthem;
	}

	public void setNationalAnthem(String nationalAString) {
		this.nationalAnthem = nationalAString;
	}
	
	public String getTouristSpot() {
		return touristSpot;
	}
	
	public void setTouristSpot(String touristSpot) {
		this.touristSpot = touristSpot;
	}
	
	public static void main(String[] args) {
		
		Encapsulation encapsulation = new Encapsulation();
		
		System.out.println("Country: "+ encapsulation.country);
		System.out.println("National Anthem : "+ encapsulation.nationalAnthem);
		System.out.println("Tourist spot : "+ encapsulation.touristSpot);
		
		encapsulation.setCountry("India");
		encapsulation.setNationalAnthem("Jana Gana Mana");
		encapsulation.setTouristSpot("Taj Mahal");
		System.out.println("\nAfter updating the variablevalues:");
		System.out.println("Country: " + encapsulation.country);
		System.out.println("National Anthem: " +encapsulation.nationalAnthem);
		System.out.println("Tourist Spot: " + encapsulation.touristSpot);
	}

}
