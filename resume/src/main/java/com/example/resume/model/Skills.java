package com.example.resume.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer skillId;
	private String name;
	private String category;

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
