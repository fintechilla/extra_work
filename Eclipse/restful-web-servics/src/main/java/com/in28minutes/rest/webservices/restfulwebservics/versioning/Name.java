package com.in28minutes.rest.webservices.restfulwebservics.versioning;

public class Name {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	
	public Name(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	

}
