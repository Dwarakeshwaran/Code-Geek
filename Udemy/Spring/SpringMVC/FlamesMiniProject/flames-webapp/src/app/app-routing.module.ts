import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { NamePageComponent } from './name-page/name-page.component';
import { DisplayPageComponent } from './display-page/display-page.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { RegisterPageComponent } from './register-page/register-page.component';
 

const routes: Routes = [
  {path: "name", component: NamePageComponent},
  {path: "display", component: DisplayPageComponent},
  {path: "login", component: LoginPageComponent},
  {path: "register", component: RegisterPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
