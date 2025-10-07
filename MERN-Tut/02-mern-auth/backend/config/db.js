import mongoose from "mongoose";
import { mongo_uri } from "./config.js";

export const connectDB = async () => {
  try {
    await mongoose.connect(mongo_uri, {
      // useNewUrlParser: true,
      // useUnifiedTopology: true,
    });
    console.log(`MongoDB connected successfully`);
  } catch (error) {
    console.error(`MongoDB connection error:`, error);
    process.exit(1);
  }
};