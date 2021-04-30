package com.challenge.alkemy.dao;

import org.springframework.data.repository.CrudRepository;

import com.challenge.alkemy.domain.UserDomain;

public interface UserDao extends CrudRepository<UserDomain, String> {

	public UserDomain findByUserName(String username);

}
