package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.Student;

@RestController
public class StudentController {
	
	private final StudentService studentService;
	
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	@GetMapping
	@RequestMapping("api/homescreen")
	public String getStudent() {
		return studentService.getHomescreen();
	}
	
	
	
	@GetMapping
	@RequestMapping("api/getstudents")
	public List<String> getStudentList(){
		return studentService.getStudentList();
	}
	
	@PutMapping
	@RequestMapping("api/addstudent")
	public void addStudent() {
		studentService.addStudent();
	}
	
	@GetMapping
	@RequestMapping("api/getallstudents")
	public List<Student> getAllStudents(){
		return studentService.getAllStduents();
	}
	
	@DeleteMapping
	@RequestMapping("api/deleteStudent")
	public void deleteStudent() {
		studentService.deleteStudent();
	}
	

}
