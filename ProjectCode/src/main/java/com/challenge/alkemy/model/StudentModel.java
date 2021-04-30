package com.challenge.alkemy.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

public class StudentModel {
private static final long serialVersionUID = 1L;
	
   private String dni;
   private String name;
   private String lastName;
   private String userName;
   
public StudentModel() {
	super();
	// TODO Auto-generated constructor stub
}


public StudentModel(String dni, @NotEmpty String name, String lastName, String userName) {
	super();
	this.dni = dni;
	this.name = name;
	this.lastName = lastName;
	this.userName = userName;
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

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

}
