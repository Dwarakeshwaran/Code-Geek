import { Component, OnInit, Input } from '@angular/core';


@Component({
  selector: 'app-data',
  templateUrl: './data.component.html',
  styleUrls: ['./data.component.css']
})
export class DataComponent implements OnInit {

  constructor() { 
  }
 
  ngOnInit() {
    

  }
  
  @Input("data") name;
  currency = 100;

  
  multiple = 0;
  multiply(any1,any2){
     this.multiple = any1 * any2;
  }
}