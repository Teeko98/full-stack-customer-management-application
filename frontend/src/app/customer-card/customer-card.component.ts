import { Component } from '@angular/core';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer-card',
  standalone: true,
  imports: [],
  templateUrl: './customer-card.component.html',
  styleUrl: './customer-card.component.css'
})
export class CustomerCardComponent {
  customer!: Customer;


}
