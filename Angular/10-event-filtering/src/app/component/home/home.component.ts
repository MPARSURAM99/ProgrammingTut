import { Component } from '@angular/core';
import { NavbarComponent } from '../navbar/navbar.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [NavbarComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {
  // Traditional event filtering method;
  // onKeyUp = ($event: any) => {
  //   console.log($event.keyCode);
  // };

  // Angular event filtering method;

  onKeyUp = () => {
    console.log('Enter key is pressed');
  };
}
