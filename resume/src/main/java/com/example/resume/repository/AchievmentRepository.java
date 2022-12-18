package com.example.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resume.model.Achievements;

public interface AchievmentRepository extends JpaRepository<Achievements, Integer> {

}
