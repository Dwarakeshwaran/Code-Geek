import { Component, OnInit, Input } from '@angular/core';
import { ListService } from '../list.service';

@Component({
  selector: 'app-data',
  templateUrl: './data.component.html',
  styleUrls: ['./data.component.css']
})
export class DataComponent implements OnInit {

  constructor(private _list: ListService) { 
  }
  private animes  = [];
  ngOnInit() {
    this.animes = this._list.getAnime();

  }
  
  @Input("data") name;
  currency = 100;

  
  

  

  
}
