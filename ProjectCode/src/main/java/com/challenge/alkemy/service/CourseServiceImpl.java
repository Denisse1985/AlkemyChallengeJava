package com.challenge.alkemy.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.alkemy.dao.CourseDao;
import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.model.CourseModel;
import com.challenge.alkemy.transform.CourseTransform;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao courseDao;
	
	@Override
	@Transactional
	public List<CourseModel> listCourse() {
		return (List<CourseModel>)   CourseTransform.domainToModelList(courseDao.findAllByOrderByNameAsc());
				
				
	}
	
	@Override
	@Transactional
	public void save (CourseDomain course) {
			courseDao.save(course);
	}
	
	@Override
	@Transactional
	public void delete (CourseDomain course) {
			courseDao.delete(course);
	}
	
	@Override
	@Transactional
	public CourseDomain findCourseDomain	(CourseDomain course) {
			return courseDao.findById(course.getIdCourse()).orElse(null);
	}
	
	

}
