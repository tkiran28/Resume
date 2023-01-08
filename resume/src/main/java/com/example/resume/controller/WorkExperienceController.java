package com.example.resume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resume.model.WorkExperience;
import com.example.resume.service.WorkExperienceService;

@CrossOrigin(origins="http://resumeui.s3-website.ap-south-1.amazonaws.com", allowedHeaders="*")
@RestController
@RequestMapping("/workexperience")
public class WorkExperienceController {

	@Autowired
	private WorkExperienceService workExperienceService;

	@GetMapping("/workexperience-details")
	public ResponseEntity<List<WorkExperience>> getWorkExperienceDetails() {
		List<WorkExperience> response = workExperienceService.getWorkExperienceDetails();

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
