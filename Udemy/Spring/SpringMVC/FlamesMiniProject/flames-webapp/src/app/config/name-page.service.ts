import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Partners } from './Partners';


@Injectable({
  providedIn: 'root'
})
export class NamePageService {

  constructor(private http: HttpClient) { }


  getPartners(): Observable<any>{
   
    return this.http.get("http://localhost:8080/flames/home/allpairs");
    
  }

  partner: string = "{'userName': 'D','crushName': 'R'}";

  postPartner(name: Partners): Observable<any>{
    console.log("post");

    return this.http.post("http://localhost:8080/flames/home/addpair", JSON.stringify(name));

  }

}
