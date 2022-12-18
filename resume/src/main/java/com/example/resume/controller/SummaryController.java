package com.example.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resume.model.Summary;
import com.example.resume.service.SummaryService;

@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
@RestController
@RequestMapping("/summary")
public class SummaryController {

	@Autowired
	private SummaryService summaryService;

	@GetMapping("/summary-details/{id}")
	
	public ResponseEntity<Summary> getSummaryDetails(
			@PathVariable("id") Integer Id	) {
		Summary response = summaryService.getSummaryDetails(Id);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
