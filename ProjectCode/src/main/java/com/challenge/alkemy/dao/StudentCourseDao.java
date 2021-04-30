package com.challenge.alkemy.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.domain.StudentCourseDomain;
import com.challenge.alkemy.model.CourseModel;

public interface StudentCourseDao extends CrudRepository<StudentCourseDomain, Integer> {

	List<StudentCourseDomain> findByStudentDni(String studentDni);
//	Long countByCourseByCourseId(Integer idCourse);
	List<StudentCourseDomain>  getAllByCourse(CourseModel a);
}
