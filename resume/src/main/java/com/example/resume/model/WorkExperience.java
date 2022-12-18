package com.example.resume.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WorkExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer workExperienceId;

	private String designation;

	private String companyname;

	private String yearOfExperience;

	private String description;

	public Integer getWorkExperienceId() {
		return workExperienceId;
	}

	public void setWorkExperienceId(Integer workExperienceId) {
		this.workExperienceId = workExperienceId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(String yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
