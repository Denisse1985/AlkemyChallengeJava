package com.challenge.alkemy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.challenge.alkemy.model.TeacherModel;
import com.challenge.alkemy.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@GetMapping("/list")
	public String listTeacher(Model model) {
		var teachers=teacherService.listTeacher();
		model.addAttribute("teachers", teachers);		
		return "listTeacher";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("teacher", new TeacherModel());
		return "editTeacher";
	}
	
	
	@PostMapping("/save")
	public String save(TeacherModel teacher) {
		teacherService.save(teacher);
		return "redirect:/teacher/list";
	}
	
	
	@GetMapping("/edit/{dni}")
	public String edit(TeacherModel teacher, Model model) {
		teacher=teacherService.findTeacherDomain(teacher);
		model.addAttribute("teacher", teacher);
		return "editTeacher";
	}
	
	@GetMapping("/delete")
	public String delete (TeacherModel teacher) {
		teacherService.delete(teacher);
		return "redirect:/teacher/list";
	}
}
