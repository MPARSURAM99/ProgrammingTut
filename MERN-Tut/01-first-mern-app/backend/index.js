import express from "express";
import { app, connectServer } from "./server/connection.js";
import cors from "cors";
import userRouter from "./routes/userapi.js";
app.use(express.json());

// CORS setup
const corsOptions = {
  origin: ["http://localhost:3000", "https://your-production-domain.com"],
  methods: ["GET", "POST", "PUT", "DELETE"],
  allowedHeaders: ["Content-Type", "Authorization"],
};
app.use(cors(corsOptions));

app.use("/api/users", userRouter);

// Routes
app.get("/", (req, resp) => {
  return resp.send("Welcome to the book store management project");
});

app.get("/books", (req, resp) => {
  return resp.send("No Book Available.");
});

// Start server and connect to database
(async () => {
  try {
    await connectServer();
    console.log("Server is up and running!");
  } catch (error) {
    console.error("Failed to start server:", error.message);
    process.exit(1);
  }
})();
