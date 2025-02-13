import React from "react";
import { Link } from "react-router-dom";

const Home = () => {
  return (
    <div>
      <h1>Welcome to the Home Page</h1>
      <p>This is where you can find information about our services.</p>
      <div>
        <Link to={`/login`}>
          <button>Login</button>
        </Link>
        <br />
        <Link to={`/register`}>
          <button>Register</button>
        </Link>
      </div>
    </div>
  );
};

export default Home;
