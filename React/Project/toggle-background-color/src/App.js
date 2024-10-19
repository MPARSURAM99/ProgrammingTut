import React from "react";
import "./index.css";
import { useState } from "react";

const App = () => {
  const [headerBackground, setHeaderBackground] = useState("antiquewhite");
  const [borderBottom, setBorderBottm] = useState("none");
  const [backgroundColor, setBackgroundColor] = useState("white");
  const [textColor, setTextColor] = useState("#1b1b1b");
  const [buttonStyle, setButtonStyle] = useState("white");

  const handleClick = () => {
    setHeaderBackground(
      headerBackground === "antiquewhite" ? "#1b1b1b" : "antiquewhite"
    );
    setBorderBottm(borderBottom === "none" ? `2px solid #ffa31a` : "none");
    setBackgroundColor(backgroundColor === "white" ? "#1b1b1b" : "white");
    setTextColor(textColor === "#1b1b1b" ? "#ffa31a" : "#1b1b1b");
    setButtonStyle(backgroundColor === "white" ? "#1b1b1b" : "white");
  };

  return (
    <section style={{ backgroundColor, color: textColor }}>
      <div
        className="header"
        style={{
          backgroundColor: headerBackground,
          color: textColor,
          borderBottom: `${borderBottom}`,
        }}
      >
        <h1 style={{ border: `2px solid ${textColor}` }}>PM</h1>
        <p>Home</p>
        <p>About</p>
        <p>Contact Us</p>
        <p>Login</p>
        <p>Sign up</p>
        <button
          className="button"
          onClick={handleClick}
          style={{
            buttonStyle,
            color: textColor,
            border: `2px solid ${textColor}`,
          }}
        >
          {backgroundColor === "white" ? "Black Them" : "White Them"}
        </button>
      </div>
      <section className="content">
        <h1>
          Welcome <br /> to a real world...
        </h1>
      </section>
    </section>
  );
};

export default App;
