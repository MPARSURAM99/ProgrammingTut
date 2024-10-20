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
  inputValue: string = '';
  // onKeyUp = ($event) => {
  //   Traditional method to get the template value;
  //   this.inputValue = $event.target.value;
  // };

  onKeyUp = (inputFieldValue: any) => {
    this.inputValue = inputFieldValue;
  };
}
