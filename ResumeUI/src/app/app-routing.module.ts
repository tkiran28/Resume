import { Expansion } from '@angular/compiler';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AchievementComponent } from './achievement/achievement.component';
import { ContactComponent } from './contact/contact.component';
import { EducationComponent } from './education/education.component';
import { ExperienceComponent } from './experience/experience.component';
import { HomeComponent } from './home/home.component';
import { SkillsComponent } from './skills/skills.component';

const routes: Routes = [
  
  {path: "", component: HomeComponent },
  {path: "home", component: HomeComponent },
  {path: "skills", component: SkillsComponent },
  {path: "experience", component: ExperienceComponent },
  {path: "education", component: EducationComponent },
  {path: "achievement", component: AchievementComponent },
  {path: "contact", component: ContactComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
