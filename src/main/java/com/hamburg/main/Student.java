package com.hamburg.main;

import java.util.ArrayList;

public class Student {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private boolean active;
	
	//Creating arraylist.
	ArrayList<String> address =new ArrayList<String>();

	
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
