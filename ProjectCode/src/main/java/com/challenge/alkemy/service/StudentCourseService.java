package com.challenge.alkemy.service;

import java.util.List;

import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.domain.StudentCourseDomain;
import com.challenge.alkemy.model.CourseModel;
import com.challenge.alkemy.model.StudentCourseModel;

public interface StudentCourseService {


	public List<StudentCourseModel> listStudentCourse(String studentDni);

	public void save (StudentCourseModel studentCourse);
	public void delete (StudentCourseModel studentCourse);
	public  StudentCourseModel findStudentCourseDomain (StudentCourseModel studentCourse);

	public List<CourseModel> listStudentCourseNotRegistered(String dni);

}
