import { BrowserModule, BrowserTransferStateModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';

import { ListService } from './list.service';
import { HttpClientModule } from '@angular/common/http';
import { SurpriseComponent } from './surprise/surprise.component';
import { AppModule } from './app.module';



@NgModule({
  imports: [
    
    AppRoutingModule,
    HttpClientModule,
    AppModule,
    BrowserTransferStateModule
  ],
  providers: [ListService],
  bootstrap: [AppComponent]
})
export class AppBrowserModule { }
