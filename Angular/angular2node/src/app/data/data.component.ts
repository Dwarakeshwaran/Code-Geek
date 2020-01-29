import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-data',
  templateUrl: './data.component.html',
  styleUrls: ['./data.component.css']
})
export class DataComponent implements OnInit {

  constructor() { }


  
  ngOnInit() {
  }
  
  @Input("data") name;
  currency = 100;

  animes = [
    {name: 'Naruto', genre:'Shonen', year:'1999'},
    {name: 'Gantz', genre:'Seinen', year:'2000'},
    {name: 'Doremon', genre:'Kodomo', year:'1970'}
  ];
}
