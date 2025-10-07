import { useState } from 'react'
import { Link } from 'react-router-dom'

function Signup() {
  const [form, setForm] = useState({ name: '', email: '', password: '' })

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value })
  }

  const handleSubmit = (e) => {
    e.preventDefault()
    // Handle signup logic here
    alert('Signup successful!')
  }

  return (
    <div className="min-h-screen flex items-center justify-center bg-gradient-to-br from-indigo-400 to-purple-600">
      <form
        onSubmit={handleSubmit}
        className="bg-white p-8 rounded-xl shadow-lg w-full max-w-md"
      >
        <h2 className="text-3xl font-bold text-center text-purple-700 mb-6">Sign Up</h2>
        <div className="mb-4">
          <label className="block mb-1 text-gray-700 font-medium">Name</label>
          <input
            type="text"
            name="name"
            value={form.name}
            onChange={handleChange}
            required
            className="w-full px-4 py-2 rounded-lg border border-gray-300 focus:outline-none focus:ring-2 focus:ring-purple-400"
            placeholder="Enter your name"
          />
        </div>
        <div className="mb-4">
          <label className="block mb-1 text-gray-700 font-medium">Email</label>
          <input
            type="email"
            name="email"
            value={form.email}
            onChange={handleChange}
            required
            className="w-full px-4 py-2 rounded-lg border border-gray-300 focus:outline-none focus:ring-2 focus:ring-purple-400"
            placeholder="Enter your email"
          />
        </div>
        <div className="mb-6">
          <label className="block mb-1 text-gray-700 font-medium">Password</label>
          <input
            type="password"
            name="password"
            value={form.password}
            onChange={handleChange}
            required
            className="w-full px-4 py-2 rounded-lg border border-gray-300 focus:outline-none focus:ring-2 focus:ring-purple-400"
            placeholder="Enter your password"
          />
        </div>
        <button
          type="submit"
          className="w-full py-2 rounded-lg bg-gradient-to-r from-indigo-500 to-purple-600 text-white font-semibold text-lg hover:from-indigo-600 hover:to-purple-700 transition"
        >
          Sign Up
        </button>
        <p className="mt-4 text-center text-gray-600">
          Already have an account?{' '}
          <Link to="/login" className="text-purple-600 hover:underline">
            Login
          </Link>
        </p>
      </form>
    </div>
  )
}

export default Signup