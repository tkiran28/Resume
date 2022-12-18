package com.example.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resume.model.Summary;
import com.example.resume.repository.SummaryRepository;
import com.example.resume.service.SummaryService;

@Service
public class SummaryServiceImpl implements SummaryService {

	@Autowired
	private SummaryRepository summaryRepository;

	@Override
	public Summary getSummaryDetails(Integer Id) {
		
		return summaryRepository.findById(Id).get();
	}

}
