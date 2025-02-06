import { PORT, MONGODB_URI } from "../config/config.js";
import express from "express";
import mongoose from "mongoose";

export const app = express();

export const connectServer = () => {
  // Database connection.
  mongoose
    .connect(MONGODB_URI)
    .then(() => {
      console.log(`Database connected successfully.`);
      // Creating server.
      app.listen(PORT, () => {
        console.log(`Listening to the port: ${PORT}`);
      });
    })
    .catch((error) => {
      console.log(error);
    });
};
