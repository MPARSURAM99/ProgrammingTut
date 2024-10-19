import React from "react";
import "./counter.css";
import { useState } from "react";

const Counter = () => {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const reset = () => {
    setCount(0);
  };

  const formatCount = (num) => {
    return num < 10 && num >= 0 ? `0${num}` : num.toString();
  };

  return (
    <>
      <div className="counter-container">
        <h1>{formatCount(count)}</h1>
        <div className="btnDiv">
          <button className="countBtn" onClick={() => increment()}>
            +
          </button>
          <button className="countBtn" id="resetBtn" onClick={() => reset()}>
            Reset
          </button>
          <button className="countBtn" onClick={() => decrement()}>
            -
          </button>
        </div>
      </div>
    </>
  );
};

export default Counter;
