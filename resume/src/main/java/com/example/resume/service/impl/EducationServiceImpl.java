package com.example.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resume.model.Education;
import com.example.resume.repository.EducationRepository;
import com.example.resume.service.EducationService;

@Service
public class EducationServiceImpl implements EducationService {

	@Autowired
	EducationRepository educationRepository;

	@Override
	public Education getEducationDetails(Integer Id) {

		return educationRepository.findById(Id).get();
	}

}
