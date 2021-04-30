package com.challenge.alkemy.transform;

import java.util.ArrayList;
import java.util.List;

import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.domain.StudentCourseDomain;
import com.challenge.alkemy.model.CourseModel;
import com.challenge.alkemy.model.StudentCourseModel;

public class StudentCourseTransform {

	public static StudentCourseModel domainToModel(StudentCourseDomain domain) {
		if(domain == null) {
			return null;
		}
		
		StudentCourseModel model=new StudentCourseModel();
		model.setId(domain.getId());
		model.setCourse(CourseTransform.domainToModel(domain.getCourse()));
		model.setStudent(StudentTransform.domainToModel(domain.getStudent()));
				
		return model;
	}
	
	
	public static StudentCourseDomain modelToDomain(StudentCourseModel model) {
		if(model == null) {
			return null;
		}
		
		StudentCourseDomain domain=new StudentCourseDomain();
		domain.setId(model.getId());
		domain.setCourse(CourseTransform.modelToDomain(model.getCourse()));
		domain.setStudent(StudentTransform.modelToDomain(model.getStudent()));
				
		return domain;
	}


	public static List<StudentCourseModel> domainToModelList(List<StudentCourseDomain> domainList) {
		if(domainList == null) {
			return null;
		}
		
		List<StudentCourseModel> modelList=new ArrayList<StudentCourseModel>();
		for(StudentCourseDomain domain: domainList) {
			modelList.add(domainToModel(domain));
			
		}
		
		return modelList;
	}
}
