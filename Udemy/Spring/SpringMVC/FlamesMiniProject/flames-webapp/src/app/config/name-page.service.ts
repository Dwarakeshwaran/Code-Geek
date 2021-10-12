import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Partners } from './Partners';


@Injectable({
  providedIn: 'root'
})
export class NamePageService {

  constructor(private http: HttpClient) { }


  getPartners(): Observable<any> {

    return this.http.get("http://localhost:8080/flames/home/allpairs");

  }

  postPartner(name: Partners): Observable<any> {
    console.log("post");

    return this.http.post("http://localhost:8080/flames/home/addpair", JSON.stringify(name));

  }

  getFlames(userName: String, crushName: String):Observable<any>{

    let parameter1 = new HttpParams()
    .set('user',userName.toString())
    .set('crush',crushName.toString())    ;
    

    return this.http.get("http://localhost:8080/flames/home/getpair",{params: parameter1});
  }

}
