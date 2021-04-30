package com.challenge.alkemy.model;

import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.domain.StudentDomain;

public class StudentCourseModel {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private StudentModel student;
	private CourseModel course;
	
	public StudentCourseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentCourseModel(Integer id, StudentModel student, CourseModel course) {
		super();
		this.id = id;
		this.student = student;
		this.course = course;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public StudentModel getStudent() {
		return student;
	}
	public void setStudent(StudentModel student) {
		this.student = student;
	}
	public CourseModel getCourse() {
		return course;
	}
	public void setCourse(CourseModel course) {
		this.course = course;
	}

	
}
