import express from "express";
const router = express.Router();
import Cst from "../models/cst.js";

router.post("/addcst", async (req, res) => {
  try {
    const newCst = new Cst({
      cst_name: req.body.cst_name,
      cst_email: req.body.cst_email,
      cst_dob: req.body.cst_dob,
      cst_gender: req.body.cst_gender,
    });
    const cst = await newCst.save();
    res.status(201).json(cst);
  } catch (err) {
    res.status(400).json({ message: err.message });
  }
});

// module.exports = router;
export default router;
