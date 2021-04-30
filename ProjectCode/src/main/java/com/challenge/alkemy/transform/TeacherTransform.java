package com.challenge.alkemy.transform;

import java.util.ArrayList;
import java.util.List;

import com.challenge.alkemy.domain.TeacherDomain;
import com.challenge.alkemy.model.TeacherModel;

public class TeacherTransform {

	public static TeacherModel domainToModel(TeacherDomain domain) {
		if(domain == null) {
			return null;
		}
		
		TeacherModel model=new TeacherModel();
		model.setDni(domain.getDni());
		model.setName(domain.getName());
		model.setLastName(domain.getLastName());
		model.setIsActive(domain.getIsActive());
						
		return model;
	}
		
	public static TeacherDomain modelToDomain(TeacherModel model) {
		if(model == null) {
			return null;
		}
		
		TeacherDomain domain=new TeacherDomain();
		domain.setDni(model.getDni());
		domain.setName(model.getName());
		domain.setLastName(model.getLastName());
		domain.setIsActive(model.getIsActive());		
				
		return domain;
	}


	public static List<TeacherModel> domainToModelList(List<TeacherDomain> domainList) {
		if(domainList == null) {
			return null;
		}
		
		List<TeacherModel> modelList=new ArrayList<TeacherModel>();
		for(TeacherDomain domain: domainList) {
			modelList.add(domainToModel(domain));
			
		}
		
		return modelList;
	}
}
