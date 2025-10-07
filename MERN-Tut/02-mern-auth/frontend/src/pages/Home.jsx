import React from "react";
import { Link } from "react-router-dom";

const Home = () => {
  return (
    <div className="min-h-screen flex flex-col bg-gray-50">
      {/* Navbar */}
      <nav className="flex justify-between items-center px-6 py-4 bg-white shadow-md">
        {/* Logo */}
        <div className="flex items-center space-x-2">
          <img
            src="https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg"
            alt="Logo"
            className="w-10 h-10"
          />
          <h1 className="text-2xl font-bold text-blue-600">MyApp</h1>
        </div>

        {/* Buttons */}
        <div className="flex space-x-4">
          <Link
            to="/login"
            className="px-4 py-2 bg-blue-600 text-white font-medium rounded-md hover:bg-blue-700 transition"
          >
            Login
          </Link>
          <Link
            to="/signup"
            className="px-4 py-2 bg-blue-600 text-white font-medium rounded-md hover:bg-blue-700 transition"
          >
            Sign Up
          </Link>
        </div>
      </nav>

      {/* Body Section */}
      <main className="flex-grow flex flex-col items-center justify-center text-center px-4">
        <h2 className="text-4xl md:text-5xl font-bold text-gray-800 mb-4">
          Welcome to <span className="text-blue-600">MyApp</span>
        </h2>
        <p className="text-gray-600 text-lg md:w-2/3">
          This is your MERN Authentication Learning Project. Build, break, and
          learn how secure login systems work using MongoDB, Express, React, and
          Node.js.
        </p>

        <button className="mt-8 px-6 py-3 bg-blue-600 text-white font-semibold rounded-lg hover:bg-blue-700 transition">
          Get Started
        </button>
      </main>

      {/* Footer */}
      <footer className="bg-white text-center py-3 text-gray-500 border-t">
        © {new Date().getFullYear()} MyApp. All rights reserved.
      </footer>
    </div>
  );
};

export default Home;
