// example 1
/*const add = require("./export.js");
console.log(add(10,6));*/


// example 2
/*const oper = require("./export.js");
console.log(oper.add(4,6));
console.log(oper.sub(18,8));*/
// or
/*const {add, sub} = require("./export.js");
console.log(add(5,10));
console.log(sub(20,10));*/
 
//example 3
const {add, sub, mult} = require("./export.js");
console.log(add(5,10));
console.log(sub(20,15));
console.log(mult(3,5));