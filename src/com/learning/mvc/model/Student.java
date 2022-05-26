package com.learning.mvc.model;

import java.util.HashMap;

import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.pl.REGON;

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
	@NotNull(message = "Please enter valid age")
	private Integer age;
	
	@NotNull(message = "Area code is a mandatory field")
	@Pattern(regexp = "^[0-9]{3}[-]{1}[0-9]{3}", message = "Area code should be six digit long" )
	private String areaCode;
	
	
	public String getAreaCode() {
		return areaCode;
	}


	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
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
