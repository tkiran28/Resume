package com.example.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resume.model.Education;
import com.example.resume.service.EducationService;

@CrossOrigin(origins="http://resumeui.s3-website.ap-south-1.amazonaws.com", allowedHeaders="*")
@RestController
@RequestMapping("/education")
public class EducationController {

	@Autowired
	private EducationService educationService;

	@GetMapping("/education-details/{id}")
	public ResponseEntity<Education> getEducationDetails(@PathVariable("id") Integer Id) {
		Education response = educationService.getEducationDetails(Id);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
