import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ListService {

  constructor() { }

  animes = [];

  getAnime(){

    return this.animes = [
      {name: 'Naruto', genre:'Shonen', year:'1999'},
      {name: 'Gantz', genre:'Seinen', year:'2000'},
      {name: 'Doremon', genre:'Kodomo', year:'1970'}
    ];

  }

 


}
