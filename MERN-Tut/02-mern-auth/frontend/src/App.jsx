import { Routes, Route } from 'react-router-dom';
import Home from './pages/Home.jsx';
import Signup from './pages/signup.jsx';
import Login from './pages/Login.jsx';
import Profile from './pages/Profile.jsx';

function App() {
  return (
    <div>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/signup" element={<Signup />} />
        <Route path="/login" element={<Login />} />
        <Route path="/profile" element={<Profile />} />
      </Routes>
    </div>
  )
}

export default App
