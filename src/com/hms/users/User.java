package com.hms.users;

import com.hms.billing.HealthInsurancePlan;

public class User {
    
	private long id;
	// add rest of the variables
	// id (long), firstName (String), lastName (String), gender (String), email (String)  
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private int age;
	private boolean smokes;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSmokes() {
		return smokes;
	}
	public void setSmokes(boolean smokes) {
		this.smokes = smokes;
	}
	private boolean insured;
	private HealthInsurancePlan insurancePlan;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isInsured() {
		return insured;
	}
	public void setInsured(boolean insured) {
		this.insured = insured;
	}
	public HealthInsurancePlan getInsurancePlan() {
		return insurancePlan;
	}
	public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
	
}