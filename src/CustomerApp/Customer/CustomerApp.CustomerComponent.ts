import { Component } from '@angular/core';
import {Customer} from "./CustomerApp.model";


@Component({
  templateUrl: './CustomerApp.CustomerView.html',
  styleUrls: ['./CustomerApp.component.css']
})
export class CustomerComponent {
  title = 'angularpractice';

  CustomerModel : Customer = new Customer();
  CustomerModels : Array<Customer> = new Array<Customer>;
  Add(){
    this.CustomerModels.push(this.CustomerModel);
    this.CustomerModel = new Customer()
  }
}
