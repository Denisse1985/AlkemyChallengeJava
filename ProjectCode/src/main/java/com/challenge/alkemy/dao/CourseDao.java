package com.challenge.alkemy.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.challenge.alkemy.domain.CourseDomain;

public interface  CourseDao extends  CrudRepository<CourseDomain, Integer> {

	
	List<CourseDomain> findAllByOrderByNameAsc();

}
