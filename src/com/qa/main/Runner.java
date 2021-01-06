package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		// two objects - new instances of Customer.java
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		// i want:
		// customer1 should be called Nick
		// customer2 should be called Jenny
		
		customer1.setName("Nick");
		customer2.setName("Jenny");
		
		customer1.setBirthDay(9);
		customer2.setBirthDay(12);
		
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		
		System.out.println(customer1.getBirthDay());
		System.out.println(customer2.getBirthDay());
	}

}
