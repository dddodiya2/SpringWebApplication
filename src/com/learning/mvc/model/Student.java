package com.learning.mvc.model;

import java.util.HashMap;

import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	@NotNull(message = "mandatory field, please enter some value")
	@Size(min = 1, message = "mandatory field, please enter some value")
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLang;
	private String[] knownOS;
	private Map<String, String> countryOptions;
	
	@Min(value = 15, message = "Age should more than or equal to 15 Years")
	private int age;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}


	public Student() {
		countryOptions = new HashMap<>();
		countryOptions.put("India", "IN");
		countryOptions.put("United States Of America", "USA");
		countryOptions.put("Canada", "CAN");
	}


	public String[] getKnownOS() {
		return knownOS;
	}

	public void setKnownOS(String[] knownOS) {
		this.knownOS = knownOS;
	}

	public String getFavoriteLang() {
		return favoriteLang;
	}

	public void setFavoriteLang(String favoriteLang) {
		this.favoriteLang = favoriteLang;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
		//System.out.println("getLastName method called");
		return lastName;
	}

	public void setLastName(String lastName) {
		//System.out.println("setLastName method called");
		this.lastName = lastName;
	}

}
