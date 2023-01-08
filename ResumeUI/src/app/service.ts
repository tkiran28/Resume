import { HttpClient } from '@angular/common/http';
import { Summary } from './Entity/Summary';
import { Component, Injectable, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Achievements } from './Entity/Achievement';
import { Skills } from './Entity/Skills';
import { Education } from './Entity/Education';
import { Experience } from './Entity/Experience';
import { Certification } from './Entity/Certification';

@Injectable({
    providedIn: 'root'
  })
export class resumeUIService {

  localURL = "http://localhost:8080";

  constructor(private httpclient: HttpClient) { }

  getSummaryDetails(id): Observable<Summary> {
    return this.httpclient.get<Summary>(this.localURL+"/summary/summary-details/"+id);
  }

  getAchievementDetails(): Observable<Achievements>{
    return this.httpclient.get<Achievements>(this.localURL+"/achievement/achievement-details");
  }

  getSkillsDetails(category): Observable<Skills>{
    return this.httpclient.get<Skills>(this.localURL+"/skills/skills-details/"+category);
  }

  getEducationDetails(id): Observable<Education>{
    return this.httpclient.get<Education>(this.localURL+"/education/education-details/"+id);
  }

  getExperienceDetails(): Observable<Experience>{
    return this.httpclient.get<Experience>(this.localURL+"/workexperience/workexperience-details");
  }

  getCertificationDetails (): Observable<Certification>{
    return this.httpclient.get<Certification>(this.localURL+"/certification/certifications-details");
  }

}
