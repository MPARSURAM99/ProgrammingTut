// const http = require("http");
// const fs = require("fs");
// const server = http.createServer((req, res) => {
//     fs.readFile("./API.json", "utf-8", (err, data) => {
//         res.end("<h1> The json data are given bellow </h1>" + data );
//     })
//  })

const http = require("http");
const fs = require("fs");
const { create } = require("domain");

const server = http.createServer((req, res) => {
    if(req.url == "/"){
        res.end("It is your own server");
    } else if(req.url == "/contact") {
        res.end("You are on the contact page");
    } else if (req.url == "/about"){
        res.end("You are on the about page");
    }else if(req.url == "/userapi"){
        fs.readFile("./API.json", "utf-8", (err, data) => {
        const objectData = JSON.parse(data);
        console.log(objectData);    
        res.end("<h1> The json data are given bellow </h1>" + objectData.name );
        });
    } else {
        res.end("<h1> Error number 404: Page doesn't exist </h1>")
    }
});




server.listen(8000, "127.0.0.1", () => {
    console.log("Listening to the port number 8000");
});