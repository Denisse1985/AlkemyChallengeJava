package com.challenge.alkemy.service;

import java.util.List;

import com.challenge.alkemy.domain.TeacherDomain;
import com.challenge.alkemy.model.TeacherModel;

public interface TeacherService {

	public List<TeacherModel> listTeacher();
	
	public void save(TeacherModel teacher);
	public void delete(TeacherModel teacher);
	public TeacherModel findTeacherDomain(TeacherModel teacher);
	
	
}
