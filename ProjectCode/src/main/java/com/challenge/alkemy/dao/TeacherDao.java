package com.challenge.alkemy.dao;

import org.springframework.data.repository.CrudRepository;

import com.challenge.alkemy.domain.TeacherDomain;

public interface TeacherDao extends CrudRepository<TeacherDomain, String> {

}
