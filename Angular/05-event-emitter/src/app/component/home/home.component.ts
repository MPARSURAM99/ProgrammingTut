import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { NavbarComponent } from '../navbar/navbar.component';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [NavbarComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent implements OnInit {
  // Create a message that to be shown in parent component when event is triggered;
  outputChildMsg: string = 'Message from home component';

  // Create an Event emitter object to trigger the event;
  @Output() messageEvent = new EventEmitter<string>();

  ngOnInit(): void {}

  // Define the on click function that is declared at the button of home component;
  sendMsg = () => {
    console.log('Button is clicked');

    // Emit the event through event emitter object (messageEvent);
    this.messageEvent.emit(this.outputChildMsg);
  };
}
