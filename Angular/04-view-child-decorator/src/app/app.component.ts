import { AfterViewInit, Component, ViewChild } from '@angular/core';
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
export class AppComponent implements AfterViewInit {
  title = 'angular-tutorial';

  childMsg!: string; // Variable that stores the message from home component;
  @ViewChild(HomeComponent) HomeComponent: any; //Here home component stores the child message;

  ngAfterViewInit(): void {
    // This method is invoked after the web page is load;
    this.childMsg = this.HomeComponent.msgFromHomeToApp; // msgFromHomeToApp is the variable declared inside home.component.ts;
  }
}
