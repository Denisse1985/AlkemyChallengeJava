package com.challenge.alkemy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.challenge.alkemy.domain.StudentCourseDomain;
import com.challenge.alkemy.model.StudentCourseModel;
import com.challenge.alkemy.service.StudentCourseService;
import com.challenge.alkemy.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentCourseService studentCourse;
	
	@GetMapping("/student")
	public String home(Model model, @AuthenticationPrincipal User user ) {
		var student=studentService.findStudentByUserName(user.getUsername());
		model.addAttribute("student", student);		
			
		List<StudentCourseModel> listStudentCourse = studentCourse.listStudentCourse(student.getDni());
		model.addAttribute("studentCourses", listStudentCourse);
		
		
		return "student";
	}
	
	
	
}
