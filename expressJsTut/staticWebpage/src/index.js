const path = require("path");
const express = require("express");
const app = express();

const staticPath = path.join(__dirname, "../public/");
app.use(express.static(staticPath));

app.listen(8000, () => {
    console.log(`The file path is ${staticPath}`);
});