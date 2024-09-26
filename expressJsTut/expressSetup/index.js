var express = require('express')
var app = express();

app.get("/", (req, res) => {
    res.send("Hello World");
});

// For about page

app.get("/about", (req, res) => {
    res.send("Hello from about");
});

app.listen(8000, () => {
    console.log("Listing the port number at 8000");
});

