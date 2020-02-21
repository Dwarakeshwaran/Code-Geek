import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DataComponent } from './data/data.component';
import { MangaComponent } from './manga/manga.component';
import { SurpriseComponent } from './surprise/surprise.component';

const routes: Routes = [
  {path : 'data' , component : DataComponent},
  {path : 'manga' , component : MangaComponent },
  {path : 'surprise', component : SurpriseComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents  = [
  DataComponent,
  MangaComponent  
]
