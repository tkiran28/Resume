package com.example.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resume.model.Summary;

public interface SummaryRepository extends JpaRepository<Summary, Integer> {

}
