const fs = require("fs");
const http = require("http");

const server = http.createServer();

server.on("request", (req, res) => {
    const readableStream = fs.createReadStream("input.txt");
    readableStream.pipe(res /*to show on response */ );
});

server.listen(8000, "127.0.0.1");