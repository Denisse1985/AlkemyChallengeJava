package com.challenge.alkemy.dao;

import org.springframework.data.repository.CrudRepository;

import com.challenge.alkemy.domain.StudentDomain;

public interface StudentDao extends CrudRepository <StudentDomain, String> {

	public StudentDomain findByUserName(String userName);

}
