package com.sample.security.domain;

import lombok.Data;

@Data
public class User {

	private String firstName;
	private String lastName;
	private String address;

	public User(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	

}
