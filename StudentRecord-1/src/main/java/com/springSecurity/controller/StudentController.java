package com.springSecurity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springSecurity.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	List<Student> recordsList = new ArrayList<>();

	public StudentController() {
		
	}
	@GetMapping
	public List<Student> getAllData(){
		recordsList.add(new Student(1, "John Doe", "Science", 10));
		recordsList.add(new Student(2, "Jane Smith", "Arts", 11));
		recordsList.add(new Student(3, "Alice Johnson", "Commerce", 12));
		return recordsList;
		
	}
}
