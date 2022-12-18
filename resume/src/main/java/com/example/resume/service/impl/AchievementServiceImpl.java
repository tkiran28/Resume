package com.example.resume.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resume.model.Achievements;
import com.example.resume.repository.AchievmentRepository;
import com.example.resume.service.AchievementService;
@Service
public class AchievementServiceImpl implements AchievementService{

	@Autowired
	private AchievmentRepository achievementRepository;
	@Override
	public List<Achievements> getAchievementsDetails() {
		
		return achievementRepository.findAll();
	}

}
