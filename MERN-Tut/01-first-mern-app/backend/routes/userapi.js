import express from "express";
const router = express.Router();

import User from "../models/user.js";
router.post("/adduser", async (req, res) => {
  try {
    const newUser = new User({
      user_name: req.body.user_name,
      user_email: req.body.user_email,
      user_dob: req.body.user_dob,
      user_gender: req.body.user_gender,
    });
    const user = await newUser.save();
    res.status(201).json(user);
  } catch (err) {
    res.status(400).json({ message: err.message });
  }
});

// module.exports = router;
export default router;
