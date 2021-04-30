package com.challenge.alkemy.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="user_type")
public class UserTypeDomain {
	@Id
	private Integer id;
	
	@NotEmpty
	private String description;
	
	
	public UserTypeDomain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserTypeDomain(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
