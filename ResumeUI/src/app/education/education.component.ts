import { Component, OnInit } from '@angular/core';
import { resumeUIService } from '../service';

@Component({
  selector: 'app-education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.css']
})
export class EducationComponent implements OnInit {
  education;
  cgpa;
  degree;
  university;
  yearOfCompletion;
  constructor(private resumeService :resumeUIService) { }

  ngOnInit(): void {
    this.getEducationDetails();
  }

  getEducationDetails() {
    this.resumeService.getEducationDetails(1).subscribe(
      (data) => {
        this.education = data;
     this.degree=data.degree;
     this.university=data.university;
     this.yearOfCompletion=data.yearOfCompletion;
        this.cgpa= data.cgpa;

      }

    )

  }
}
