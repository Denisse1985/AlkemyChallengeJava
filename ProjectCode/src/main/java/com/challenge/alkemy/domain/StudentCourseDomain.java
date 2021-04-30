package com.challenge.alkemy.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_course")
public class StudentCourseDomain implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="student_dni" ,referencedColumnName = "dni")
	private StudentDomain student;
	
	@OneToOne
	@JoinColumn(name="course_id" ,referencedColumnName = "idCourse")
	private CourseDomain course;
	

	public StudentCourseDomain() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public StudentCourseDomain(Integer id, StudentDomain student, CourseDomain course) {
		super();
		this.id = id;
		this.student = student;
		this.course = course;
	}



	public StudentCourseDomain(CourseDomain course, StudentDomain student) {
		this.student = student;
		this.course = course;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public StudentDomain getStudent() {
		return student;
	}



	public void setStudent(StudentDomain student) {
		this.student = student;
	}



	public CourseDomain getCourse() {
		return course;
	}



	public void setCourse(CourseDomain course) {
		this.course = course;
	}



	
	
	

}
