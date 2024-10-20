import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { NavbarComponent } from '../navbar/navbar.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [NavbarComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {
  imageUrl: string =
    'https://media.istockphoto.com/id/175454330/photo/hindu-god-krishna.jpg?s=2048x2048&w=is&k=20&c=Y62zgGQveJD4XwclvTUKpvFZealoG8CxYl_dTPwQwi0=';
}
