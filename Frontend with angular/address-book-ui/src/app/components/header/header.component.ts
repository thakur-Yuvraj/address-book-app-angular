import { Component } from '@angular/core';
import { AppComponent } from '../../app.component';

@Component({
  selector: 'app-header',
  // imports: [AppComponent],
  templateUrl: './header.component.html',
  styleUrl: './header.component.scss'
})
export class HeaderComponent {

  constructor(private appComponent:AppComponent){}
  switchView1($event:any) {
    this.appComponent.showAddContact = false;
  }
  switchView2($event:any) {
    this.appComponent.showAddContact = true;
  }
  toggleComponent() {
    this.appComponent.showAddContact = !this.appComponent.showAddContact; // Toggle between components
  }
}
