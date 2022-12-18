package com.example.resume.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resume.model.Skills;
import com.example.resume.repository.SkillRepository;
import com.example.resume.service.SkillService;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	SkillRepository skillRepository;

	@Override
	public List<Skills> getSkillDetails(String category) {

		return skillRepository.findByCategory(category);
	}

}
