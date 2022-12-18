package com.example.resume.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resume.model.WorkExperience;
import com.example.resume.repository.WorkExperienceRepository;
import com.example.resume.service.WorkExperienceService;

@Service
public class WorkExperienceServiceImpl implements WorkExperienceService {

	@Autowired
	WorkExperienceRepository workExperienceRepository;

	@Override
	public List<WorkExperience> getWorkExperienceDetails() {

		return workExperienceRepository.findAll();
	}

}
