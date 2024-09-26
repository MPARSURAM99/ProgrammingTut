const express = require("express");
const app = express();
const port = 3000;

app.get("/", (req, res) => {
    res.json({
        Name : "Parsuram",
        Age : 23,
        Mob : 9937734192,
        College : "CUTM"
    });
});

app.listen(port, () => {
    console.log(`Responding to the port number 3000`);
});