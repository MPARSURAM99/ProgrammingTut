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
  isClicked: boolean = false;

  btnClick = () => {
    if (!this.isClicked) {
      this.isClicked = true;
    } else if (this.isClicked) {
      this.isClicked = false;
    }
  };
}
