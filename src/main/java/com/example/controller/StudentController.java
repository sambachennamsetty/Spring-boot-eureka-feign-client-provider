package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-provider")
public class StudentController {

	@GetMapping("/get")
	public String getStudentData() {
		return "From Student Provider";
	}
}
