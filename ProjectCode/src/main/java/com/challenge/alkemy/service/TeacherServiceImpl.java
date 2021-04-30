package com.challenge.alkemy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.challenge.alkemy.dao.TeacherDao;
import com.challenge.alkemy.domain.TeacherDomain;
import com.challenge.alkemy.model.TeacherModel;
import com.challenge.alkemy.transform.TeacherTransform;

@Service
public class TeacherServiceImpl implements TeacherService {
 
	@Autowired
	private TeacherDao teacherDao;

	@Override
	@Transactional(readOnly = true)
	public List<TeacherModel> listTeacher() {
		return TeacherTransform.domainToModelList((List<TeacherDomain>) teacherDao.findAll());   		
	}

	@Override
	@Transactional
	public void save(TeacherModel teacher) {	
		teacherDao.save(TeacherTransform.modelToDomain(teacher));
	}

	@Override
	@Transactional
	public void delete(TeacherModel teacher) {
		teacherDao.delete(TeacherTransform.modelToDomain(teacher));
	}

	@Override
	@Transactional(readOnly = true)
	public TeacherModel findTeacherDomain(TeacherModel teacher) {
		return TeacherTransform.domainToModel(teacherDao.findById(teacher.getDni()).orElse(null));		
	}


}
