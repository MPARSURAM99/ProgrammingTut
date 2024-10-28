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
  // use of ngFor
  // Array
  arrayName: Array<string> = ['Name1', 'Name2', 'Name3', 'Name4', 'Name5'];

  // use of ngIf
  id!: number | null;
  name!: string;
  // Array of Objects;
  arrayOfObject: Array<{ id: number | null; name: string }> = [
    // { id: 1, name: 'Parsu' },
    // { id: 2, name: 'Rojalin' },
    // { id: 3, name: 'Barsha' },
    // { id: 4, name: 'Lipsa' },
    // { id: 5, name: 'Alisha' },
  ];
  addPerson = () => {
    this.arrayOfObject.push({ id: this.id, name: this.name });

    this.id = null;
    this.name = '';
  };
  deleteItem = (i: number) => {
    this.arrayOfObject.splice(i, 1);
  };

  // use of ngSwitchcase;
  status: string = 'There is no step';

  onClick = (stepValue: string) => {
    this.status = stepValue;
  };

  // use of ngStyle;
  isActiveStyle: boolean = true;

  // use of ngClass directive;
  isActiveClass: boolean = true;
}
