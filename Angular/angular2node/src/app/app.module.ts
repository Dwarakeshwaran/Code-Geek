import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';

import { ListService } from './list.service';
import { HttpClientModule } from '@angular/common/http';
import { SurpriseComponent } from './surprise/surprise.component';
import { CommonModule } from '@angular/common';
import { TransferHttpCacheModule } from '@nguniversal/common';
import { NgtUniversalModule } from '@ng-toolkit/universal';



@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    SurpriseComponent
    
  ],
  imports: [
    BrowserModule.withServerTransition({ appId: 'serverApp' }),
    AppRoutingModule,
    HttpClientModule,
    CommonModule,
    TransferHttpCacheModule,
    NgtUniversalModule
  ],
  providers: [ListService],
  bootstrap: [AppComponent]
})
export class AppModule { }
