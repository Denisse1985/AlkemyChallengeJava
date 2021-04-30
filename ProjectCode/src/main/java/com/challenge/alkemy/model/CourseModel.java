package com.challenge.alkemy.model;

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



public class CourseModel implements Serializable {
	
		private static final long serialVersionUID = 1L;
	
	private Integer idCourse;	
	private String name;	
	private String schedule; //horario	
	private Integer maximumQuota;		
	private String description;	
	private Integer availableQuota;
	
	public Integer getAvailableQuota() {
		return availableQuota;
	}


	public void setAvailableQuota(Integer availableQuota) {
		this.availableQuota = availableQuota;
	}


	public CourseModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CourseModel(Integer idCourse, String name, String schedule, Integer maximumQuota) {
		super();
		this.idCourse = idCourse;
		this.name = name;
		this.schedule = schedule;
		this.maximumQuota = maximumQuota;
		
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
