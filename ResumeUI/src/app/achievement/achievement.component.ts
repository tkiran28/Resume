import { Component, OnInit } from '@angular/core';
import { resumeUIService } from '../service';

@Component({
  selector: 'app-achievement',
  templateUrl: './achievement.component.html',
  styleUrls: ['./achievement.component.css']
})
export class AchievementComponent implements OnInit {
  descriptionAchievement;
  achievementList;
  certificationList;
  year;
  name;
  constructor(private resumeService:resumeUIService) { }

  ngOnInit(): void {
    this.getAchievementsDetails();
    this.getCertificationDetails();
  }

  getAchievementsDetails() {
    this.resumeService.getAchievementDetails().subscribe(
      (data) => {
        this.achievementList = data;
      }
    )
  }

  getCertificationDetails() {
    this.resumeService.getCertificationDetails().subscribe(
      (data) => {
        this.certificationList = data;
      }
    )
  }

}
