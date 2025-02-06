import dotenv from "dotenv";
dotenv.config({ path: "./config/.env" });

export const PORT = process.env.PORT;
export const MONGODB_URI = process.env.MONGO_URI;
