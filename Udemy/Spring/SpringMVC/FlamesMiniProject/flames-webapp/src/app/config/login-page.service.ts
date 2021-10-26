import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
import { Users } from './Users';

@Injectable({
  providedIn: 'root'
})
export class LoginPageService {

  constructor(private http: HttpClient) { }

  insertUser(user: Users):Observable<any>{

    return this.http.post("http://localhost:8080/flames/home/register",JSON.stringify(user));

  }

  getUsers():Observable<any>{

    return this.http.get("http://localhost:8080/flames/home/users");
  }

  
}
