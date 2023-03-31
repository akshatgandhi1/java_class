import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerComponent } from './Customer/CustomerApp.CustomerComponent';
import { HomeComponent } from './Home/CustomerApp.HomeComponent';
import { SupplierComponent } from './Supplier/CustomerApp.SupplierComponent';

const routes: Routes = [
  {path:"home", component:HomeComponent},
  {path:"supplier", component:SupplierComponent},
  {path:"customer", component:CustomerComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
