package com.learning.mvc.model;

public class Student {

	private String firstName;
	private String lastName;

	public Student() {
		
	}

	public String getFirstName() {
		System.out.println("getFirstName method called");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("setFirstName method called");
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("getLastName method called");
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("setLastName method called");
		this.lastName = lastName;
	}

}
