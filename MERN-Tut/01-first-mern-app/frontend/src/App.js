import "./App.css";
import React from "react";
import { Routes, Route } from "react-router-dom";
import Home from "./component/Home.jsx";
import Login from "./component/Login.jsx";
import Register from "./component/Register.jsx";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="login" element={<Login />} />
        <Route path="register" element={<Register />} />
      </Routes>
    </div>
  );
}

export default App;
