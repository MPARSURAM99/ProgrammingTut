import { Component, NgModule } from '@angular/core';
import { NavbarComponent } from '../navbar/navbar.component';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [NavbarComponent, FormsModule, CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {
  name!: string;
  email!: string;
  address!: string;

  userDetails: Array<any> = [];

  addUser = () => {
    this.userDetails.push({
      name: this.name,
      email: this.email,
      address: this.address,
    });
    this.name = '';
    this.email = '';
    this.address = '';
  };

  deleteUser = (index: number) => {
    this.userDetails.splice(index, 1);
  };
}
