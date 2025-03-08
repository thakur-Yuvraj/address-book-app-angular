import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from './components/header/header.component';
import { AddContactComponent } from './components/add-contact/add-contact.component';
import { ShowContactComponent } from './components/show-contact/show-contact.component';
import { Injectable } from '@angular/core';
import { CommonModule } from '@angular/common';

@Injectable ({
  providedIn: 'root'
})

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,HeaderComponent,AddContactComponent,ShowContactComponent,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'address-book-ui';
  constructor() {}

  showAddContact: boolean = false; // Show Add Contact by default

  toggleComponent() {
    this.showAddContact = !this.showAddContact; // Toggle between components
  }

}

