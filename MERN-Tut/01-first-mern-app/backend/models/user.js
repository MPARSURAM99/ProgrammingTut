import mongoose from "mongoose";

const userSchema = new mongoose.Schema({
  user_name: {
    type: String,
    required: true,
    unique: true,
  },
  user_email: {
    type: String,
    required: true,
    unique: true,
  },
  user_dob: {
    type: Date,
    required: true,
  },
  user_gender: {
    type: String,
    required: true,
    enum: ["male", "female"],
    default: "male",
  },
});

const User = mongoose.model("mbs-bloging-system", userSchema);
export default User;
