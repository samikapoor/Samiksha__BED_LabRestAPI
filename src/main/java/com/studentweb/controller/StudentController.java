package com.studentweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.studentweb.entities.Students;
import com.studentweb.services.StudentService;

	@Controller
	public class StudentController {
		@Autowired
		private StudentService studentService;
		
			
	@RequestMapping("/show")
	public String showStudentPage() {
		return "student_info";
	}
	@RequestMapping("/saveStudentInfo")
	public String saveStudentInfo(@ModelAttribute("loc") Students student, ModelMap model) {
		studentService.saveStudentInfo(student);
		model.addAttribute("msg", "Information is saved");
		return "student_info";

	}
	@RequestMapping("/listall")
	public String listAll(ModelMap model) {
		List<Students> student = studentService.getAllInformationById();
		model.addAttribute("student", student);
		return "student_record";
	}
	@RequestMapping("/delete")
	public String deleteStudentRecord(@RequestParam("id") long id, ModelMap model) {
		studentService.deleteRecordById(id);
		List<Students> student = studentService.getAllInformationById();
		model.addAttribute("student", student);
		return "student_record";
	}
	@RequestMapping("/update")
	public String updateStudentRecord(@RequestParam("id") long id, ModelMap model) {
		Students student = studentService.getStudentById(id);
		model.addAttribute("student", student);
		return "update_record";
	}
	@RequestMapping("/updateData")
	public String updateStudentData(@ModelAttribute("loc") Students student, ModelMap model) {
		studentService.saveStudentInfo(student);
		model.addAttribute("msg", "Record is updated");
		return "update_record";
	}
}
