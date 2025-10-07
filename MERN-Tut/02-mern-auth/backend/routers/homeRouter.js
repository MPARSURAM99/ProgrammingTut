import express from "express";
import { home } from "../controllers/homeControllers.js";

const homeRouter = express.Router();

homeRouter.get('', home);

export default homeRouter;