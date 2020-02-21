import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-surprise',
  templateUrl: './surprise.component.html',
  styleUrls: ['./surprise.component.css']
})
export class SurpriseComponent implements OnInit {

  constructor() { 
  }
 
  ngOnInit() {
    

  }
  click(){
    console.log("Clicked!");
  }

  
  name = "Dwarki's Love towards Renu is ";
  isDisabled = null; 
  love = null;
  showHello(){
    this.isDisabled = true;
  }
  hideHello(){
    this.isDisabled = false;
  }

  isLove(){
    this.love = true;
  }

}
