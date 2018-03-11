package org.spring.basic.java.model;

public class Student {
	private String firstname;
	private String lastname;
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}
