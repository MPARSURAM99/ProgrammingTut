import express from "express";
import { logout, userLogin, userRegistration } from "../controllers/authUserControllers.js";

const authUserRouter = express.Router();

authUserRouter.post('/register', userRegistration);
authUserRouter.post('/login', userLogin);
authUserRouter.post('/logout', logout);

export default authUserRouter;