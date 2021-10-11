import { Component, OnInit } from '@angular/core';

import { NamePageService } from '../config/name-page.service';
import { Partners } from '../config/Partners';
 
@Component({
  selector: 'app-name-page',
  templateUrl: './name-page.component.html',
  styleUrls: ['./name-page.component.css']
})
export class NamePageComponent implements OnInit {

  constructor(private service: NamePageService ) { }

  names:Partners[];
  partnerName: Partners = null;

 

  ngOnInit() {

    this.service.getPartners()
    .subscribe(data => {this.names = data});

  }

  heading: string = 'Have fun with Flames';

  message: string = "";

  i:number = 0;

  check() {
    console.log("Clicked!");
    
    this.i = this.i + 1;
  }

  getVal():number{
    return 1;

  }

  postName(userName: string, crushName: string){

    console.log("clicked");

    var name:Partners = new Partners();
  
    name.userName = userName;
    name.crushName = crushName;

    console.log(name);

    this.service.postPartner(name)
    .subscribe(data => {this.names.push(data)});
  }
  

}
