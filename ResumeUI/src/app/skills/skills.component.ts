import { Component, OnInit } from '@angular/core';
import { resumeUIService } from '../service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
skillsList:any;
  constructor(private resumeService :resumeUIService) { }
  category:any;
  ngOnInit(): void {
    this.getSkillsDetails(this.category);
  }


  getSkillsDetails(category){
  this.resumeService.getSkillsDetails(category).subscribe(
    (data) => {
      this.skillsList = data;
    }
  )




  }
}
