package com.challenge.alkemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.challenge.alkemy.domain.CourseDomain;
import com.challenge.alkemy.service.CourseService;
import com.challenge.alkemy.service.TeacherService;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/list")
	public String listCourse(Model model ) {
		var courses=courseService.listCourse();
		model.addAttribute("courses", courses);		
		System.out.println("PASE POR course-list");
		return "listCourse";
	}
	

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("course", new CourseDomain());
		var teachers=teacherService.listTeacher();
		model.addAttribute("teachers", teachers);	
		return "editCourse";
	}
	
	
	@PostMapping("/save")
	public String save(@Validated CourseDomain course,Errors errors) {
		courseService.save(course);
		return "redirect:/course/list";
	}
	
	
	@GetMapping("/edit/{idCourse}")
	public String edit(CourseDomain course, Model model) {
		course=courseService.findCourseDomain(course);
		model.addAttribute("course", course);
		var teachers=teacherService.listTeacher();
		model.addAttribute("teachers", teachers);	
		return "editCourse";
	}
	
	@GetMapping("/delete")
	public String delete (CourseDomain course) {
		courseService.delete(course);
		return "redirect:/course/list";
	}
	

}
