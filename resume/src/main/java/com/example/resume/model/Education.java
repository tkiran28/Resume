package com.example.resume.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer educationId;

	private String degree;

	private String yearOfCompletion;

	private String cgpa;

	private String university;

	public Integer getEducationId() {
		return educationId;
	}

	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getYearOfCompletion() {
		return yearOfCompletion;
	}

	public void setYearOfCompletion(String yearOfCompletion) {
		this.yearOfCompletion = yearOfCompletion;
	}

	public String getCgpa() {
		return cgpa;
	}

	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

}
