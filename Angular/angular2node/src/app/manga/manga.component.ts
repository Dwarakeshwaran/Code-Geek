import { Component, OnInit } from '@angular/core';
import { ListService } from '../list.service';

@Component({
  selector: 'app-manga',
  templateUrl: './manga.component.html',
  styleUrls: ['./manga.component.css']
})
export class MangaComponent implements OnInit {

  constructor(private _list: ListService) { }
  public mangas  = [];

 
  ngOnInit() {
   this.mangas = this._list.getManga()
   // .subscribe(data => this.mangas = data);
  }

}
