const mongoose = require("mongoose");

const connectDB = async () => {
  try {
    await mongoose.connect(
      "mongodb+srv://root:123Shriramsmd@free-cluster.q9zqz.mongodb.net/01-first-mern-app?retryWrites=true&w=majority&appName=Free-Cluster"
    );
    console.log("MongoDB connected");
  } catch (err) {
    console.error("MongoDB connection error:", err);
    process.exit(1); // Exit process with failure
  }
};

module.exports = connectDB;
