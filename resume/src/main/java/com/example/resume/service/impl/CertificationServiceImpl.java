package com.example.resume.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resume.model.Certifications;
import com.example.resume.repository.CertificationRepository;
import com.example.resume.service.CertificationService;
@Service
public class CertificationServiceImpl implements CertificationService {

	@Autowired
	CertificationRepository certificationRepository;
	@Override
	public List<Certifications> getCertificationDetails() {
		List<Certifications> test =certificationRepository.findAll();
		return test;
	}

}
