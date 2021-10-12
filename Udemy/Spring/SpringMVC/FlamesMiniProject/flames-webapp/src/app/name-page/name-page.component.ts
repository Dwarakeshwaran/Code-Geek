import { Component, OnInit } from '@angular/core';

import { NamePageService } from '../config/name-page.service';
import { Partners } from '../config/Partners';

@Component({
  selector: 'app-name-page',
  templateUrl: './name-page.component.html',
  styleUrls: ['./name-page.component.css']
})
export class NamePageComponent implements OnInit {

  constructor(private service: NamePageService) { }

  names: Partners[];
  partnerName: Partners = null;
  flames:String = null;

  flamesPartner: Partners = null;
  ngOnInit() {

  }

  postName(userName: string, crushName: string) {

    if (userName == "" || crushName == "") {
      alert("One of the fiels is null");
      return;
    }
    else {
      console.log("clicked");

      var name: Partners = new Partners();

      name.userName = userName;
      name.crushName = crushName;

      console.log(name);

      this.service.postPartner(name)
        .subscribe(data => { this.partnerName = name });

      alert(name.userName + " and his crush " + name.crushName
        + " has been added");

       this.service.getFlames(name.userName, name.crushName)
       .subscribe(data => this.flamesPartner = data);

       console.log(this.flamesPartner);
        

    }

  }

}
