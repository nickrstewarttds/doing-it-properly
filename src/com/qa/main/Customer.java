package com.qa.main;

public class Customer {

	String name; // declared
	int birthDay;
	String birthMonth;
	int birthYear;
	String email;
	
	// public Customer() { }
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(int newBirthDay) {
		this.birthDay = newBirthDay;
	}
	
}
