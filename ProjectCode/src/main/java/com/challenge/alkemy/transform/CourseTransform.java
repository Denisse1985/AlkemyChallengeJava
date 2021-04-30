package com.challenge.alkemy.transform;

import java.util.ArrayList;
import java.util.List;

import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.model.CourseModel;

public class CourseTransform {

	public static CourseModel domainToModel(CourseDomain domain) {
		if(domain == null) {
			return null;
		}
		
		CourseModel model=new CourseModel();
		model.setIdCourse(domain.getIdCourse());
		model.setName(domain.getName());
		model.setSchedule(domain.getSchedule());
		model.setMaximumQuota(domain.getMaximumQuota());
		model.setDescription(domain.getDescription());
				
		return model;
	}
	
	
	public static CourseDomain modelToDomain(CourseModel model) {
		if(model == null) {
			return null;
		}
		
		CourseDomain domain=new CourseDomain();
		domain.setIdCourse(model.getIdCourse());
		domain.setName(model.getName());
		domain.setSchedule(model.getSchedule());
		domain.setMaximumQuota(model.getMaximumQuota());
		domain.setDescription(model.getDescription());
				
		return domain;
	}


	public static List<CourseModel> domainToModelList(List<CourseDomain> domainList) {
		if(domainList == null) {
			return null;
		}
		
		List<CourseModel> modelList=new ArrayList<CourseModel>();
		for(CourseDomain domain: domainList) {
			modelList.add(domainToModel(domain));
			
		}
		
		return modelList;
	}
}
