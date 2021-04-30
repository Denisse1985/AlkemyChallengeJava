package com.challenge.alkemy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="student")
public class StudentDomain implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
   private String dni;
	
  @NotEmpty
   private String name;
  
   @Column(name="last_name")
     private String lastName;
   
   @Column(name="user_name")
   private String userName;
     
   
public StudentDomain() {
	super();
	// TODO Auto-generated constructor stub
}


public StudentDomain(String dni, @NotEmpty String name, String lastName, String userName) {
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
