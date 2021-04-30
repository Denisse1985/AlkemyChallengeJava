package com.challenge.alkemy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="User")
public class UserDomain {
	@Id
	@Column(name="username")
	private String userName;
	
	@NotEmpty
	private String password;
	
	@OneToOne
	@JoinColumn(name="user_type_id" ,referencedColumnName = "id", updatable = false)
	private UserTypeDomain userType;
	
	public UserDomain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDomain(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserTypeDomain getUserType() {
		return userType;
	}

	public void setUserType(UserTypeDomain userType) {
		this.userType = userType;
	}
	
	
	

}
