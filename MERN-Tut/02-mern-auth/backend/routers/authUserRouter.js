// Importing the express framework to create routes
import express from "express";

// Importing controller functions that handle user authentication-related logic
import { logout, userLogin, userProfile, userRegistration } from "../controllers/authUserControllers.js";

// Importing middleware to verify user authentication before accessing protected routes
import { userProfileMiddleware } from "../middleware/userprofileMiddleware.js";

// Creating a new router instance for authentication routes
const authUserRouter = express.Router();

// Route for user registration — handles POST requests to '/register'
// Calls the 'userRegistration' controller function
authUserRouter.post('/signup', userRegistration);

// Route for user login — handles POST requests to '/login'
// Calls the 'userLogin' controller function
authUserRouter.post('/login', userLogin);

// Route for user logout — handles POST requests to '/logout'
// Calls the 'logout' controller function
authUserRouter.post('/logout', logout);

// Route for fetching user profile — handles GET requests to '/profile'
// Applies 'userProfileMiddleware' to check authentication before calling 'userProfile'
authUserRouter.get('/profile', userProfileMiddleware, userProfile);

// Exporting the router so it can be used in other files (like server.js or app.js)
export default authUserRouter;
