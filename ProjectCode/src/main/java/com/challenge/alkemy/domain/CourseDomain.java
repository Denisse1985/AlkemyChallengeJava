package com.challenge.alkemy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="course")
public class CourseDomain implements Serializable {
	
		private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer idCourse;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String schedule; //horario
	
	@Column(name="maximum_quota")
	private Integer maximumQuota;
		
	@OneToOne
	@JoinColumn(name="teacher_dni" ,referencedColumnName = "dni")
	private TeacherDomain teacher;
	
	@Column(name="description")
	private String description;
	
	public CourseDomain() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CourseDomain(Integer idCourse, String name, String schedule, Integer maximumQuota, TeacherDomain teacher) {
		super();
		this.idCourse = idCourse;
		this.name = name;
		this.schedule = schedule;
		this.maximumQuota = maximumQuota;
		this.teacher = teacher;
	}

	public TeacherDomain getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherDomain teacher) {
		this.teacher = teacher;
	}

	public Integer getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(Integer idCourse) {
		this.idCourse = idCourse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public Integer getMaximumQuota() {
		return maximumQuota;
	}

	public void setMaximumQuota(Integer maximumQuota) {
		this.maximumQuota = maximumQuota;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
