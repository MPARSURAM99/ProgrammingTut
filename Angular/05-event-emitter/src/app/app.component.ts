import { Component, ViewChild } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { NavbarComponent } from './component/navbar/navbar.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HomeComponent, NavbarComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'angular-tutorial';

  // Declare the variable to store the event;
  msgFromHome!: string;

  // Declare the receive message method
  receiveMsg = ($event: any) => {
    // Assign the $event to the local variable;
    this.msgFromHome = $event;
  };
}
