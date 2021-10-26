import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule, HttpClientJsonpModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NamePageComponent } from './name-page/name-page.component';

import { NamePageService } from './config/name-page.service';
import { LoginPageService } from './config/login-page.service';
import { DisplayPageComponent } from './display-page/display-page.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { RegisterPageComponent } from './register-page/register-page.component';



@NgModule({
  declarations: [
    AppComponent,
    NamePageComponent,
    DisplayPageComponent,
    LoginPageComponent,
    RegisterPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    HttpClientJsonpModule

  ],
  providers: [NamePageService, LoginPageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
