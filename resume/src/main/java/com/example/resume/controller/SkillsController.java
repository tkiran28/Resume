package com.example.resume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resume.model.Skills;
import com.example.resume.service.SkillService;

@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@RestController
@RequestMapping("/skills")
public class SkillsController {

	@Autowired
	private SkillService skillService;

	@GetMapping("/skills-details/{category}")
	public ResponseEntity<List<Skills>> getSkillDetails(@PathVariable("category") String category) {
		List<Skills> response = skillService.getSkillDetails(category);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
