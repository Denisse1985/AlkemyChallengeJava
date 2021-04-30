package com.challenge.alkemy.transform;

import java.util.ArrayList;
import java.util.List;

import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.domain.StudentDomain;
import com.challenge.alkemy.model.CourseModel;
import com.challenge.alkemy.model.StudentModel;

public class StudentTransform {

	public static StudentModel domainToModel(StudentDomain domain) {
		if(domain == null) {
			return null;
		}
		
		StudentModel model=new StudentModel();
		model.setDni(domain.getDni());
		model.setName(domain.getName());
		model.setLastName(domain.getLastName());
		model.setUserName(domain.getUserName());
	
				
		return model;
	}
	
	
	public static StudentDomain modelToDomain(StudentModel model) {
		if(model == null) {
			return null;
		}
		
		StudentDomain domain=new StudentDomain();
		domain.setDni(model.getDni());
		domain.setName(model.getName());
		domain.setLastName(model.getLastName());
		domain.setUserName(model.getUserName());
				
		return domain;
	}


	public static List<StudentModel> domainToModelList(List<StudentDomain> domainList) {
		if(domainList == null) {
			return null;
		}
		
		List<StudentModel> modelList=new ArrayList<StudentModel>();
		for(StudentDomain domain: domainList) {
			modelList.add(domainToModel(domain));
			
		}
		
		return modelList;
	}
}
