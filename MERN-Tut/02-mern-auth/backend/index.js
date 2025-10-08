import express from "express";
import cookieParser from "cookie-parser";
import { port } from "./config/config.js";
import { connectDB } from "./config/db.js";
import authUserRouter from "./routers/authUserRouter.js";
import homeRouter from "./routers/homeRouter.js";
import cors from "cors";

const app = express();
// Add this middleware to parse JSON requests and responses;
app.use(express.json());
app.use(express.urlencoded({extended: true}));
app.use(cookieParser());


app.use(cors({
  origin: 'http://localhost:5173', // or your frontend port
  credentials: true
}));

// Define base url;
app.use('/', homeRouter);
app.use('/auth', authUserRouter);



app.listen(port, (req, res) => {
    // Check database is connected or not;
    connectDB();
    console.log(`Server is running on port No. ${port}`);
});