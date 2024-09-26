// Creating Express Routing.
const express = require("express");
const app = express();
const port = 3000;

app.get("/", (req, res) => {
    res.send("Wellcome to my home page");
});

app.get("/about", (req, res) => {
    res.status(200).send("Wellcom to my about page");
});

app.get("/contact", (req, res) => {
    res.send("Wellcome to my contact page");
});

app.get("/temp", (req,res) => {
    res.send("Wellcome to temp page");
});

// Creating Server
app.listen(port, () =>{
    console.log("Listning to the port number 3000");
});