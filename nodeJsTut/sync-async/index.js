const fs = require("fs");
// fs.writeFileSync("read.txt","I am testing Sync vs Async");
fs.readFile("read.txt","utf-8",(err, data) =>{
    console.log(data);
});
console.log("After the data");
