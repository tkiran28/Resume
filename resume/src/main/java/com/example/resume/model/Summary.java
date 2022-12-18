package com.example.resume.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Summary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer summaryId;

	private String description;

	public Integer getSummaryId() {
		return summaryId;
	}

	public void setSummaryId(Integer summaryId) {
		this.summaryId = summaryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
