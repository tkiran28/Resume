package com.example.resume.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resume.model.Achievements;
import com.example.resume.service.AchievementService;

@CrossOrigin(origins="http://resumeui.s3-website.ap-south-1.amazonaws.com", allowedHeaders="*")
@RestController
@RequestMapping("/achievement")
public class AchievementController {

	@Autowired
	private AchievementService achievementService;

	@GetMapping("/achievement-details")
	public ResponseEntity<List<Achievements>> getAchievementDetails() {
		List<Achievements> response = achievementService.getAchievementsDetails();

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
	