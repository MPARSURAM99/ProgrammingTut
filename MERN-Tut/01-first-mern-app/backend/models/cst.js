import mongoose from "mongoose";

const cstSchema = new mongoose.Schema({
  cst_name: {
    type: String,
    required: true,
    unique: true,
  },
  cst_email: {
    type: String,
    required: true,
    unique: true,
  },
  cst_dob: {
    type: Date,
    required: true,
  },
  cst_gender: {
    type: String,
    required: true,
    enum: ["male", "female"],
    default: "male",
  },
});

const Cst = mongoose.model("mbs-bloging-system-cst", cstSchema);
export default Cst;
