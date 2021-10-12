import { Component, OnInit } from '@angular/core';
import { NamePageService } from '../config/name-page.service';
import { Partners } from '../config/Partners';

@Component({
  selector: 'app-display-page',
  templateUrl: './display-page.component.html',
  styleUrls: ['./display-page.component.css']
})
export class DisplayPageComponent implements OnInit {

  constructor(private service: NamePageService) { }

  names: Partners[] = null;

  ngOnInit() {

    this.service.getPartners()
      .subscribe(data => { this.names = data });
  }

}
