import { Injectable } from '@angular/core';
import { mangaInterface } from "./mangaInterface";
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ListService {

  constructor(private http: HttpClient) { }

  _url:string = "./manga.json";
  
  // getManga():Observable<mangaInterface[]>{

  //   return this.http.get<mangaInterface[]>(this._url);

  // }

  getManga(){
    return [
      {"name": "Naruto", "genre":"Shonen", "year":1999},
      {"name": "Gantz", "genre":"Seinen", "year":2000},
      {"name": "Doremon", "genre":"Kodomo", "year":1970}
  ]
  }

 


}
