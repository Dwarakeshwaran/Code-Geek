import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular2node';

  click(){
    console.log("Clicked!");
  }

  isDisabled = null; 

  showHello(){
    this.isDisabled = true;
  }
  hideHello(){
    this.isDisabled = false;
  }
 
}
 