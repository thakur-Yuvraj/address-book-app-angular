import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-show-contact',
  standalone:true,
  imports: [CommonModule],
  templateUrl: './show-contact.component.html',
  styleUrl: './show-contact.component.scss'
})

export class ShowContactComponent {
  contacts = [
    { name: 'John Doe', email: 'john@example.com', address: '123 Street', city: 'New York', state: 'NY', pincode: '10001' },
    { name: 'Yuvraj Singh', email: 'example@gmail.com', address: '31b', city: 'Bhopal', state: 'MadhyaPradesh', pincode: '108001' },
    { name: 'Jane Smith', email: 'jane@example.com', address: '456 Avenue', city: 'Los Angeles', state: 'CA', pincode: '900051' }
  ];
}
