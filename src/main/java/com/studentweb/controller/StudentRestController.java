package com.studentweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentweb.entities.Students;
import com.studentweb.repositories.StudentRepository;

@RestController
public class StudentRestController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	
	@GetMapping("/student")
	public List<Students> getStudents(){
		List<Students> students = studentRepo.findAll();
		return students;
	}

}
