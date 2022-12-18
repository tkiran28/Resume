package com.example.resume.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Achievements {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer achievementId;

	private String description;

	public Integer getAchievementId() {
		return achievementId;
	}

	public void setAchievementId(Integer achievementId) {
		this.achievementId = achievementId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
