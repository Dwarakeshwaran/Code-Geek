import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule, HttpClientJsonpModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NamePageComponent } from './name-page/name-page.component';

import { NamePageService } from './config/name-page.service';



@NgModule({
  declarations: [
    AppComponent,
    NamePageComponent
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
