package com.challenge.alkemy.service;

import java.util.List;


import com.challenge.alkemy.domain.StudentDomain;
import com.challenge.alkemy.model.StudentModel;

public interface StudentService {

	
public List<StudentModel> listStudent();
	
	public void save (StudentModel student);
	public void delete (StudentModel student);
	public  StudentModel findStudentDomain (StudentModel student);
	public StudentModel findStudentByUserName(String userName);
}
