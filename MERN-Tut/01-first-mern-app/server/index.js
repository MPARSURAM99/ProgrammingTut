const express = require("express");
const connectDB = require("./db.js");
const cors = require("cors");
const userModel = require("./models/user.js");
const app = express();
app.use(cors());
app.use(express.json());

const port = 3000;

connectDB(); // Call the function to connect to the database;

app.get("/getUser", (req, res) => {
  console.log("Request received for /getUser");
  userModel
    .find({})
    .then((user) => {
      console.log("Users found:", user);
      res.status(200).json(user);
    })
    .catch((err) => {
      console.error("Error fetching users:", err);
      res.status(500).json({ error: err.message });
    });
});

app.listen(port, () => {
  console.log(`Server is running on port No. ${port}`);
});
