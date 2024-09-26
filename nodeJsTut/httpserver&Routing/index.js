const http = require("http");
const server = http.createServer((req, res) => {
    if (req.url == "/"){
        res.end("I am here to respond you");
    } else if (req.url == "/about") {
        res.end("You are on the about page");
    } else if (req.url == "/contact") {
        res.end("You are on the contact page")
    } else {
        res.end("<h1> Page doesn't exit: Error No.- 404 </h1>");
    }
    
});

server.listen(8000, "127.0.0.1", () => {
    console.log("Listening to the port no 8000");
});