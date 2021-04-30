package com.challenge.alkemy.dao;

import org.springframework.data.repository.CrudRepository;

import com.challenge.alkemy.domain.UserTypeDomain;

public interface UserTypeDao extends CrudRepository<UserTypeDomain, Integer> {

}
