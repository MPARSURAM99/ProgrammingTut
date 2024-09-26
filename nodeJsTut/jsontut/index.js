const bioData = {
    name : "Parsuram",
    age : 26,
    college : "CUTM",
}
// console.log(bioData.college);
// Convert the object into JSON data

const jsonData = JSON.stringify(bioData);
// console.log(jsonData);

const objectData = JSON.parse(jsonData);
console.log(objectData);