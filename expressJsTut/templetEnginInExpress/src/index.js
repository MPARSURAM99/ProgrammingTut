const path = require("path");
const express = require("express");
const app = express();
const port = 8000;
const staticPath = path.join(__dirname, "../public");
const templatePath = path.join(__dirname, "../templates");

app.set("view engine", "hbs");
app.set("views", templatePath);

app.use(express.static(staticPath));

app.get("/", (req, res) => {
    res.render("index");
});

app.get("/link.html", (req, res) => {
    res.render("link", {
        myLink: "www.instagram.com"
    });
});

app.listen(port, () => {
    console.log(`Leastning to the port number ${port}`);
});