package com.challenge.alkemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.domain.StudentCourseDomain;
import com.challenge.alkemy.domain.StudentDomain;
import com.challenge.alkemy.model.CourseModel;
import com.challenge.alkemy.model.StudentCourseModel;
import com.challenge.alkemy.model.StudentModel;
import com.challenge.alkemy.service.StudentCourseService;
import com.challenge.alkemy.transform.CourseTransform;
import com.challenge.alkemy.transform.StudentCourseTransform;
import com.challenge.alkemy.transform.StudentTransform;



@Controller
@RequestMapping(path = "/studentCourse")
public class StudentCourseController {
	@Autowired
	private StudentCourseService studentCourseService;
	
	@GetMapping("/list/{dni}")
	public String listStudentCourse(StudentModel  student, Model model) {
		var studentCourses=studentCourseService.listStudentCourseNotRegistered(student.getDni());
		model.addAttribute("studentCourses", studentCourses);		
		model.addAttribute("student", student);
		return "listStudentCourse";
	}
	
	@GetMapping("/delete")
	public String delete (StudentCourseModel studentCourse) {
		studentCourseService.delete(studentCourse);
		return "redirect:/student";
	}
	
	@GetMapping("/register/{idCourse}/{dni}")
	public String register (CourseModel course,StudentModel student) {
		
		CourseDomain courseDomain = CourseTransform.modelToDomain(course);
		StudentDomain studentDomain = StudentTransform.modelToDomain(student);
		
		studentCourseService.save(StudentCourseTransform.domainToModel(new StudentCourseDomain(courseDomain,studentDomain)));
		return "redirect:/student";
	}
	

	
}
