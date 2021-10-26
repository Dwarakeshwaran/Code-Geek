import { Component, OnInit } from '@angular/core';
import { LoginPageService } from '../config/login-page.service';
import { Users } from '../config/Users';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  constructor(private service: LoginPageService) { }

  ngOnInit() {

    this.service.getUsers()
      .subscribe(data => this.userArray = data);
  }

  userArray: Users[];

  checkPresence(list: Users[], email: String, password: String): boolean {

    for (let i = 0; i < list.length; i++) {
      if (list[i].email.toString() == email.toString()) {
        if (list[i].password.toString() == password.toString()) {
          return true;
        }
      }
    }
    return false;
  }


  loginCheck(email: String, password: String) {

    if (email.toString() == "" || password.toString() == "") {
      alert("One/More of the field(s) is/are null");
    }
    else {

      if (this.checkPresence(this.userArray, email, password)) {

        console.log("User Exists!");
      }
      else {
        alert("User Doesn't Exists! Please Register!");
      }
    }
  }
}
