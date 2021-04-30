package com.challenge.alkemy.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.alkemy.dao.CourseDao;
import com.challenge.alkemy.dao.StudentDao;
import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.domain.StudentDomain;
import com.challenge.alkemy.model.StudentModel;
import com.challenge.alkemy.transform.StudentTransform;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Override
	@Transactional
	public List<StudentModel> listStudent() {
		return StudentTransform.domainToModelList((List<StudentDomain>) studentDao.findAll());
	}
	
	@Override
	@Transactional
	public void save (StudentModel student) {
		studentDao.save(StudentTransform.modelToDomain(student));
	}
	
	@Override
	@Transactional
	public void delete (StudentModel student) {
		studentDao.delete(StudentTransform.modelToDomain(student));
	}
	
	@Override
	@Transactional
	public StudentModel findStudentDomain	(StudentModel student) {
			return StudentTransform.domainToModel(studentDao.findById(student.getDni()).orElse(null));
	}

	@Override
	@Transactional
	public StudentModel findStudentByUserName(String userName) {
		return StudentTransform.domainToModel(studentDao.findByUserName(userName));
		
	}
	
}
