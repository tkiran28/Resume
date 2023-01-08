import { Component, OnInit } from '@angular/core';
import { resumeUIService } from '../service';
import { Experience } from '../Entity/Experience';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {
  experienceList: any;


  constructor(private resumeService: resumeUIService) { }

  ngOnInit(): void {
    this.getExperienceDetails();
  }

  getExperienceDetails() {
    this.resumeService.getExperienceDetails().subscribe(
      (data) => {
        this.experienceList = data;
      }

    )

  }
}
