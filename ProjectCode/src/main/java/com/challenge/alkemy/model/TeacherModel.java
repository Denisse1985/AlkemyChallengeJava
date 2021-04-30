package com.challenge.alkemy.model;

public class TeacherModel {

	private String dni;
	private String name;
	private String lastName;
	private String isActive;
	
	public TeacherModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TeacherModel(String dni, String name, String lastName, String isActive) {
		super();
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.isActive = isActive;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}


	@Override
	public String toString() {
		return "TeacherModel [dni=" + dni + ", name=" + name + ", lastName=" + lastName + ", isActive=" + isActive
				+ "]";
	}
	
}
