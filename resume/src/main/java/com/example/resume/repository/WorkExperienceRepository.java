package com.example.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resume.model.WorkExperience;

public interface WorkExperienceRepository extends JpaRepository<WorkExperience, Integer> {

}
