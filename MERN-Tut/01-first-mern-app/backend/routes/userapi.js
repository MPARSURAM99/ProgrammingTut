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

// Update all the data or required data through save method.
// router.put("/updateUser/:uid", async (req, res) => {
//   const updateUser = req.params.uid;
//   try {
//     const user = await User.findById(updateUser);
//     if (!user) {
//       return res.status(404).json({ message: "User not found" });
//     }

//     user.user_name = req.body.user_name || user.user_name;
//     user.user_email = req.body.user_email
//       ? bcrypt.hashSync(req.body.user_email, 10)
//       : user.user_email;
//     user.user_dob = req.body.user_dob || user.user_dob;
//     user.user_gender = req.body.user_gender || user.user_gender;

//     const updatedUser = await user.save();
//     res.status(200).json(updatedUser);
//   } catch (err) {
//     res.status(400).json({ message: err.message });
//   }
// });

// To update all the data.
// router.put("/updateUser/:uid", async (req, res) => {
//   const updateUser = req.params.uid;
//   try {
//     const user = await User.findByIdAndUpdate(updateUser, req.body, {
//       new: true,
//     });
//     if (!user) {
//       return res.status(404).json({ message: "User not found" });
//     }
//     res.status(200).json(user);
//   } catch (err) {
//     res.status(400).json({ message: err.message });
//   }
// });

// To update a particular data. Here all the data will not be updated.
router.put("/updateUser/:uid", async (req, res) => {
  const updateUser = req.params.uid;
  try {
    const user = await User.findByIdAndUpdate(
      updateUser,
      { $set: req.body },
      {
        new: true,
      }
    );
    if (!user) {
      return res.status(404).json({ message: "User not found" });
    }
    res.status(200).json(user);
  } catch (err) {
    res.status(400).json({ message: err.message });
  }
});

// Delete user by id.
router.delete("/deleteUser/:uid", async (req, res) => {
  const deleteId = req.params.uid;
  try {
    const user = await User.findByIdAndDelete(deleteId);
    if (!user) {
      return res.status(404).json({ message: "User not found" });
    }
    res.status(200).json({ message: "User deleted successfully" });
  } catch (error) {
    res.status(400).json({ message: error.message });
  }
});

// module.exports = router;
export default router;
