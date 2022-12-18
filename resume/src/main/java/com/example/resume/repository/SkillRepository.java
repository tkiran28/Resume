package com.example.resume.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resume.model.Skills;

public interface SkillRepository extends JpaRepository<Skills, Integer> {
	
	List<Skills> findByCategory(String category);

}
