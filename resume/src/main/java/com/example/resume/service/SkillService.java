package com.example.resume.service;

import java.util.List;

import com.example.resume.model.Skills;

public interface SkillService {

	List<Skills> getSkillDetails(String category);

}
