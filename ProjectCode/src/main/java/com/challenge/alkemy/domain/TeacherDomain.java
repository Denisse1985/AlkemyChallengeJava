package com.challenge.alkemy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="teacher")
public class TeacherDomain {
	
	@Id
	private String dni;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	@Column(name="last_name")
	private String lastName;
	
	@NotEmpty
	@Column(name="active")
	private String isActive;
	
	
	public TeacherDomain() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TeacherDomain(String dni, String name, String lastName, String isActive) {
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
	
	
	
	
}
