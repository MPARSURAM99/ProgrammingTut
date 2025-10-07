import React from "react";
import { useNavigate } from "react-router-dom";

const user = {
  name: "John Doe",
  email: "john.doe@example.com",
  quote: "The only way to do great work is to love what you do. – Steve Jobs"
};

const Profile = () => {
  const navigate = useNavigate();

  const handleLogout = () => {
    // Add logout logic here (e.g., clear auth tokens)
    navigate("/");
  };

  return (
    <div className="min-h-screen flex items-center justify-center bg-gradient-to-br from-indigo-400 to-purple-600">
      <div className="bg-white/90 p-8 rounded-xl shadow-lg w-full max-w-md flex flex-col items-center">
        <div className="w-20 h-20 rounded-full bg-gradient-to-br from-indigo-500 to-purple-500 flex items-center justify-center mb-4">
          <span className="text-3xl font-bold text-white">
            {user.name[0]}
          </span>
        </div>
        <h2 className="text-2xl font-bold text-purple-700 mb-2">{user.name}</h2>
        <p className="text-gray-700 mb-6">{user.email}</p>
        <blockquote className="italic text-center text-indigo-700 border-l-4 border-indigo-400 pl-4 mb-8">
          "{user.quote}"
        </blockquote>
        <button
          onClick={handleLogout}
          className="mt-2 px-6 py-2 bg-gradient-to-r from-indigo-500 to-purple-600 text-white font-semibold rounded-lg hover:from-indigo-600 hover:to-purple-700 transition"
        >
          Logout
        </button>
      </div>
    </div>
  );
};

export default Profile;