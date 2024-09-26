// const fs = require("fs");
// const http = require("http");

// const server = http.createServer();

// server.on("request", (req, res) => {
//     var fs = require("fs");
//     fs.readFile("input.txt", (err, data) => {
//         if (err) return console.error(err);
//         res.end(data.toString());
//     });
// });

// server.listen(8000, "127.0.0.1");

const fs = require("fs");
const http = require("http");

const server = http.createServer();

server.on("request", (req, res) => {
    const readableStream = fs.createReadStream("input.txt");

    readableStream.on("data", (chunckData) => {
        res.write(chunckData);
    });

    readableStream.on("end", () => {
        res.end();
    });

    readableStream.on("error", (err) => {
        console.log(err);
        res.end("<h1> File doesn't Exist </h1>");
    })
});

server.listen(8000, "127.0.0.1");