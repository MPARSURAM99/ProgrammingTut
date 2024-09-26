const path = require("path");
/*var data = path.dirname("C:\Users\mpars\OneDrive\Documents\Programing\nodepractice\pathModules\index.js");
console.log(data);*/

// console.log(path.extname("C:\Users\mpars\OneDrive\Documents\Programing\nodepractice\pathModules\index.js"));
var myPath = (path.parse("C:\Users\mpars\OneDrive\Documents\Programing\nodepractice\pathModules\index.js"));
console.log(myPath.name);