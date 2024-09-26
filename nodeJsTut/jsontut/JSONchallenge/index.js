// Create na object
// convert it into JSON
// Add the JSON data into another file
// Read the file
// Again convert it back into Object
// Console the object data
const { Console } = require("console");
const fs = require("fs");
const bioData = {
    name : "Parsuram",
    Age : 22,
    College : "CUTM",
    Address : "Lalitagiri"
}

const jsonData = JSON.stringify(bioData);
/*fs.writeFile("bioData.json", jsonData, (err) => {
    console.log("json file is created successfully");
});*/

/*fs.readFile("bioData.json", "utf-8", (err, data) => {
    console.log(data);
});*/

fs.readFile("biodata.json", "utf-8", (err, data) => {
    const newData = JSON.parse(data);
    console.log(data);
})



