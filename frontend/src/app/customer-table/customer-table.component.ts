import { Component, Input } from '@angular/core';
import { AppComponent } from '../app.component';
import { Customer } from '../customer';
import { CustomerCardComponent } from "../customer-card/customer-card.component";

@Component({
    selector: 'app-customer-table',
    standalone: true,
    templateUrl: './customer-table.component.html',
    styleUrl: './customer-table.component.css',
    imports: [CustomerCardComponent,]
})
export class CustomerTableComponent {
  @Input() 
  customers: Customer[] = [];
}
