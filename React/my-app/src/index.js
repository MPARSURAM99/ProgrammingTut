import React from 'react';
import ReactDOM from 'react-dom/client'; //importing react dom(mandatory)
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));

// Using the component from the app.js file and rendering it to the root div present in index.html inside public folder
root.render(
  <React.StrictMode>  
    <App />
  </React.StrictMode>
); 

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();