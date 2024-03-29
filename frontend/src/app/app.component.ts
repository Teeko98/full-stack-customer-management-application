import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Customer } from './customer';
import { CustomerService } from './customer.service';
import { HttpErrorResponse } from '@angular/common/http';

import { HeaderComponent } from './header/header.component';
import { CustomerTableComponent } from './customer-table/customer-table.component';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [RouterOutlet, HeaderComponent, CustomerTableComponent]
})
export class AppComponent implements OnInit {

  public customers: Customer[] = [];

  constructor(private customerService: CustomerService) {}

  ngOnInit(): void {
    this.getCustomers();
  }

  public getCustomers(): void {
    this.customerService.getCustomers().subscribe({
        next:(response: Customer[]) => {this.customers = response;},
        error:(error: HttpErrorResponse) => {alert(error.message);}
      });
  }
}
