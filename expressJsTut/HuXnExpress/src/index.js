import express from "express";
const app = express();
import path, { join } from "path";
const port = 8000;
// const staticPath = join(process.cwd(), "../public");
app.set("view engine", "ejs");

app.use(express.static(join(process.cwd(), "/public")));
app.get("/", (req, res) => {
    res.render("index");
});

app.listen(port, () => {
    console.log("Leastning to the port number 8000");
});