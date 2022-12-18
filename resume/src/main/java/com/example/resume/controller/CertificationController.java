package com.example.resume.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.resume.model.Certifications;
import com.example.resume.service.CertificationService;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/certification")
public class CertificationController {

	@Autowired
	private CertificationService certificationService;

	@GetMapping(value = "/certifications-details")
	public ResponseEntity<List<Certifications>> getCertificationDetails() {
		List<Certifications> response = certificationService.getCertificationDetails();

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
