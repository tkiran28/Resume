package com.example.resume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.resume.model.Certifications;

public interface CertificationRepository extends  JpaRepository<Certifications, Integer>{

}
