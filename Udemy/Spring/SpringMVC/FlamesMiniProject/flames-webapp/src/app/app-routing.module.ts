import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { NamePageComponent } from './name-page/name-page.component';
import { DisplayPageComponent } from './display-page/display-page.component';


const routes: Routes = [
  {path: "name", component: NamePageComponent},
  {path: "display", component: DisplayPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
