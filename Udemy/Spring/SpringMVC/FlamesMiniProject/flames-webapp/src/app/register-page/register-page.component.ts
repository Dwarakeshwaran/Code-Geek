import { Component, OnInit } from '@angular/core';

import { Users } from '../config/Users';
import { LoginPageService } from '../config/login-page.service';

@Component({
  selector: 'app-register-page',
  templateUrl: './register-page.component.html',
  styleUrls: ['./register-page.component.css']
})
export class RegisterPageComponent implements OnInit {

  constructor(private service: LoginPageService) { }

  users: Users = new Users();

  userArray: Users[] = null;

  ngOnInit() {

    this.service.getUsers()
      .subscribe(data => this.userArray = data);

  }

  checkPresence(list: Users[], email: String): boolean {

    for (let i = 0; i < list.length; i++) {
      if (list[i].email.toString() == email.toString()) {

        console.log(list[i].email.toString() + "-" + email.toString());
        return false;
      }
      console.log(list[i].email.toString() + "-" + email.toString());
    }

    return true;
  }

  registerUser(user: String, pass: String, confirmPassword: String, email: String) {

    if (user == "" || pass == "" || confirmPassword == "" || email == "") {
      alert("One/More of the field(s) is/are null");
    }
    else {


      if (pass.toString() == confirmPassword.toString()) {

        this.users.userName = user;
        this.users.password = pass;
        this.users.email = email;

        if (this.checkPresence(this.userArray, email)) {
          this.service.insertUser(this.users)
            .subscribe();

          alert("User Registered!");

          window.location.reload();
        }
        else {
          alert("User Already Exists!");
        }

      }
      else {
        alert("Passwords Doesn't Match");
      }
    }
  }
}
