package com.challenge.alkemy.service;

import java.util.List;



import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.model.CourseModel;

public interface CourseService {
	
	
	public List<CourseModel> listCourse();	
	public void save (CourseDomain course);
	public void delete (CourseDomain course);
	public  CourseDomain findCourseDomain (CourseDomain course);
	

}
