import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule} from '@angular/forms';
import {AppRoutingModule} from './app-routing.module'
import { CustomerComponent } from './Customer/CustomerApp.CustomerComponent';
import { HomeComponent } from './Home/CustomerApp.HomeComponent';
import { MasterComponent } from './Home/CustomerApp.MasterComponent';
import { SupplierComponent } from './Supplier/CustomerApp.SupplierComponent';

@NgModule({
  declarations: [
    CustomerComponent,
    HomeComponent,
    MasterComponent,
    SupplierComponent
  ],
  imports: [
    AppRoutingModule,
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [MasterComponent]
})
export class CustomerModule { }