package com.challenge.alkemy.service;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.alkemy.dao.CourseDao;
import com.challenge.alkemy.dao.StudentCourseDao;
import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.domain.StudentCourseDomain;
import com.challenge.alkemy.model.CourseModel;
import com.challenge.alkemy.model.StudentCourseModel;
import com.challenge.alkemy.transform.CourseTransform;
import com.challenge.alkemy.transform.StudentCourseTransform;

@Service
public class StudentCourseServiceImpl implements StudentCourseService {


	@Autowired
	private StudentCourseDao studentCourseDao;
	
	@Autowired
	private CourseDao courseDao;
	
	
	
	@Override
	@Transactional
	public void save (StudentCourseModel studentCourse) {
		studentCourseDao.save(StudentCourseTransform.modelToDomain(studentCourse));
	}
	
	@Override
	@Transactional
	public void delete (StudentCourseModel studentCourse) {
		studentCourseDao.delete(StudentCourseTransform.modelToDomain(studentCourse));
	}
	
	@Override
	@Transactional
	public StudentCourseModel findStudentCourseDomain	(StudentCourseModel studentCourse) {
			return StudentCourseTransform.domainToModel(studentCourseDao.findById(studentCourse.getId()).orElse(null));
	}

	@Override
	public List<StudentCourseModel> listStudentCourse(String studentDni) {
		return StudentCourseTransform.domainToModelList(studentCourseDao.findByStudentDni(studentDni));
	}

	@Override
	public List<CourseModel> listStudentCourseNotRegistered(String dni) {
		
		List<StudentCourseDomain> registeredCourses = studentCourseDao.findByStudentDni(dni);
		List<CourseDomain> courses = (List<CourseDomain>) courseDao.findAllByOrderByNameAsc();
		
		for(StudentCourseDomain cr:registeredCourses) {
			CourseDomain courseRegistered = cr.getCourse();
			for(CourseDomain cd:courses) {
				if(courseRegistered.getIdCourse().equals(cd.getIdCourse())) {
					courses.remove(cd);
					break;
				}
			}
		}
		
		//algo que calcule los cupos que quedan
		
		List<CourseModel> modelList = CourseTransform.domainToModelList(courses);
		
//		estaba tratando de poner la cantidad de cupos disponibles en cada clase, pero no lo puedo hacer funcionar
//		for(CourseModel a: modelList ) {
//			List<StudentCourseDomain>  qty =	studentCourseDao.getAllByCourse(a);
//			
//		}
				
		return modelList;
	}
	
	
}
