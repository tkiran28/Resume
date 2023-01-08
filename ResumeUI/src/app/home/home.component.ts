import { Component, OnInit } from '@angular/core';
import { Achievements } from '../Entity/Achievement';
import { Summary } from '../Entity/Summary';
import { resumeUIService } from '../service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private resumeService: resumeUIService) { }

  summary: Summary;
  descriptionSummary;


  ngOnInit(): void {
    console.log("calling service");
    this.getSummaryDetails();
    
  }

  getSummaryDetails() {
    this.resumeService.getSummaryDetails(1).subscribe(
      (data) => {
        console.log("calling summary");
        this.summary = data;
        this.descriptionSummary= data.description;
        console.log(this.summary);
      }
    )
  }

 

}
