import express from "express";
const router = express.Router();
import bcrypt from "bcryptjs";

import User from "../models/user.js";
router.post("/adduser", async (req, res) => {
  try {
    const newUser = new User({
      user_name: req.body.user_name,
      user_email: bcrypt.hashSync(req.body.user_email, 10), // Hashing the email
      user_dob: req.body.user_dob,
      user_gender: req.body.user_gender,
    });
    const user = await newUser.save();
    res.status(201).json(user);
  } catch (err) {
    res.status(400).json({ message: err.message });
  }
});

router.get("/viewUsers", async (req, res) => {
  try {
    const viewUser = await User.find();
    res.status(200).json(viewUser);
  } catch (err) {
    res.status(400).json({ message: err.message });
  }
});

router.get("/viewSingleUser/:uid", async (req, res) => {
  const singleUser = req.params.uid;
  try {
    const user = await User.findById(singleUser);
    if (!user) {
      return res.status(404).json({ message: "User not found" });
    }
    res.status(200).json(user);
  } catch (err) {
    res.status(400).json({ message: err.message });
  }
});

// module.exports = router;
export default router;
