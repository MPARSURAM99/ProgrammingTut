const fs = require("fs");
/*fs.writeFile("read.txt", "This is an asynchronous File System", (err) => {
    console.log("File is created successfully");
    console.log(err);
})*/
/*fs.appendFile("read.txt", " This data is modified", ()=>{
    console.log("file is updated successfully")
});*/
fs.readFile("read.txt", "UTF-8", (err,data ) => {
    console.log(data)
})