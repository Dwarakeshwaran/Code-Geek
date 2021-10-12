import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule, HttpClientJsonpModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NamePageComponent } from './name-page/name-page.component';

import { NamePageService } from './config/name-page.service';
import { DisplayPageComponent } from './display-page/display-page.component';



@NgModule({
  declarations: [
    AppComponent,
    NamePageComponent,
    DisplayPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    HttpClientJsonpModule

  ],
  providers: [NamePageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
