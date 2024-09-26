const path = require("path");
const express = require("express");
const app = express();
const port = 8000;
const staticPath = path.join(__dirname, "../public");

// app.get("/", (req, res) => {
//     res.send("Hello World");
// });

app.use(express.static(staticPath));

app.get("/", (req, res) => {
    res.send(`Wellcom to my home page`);
});

app.listen(port, () => {
    console.log(`Lestning to the port number ${port}`);
});