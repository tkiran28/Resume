package com.example.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resume.model.Education;

public interface EducationRepository extends  JpaRepository<Education, Integer>{

}
