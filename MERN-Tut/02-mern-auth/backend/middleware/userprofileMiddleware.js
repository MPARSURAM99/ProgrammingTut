// Importing the 'jsonwebtoken' library for verifying JWT tokens
import jwt from "jsonwebtoken";

// Importing the User model to fetch user details from the database
import { User } from "../models/authUserModel.js";

// Middleware function to verify the user's token before allowing access to protected routes
export const userProfileMiddleware = async (req, res, next) => {
    // Extract the token from cookies (assumes token is stored under the key 'userToken')
    const token = req.cookies.userToken;

    try {
        // If there is no token in cookies, deny access
        if (!token) {
            return res.status(401).json({
                success: false,              // Indicates the request was not successful
                message: "Unauthorized user", // Error message
                data: null,                  // No data to send back
            });
        }

        // Verify the JWT token using the secret key from environment variables
        const decodedToken = jwt.verify(token, process.env.JWT_SECRET_KEY);

        // Find the user in the database using the ID extracted from the decoded token
        req.user = await User.findById(decodedToken.id);

        // Proceed to the next middleware or route handler
        next();
    } catch (error) {
        // If token verification fails or any other error occurs
        return res.status(401).json({
            success: false,              // Indicates failure
            message: "Unauthorized user", // Generic unauthorized message
            data: null,                  // No data returned
        });
    }
};
