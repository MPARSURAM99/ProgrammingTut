// Import the User model (Mongoose schema) from the models folder
import { User } from "../models/authUserModel.js";

// Import bcrypt for hashing passwords securely
import bcrypt from "bcrypt";

// Import jsonwebtoken for creating authentication tokens
import jwt from "jsonwebtoken";

// Controller function for handling user registration
export const userRegistration = async (req, res) => {

    // Destructure user details (name, email, password) from the request body
    const { name, email, password } = req.body;

    try {
        // ✅ Step 1: Validate user input
        // If any of the required fields are missing, return an error response
        if (!name || !email || !password) {
            return res.status(400).json({
                success: false,
                message: "All fields are required.",
                data: null
            });
        }

        // ✅ Step 2: Check if user already exists in the database
        const existingUser = await User.findOne({ email });

        if (existingUser) {
            return res.status(409).json({ // 409 = Conflict (better than 404)
                success: false,
                message: "User already exists.",
                data: null,
            });
        }

        // ✅ Step 3: Hash (encrypt) the user password before saving
        // Generate a salt (random string added to the password for extra security)
        const salt = await bcrypt.genSalt();
        // Create a hashed version of the password using bcrypt
        const hashedPassword = await bcrypt.hash(password, salt);

        // ✅ Step 4: Create and save the new user in the database
        const user = await User.create({
            name,
            email,
            password: hashedPassword
        });

        // ✅ Step 5: Generate a JWT token for the user
        // The token contains the user's ID and expires in 2 days
        const token = jwt.sign(
            { id: user._id },
            process.env.JWT_SECRET_KEY,
            { expiresIn: '2d' }
        );

        // ✅ Step 6: Store the token in a secure HTTP-only cookie
        res.cookie('userToken', token, {
            httpOnly: true, // prevents client-side JavaScript from accessing the cookie
            secure: process.env.NODE_ENV === 'production', // use HTTPS in production
            maxAge: 30 * 24 * 60 * 60 * 1000, // cookie expiry = 30 days
        });

        // ✅ Step 7: Send a success response back to the client
        res.status(201).json({
            success: true,
            message: "User registered successfully.",
            data: {
                id: user._id,
                name: user.name,
                email: user.email
            },
        });

    } catch (error) {
        // ✅ Step 8: Handle any unexpected errors during registration
        res.status(500).json({
            success: false,
            message: "Something went wrong.",
            error: error.message, // send only message, not full error object
        });
    }
};



// 🧩 Controller function for handling user login requests
export const userLogin = async (req, res) => {

    // Extract email and password from the request body
    const { email, password } = req.body;

    try {
        // ✅ Step 1: Validate input fields
        // If email or password is missing, return an error
        if (!email || !password) {
            return res.status(400).json({
                success: false,
                message: "All fields are required.",
                data: null,
            });
        }

        // ✅ Step 2: Check if the user exists in the database
        const user = await User.findOne({ email });
        if (!user) {
            return res.status(404).json({
                success: false,
                message: `User with email '${email}' does not exist.`,
                data: null,
            });
        }

        // ✅ Step 3: Compare entered password with the stored hashed password
        const isMatch = await bcrypt.compare(password, user.password);

        // bcrypt.compare() returns true if passwords match, false otherwise
        if (!isMatch) {
            return res.status(401).json({
                success: false,
                message: "Invalid credentials. Please check your password.",
                data: null,
            });
        }

        // ✅ Step 4: Generate a JWT token for the authenticated user
        // The token will contain the user's ID and expire in 2 days
        const token = jwt.sign(
            { id: user._id },
            process.env.JWT_SECRET_KEY,
            { expiresIn: "2d" }
        );

        // ✅ Step 5: Store the token in a secure cookie
        res.cookie("userToken", token, {
            httpOnly: true, // Cookie cannot be accessed via JavaScript (helps prevent XSS attacks)
            secure: process.env.NODE_ENV === "production", // Use HTTPS only in production
            maxAge: 30 * 24 * 60 * 60 * 1000, // Cookie expiry = 30 days
        });

        // ✅ Step 6: Send a success response with user data (optional)
        res.status(200).json({
            success: true,
            message: "Login successful.",
            data: user,
        });

    } catch (error) {
        // ✅ Step 7: Handle unexpected errors
        res.status(500).json({
            success: false,
            message: "Something went wrong.",
            error: error.message, // Send only the error message, not the full stack trace
        });
    }
};



// 🧩 Controller function for handling user login requests
export const logout = (req, res) => {
    res.cookie('userToken', ' ', {
        httpOnly: true,
        expires: new Date(0),
    });

    return res.status(200).json({
        success: true,
        message: `Logout successful.`,
        data: null,
    });
}


// 🧩 Controller function for handling user login requests
export const userProfile = (req, res) => {
    res.status(200).json({
        user: req.user,
    });
}
